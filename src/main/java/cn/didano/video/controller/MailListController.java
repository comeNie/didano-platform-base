package cn.didano.video.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_bossData;
import cn.didano.base.model.Tb_class;
import cn.didano.base.model.Tb_classStudent;
import cn.didano.base.model.Tb_classStudentParent;
import cn.didano.base.model.Tb_deleteParentDate;
import cn.didano.base.model.Tb_mailList_list;
import cn.didano.base.model.Tb_newstudent;
import cn.didano.base.model.Tb_parent;
import cn.didano.base.model.Tb_relation;
import cn.didano.base.model.Tb_schoolparent;
import cn.didano.base.model.Tb_sign_type;
import cn.didano.base.model.Tb_staff;
import cn.didano.base.model.Tb_staff4MailList;
import cn.didano.base.model.Tb_staffData;
import cn.didano.base.model.Tb_staff_class;
import cn.didano.base.model.Tb_studentData;
import cn.didano.base.model.Tb_studentparent;
import cn.didano.base.model.Tb_teacher;
import cn.didano.base.model.Tb_teacherAndStudent;
import cn.didano.base.service.ClassService;
import cn.didano.base.service.MailListService;
import cn.didano.base.service.StaffService;
import cn.didano.base.service.StudentService;
import cn.didano.video.app.config.AppConfigProperties;
import cn.didano.video.constant.BackType;
import cn.didano.video.constant.StaffType;
import cn.didano.video.json.In_Student_Edit;
import cn.didano.video.json.In_Teacher_Edit;
import cn.didano.video.json.Out;
import cn.didano.video.json.OutList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.sf.json.JSONObject;

@Api(value = "通讯录服务", tags = "通讯录服务，提供给表现层")
@RestController
@RequestMapping(value = "/base/maillist/post/")
public class MailListController {

	static Logger logger = Logger.getLogger(MailListController.class);

	@Autowired
	private MailListService mailListService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private StaffService staffService;
	@Autowired
	private ClassService classService;
	@Autowired
	AppConfigProperties appConfigProperties;

	/**
	 * 家长查看本班老师
	 * 
	 * @throws ParseException
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	@PostMapping(value = "Parent_findteacher/{student_id}")
	@ApiOperation(value = "家长查看本班老师", notes = "通过老师id查询小朋友")
	@ResponseBody
	public Out<OutList<Tb_staff>> Parent_findteacher(@PathVariable("student_id") Integer student_id)
			throws ParseException, IllegalAccessException, InvocationTargetException {
		logger.info("访问  MailListController:Parent_findteacher,student_id=" + student_id);

		Tb_mailList_list student = null;
		List<Tb_teacher> classstaff = null;
		OutList<Tb_staff> outList = null;
		Out<OutList<Tb_staff>> back = new Out<OutList<Tb_staff>>();
		try {
			student = mailListService.findById(student_id);
			classstaff = mailListService.findTeacherByClass(student.getClass_id());
			List<Tb_staff> doctor = new ArrayList<Tb_staff>();
			Tb_staff staff1 = null;
			for (Tb_teacher teacher : classstaff) {
				staff1 = new Tb_staff();
				BeanUtils.copyProperties(staff1, teacher);

				staff1.setSchoolId(teacher.getSchool_id());

				doctor.add(staff1);
			}
			outList = new OutList<Tb_staff>(doctor.size(), doctor);

			back.setBackTypeWithLog(outList, BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 查询班级关系对应 当前登录老师所对应的班级
	 */
	@PostMapping(value = "findStaff_ClassInfo/{staff_id}")
	@ApiOperation(value = "查询班级关系对应", notes = "查询班级关系对应")
	@ResponseBody
	public Out<OutList<Tb_class>> findStaff_ClassInfo(@PathVariable("staff_id") Integer id) {
		logger.info("访问  MailListController : findStaff_ClassInfo,staff_id=" + id);
		Tb_staff staff = staffService.findById(id);
		List<Tb_class> classs = null;
		OutList<Tb_class> outList = null;
		Out<OutList<Tb_class>> back = new Out<OutList<Tb_class>>();
		try {
			classs = classService.findAll(staff.getSchoolId());
			if (classs.size() > 0) {
				outList = new OutList<Tb_class>(classs.size(), classs);
				back.setBackTypeWithLog(outList, BackType.SUCCESS_UPDATE);
			} else {
				back.setBackTypeWithLog(outList, BackType.FAIL_UPDATE_NORMAL);
			}
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 查询家长关系对应
	 */
	@PostMapping(value = "relation")
	@ApiOperation(value = "查询家长关系对应", notes = "查询家长关系对应")
	@ResponseBody
	public Out<OutList<Tb_relation>> relation() {
		logger.info("访问  MailListController :relation");
		List<Tb_relation> relation = null;
		OutList<Tb_relation> outList = null;
		Out<OutList<Tb_relation>> back = new Out<OutList<Tb_relation>>();
		try {
			relation = mailListService.findrelation();
			if (relation.size() > 0) {
				outList = new OutList<Tb_relation>(relation.size(), relation);
				back.setBackTypeWithLog(outList, BackType.SUCCESS_UPDATE);
			} else {
				back.setBackTypeWithLog(outList, BackType.FAIL_UPDATE_NORMAL);
			}
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 通过名字搜索
	 * 
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	@PostMapping(value = "studentstaff_searchByName/{name}/{id}")
	@ApiOperation(value = "通过名字搜索", notes = "通过名字搜索")
	@ResponseBody
	public Out<Tb_bossData> studentstaff_searchByName(@PathVariable("name") String name, @PathVariable("id") Integer id)
			throws IllegalAccessException, InvocationTargetException {
		logger.info("访问  MailListController:studentstaff_searchByName,name=" + name + ",id=" + id);
		Tb_staff s0 = staffService.findById(id);
		Tb_staff4MailList s1 = mailListService.findbystaffbyid(id);
		// 按名字查询老师集合
		List<Tb_staff> staffAll = new ArrayList<Tb_staff>();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		if (s0.getType() == StaffType.SCHOOLMASTER.getIndex()) {
			List<Tb_staff> staffA = staffService.findByNameSchool("%" + name + "%", s0.getSchoolId());
			// 取教职工（老师）
			Tb_staff4MailList target = null;
			Tb_sign_type t = null;
			for (Tb_staff staff : staffA) {
				target = new Tb_staff4MailList();
				BeanUtils.copyProperties(target, staff);
				if (target.getSignTypeId() != 0) {
					t = staffService.findTypeByID(target.getSignTypeId());
					target.setIn_time(sdf.format(t.getInTime()));
					target.setOut_time(sdf.format(t.getOutTime()));
				}
				staffAll.add(target);
			}

		} else {
			List<Tb_staff> boss = staffService.findBossByNameschool("%" + name + "%", s0.getSchoolId());
			Tb_staffData data2 = new Tb_staffData();
			data2.setName("%" + name + "%");
			data2.setClass_id(s1.getClass_id());
			staffAll.addAll(boss);
			List<Tb_staff> teacherAll = mailListService.findTeacherByNameClass(data2);
			Tb_sign_type t0 = null;
			if (!teacherAll.isEmpty()) {
				for (Tb_staff one : teacherAll) {
					Tb_staff4MailList target0 = new Tb_staff4MailList();
					BeanUtils.copyProperties(target0, one);
					if (target0.getSignTypeId() != 0) {
						t0 = staffService.findTypeByID(target0.getSignTypeId());
						target0.setIn_time(sdf.format(t0.getInTime()));
						target0.setOut_time(sdf.format(t0.getOutTime()));
					}
					staffAll.add(target0);
				}
			}
			List<Tb_staff> n = staffService.findByNameType("%" + name + "%", s0.getSchoolId());
			Tb_sign_type t1 = null;
			if (!n.isEmpty()) {
				for (Tb_staff one : n) {
					Tb_staff4MailList target1 = new Tb_staff4MailList();
					BeanUtils.copyProperties(target1, one);
					if (target1.getSignTypeId() != 0) {
						t1 = staffService.findTypeByID(target1.getSignTypeId());
						target1.setIn_time(sdf.format(t1.getInTime()));
						target1.setOut_time(sdf.format(t1.getOutTime()));
					}
					staffAll.add(target1);
				}
			}
		}
		Tb_bossData data = new Tb_bossData();
		List<Tb_mailList_list> student = null;
		List<Tb_classStudent> student2 = new ArrayList<Tb_classStudent>();
		// 学生同名顶多三次
		Out<Tb_bossData> back = new Out<Tb_bossData>();
		try {

			if (staffAll.size() != 0) {
				data.getStaff().addAll(staffAll);
			}
			Tb_studentData data1 = new Tb_studentData();
			if (s0.getType() == StaffType.SCHOOLMASTER.getIndex()) {

				data1.setName("%" + name + "%");
				data1.setSchoolid(s0.getSchoolId());
				// 按名字查询学生集合
				student = mailListService.findByname(data1);
			} else {
				data1.setName("%" + name + "%");
				data1.setSchoolid(s1.getClass_id());
				student = mailListService.findBynameClass(data1);
			}

			// 循环，取每个
			// 当出现一个新的class 创建一个hashmap2 key=student_id value= list
			// 循环将处理，当getkey by student_id =null,创建一个list，并将家长写入list中
			// 如果有，通过hashmap 的key获取这个家长list，然后写入
			// 组装我所需要的数据格式
			Map<Integer, List<Tb_mailList_list>> map = new HashMap<Integer, List<Tb_mailList_list>>();
			for (Tb_mailList_list list : student) {
				List<Tb_parent> parent = mailListService.findparent(list.getId());
				list.getParent().addAll(parent);
				if (map.containsKey(list.getClass_id())) {
					map.get(list.getClass_id()).add(list);
				} else {
					List<Tb_mailList_list> mailLists = new ArrayList<Tb_mailList_list>();
					mailLists.add(list);
					map.put(list.getClass_id(), mailLists);
				}
			}

			
			Set<Integer> keys = map.keySet();
			Iterator<Integer> it = keys.iterator();
			while (it.hasNext()) {
				Integer key = it.next();
				List<Tb_mailList_list> val = map.get(key);
				Tb_classStudent s = new Tb_classStudent();
				s.setClassId(key);
				s.setClassName(classService.selectNameByPrimaryKey(key));
				s.setStudent(val);
				
				student2.add(s);
			}
			data.setStudentall(student2);

			back.setBackTypeWithLog(data, BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}

		return back;
	}

	/**
	 * 
	 * 删除员工
	 * 
	 * @param teacher_id
	 * @return
	 */
	@PostMapping(value = "deleteStaff/{staff_id}")
	@ApiOperation(value = "删除员工", notes = "删除员工")
	@ResponseBody
	public Out<String> deleteStaff(@PathVariable("staff_id") Integer staff_id) {
		logger.info("访问  MailListController:deleteStaff,staff_id=" + staff_id);
		Out<String> back = new Out<String>();
		try {
			int rowNum = staffService.delete(staff_id);
			if (rowNum > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_UPDATE, "rowNum=" + rowNum);
			} else {
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL, "rowNum=" + rowNum);
			}
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 新增职工
	 * 
	 * 根据条件创建老师，创建老师之后，再根据生成的老师id与生成其他表的数据
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value = "新增编辑职工", notes = "新增职工")
	@PostMapping(value = "Teacher_add")
	@ResponseBody
	public Out<String> Teacher_add(
			@ApiParam(value = "新增编辑职工", required = true) @RequestBody In_Teacher_Edit teacher_a) {
		logger.info("访问  MailListController:Teacher_add,teacher_a=" + teacher_a);
		Tb_staff s = staffService.findById(teacher_a.getStaffid());
		Tb_staff vd_staff = new Tb_staff();
		Tb_staff_class vd_class = new Tb_staff_class();
		Tb_sign_type vd_date = new Tb_sign_type();
		Out<String> back = new Out<String>();
		try {
			BeanUtils.copyProperties(vd_staff, teacher_a);
			int rowNum = 0;
			int rowNum3 = 0;
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			if (vd_staff.getId() == null) {
				if (teacher_a.getType() != StaffType.SCHOOLMASTER.getIndex()) {
					vd_date.setSchoolId(s.getSchoolId());
					vd_date.setInTime(sdf.parse(teacher_a.getSetIntime()));
					vd_date.setOutTime(sdf.parse(teacher_a.getSetOuttime()));
					vd_date.setCreated(new Date());
					rowNum3 = staffService.insertTypeSelective(vd_date);
				}
				vd_staff.setCreated(new Date());
				if (teacher_a.getType() != StaffType.SCHOOLMASTER.getIndex()) {
					vd_staff.setSignTypeId(vd_date.getId());
				} else {
					vd_staff.setSignTypeId(0);
				}
				vd_staff.setSchoolId(s.getSchoolId());
				rowNum = staffService.insertTeacherSelective(vd_staff);// insert
				if (teacher_a.getType() == 32) {
					vd_class.setClassId(teacher_a.getClassId());
					vd_class.setCreated(new Date());
					vd_class.setSchoolId(vd_staff.getSchoolId());
					vd_class.setStaffId(vd_staff.getId());
					staffService.insertClassSelective(vd_class);
				}
				HttpPost httpPost = new HttpPost(appConfigProperties.getQrcodePath());
		        CloseableHttpClient client = HttpClients.createDefault();
		        String respContent = null;
		        
		        //新增家长json方式
		        JSONObject jsonParam = new JSONObject();  
		        jsonParam.put("school_id", vd_staff.getSchoolId());
		        jsonParam.put("type", 2);
		        jsonParam.put("staff_id", vd_staff.getId());
		       
		        StringEntity entity = new StringEntity(jsonParam.toString(),"utf-8");//解决中文乱码问题    
		        entity.setContentEncoding("UTF-8");    
		        entity.setContentType("application/json");    
		        httpPost.setEntity(entity);
		          

		        HttpResponse resp = client.execute(httpPost);
		        if(resp.getStatusLine().getStatusCode() == 200) {
		            HttpEntity he = resp.getEntity();
		            respContent = EntityUtils.toString(he,"UTF-8");
		        }

		        System.out.println(respContent);
				if (rowNum > 0) {
					back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "Id=" + "," + ":rowNum3=" + rowNum3);

				} else {
					// 更新有问题
					back.setBackTypeWithLog(BackType.FAIL_UPDATE_AFTER_INSERT, "rowNum=" + rowNum);
				}
			} else {
				if (teacher_a.getType() == StaffType.SCHOOLMASTER.getIndex()) {
					vd_staff.setSignTypeId(0);
				} else {
					if (staffService.findById(teacher_a.getId()).getSignTypeId() != 0) {
						vd_date.setSchoolId(s.getSchoolId());

						vd_date.setInTime(sdf.parse(teacher_a.getSetIntime()));
						vd_date.setOutTime(sdf.parse(teacher_a.getSetOuttime()));

						vd_date.setId(staffService.findById(teacher_a.getId()).getSignTypeId());
						
						rowNum3 = staffService.updateType(vd_date);
					} else {
						vd_date.setSchoolId(s.getSchoolId());
						vd_date.setInTime(sdf.parse(teacher_a.getSetIntime()));
						vd_date.setOutTime(sdf.parse(teacher_a.getSetOuttime()));
						vd_date.setCreated(new Date());
						rowNum3 = staffService.insertTypeSelective(vd_date);
						vd_staff.setSignTypeId(vd_date.getId());
					}

				}
				rowNum = staffService.updatestaff(vd_staff);
				if (teacher_a.getType() == 32) {
					if (!staffService.findclassidByStaffid(vd_staff.getId()).isEmpty()) {
						vd_class.setClassId(teacher_a.getClassId());

						vd_class.setId(staffService.findclassidByStaffid(vd_staff.getId()).get(0).getId());
						vd_class.setSchoolId(s.getSchoolId());
						vd_class.setStaffId(teacher_a.getId());
						staffService.updateclass(vd_class);
					} else {
						vd_class.setClassId(teacher_a.getClassId());
						vd_class.setCreated(new Date());
						vd_class.setSchoolId(s.getSchoolId());
						vd_class.setStaffId(vd_staff.getId());
						staffService.insertClassSelective(vd_class);
					}
				}

				if (rowNum > 0) {
					back.setBackTypeWithLog(BackType.SUCCESS_UPDATE, "Id=" + "," + ":rowNum3=" + rowNum3);

				} else {
					// 更新有问题
					back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL, "rowNum=" + rowNum);
				}
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
	 * 通过班级查找老师
	 */
	@PostMapping(value = "teacher_searchByClass/{class_id}")
	@ApiOperation(value = "通过班级查找老师", notes = "通过班级查找老师")
	@ResponseBody
	public Out<OutList<Tb_teacher>> teacher_searchByClass(@PathVariable("class_id") Integer class_id) {
		logger.info("访问  MailListController:teacher_searchByClass,class_id=" + class_id);
		List<Tb_teacher> teacher = null;
		OutList<Tb_teacher> outList = null;
		Out<OutList<Tb_teacher>> back = new Out<OutList<Tb_teacher>>();
		try {
			teacher = mailListService.findTeacherByClass(class_id);

			outList = new OutList<Tb_teacher>(teacher.size(), teacher);
			back.setBackTypeWithLog(outList, BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 通过园长id查询小朋友并通过班级分类
	 * 
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	@PostMapping(value = "student_searchByBoss/{staff_id}")
	@ApiOperation(value = "通过园长id查询小朋友并通过班级分类", notes = "园长查询小朋友并通过班级分类")
	@ResponseBody
	public Out<Tb_bossData> student_searchByBoss(@PathVariable("staff_id") Integer staff_id)
			throws IllegalAccessException, InvocationTargetException {
		logger.info("访问  MailListController:student_searchByBoss,staff_id=" + staff_id);
		Tb_staff staff = staffService.findById(staff_id);
		Tb_bossData data = new Tb_bossData();
		List<Tb_mailList_list> student = null;
		List<Tb_classStudent> student2 = new ArrayList<Tb_classStudent>();

		Tb_classStudent cs = null;

		Out<Tb_bossData> back = new Out<Tb_bossData>();
		try {
			// 取该学校所有班级对应的学生
			List<Tb_class> classall = mailListService.findClassByschool(staff.getSchoolId());
			// 按学生分类存进一个map
			Map<Integer, List<Tb_class>> m = new HashMap<Integer, List<Tb_class>>();
			for (Tb_class c : classall) {
				if (m.containsKey(c.getId())) {
					m.get(c.getId()).add(c);
				} else {
					List<Tb_class> newOne = new ArrayList<Tb_class>();
					newOne.add(c);
					m.put(c.getId(), newOne);
				}
			}
			// 循环遍历成一个学生家长集合
			List<Tb_classStudentParent> cspAll = new ArrayList<Tb_classStudentParent>();
			Set<Integer> keys1 = m.keySet();
			Iterator<Integer> it1 = keys1.iterator();
			while (it1.hasNext()) {
				Integer key = it1.next(); 
				List<Tb_class> val = m.get(key);
				List<Tb_parent> parentall = new ArrayList<Tb_parent>();
				Tb_parent parent = null;
				for (Tb_class c : val) {
					if(c.getParent_name()!=null){
					parent = new Tb_parent();
					parent.setParent_name(c.getParent_name());
					parent.setParent_phone(c.getParent_phone());
					parent.setRelation_id(c.getRelation_id());
					parent.setId(c.getParent_id());
					// 编辑家长的rfid
					parent.setRfid(c.getRfid());
					parentall.add(parent);
					}
				}
				Tb_classStudentParent csp = new Tb_classStudentParent();
				BeanUtils.copyProperties(csp, val.get(0));
				if(!parentall.isEmpty()){
				csp.setParent(parentall);
				}
				cspAll.add(csp);
			}
			// 将学生家长集合通过班级分类
			Map<Integer, List<Tb_mailList_list>> map = new HashMap<Integer, List<Tb_mailList_list>>();
			Tb_mailList_list mailList = null;

			for (Tb_classStudentParent c : cspAll) {
				mailList = new Tb_mailList_list();
				mailList.setBirthday(c.getBirthday());
				mailList.setClass_id(c.getClass_id());
				mailList.setGender(c.getGender());
				mailList.setId(c.getId());
				mailList.setName(c.getName());
				mailList.setClass_name(c.getTitle());
				mailList.setParent(c.getParent());
				// 学生的rfid
				mailList.setStudent_rfid(c.getStudent_rfid());
				if (map.containsKey(c.getClass_id())) {
					map.get(c.getClass_id()).add(mailList);
				} else {
					student = new ArrayList<Tb_mailList_list>();
					student.add(mailList);
					map.put(c.getClass_id(), student);
				}
			}
			// 循环map将数据返回给总返回数据
			Set<Integer> keys = map.keySet();
			Iterator<Integer> it = keys.iterator();
			while (it.hasNext()) {
				Integer key = it.next();
				List<Tb_mailList_list> val = map.get(key);
				
				cs = new Tb_classStudent();
				cs.setClassId(key);
				if (!val.isEmpty()) {
					cs.setClassName(val.get(0).getClass_name());
				}
				cs.setStudent(val);
				student2.add(cs);
			}

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			// 返回数据集合
			List<Tb_staff4MailList> staffall = new ArrayList<Tb_staff4MailList>();
			// 校长
			List<Tb_staff> bosses = staffService.findBossByschool(staff.getSchoolId());
			if (!bosses.isEmpty()) {
				for (Tb_staff one : bosses) {
					Tb_staff4MailList target = new Tb_staff4MailList();
					BeanUtils.copyProperties(target, one);
					staffall.add(target);
				}
			}
			// 取教职工（老师）
			List<Tb_teacher> teacherall = mailListService.findteacherByschool(staff.getSchoolId());
			Tb_staff4MailList staff1 = null;
			for (Tb_teacher teacher : teacherall) {
				staff1 = new Tb_staff4MailList();
				BeanUtils.copyProperties(staff1, teacher);
				String intime = sdf.format(teacher.getIn_time());
				String outtime = sdf.format(teacher.getOut_time());
				staff1.setSchoolId(teacher.getSchool_id());
				staff1.setIn_time(intime);
				staff1.setOut_time(outtime);
				staffall.add(staff1);
			}
			// 取教职工（医生、勤务）
			List<Tb_staff> workers = staffService.findByType(staff.getSchoolId());
			Tb_sign_type t = null;
			if (!workers.isEmpty()) {
				for (Tb_staff one : workers) {
					Tb_staff4MailList target = new Tb_staff4MailList();
					BeanUtils.copyProperties(target, one);
					if (target.getSignTypeId() != 0) {
						t = staffService.findTypeByID(target.getSignTypeId());
						target.setIn_time(sdf.format(t.getInTime()));
						target.setOut_time(sdf.format(t.getOutTime()));
					}
					staffall.add(target);
				}
			}
			data.getStaff().addAll(staffall);
			data.getStudentall().addAll(student2);
			back.setBackTypeWithLog(data, BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 通过老师id查询小朋友
	 * 
	 * @throws ParseException
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	@PostMapping(value = "student_searchByClass/{staff_id}")
	@ApiOperation(value = "通过老师id查询小朋友", notes = "通过老师id查询小朋友")
	@ResponseBody
	public Out<Tb_teacherAndStudent> student_searchByClass(@PathVariable("staff_id") Integer staff_id)
			throws ParseException, IllegalAccessException, InvocationTargetException {
		logger.info("访问  MailListController:student_searchByClass,staff_id=" + staff_id);
		Tb_staff staff = staffService.findById(staff_id);
		Tb_staff classid = mailListService.findClassIdBySid(staff_id);
		Tb_teacherAndStudent data = new Tb_teacherAndStudent();
		List<Tb_mailList_list> students = null;
		Tb_classStudent cs = new Tb_classStudent();
		Out<Tb_teacherAndStudent> back = new Out<Tb_teacherAndStudent>();
		try {
			if (staff.getType() == StaffType.TEACHEER.getIndex()) {
				students = mailListService.findByTeacher(staff.getId());
				if (!students.isEmpty()) {
					for (Tb_mailList_list list : students) {
						List<Tb_parent> parent = mailListService.findparent(list.getId());
						list.getParent().addAll(parent);
					}
					
					cs.getStudent().addAll(students);
				}
				cs.setClassId(classid.getClass_id());
				cs.setClassName(classService.selectNameByPrimaryKey(classid.getClass_id()));
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

					List<Tb_staff4MailList> all = new ArrayList<Tb_staff4MailList>();
					List<Tb_staff> bosses = staffService.findBossByschool(staff.getSchoolId());
					// 校长
					if (!bosses.isEmpty()) {
						for (Tb_staff one : bosses) {
							Tb_staff4MailList target = new Tb_staff4MailList();
							BeanUtils.copyProperties(target, one);
							all.add(target);
						}
					}
					// 取教职工（老师）
					List<Tb_teacher> classstaff = mailListService.findTeacherByClass(classid.getClass_id());
					Tb_staff4MailList staff1 = null;
					for (Tb_teacher teacher : classstaff) {
						staff1 = new Tb_staff4MailList();
						BeanUtils.copyProperties(staff1, teacher);
						String intime = sdf.format(teacher.getIn_time());
						String outtime = sdf.format(teacher.getOut_time());
						staff1.setSchoolId(teacher.getSchool_id());
						staff1.setIn_time(intime);
						staff1.setOut_time(outtime);
						all.add(staff1);
					}
					// 教职工（后勤）
					List<Tb_staff> workers = staffService.findByType(staff.getSchoolId());
					Tb_sign_type t = null;
					if (!workers.isEmpty()) {
						for (Tb_staff one : workers) {
							Tb_staff4MailList target = new Tb_staff4MailList();
							BeanUtils.copyProperties(target, one);
							if (target.getSignTypeId() != 0) {
								t = staffService.findTypeByID(target.getSignTypeId());
								target.setIn_time(sdf.format(t.getInTime()));
								target.setOut_time(sdf.format(t.getOutTime()));
							}
							all.add(target);
						}
					}
					data.getDoctor().addAll(all);
					data.setStudentall(cs);
				
			}
			back.setBackTypeWithLog(data, BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 通过小朋友id编辑其家长信息
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value = "编辑特定小朋友家长的信息", notes = "编辑小朋友家长信息")
	@PostMapping(value = "parent_edit")
	@ResponseBody
	public Out<String> parent_edit(
			@ApiParam(value = "编辑特定小朋友家长的信息", required = true) @RequestBody List<Tb_parent> parent_edit) {
		logger.info("访问  MailListController:parent_edit,parent_edit=" + parent_edit);
		List<Tb_parent> parentall = new ArrayList<Tb_parent>();
		Out<String> back = new Out<String>();
		try {
			parentall.addAll(parent_edit);
			int rowNum = 0;// insert
			for (Tb_parent parent : parentall) {
				mailListService.UpdateParent(parent);
				rowNum++;
			}
			if (rowNum > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_UPDATE, "rowNum=" + rowNum);
			} else {
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL, "rowNum=" + rowNum);
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
	 * 通讯录首页 通过小朋友id删除该小朋友及其所有家长信息
	 * 
	 * @param teacher_id
	 * @return
	 */
	@PostMapping(value = "deleteByChildId/{student_id}")
	@ApiOperation(value = "通过小朋友id删除该小朋友及其所有家长信息", notes = "通过小朋友id删除")
	@ResponseBody
	public Out<String> deleteByChildId(@PathVariable("student_id") Integer student_id) {
		logger.info("访问  MailListController:deleteByChildId,student_id=" + student_id);
		Out<String> back = new Out<String>();
		List<Tb_parent> parentall = null;
		try {
			int rowNum = mailListService.delete(student_id);
			parentall = mailListService.findparent(student_id);
			if (!parentall.isEmpty()) {
				mailListService.deleteparent(student_id);
			}
			if (rowNum > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_UPDATE, "rowNum=" + rowNum);
			} else {
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL, "rowNum=" + rowNum);
			}
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 通讯录首页 通过小朋友id查询该小朋友所有家长信息
	 * 
	 * @param teacher_id
	 * @return
	 */
	@PostMapping(value = "parent_searchByChildId/{student_id}")
	@ApiOperation(value = "通过小朋友id查询所有父母", notes = "通过小朋友id查询")
	@ResponseBody
	public Out<OutList<Tb_parent>> parent_searchByChildId(@PathVariable("student_id") Integer student_id) {
		logger.info("访问  MailListController:parent_searchByChildId,student_id=" + student_id);
		List<Tb_parent> parentall = null;
		OutList<Tb_parent> outList = null;
		Out<OutList<Tb_parent>> back = new Out<OutList<Tb_parent>>();
		try {
			parentall = mailListService.findparent(student_id);
			outList = new OutList<Tb_parent>(parentall.size(), parentall);
			back.setBackTypeWithLog(outList, BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 通讯录首页 通过小朋友id查询小朋友及其家长信息
	 * 
	 * @param teacher_id
	 * @return
	 */
	@PostMapping(value = "student_searchById/{student_id}")
	@ApiOperation(value = "通过小朋友id查询小朋友及其家长信息", notes = "通过小朋友id查询")
	@ResponseBody
	public Out<Tb_mailList_list> student_searchById(@PathVariable("student_id") Integer student_id) {
		logger.info("访问  MailListController:student_searchById,student_id=" + student_id);
		Tb_mailList_list student = null;
		Out<Tb_mailList_list> back = new Out<Tb_mailList_list>();
		try {
			student = mailListService.findById(student_id);
			List<Tb_parent> parent = mailListService.findparent(student.getId());
			student.getParent().addAll(parent);

			back.setBackTypeWithLog(student, BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 通讯录首页 查询所有小朋友及其家长信息
	 * 
	 * @param teacher_id
	 * @return
	 */
	@PostMapping(value = "student_searchall")
	@ApiOperation(value = "搜索所有小朋友", notes = "搜索所有小朋友")
	@ResponseBody
	public Out<OutList<Tb_mailList_list>> student_searchall() {
		logger.info("访问  MailListController:student_searchall");
		List<Tb_mailList_list> studentall = null;
		OutList<Tb_mailList_list> outList = null;
		Out<OutList<Tb_mailList_list>> back = new Out<OutList<Tb_mailList_list>>();
		try {
			studentall = mailListService.findAll();
			for (Tb_mailList_list list : studentall) {
				List<Tb_parent> parent = mailListService.findparent(list.getId());
				list.getParent().addAll(parent);
			}
			outList = new OutList<Tb_mailList_list>(studentall.size(), studentall);
			back.setBackTypeWithLog(outList, BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 新建小朋友
	 * 
	 * 根据条件创建小朋友，创建小朋友之后，再根据生成的小朋友ID建立父母的联系
	 * 
	 * @param c_channel
	 * @return
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	@ApiOperation(value = "新增编辑小朋友", notes = "新增编辑小朋友")
	@PostMapping(value = "Student_add_edit")
	@ResponseBody
	public Out<String> Student_add_edit(
			@ApiParam(value = "新增编辑小朋友", required = true) @RequestBody In_Student_Edit student_a) throws IllegalAccessException, InvocationTargetException, ClientProtocolException, IOException {
		logger.info("访问  MailListController:Student_add_edit,student_a=" + student_a);
		Tb_newstudent vd_student = new Tb_newstudent();
		Tb_mailList_list list = new Tb_mailList_list();
		Tb_schoolparent vd_parent = new Tb_schoolparent();
		Tb_studentparent vd_studentparent = new Tb_studentparent();
		Out<String> back = new Out<String>();
		try {
			BeanUtils.copyProperties(vd_student, student_a);
			if (vd_student.getId() == null) {
				vd_student.setStatus((byte) 1);
				vd_student.setCreated(new Date());
				vd_student.setSchoolId(classService.selectById(vd_student.getClass_id()).getSchoolId());
				System.err.println(vd_student.getRfid()+"----------------");
				int rowNum = studentService.insertStudentSelective(vd_student);// insert
                int rowNUM2= 0;
			
				if (!student_a.getParent().isEmpty()) {
					for (Tb_parent add : student_a.getParent()) {
						vd_parent.setSchoolId(classService.selectById(vd_student.getClass_id()).getSchoolId());

						vd_parent.setPhone(add.getParent_phone());
						vd_parent.setRfid(add.getRfid());
						vd_parent.setType(1);
						vd_parent.setStatus((byte) 1);
						vd_parent.setCreated(new Date());
						vd_parent.setRfid(add.getRfid());
						rowNUM2=studentService.insertParentSelective(vd_parent);
						vd_studentparent.setSchoolId(vd_student.getSchoolId());
						vd_studentparent.setClassId(vd_student.getClass_id());
						vd_studentparent.setStudentId(vd_student.getId());
						vd_studentparent.setParentId(vd_parent.getId());
						if (add.getRelation_id() != 99) {
							vd_studentparent.setRelationTitle(
									mailListService.findrealtionById(add.getRelation_id()).getTitle());
						} else {
							vd_studentparent.setRelationTitle(add.getParent_name());
						}
						vd_studentparent.setCreated(new Date());
						rowNUM2=studentService.insertStudentParentSelective(vd_studentparent);
						System.out.println("插入从父母成功:"+vd_parent.getId()+vd_student.getId());
						HttpPost httpPost = new HttpPost(appConfigProperties.getQrcodePath());
						logger.info("appConfigProperties.getQrcodePath()="+appConfigProperties.getQrcodePath());
				        CloseableHttpClient client = HttpClients.createDefault();
				        String respContent = null;
				        
				        //json方式
				        JSONObject jsonParam = new JSONObject();  
				        jsonParam.put("school_id", vd_parent.getSchoolId());
				        jsonParam.put("type", 1);
				        jsonParam.put("parent_id", vd_parent.getId());
				        jsonParam.put("student_id", vd_student.getId());
				       
				        StringEntity entity = new StringEntity(jsonParam.toString(),"utf-8");//解决中文乱码问题    
				        entity.setContentEncoding("UTF-8");    
				        entity.setContentType("application/json");    
				        httpPost.setEntity(entity);
				          
      
				        HttpResponse resp = client.execute(httpPost);
				        logger.info("resp.getStatusLine().getStatusCode()="+resp.getStatusLine().getStatusCode());
				        if(resp.getStatusLine().getStatusCode() == 200) {
				            HttpEntity he = resp.getEntity();
				            respContent = EntityUtils.toString(he,"UTF-8");
				        }
				        logger.info("respContent="+respContent);
					}
				}
				
		       

				if (rowNum >= 0) {
					back.setBackTypeWithLog(BackType.SUCCESS_INSERT,"成功");

				} else {
					// 更新有问题
					back.setBackTypeWithLog(BackType.FAIL_UPDATE_AFTER_INSERT, "rowNum=" + rowNum);
				}
			} else {
				BeanUtils.copyProperties(list, student_a);
				int rowNum = mailListService.Update(list);// insert
				System.err.println("修改学生成功");
				if(!"".equals(student_a.getDeleteParents())){
				String[] arr = student_a.getDeleteParents().split("_");
				Tb_deleteParentDate date =null;
				for (int i = 0; i < arr.length; i++) {
					date = new Tb_deleteParentDate();
					date.setStudent_id(list.getId());
					date.setParent_id(Integer.parseInt(arr[i]));
					mailListService.deleteparentByid(date);
				}
				}

				if (!student_a.getParent().isEmpty()) {
					for (Tb_parent add : student_a.getParent()) {
						if(add.getId()==null){
						vd_parent.setSchoolId(classService.selectById(list.getClass_id()).getSchoolId());
						vd_parent.setPhone(add.getParent_phone());
						
						vd_parent.setType(1);
						vd_parent.setStatus((byte) 1);
						vd_parent.setCreated(new Date());
						studentService.insertParentSelective(vd_parent);
						vd_studentparent.setSchoolId(classService.selectById(list.getClass_id()).getSchoolId());
						vd_studentparent.setClassId(list.getClass_id());
						vd_studentparent.setStudentId(list.getId());
						vd_studentparent.setParentId(vd_parent.getId());
						vd_studentparent.setRelationId(add.getRelation_id());
						vd_studentparent.setRfid(list.getParent().get(0).getRfid());
						vd_studentparent.setStudent_rfid(list.getStudent_rfid());
						if (add.getRelation_id() != 99) {
							vd_studentparent.setRelationTitle(
									mailListService.findrealtionById(add.getRelation_id()).getTitle());
						} else {
							vd_studentparent.setRelationTitle(add.getParent_name());
						}
						vd_studentparent.setCreated(new Date());
						studentService.insertStudentParentSelective(vd_studentparent);
						System.out.println("插入从父母成功:"+vd_parent.getId()+ list.getId());
						
						HttpPost httpPost = new HttpPost(appConfigProperties.getQrcodePath());
						logger.info("appConfigProperties.getQrcodePath()="+appConfigProperties.getQrcodePath());
				        CloseableHttpClient client = HttpClients.createDefault();
				        String respContent = null;
				        
				        //json方式
				        JSONObject jsonParam = new JSONObject();  
							jsonParam.put("school_id", vd_parent.getSchoolId());
				        jsonParam.put("type", 1);
				        jsonParam.put("parent_id", vd_parent.getId());
				        jsonParam.put("student_id", list.getId());
				       
				        StringEntity entity = new StringEntity(jsonParam.toString(),"utf-8");//解决中文乱码问题    
				        entity.setContentEncoding("UTF-8");    
				        entity.setContentType("application/json");    
				        httpPost.setEntity(entity);
				          
      
				        HttpResponse resp = client.execute(httpPost);
				        logger.info("resp.getStatusLine().getStatusCode()="+resp.getStatusLine().getStatusCode());
				        if(resp.getStatusLine().getStatusCode() == 200) {
				            HttpEntity he = resp.getEntity();
				            respContent = EntityUtils.toString(he,"UTF-8");
				        }
				        logger.info("respContent="+respContent);

					}else{
						Tb_parent p = mailListService.findParentByPid(add.getId());
						p.setParent_phone(add.getParent_phone());
						p.setRelation_id(add.getRelation_id());
						p.setParent_name(mailListService.findrealtionById(add.getRelation_id()).getTitle());
						mailListService.UpdateParent(p);
					}
					}

				}
				if (rowNum > 0) {
					back.setBackTypeWithLog(BackType.SUCCESS_UPDATE, "rowNum=" + (rowNum + rowNum));
				} else {
					back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL, "rowNum=" + (rowNum + rowNum));
				}
			}
		} catch (ServiceException e) {
			// 服务层错误，包括 内部service 和 对外service
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		} 
		return back;
	}
}
