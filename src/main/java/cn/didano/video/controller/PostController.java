package cn.didano.video.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Bs_good;
import cn.didano.base.model.Hand_student;
import cn.didano.base.model.Tb_benchmark;
import cn.didano.base.model.Tb_class;
import cn.didano.base.model.Tb_school;
import cn.didano.base.model.Tb_student;
import cn.didano.base.model.Tb_studentRecord;
import cn.didano.base.model.Tb_student_detection;
import cn.didano.base.model.Tb_student_inf;
import cn.didano.base.model.Vd_auth_switch;
import cn.didano.base.model.Vd_auth_time_control;
import cn.didano.base.model.Vd_channel;
import cn.didano.base.model.View_channel_info;
import cn.didano.base.model.View_channel_info_on;
import cn.didano.base.model.View_switch_s_c;
import cn.didano.base.service.AuthSwitchService;
import cn.didano.base.service.AuthTimeControlService;
import cn.didano.base.service.ChannelService;
import cn.didano.base.service.ClassService;
import cn.didano.base.service.GoodService;
import cn.didano.base.service.ManagerService;
import cn.didano.base.service.SchoolService;
import cn.didano.base.service.StudentService;
import cn.didano.base.service.ViewChannelService;
import cn.didano.video.auth.channel.ChannelStatus;
import cn.didano.video.constant.BackType;
import cn.didano.video.constant.ChannelType;
import cn.didano.video.constant.DeletedType;
import cn.didano.video.constant.StatusType;
import cn.didano.video.entity.InfoChannel;
import cn.didano.video.entity.InfoChannel_C;
import cn.didano.video.json.In_Channel_Add;
import cn.didano.video.json.In_Channel_Edit;
import cn.didano.video.json.In_Channel_Search;
import cn.didano.video.json.In_Control_Add;
import cn.didano.video.json.In_Control_Edit;
import cn.didano.video.json.In_School_Search;
import cn.didano.video.json.In_Switch_Edit4Video;
import cn.didano.video.json.In_Switch_Search;
import cn.didano.video.json.Out;
import cn.didano.video.json.OutList;
import cn.didano.video.json.Out_Channel_Time_Control;
import cn.didano.video.json.Out_Switch_Class;
import cn.didano.video.json.Out_Switch_School;
import cn.didano.video.service.OssManagerService;
import cn.didano.video.service.WebsocketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * post操作 操作有四种 add/edit/delete/set
 * 
 * @author stephen Created on 2016年12月17日 下午6:38:30
 */
@Api(value = "管理控制台POST服务",  tags = "控制台POST服务，提供给表现层")
@RestController
@RequestMapping(value = "/video/rest/post/")
public class PostController {
	static Logger logger = Logger.getLogger(PostController.class);
	@Autowired
	private ChannelService channelService;
	@Autowired
	private OssManagerService ossManagerService;
	@Autowired
	private AuthSwitchService authSwitchService;
	@Autowired
	private SchoolService schoolService;
	@Autowired
	private ClassService classService;
	@Autowired
	private ManagerService managerService;
	@Autowired
	private ViewChannelService viewChannelService;
	@Autowired
	private GoodService goodService;
	@Autowired
	private AuthTimeControlService controlService;
	@Autowired
	private WebsocketService websocketService;
    @Autowired
    private StudentService studentService;
   

    /**
	 * 获取学生照片
	 */	
	@PostMapping(value = "student_search_by_studentid/{student_id}")
	@ApiOperation(value="搜索学生照片", notes = "搜索学生照片，不翻页")
	@ResponseBody
	public Out<OutList<Tb_student_inf>> student_search(@PathVariable("student_id") Integer student_id) {
		logger.info("访问  PostController:student_search_by_studentid student_id ="+student_id);
		List<Tb_student> studentall = null;
		List<Tb_student_inf> student = new ArrayList<Tb_student_inf>();		
		OutList<Tb_student_inf> outList = null;
		Out<OutList<Tb_student_inf>> back = new Out<OutList<Tb_student_inf>>();
		try {
			studentall = studentService.selectById(student_id);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			if(studentall.size()>4){
				student.add(new Tb_student_inf(studentall.get(0).getHeight()/10,studentall.get(0).getWeight()/1000,studentall.get(0).getOrgImgUrl(),sdf.format(studentall.get(0).getCreated())));				
			    Tb_student tb=studentall.get((int)(Math.random()*(studentall.size()-1)/5)+(studentall.size()-1)/5);
			    Tb_student_inf inf = new Tb_student_inf(tb.getHeight()/10,tb.getWeight()/1000,tb.getOrgImgUrl(),sdf.format(tb.getCreated()));
			    student.add(inf);			    
				 tb=studentall.get((int)(Math.random()*(studentall.size()-1)/5)+((studentall.size()-1)*3)/5);
				inf=new Tb_student_inf(tb.getHeight()/10,tb.getWeight()/1000,tb.getOrgImgUrl(),sdf.format(tb.getCreated()));
			    student.add(inf);
			    tb=studentall.get(studentall.size()-1);
			    student.add(new Tb_student_inf(tb.getHeight()/10,tb.getWeight()/1000,tb.getOrgImgUrl(),sdf.format(tb.getCreated())));			
			}else if(studentall.size()==1){
				for (int i = 0; i < 4; i++) {
					student.add(new Tb_student_inf(studentall.get(0).getHeight()/10,studentall.get(0).getWeight()/1000,studentall.get(0).getOrgImgUrl(),sdf.format(studentall.get(0).getCreated())));
				}
			}else if(studentall.size()==2){
				student.add(new Tb_student_inf(studentall.get(0).getHeight()/10,studentall.get(0).getWeight()/1000,studentall.get(0).getOrgImgUrl(),sdf.format(studentall.get(0).getCreated())));
				student.add(new Tb_student_inf(studentall.get(0).getHeight()/10,studentall.get(0).getWeight()/1000,studentall.get(0).getOrgImgUrl(),sdf.format(studentall.get(0).getCreated())));
				student.add(new Tb_student_inf(studentall.get(1).getHeight()/10,studentall.get(1).getWeight()/1000,studentall.get(1).getOrgImgUrl(),sdf.format(studentall.get(1).getCreated())));
				student.add(new Tb_student_inf(studentall.get(1).getHeight()/10,studentall.get(1).getWeight()/1000,studentall.get(1).getOrgImgUrl(),sdf.format(studentall.get(1).getCreated())));
			}else if(studentall.size()==3){
				student.add(new Tb_student_inf(studentall.get(0).getHeight()/10,studentall.get(0).getWeight()/1000,studentall.get(0).getOrgImgUrl(),sdf.format(studentall.get(0).getCreated())));
				student.add(new Tb_student_inf(studentall.get(1).getHeight()/10,studentall.get(1).getWeight()/1000,studentall.get(1).getOrgImgUrl(),sdf.format(studentall.get(1).getCreated())));
				student.add(new Tb_student_inf(studentall.get(1).getHeight()/10,studentall.get(1).getWeight()/1000,studentall.get(1).getOrgImgUrl(),sdf.format(studentall.get(1).getCreated())));
				student.add(new Tb_student_inf(studentall.get(2).getHeight()/10,studentall.get(2).getWeight()/1000,studentall.get(2).getOrgImgUrl(),sdf.format(studentall.get(2).getCreated())));
			}

			for(Tb_student_inf s:student){
				if(!s.getOrgImgUrl().equals("")){
				StringBuilder address =new StringBuilder("http://image-didanuo.oss-cn-shenzhen.aliyuncs.com/") ;
				address.append(s.getOrgImgUrl());
				s.setOrgImgUrl(address.toString());
				}
				
			}
			
			outList = new OutList<Tb_student_inf>(student.size(),student);
			back.setBackTypeWithLog(outList, BackType.SUCCESS);
			
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}
	
	
	/**
	 * 获取商品列表
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	@RequestMapping(value = "good_all/{page}/{size}", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value="获取商品列表", notes = "读取所有商品信息")
	@ResponseBody
	public Out<PageInfo<Bs_good>> good_all(@PathVariable("page") int page, @PathVariable("size") int size) {
		logger.info("访问  PostController:goods_get_all");
		PageInfo<Bs_good> pageInfo = goodService.selectAll(page, size);
		Out<PageInfo<Bs_good>> back = new Out<PageInfo<Bs_good>>(BackType.SUCCESS,pageInfo);
		return back;
	}


	/**
	 * 查询视频频道
	 * 
	 * @param search
	 * @return
	 */
	@ApiOperation(value="查询视频频道", notes = "根据频道查询条件，包括名称、学校ID、班级ID等，查询频道，带翻页")
	@PostMapping(value = "channel_search/{page}/{size}")
	@ResponseBody
	public Out<PageInfo<Vd_channel>> channel_search(@PathVariable("page") int page, @PathVariable("size") int size,
			@ApiParam(value = "频道查询条件" ,required=false ) @RequestBody(required = false) In_Channel_Search search) {
		if(search!=null)
		logger.info("访问  PostController:channelSearch,search="+search);
		PageInfo<Vd_channel> pageInfo = null;
		Out<PageInfo<Vd_channel>> back = null;
		try {
			pageInfo = channelService.selectAll(page, size, search);
			logger.info(BackType.SUCCESS_SEARCH_NORMAL.getMessage() + ":channelSearch");
			back = new Out<PageInfo<Vd_channel>>(BackType.SUCCESS_SEARCH_NORMAL,pageInfo);
		} catch (ServiceException e) {
			logger.info(BackType.FAIL_SEARCH_NORMAL.getMessage() + ":channelSearch:" + e.getMessage());
			back = new Out<PageInfo<Vd_channel>>(BackType.FAIL_SEARCH_NORMAL,null,e.getMessage());
		}
		return back;
	}

	/**
	 * 新建视频频道
	 * 
	 * 对channel表有两次操作，一次插入，一次更新 根据条件创建频道，创建频道之后，再根据生成的频道ID合并其他条件生成oss路径，重新更新表
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value="新增视频频道",notes = "新增视频频道，同时在OSS"
			+ "上创建相关资源，包括推流地址和播放地址")
	@PostMapping(value = "channel_add")
	@ResponseBody
	public Out<String> channel_add(@ApiParam(value = "新增频道对象" ,required=true) @RequestBody In_Channel_Add c_channel) {
		logger.info("访问  PostController:channelAdd,c_channel="+c_channel);
		Vd_channel vd_channel = new Vd_channel();
		Out<String> back = new Out<String>();
		try {
			BeanUtils.copyProperties(vd_channel, c_channel);
			vd_channel.setStatus((byte) 1);
			vd_channel.setCreated(new Date());
			vd_channel.setUpdated(new Date());
			int rowNum = channelService.insertSelective(vd_channel);// insert
			if (rowNum > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "Id=" + vd_channel.getId() + ":rowNum=" + rowNum);
				// 创建oss文件夹，里面包含了一个新建线程，所以，在此处并不能知道当前是否创建oss成功，属于异步处理
				ossManagerService.startCreateOssChannel(vd_channel);
			} else {
				// 更新有问题
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_AFTER_INSERT, "rowNum=" + rowNum);
			}
		} catch (ServiceException e) {
			// 服务层错误，包括 内部service 和 对外service
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		} catch (Exception ex) {
			back.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, ex.getMessage());
		}
		return back;
	}

	/**
	 * 编辑视频频道
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value="编辑视频频道", notes = "编辑视频频道内容")
	@PostMapping(value = "channel_edit")
	@ResponseBody
	public Out<String> channel_edit(@ApiParam(value = "编辑频道对象" ,required=true) @RequestBody In_Channel_Edit c_channel) {
		logger.info("访问  PostController:channelEdit,c_channel="+c_channel);
		Vd_channel vd_channel = new Vd_channel();
		Out<String> back = new Out<String>();
		ChannelStatus channelStatus = new ChannelStatus(c_channel.getId(), c_channel.getStatus());
		try {
			BeanUtils.copyProperties(vd_channel, c_channel);
			websocketService.OperateVideo(channelStatus);
			int rowNum = channelService.updateByPrimaryKeySelective(vd_channel);// insert
			if (rowNum > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_UPDATE,
						"id=" + channelStatus.getChannelId() + "rowNum=" + rowNum);
			} else {
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL,
						"id=" + channelStatus.getChannelId() + "rowNum=" + rowNum);
			}
		} catch (ServiceException e) {
			// 服务层错误，包括 内部service 和 对外service
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		} catch (Exception ex) {
			back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL, ex.getMessage());
		}
		return back;
	}

	@ApiOperation(value="设置频道开关", notes = "设置频道状态，管理员设置频道开关，可以直接控制用户正在观看的频道的开闭，比如：紧急情况停播某个频道，正在观看该频道的家长将会立即无法观看")
	@PostMapping(value = "channel_set_status")
	@ResponseBody
	public Out<String> channel_set_status(@ApiParam(value = "频道状态对象" ,required=true) @RequestBody ChannelStatus channelStatus) {
		logger.info("访问  PostController:channel_set_status,channelStatus="+channelStatus);
		Out<String> back = new Out<String>();
		try {
			websocketService.OperateVideo(channelStatus);
			// TODO 没有区分是否改变，只要设置开关，一律通知客户端
			int rowNum = channelService.updateByChannelStatus(channelStatus);
			if (rowNum > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_SET,
						"id=" + channelStatus.getChannelId() + ":rowNum=" + rowNum);
			} else {
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL,
						"id=" + channelStatus.getChannelId() + ":rowNum=" + rowNum);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL, ex.getMessage());
		}
		return back;
	}

	@ApiOperation(value="删除视频", notes = "根据频道ID删除视频，只在逻辑上做删除处理，物理上不删除")
	@PostMapping(value = "channel_remove/{remove_id}")
	@ResponseBody
	public Out<String> channel_remove(@PathVariable("remove_id") int remove_id) {
		logger.info("访问  PostController:channel_remove,remove_id="+remove_id);
		Out<String> back = new Out<String>();
		try {
			// TODO 没有判断是否正在直播，如果此时删除，可能客户端还能看
			Vd_channel vd_channel = new Vd_channel();
			vd_channel.setId(remove_id);
			vd_channel.setDeleted(DeletedType.IS_DELETED.getValue());
			int rowNum = channelService.updateByPrimaryKeySelective(vd_channel);
			if (rowNum > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_DELETE, "id=" + vd_channel.getId() + ":rowNum=" + rowNum);
			} else {
				back.setBackTypeWithLog(BackType.FAIL_DELETE_NO_DELETE, "id=" + vd_channel.getId() + ":rowNum=" + rowNum);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			back.setBackTypeWithLog(BackType.FAIL_DELETE_NORMAL, ex.getMessage());
		}
		return back;
	}
	
	/**
	 * 获取学校列表
	 * 不带翻页的获取全部信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "school_all", method = {RequestMethod.GET, RequestMethod.POST})
	@GetMapping(value = "school_all")
	@ApiOperation(value="获取学校列表", notes = "获取所有学校信息，不翻页")
	@ResponseBody
	public Out<OutList<Tb_school>> school_all() {
		logger.info("访问  PostController:schools_get_all");
		List<Tb_school> schools = schoolService.selectAll4onUse();
		OutList<Tb_school> outList = new OutList<Tb_school>(schools.size(),schools);
		Out<OutList<Tb_school>> back = new Out<OutList<Tb_school>>();
		back.setBackTypeWithLog(outList, BackType.SUCCESS);
		return back;
	}
	
	@PostMapping(value = "schools_search")
	@ApiOperation(value="按学校名称搜索学校", notes = "按学校名称搜索学校，不翻页")
	@ResponseBody
	public Out<OutList<Tb_school>> schools_search(@ApiParam(value = "学校查询条件，学校名称" ,required=false) @RequestBody In_School_Search iss) {
		logger.info("访问  PostController:schools_search iss = "+iss);
		List<Tb_school> schools = null;
		OutList<Tb_school> outList = null;
		Out<OutList<Tb_school>> back = new Out<OutList<Tb_school>>();
		try {
			schools = schoolService.selectAll(iss);
			outList = new OutList<Tb_school>(schools.size(),schools);
			back.setBackTypeWithLog(outList,BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}
	
	@PostMapping(value = "classes_search_by_schoolid/{school_id}")
	@ApiOperation(value="按学校ID搜索班级", notes = "按学校ID搜索班级，不翻页")
	@ResponseBody
	public Out<OutList<Tb_class>> classes_search_by_schoolid(@PathVariable("school_id") int schoolId) {
		logger.info("访问  PostController:classes_search_by_schoolid schoolId = "+schoolId);
		List<Tb_class> classes = null;
		OutList<Tb_class> outList = null;
		Out<OutList<Tb_class>> back = new Out<OutList<Tb_class>>();
		try {
			classes = classService.selectAllBySchool(schoolId);
			outList = new OutList<Tb_class>(classes.size(),classes);
			back.setBackTypeWithLog(outList,BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	@PostMapping(value = "auth_switch_get_all/{page}/{size}")
	@ApiOperation(value="获取付费授权列表", notes = "取所有付费授权列表，带翻页，给表格提供的接口")
	@ResponseBody
	public Out<PageInfo<View_switch_s_c>> auth_switch_get_all(@PathVariable("page") int page, @PathVariable("size") int size) {
		logger.info("访问  PostController:auth_switch_get_all");
		Out<PageInfo<View_switch_s_c>> back = new Out<PageInfo<View_switch_s_c>>();
		PageInfo<View_switch_s_c>  data= authSwitchService.selectAll(page, size);
		back.setBackTypeWithLog(data, BackType.SUCCESS);
		return back;
	}
	
	@PostMapping(value = "auth_switch_by_school/{school_id}")
	@ApiOperation(value="获取学校付费授权列表", notes = "根据学校Id获取该校的授权信息，按班级划分，每个班级一个组，每组下是该班级的所有用户付费授权状态")
	@ResponseBody
	public Out<Out_Switch_School> auth_switch_by_school(@PathVariable("school_id") int schoolId) {
		logger.info("访问  PostController:auth_switch_by_school schoolId="+schoolId);
		Out<Out_Switch_School> back = new Out<Out_Switch_School>();
		Out_Switch_School out_Switch_School = new Out_Switch_School();
		out_Switch_School.setId(schoolId);
		out_Switch_School.setTitle(schoolService.selectNameByPrimaryKey(schoolId));
		//所有当前学校的授权信息，下面要根据班级对这些信息进行重新组合，计算总数
		List<Vd_auth_switch> data= authSwitchService.selectSwitch_by_school(schoolId);
		
		List<Tb_class> classes = classService.selectAllBySchool(schoolId);
		
		HashMap<Integer,Out_Switch_Class<Vd_auth_switch>> map = new HashMap<Integer,Out_Switch_Class<Vd_auth_switch>>();
		try{
			map = new HashMap<Integer,Out_Switch_Class<Vd_auth_switch>>();
			for (Tb_class tb_class : classes) {
				Out_Switch_Class<Vd_auth_switch> tmp = new Out_Switch_Class<Vd_auth_switch>();
				BeanUtils.copyProperties(tmp, tb_class);
				map.put(tb_class.getId(),tmp);
			}
			int tmp_classid = 0;
			for (Vd_auth_switch vd_auth_switch : data) {
				tmp_classid = vd_auth_switch.getClassId();
				Out_Switch_Class<Vd_auth_switch> tmp = map.get(tmp_classid);
				//如果tmp为Null，说明该班级可能被设置为删除状态
				if(tmp!=null)
				tmp.getList().add(vd_auth_switch);
			}
			List<Out_Switch_Class<Vd_auth_switch>> sss = new ArrayList<Out_Switch_Class<Vd_auth_switch>>();
			for (Out_Switch_Class<Vd_auth_switch>  osw : map.values()) {
				sss.add(osw);
			}
			//塞入班级下数量
			for (Out_Switch_Class<Vd_auth_switch> out_Switch_Class : sss) {
				out_Switch_Class.setNum(out_Switch_Class.getList().size());
			}
			out_Switch_School.setList(sss);
			out_Switch_School.setNum(sss.size());
			back.setBackTypeWithLog(out_Switch_School, BackType.SUCCESS);
		}catch(Exception ex){
			ex.printStackTrace();
			back.setBackTypeWithLog(BackType.FAIL_SEARCH_NORMAL);
		}
		return back;
	}

	@PostMapping(value = "auth_switch_search/{page}/{size}")
	@ApiOperation(value="搜索付费授权用户", notes = "查询付费授权用户，按学生姓名作为查询条件，带翻页")
	@ResponseBody
	public  Out<PageInfo<View_switch_s_c>> auth_switch_search(@PathVariable("page") int page, @PathVariable("size") int size,
			@ApiParam(value = "付费授权查询条件，学生姓名" ,required=false) @RequestBody In_Switch_Search iss) {
		logger.info("访问  PostController:auth_switch_search iss="+iss);
		Out<PageInfo<View_switch_s_c>> back = new Out<PageInfo<View_switch_s_c>>();
		PageInfo<View_switch_s_c> data = null;
		try {
			data = authSwitchService.selectAll(page, size, iss);
			back.setBackTypeWithLog(data,BackType.SUCCESS);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setBackTypeWithLog(BackType.FAIL_SEARCH_NORMAL);
		}
		return back;
	}

	/**
	 * 设置付费视频开关 编辑
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value="设置付费视频开关", notes = "设定某个用户付费授权状态，0禁用，1启用")
	@PostMapping(value = "auth_switch_edit4video")
	@ResponseBody
	public Out<String> auth_switch_edit4video(@ApiParam(value = "设置付费对象" ,required=true) @RequestBody In_Switch_Edit4Video swi) {
		logger.info("访问  PostController:switchEdit4Video swi="+swi);
		Vd_auth_switch vd_autu_swtich = new Vd_auth_switch();
		Out<String> back = new Out<String>();
		try {
			BeanUtils.copyProperties(vd_autu_swtich, swi);
			int rowNum = authSwitchService.updateUse(swi.getId(), swi.getIsUse());
			if (rowNum < 1) {// 没更新到数据
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_NO_UPDATE, "id=" + swi.getId() + ":rowNum=" + rowNum);
			} else if (rowNum == 1) {// 更新一条数据
				back.setBackTypeWithLog(BackType.SUCCESS_UPDATE, "id=" + swi.getId() + ":rowNum=" + rowNum);
			} else {// 更新超过一条数据
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_UPDATEMORE, "id=" + swi.getId() + ":rowNum=" + rowNum);
			}
		} catch (ServiceException de) {
			back.setServiceExceptionWithLog(de.getExceptionEnums());
		} catch (Exception e) {
			back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL, e.getMessage());
		}
		return back;
	}
	
	/**
	 * 返回频道信息
	 * 
	 * @return
	 */
	@PostMapping(value = "channel_all")
	@ApiOperation(value="全部频道信息", notes = "全频道信息，频道信息页")
	@ResponseBody
	public Out<InfoChannel_C> channel_all() {
		logger.info("访问  PostController:channel_all");
		InfoChannel_C ic = null;
		Out<InfoChannel_C> out = null;
		try {
			List<Tb_school> schools = schoolService.selectAll();
			List<Tb_school> schoolsOnUse = schoolService.selectAll4onUse();
			HashMap<Integer, String> schoolNameMap = new HashMap<Integer, String>();
			HashMap<Integer, Tb_school> schoolMap = new HashMap<Integer, Tb_school>();
			HashMap<Integer, InfoChannel> infoChannelMap = new HashMap<Integer, InfoChannel>();
			//组建schoolid schoolname map
			for (Iterator<Tb_school> iterator = schools.iterator(); iterator.hasNext();) {
				Tb_school tb_school = (Tb_school) iterator.next();
				schoolNameMap.put(tb_school.getId(), tb_school.getTitle());
				schoolMap.put(tb_school.getId(), tb_school);
			}
			ic = managerService.getInfoChannel_C();
			//取得返回信息包，此包还需要list进行填充
			//构建每个学校的信息，要将查询的监控的和直播的求和分别取出来，进行组合
			//不带状态的监控信息和直播信息
			List<View_channel_info> list_all_status = viewChannelService.selectAllView_channel_info();
			for (Iterator<View_channel_info> iterator = list_all_status.iterator(); iterator.hasNext();) {
				View_channel_info fo = (View_channel_info) iterator.next();
				InfoChannel one = null;
				if (infoChannelMap.get(fo.getSchoolId()) == null) {
					one = new InfoChannel();
					infoChannelMap.put(fo.getSchoolId(), one);
				} else {
					one = infoChannelMap.get(fo.getSchoolId());
				}
				// private int school_id;String school_name;int on_monitor_num;int on_live_num;
				// private int on_video_num;int all_monitor_num;int all_live_num;int all_video_num;
				one.setSchool_id(fo.getSchoolId());
				one.setSchool_name(schoolNameMap.get(fo.getSchoolId()));
				if (fo.getType() == ChannelType.MONITOR.getIndex()) {
					one.setAll_monitor_num(fo.getNum().intValue());
				} else {
					one.setAll_live_num(fo.getNum().intValue());
				}
			}
			List<View_channel_info_on> list_on = viewChannelService.selectAllView_channel_info_on();
			//带状态（启用）的监控信息和直播信息
			for (Iterator<View_channel_info_on> iterator = list_on.iterator(); iterator.hasNext();) {
				View_channel_info_on on = (View_channel_info_on) iterator.next();
				InfoChannel one = null;
				if (infoChannelMap.get(on.getSchoolId()) == null) {
					//one = new InfoChannel();
					logger.error("该学校频道信息应该已经有，不该走到这里，异常");
				} else {
					one = infoChannelMap.get(on.getSchoolId());
				}
				one.setSchool_name(schoolNameMap.get(on.getSchoolId()));
				if (on.getType() == ChannelType.MONITOR.getIndex()) {
					one.setOn_monitor_num(on.getNum().intValue());
				} else {
					one.setOn_live_num(on.getNum().intValue());
				}
			}
			ArrayList<InfoChannel> ss = new ArrayList<InfoChannel>();
			for (Iterator<InfoChannel> iterator = infoChannelMap.values().iterator(); iterator.hasNext();) {
				InfoChannel info =iterator.next();
				info.setAll_video_num(info.getAll_live_num()+info.getAll_monitor_num());
				info.setOn_video_num(info.getOn_monitor_num()+info.getOn_live_num());
				Tb_school tmpS = schoolMap.get(info.getSchool_id());
				if(tmpS!=null){
					//这个频道所属学校，必须是启用而且是未删除,否则不显示出来
					if(tmpS.getStatus()==StatusType.IS_USE.getIndex()&&tmpS.getDeleted()==DeletedType.N0_DELETED.getValue()){
						ss.add(info);
					}
				}
			}
			//有状态的学校，不包括
			//补齐无频道数据的学校
			for (Tb_school one : schoolsOnUse) {
				if(infoChannelMap.get(one.getId())!=null){
					//do nothing
				}else{
					InfoChannel empty = new InfoChannel();
					empty.setSchool_id(one.getId());
					empty.setSchool_name(one.getTitle());
					empty.setAll_live_num(0);
					empty.setAll_monitor_num(0);
					empty.setAll_video_num(0);
					empty.setOn_live_num(0);
					empty.setOn_monitor_num(0);
					empty.setOn_video_num(0);
					ss.add(empty);
				}
			}
			ic.setSchools(ss);
			ic.setSchool_num(ss.size());
			out = new Out<InfoChannel_C>(BackType.SUCCESS,ic);
		} catch (ServiceException e) {
			logger.warn(BackType.FAIL_SEARCH_NORMAL+":"+ e.getMessage());
			out = new Out<InfoChannel_C>(BackType.FAIL_SEARCH_NORMAL,ic);
		}
		return out;
	}
	
	/**
	 * 查询当前频道的所有时间控制
	 * 
	 * @param channel_Id 频道ID
	 * @return
	 */
	@PostMapping(value = "time_controls_search_by_schoolid/{school_id}")
	@ApiOperation(value="按学校ID获取频道及其时间控制", notes = "")
	@ResponseBody
	public Out<OutList<Out_Channel_Time_Control>> time_controls_search_by_schoolid(@PathVariable("school_id") int school_id) {
		logger.info("访问  PostController:time_controls_search_by_schoolid school_id = "+school_id);
		List<Out_Channel_Time_Control> channel_Controls = new ArrayList<Out_Channel_Time_Control>();
		Out<OutList<Out_Channel_Time_Control>> back = new Out<OutList<Out_Channel_Time_Control>>();
		try {
			List<Vd_channel> channels = channelService.selectAllBySchoolId(school_id);
			for (Vd_channel single_channel : channels) {
				Out_Channel_Time_Control one = new Out_Channel_Time_Control();
				BeanUtils.copyProperties(one, single_channel);
				channel_Controls.add(one);
			}
			List<Vd_auth_time_control> vatcs = controlService.selectBySchoolId(school_id);
			//频道循环
			for (Out_Channel_Time_Control l1 : channel_Controls) {
				int controls_num = 0;
				//“时间控制”循环，查哪个属于某频道
				for (Vd_auth_time_control l2 : vatcs) {
					//Integer的值不在-128到127的时候使用==方法判断是否相等就会出错，在这个范围之内的就会没有问题！！
					if(l1.getId().equals(l2.getChannelId())){
						l1.getControls().add(l2);
						controls_num++;
					}
				}
				l1.setControls_num(controls_num);
			}
			OutList<Out_Channel_Time_Control> outList = new OutList<Out_Channel_Time_Control>(channel_Controls.size(),channel_Controls);
			back.setBackTypeWithLog(outList,BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		} catch(Exception ex){
			logger.warn(ex.getMessage());
			back.setBackTypeWithLog(BackType.FAIL_SEARCH_NORMAL, ex.getMessage());
		}
		return back;
	}
	
	/**
	 * 查询当前频道的所有时间控制
	 * 
	 * @param channel_Id 频道ID
	 * @return
	 */
	@PostMapping(value = "time_controls_search_by_channelid/{channel_id}")
	@ApiOperation(value="按频道ID获取时间控制", notes = "一个频道可以有多个时间控制，这个指的是一天内，不负责周末或者节假日")
	@ResponseBody
	public Out<OutList<Vd_auth_time_control>> time_controls_search_by_channelid(@PathVariable("channel_id") int channel_Id) {
		logger.info("访问  PostController:controls_search_by_channelid channel_Id = "+channel_Id);
		List<Vd_auth_time_control> controls = null;
		OutList<Vd_auth_time_control> outList = null;
		Out<OutList<Vd_auth_time_control>> back = new Out<OutList<Vd_auth_time_control>>();
		try {
			controls = controlService.selectByChannelId(channel_Id);
			outList = new OutList<Vd_auth_time_control>(controls.size(),controls);
			back.setBackTypeWithLog(outList,BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}
	
	/**
	 * 新建时间控制
	 * 
	 * @param 
	 * @return
	 */
	@ApiOperation(value="新增时间控制",notes = "新增时间控制")
	@PostMapping(value = "time_control_add")
	@ResponseBody
	public Out<String> time_control_add(@ApiParam(value = "新增时间控制" ,required=true) @RequestBody In_Control_Add control_Add) {
		logger.info("访问  PostController:time_control_add,control_Add="+control_Add);
		Vd_auth_time_control vd_control = new Vd_auth_time_control();
		Out<String> back = new Out<String>();
		try {
			BeanUtils.copyProperties(vd_control, control_Add);
			//查学校ID和班级ID写入
			Vd_channel one = channelService.selectByPrimaryKey(control_Add.getChannelId());
			vd_control.setSchoolId(one.getSchoolId());
			vd_control.setClassId(one.getClassId());
			vd_control.setCreated(new Date());
			int rowNum = controlService.insertSelective(vd_control);// insert
			if (rowNum > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "Id=" + vd_control.getId() + ":rowNum=" + rowNum);
			} else {
				back.setBackTypeWithLog(BackType.FAIL_INSERT_NO_INSERT, "rowNum=" + rowNum);
			}
		} catch (ServiceException e) {
			// 服务层错误，包括 内部service 和 对外service
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		} catch (Exception ex) {
			back.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, ex.getMessage());
		}
		return back;
	}
	
	/**
	 * 编辑时间控制
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value="编辑时间控制", notes = "编辑时间控制")
	@PostMapping(value = "time_control_edit")
	@ResponseBody
	public Out<String> time_control_edit(@ApiParam(value = "编辑时间控制" ,required=true) @RequestBody In_Control_Edit control_Edit) {
		logger.info("访问  PostController:time_control_edit,control_Edit="+control_Edit);
		Vd_auth_time_control vd_control = new Vd_auth_time_control();
		Out<String> back = new Out<String>();
		try {
			BeanUtils.copyProperties(vd_control, control_Edit);
			int rowNum = controlService.updateByPrimaryKeySelective(vd_control);// insert
			if (rowNum > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_UPDATE);
			} else {
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL);
			}
		} catch (ServiceException e) {
			// 服务层错误，包括 内部service 和 对外service
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		} catch (Exception ex) {
			back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL, ex.getMessage());
		}
		return back;
	}
	
	/**
	 * 删除时间控制
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value="删除时间控制", notes = "根据频道ID删除删除时间控制")
	@PostMapping(value = "time_control_remove/{remove_id}")
	@ResponseBody
	public Out<String> time_control_remove(@PathVariable("remove_id") int remove_id) {
		logger.info("访问  PostController:time_control_remove,remove_id="+remove_id);
		Out<String> back = new Out<String>();
		try {
			int rowNum = controlService.deleteByPrimaryKey(remove_id);
			if (rowNum > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_DELETE, "remove_id=" + remove_id + ":rowNum=" + rowNum);
			} else {
				back.setBackTypeWithLog(BackType.FAIL_DELETE_NO_DELETE, "remove_id=" + remove_id + ":rowNum=" + rowNum);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			back.setBackTypeWithLog(BackType.FAIL_DELETE_NORMAL, ex.getMessage());
		}
		return back;
	}
	//查询出学生的成长记录
		@ApiOperation(value="查询学生的成长记录", notes = "根据学生的ID进行查询学生的成长记录")
		@PostMapping(value = "student_grow_record/{student_id}")
		@ResponseBody
		public Out<OutList<Hand_student>> student_grow_record(@PathVariable("student_id") int student_id) throws ParseException{
			logger.info("访问  PostController:select_student,student_id="+student_id);
			List<Tb_student_detection> classes = null;
			List<Hand_student> listStudent = new ArrayList<Hand_student>();
			OutList<Hand_student> outList = null;
			Out<OutList<Hand_student>> back = new Out<OutList<Hand_student>>();
			Hand_student hand=null;
			try {
				//获取学生的检测记录（完成）
				classes = controlService.selectBystudent(student_id);
				if(classes.size()!=0){
					//获取学生信息（完成）
					List<Tb_studentRecord> selectstudent = controlService.selectstudent(student_id);
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
					String dateString = formatter.format(selectstudent.get(0).getBirthday());
					//得到第一个时间（完成）
					String substring = dateString.substring(0, 7);
					//加上的时间（完成）
					String substring1=substring.substring(6, 7);
					int substring2=Integer.parseInt(substring1);
					int substring3=substring2+1;
					
					//得到第二个时间（完成）
					String substring4=substring.replace(substring1, substring3+"");
					java.text.SimpleDateFormat   formatter2   = 
							new   SimpleDateFormat( "yyyy-MM");
							Date   date1   =   formatter2.parse(substring);
							Date   date2   =   formatter2.parse(substring4);
					//直接查询最新的数据
					Tb_studentRecord tbs=new Tb_studentRecord();
					tbs.setBirthday(date1);
					tbs.setBirthday1(date2);
					List<Tb_student_detection> select_student_detection = controlService.select_student_detection(date1,date2);
					//计算同龄人的平均身高和体重（selectId中的id进行查询）
					//统计总的身高和体重
					int numHeight=0;
					int numWeight=0;
					//统计超过的了多少人
					int percentageHeight=0;
					int percentageWeight=0;
					//统计身高体重有数据的有多少人
					int i=0;
					for (Tb_student_detection tb_student_detection : select_student_detection) {
						if(tb_student_detection.getWeight()!=null && tb_student_detection.getHeight()!=null){
							numHeight+=tb_student_detection.getHeight();
							numWeight+=tb_student_detection.getWeight();
							i+=1;
						}
						if(classes.get(0).getHeight()>tb_student_detection.getHeight()){
							percentageHeight+=1;
						}
						if(classes.get(0).getWeight()>tb_student_detection.getWeight()){
							percentageWeight+=1;
						}
					}
					//平均身高和体重
					if(i!=0){
						numHeight=numHeight/i;
						numWeight=numWeight/i/1000;
						//超过的百分比
						percentageHeight=percentageHeight*100/i;
						percentageWeight=percentageWeight*100/i;
					}else{
						numHeight=0;
						numWeight=0;
					}
					//获取国家标准
					//计算月龄
					//当前的时间
					Date dateTime=new Date();
					SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String a=(dateTime.getTime()-selectstudent.get(0).getBirthday().getTime())/(1000*60*60*24)/30+"";
					System.err.println(dateTime.getTime()-selectstudent.get(0).getBirthday().getTime()+"______");
					//时间差得到月龄
					System.out.println((dateTime.getTime()-selectstudent.get(0).getBirthday().getTime())/(1000*60*60*24)/30+"=========");
					Tb_benchmark tb=new Tb_benchmark();
					if(Integer.parseInt(a)>81){
						
						tb.setAge(81);
					}
					else if(Integer.parseInt(a)%3==0){
						tb.setAge(Integer.parseInt(a));
					}else if(Integer.parseInt(a)<12){
						tb.setAge(12);
					}else{
						int b= Integer.parseInt(a)/3;
						tb.setAge(b);
					}
					tb.setSex((int)selectstudent.get(0).getGender());
					List<Tb_benchmark> selectByHeightAddWeight = controlService.selectByHeightAddWeight(tb);
					
					String compareHeight=null;
					String compareWeight=null;
					
					//和标准的比较
					Double ght=(double) (classes.get(0).getWeight()/1000);
					Double hgt=(double) (classes.get(0).getHeight()/10);
					for (Tb_benchmark tb_benchmark : selectByHeightAddWeight) {
						if(hgt>tb_benchmark.getHeight1() && hgt<tb_benchmark.getHeight2()){
							compareHeight="正常";
						}
						if(hgt>tb_benchmark.getHeight2()){
							compareHeight="偏高";
						}
						if(hgt<tb_benchmark.getHeight1()){
							compareHeight="偏矮";
						}
						if(ght>tb_benchmark.getWeight1() && ght<tb_benchmark.getWeight2()){
							compareWeight="正常";
						}
						if(ght>tb_benchmark.getWeight2()){
							compareWeight="偏胖";
						}
						if(ght<tb_benchmark.getWeight1()){
							compareWeight="偏瘦";
						}
					}
					
					SimpleDateFormat ter = new SimpleDateFormat("yyyy.MM.dd");
					String time = ter.format(classes.get(0).getCreated());
					StringBuilder builder=new StringBuilder("http://image-didanuo.oss-cn-shenzhen.aliyuncs.com/");
					builder.append(classes.get(0).getOrgImgUrl());
					hand=new Hand_student(selectstudent.get(0).getName(),time,
							classes.get(0).getHeight()/10, classes.get(0).getWeight()/1000,
							numHeight, numWeight, percentageHeight+"%", percentageWeight+"%",
							selectByHeightAddWeight.get(0).getHeight1(),
							selectByHeightAddWeight.get(0).getHeight2(), 
							selectByHeightAddWeight.get(0).getWeight1(), 
							selectByHeightAddWeight.get(0).getWeight2(),
							compareHeight, compareWeight,builder.toString());
					listStudent.add(0,hand);
					outList = new OutList<Hand_student>(listStudent.size(),listStudent);
					
					back.setBackTypeWithLog(outList,BackType.SUCCESS_SEARCH_NORMAL);
				}
			} catch (ServiceException e) {
				logger.warn(e.getMessage());
				back.setServiceExceptionWithLog(e.getExceptionEnums());
			}
			return back;
		}
}
