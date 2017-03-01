package cn.didano.video.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_address_list;
import cn.didano.base.model.Tb_bossData;
import cn.didano.base.model.Tb_class;
import cn.didano.base.model.Tb_classStudent;
import cn.didano.base.model.Tb_newstaff;
import cn.didano.base.model.Tb_newstudent;
import cn.didano.base.model.Tb_parent;
import cn.didano.base.model.Tb_relation;
import cn.didano.base.model.Tb_schoolparent;
import cn.didano.base.model.Tb_staff_class;
import cn.didano.base.model.Tb_staff_signdate;
import cn.didano.base.model.Tb_studentData;
import cn.didano.base.model.Tb_studentparent;
import cn.didano.base.model.Tb_teacher;
import cn.didano.base.model.Tb_teacherAndStudent;
import cn.didano.base.service.AddressService;
import cn.didano.base.service.ClassService;
import cn.didano.base.service.NewStudentService;
import cn.didano.base.service.NewTeacherService;
import cn.didano.video.constant.BackType;
import cn.didano.video.json.In_Student_Edit;
import cn.didano.video.json.In_Teacher_Edit;
import cn.didano.video.json.Out;
import cn.didano.video.json.OutList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "通讯录服务", tags = "通讯录服务，提供给表现层")
@RestController
@RequestMapping(value = "/base/address/post/")
public class AddressController {

	static Logger logger = Logger.getLogger(PostController.class);

	@Autowired
	private AddressService addressService;
	@Autowired
	private NewStudentService newstudentService;
	@Autowired
	private NewTeacherService newteacherService;
	@Autowired
	private ClassService classService;

	

	/**
	 * 查询班级关系对应
	 */
	@PostMapping(value = "Classid_name/{staff_id}")
	@ApiOperation(value = "查询班级关系对应", notes = "查询家长关系对应")
	@ResponseBody
	public Out<OutList<Tb_class>> Classid_name(@PathVariable("staff_id") Integer id) {
		logger.info("访问  PostController:Classid_name,staff_id="+id);
		Tb_newstaff staff = newteacherService.findById(id);
		List<Tb_class> classs = null;
		OutList<Tb_class> outList = null;		
		Out<OutList<Tb_class>> back = new Out<OutList<Tb_class>>();
		try {
			classs = classService.findAll(staff.getSchoolId());
			if (classs.size() > 0) {
				outList = new OutList<Tb_class>(classs.size(), classs);
				back.setBackTypeWithLog(outList,BackType.SUCCESS_UPDATE);
			} else {
				back.setBackTypeWithLog(outList,BackType.FAIL_UPDATE_NORMAL);
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
		logger.info("访问  PostController:relation");
		List<Tb_relation> relation = null;
		OutList<Tb_relation> outList = null;		
		Out<OutList<Tb_relation>> back = new Out<OutList<Tb_relation>>();
		try {
			relation = addressService.findrelation();
			if (relation.size() > 0) {
				outList = new OutList<Tb_relation>(relation.size(), relation);
				back.setBackTypeWithLog(outList,BackType.SUCCESS_UPDATE);
			} else {
				back.setBackTypeWithLog(outList,BackType.FAIL_UPDATE_NORMAL);
			}
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}
	
	/**
	 * 通过名字搜索
	 */
	@PostMapping(value = "studentstaff_searchByName/{name}/{id}")
	@ApiOperation(value = "通过名字搜索", notes = "通过名字搜索")
	@ResponseBody
	public Out<Tb_bossData> studentstaff_searchByName(@PathVariable("name") String name,@PathVariable("id") Integer id) {
		logger.info("访问  PostController:studentstaff_searchByName,name=" + name+",id="+id);		
		Tb_newstaff s0 = newteacherService.findById(id);
		List<Tb_newstaff> staff = newteacherService.findByName(name,s0.getSchoolId());
		Tb_bossData data = new Tb_bossData();
		List<Tb_address_list> student = null;
		List<Tb_classStudent> student2 = new ArrayList<Tb_classStudent>();
		Tb_classStudent s = new Tb_classStudent();
		Tb_classStudent s2 = new Tb_classStudent();
		Tb_classStudent s3 = new Tb_classStudent();
		
		Out<Tb_bossData> back = new Out<Tb_bossData>();
		try {

			if(staff.size()!=0){
				data.getStaff().addAll(staff);
			}
			Tb_studentData data1 = new Tb_studentData();
			data1.setName(name);
			data1.setSchoolid(s0.getSchoolId());
			student = addressService.findByname(data1);
			if(student.size()!=0){
			s.setClassName(classService.selectNameByPrimaryKey(student.get(0).getClass_id()));
			for (Tb_address_list list : student) {
				List<Tb_parent> parent = addressService.findparent(list.getId());
				list.getParent().addAll(parent);
				if(classService.selectNameByPrimaryKey(list.getClass_id()).equals(s.getClassName())){
					s.getStudent().add(list);
				}else {
					if(s2.getClassName()==null){
					s2.setClassName(classService.selectNameByPrimaryKey(list.getClass_id()));
					}
					if(classService.selectNameByPrimaryKey(list.getClass_id()).equals(s2.getClassName())){
						s2.getStudent().add(list);
					}else{
						if(s3.getClassName()==null){
							s3.setClassName(classService.selectNameByPrimaryKey(list.getClass_id()));
						}
						if(classService.selectNameByPrimaryKey(list.getClass_id()).equals(s3.getClassName())){
							s3.getStudent().add(list);
						}
					}
					
					
				}
			}
			student2.add(s);
			if(s2.getStudent().size()!=0){
			student2.add(s2);		
			}
			if(s3.getStudent().size()!=0){
				student2.add(s3);
			}
			data.getStudentall().addAll(student2);
			}
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
		logger.info("访问  PostController:deleteStaff,staff_id=" + staff_id);
		Out<String> back = new Out<String>();
		try {
			int rowNum = newteacherService.delete(staff_id);
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
	public Out<String> Teacher_add(@ApiParam(value = "新增编辑职工", required = true) @RequestBody In_Teacher_Edit teacher_a) {
		logger.info("访问  PostController:Teacher_add,teacher_a=" + teacher_a);
		Tb_newstaff vd_staff = new Tb_newstaff();
		Tb_staff_class vd_class = new Tb_staff_class();
		Tb_staff_signdate vd_date = new Tb_staff_signdate();
		Out<String> back = new Out<String>();
		try {
			BeanUtils.copyProperties(vd_staff, teacher_a);
			int rowNum=0;
			int rowNum2=0;
			int rowNum3=0;
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			if(vd_staff.getId()==null){
			vd_staff.setCreated(new Date());
			vd_staff.setSignTypeId(1);
			vd_staff.setSchoolId(classService.selectById(teacher_a.getClassId()).getSchoolId());
			 rowNum = newteacherService.insertTeacherSelective(vd_staff);// insert
			vd_class.setClassId(teacher_a.getClassId());
			vd_class.setCreated(new Date());
			vd_class.setSchoolId(vd_staff.getSchoolId());
			vd_class.setStaffId(vd_staff.getId());
			 rowNum2 = newteacherService.insertClassSelective(vd_class);
			vd_date.setCreated(new Date());
			vd_date.setStaffId(vd_staff.getId());
			vd_date.setSetIntime(sdf.parse(teacher_a.getSetIntime()));
			vd_date.setSetOuttime(sdf.parse(teacher_a.getSetOuttime()));
			long time = new Date().getTime();
			String time2 = String.valueOf(time).substring(0, 10);
			vd_date.setSignTimestamp(Long.parseLong(time2));
			vd_date.setSignDate(new Date());
			vd_date.setSignStatus((byte) 1);
			 rowNum3 = newteacherService.insertDateSelective(vd_date);
			}else {
				rowNum = newteacherService.updatestaff(vd_staff);
				vd_class.setClassId(teacher_a.getClassId());
			    vd_class.setId(newteacherService.findclassidByStaffid(vd_staff.getId()).get(0).getId());
				vd_class.setSchoolId(vd_staff.getSchoolId());
				vd_class.setStaffId(teacher_a.getId());
				 rowNum2 = newteacherService.updateclass(vd_class);
				 vd_date.setCreated(new Date());
					vd_date.setStaffId(teacher_a.getId());
					vd_date.setSetIntime(sdf.parse(teacher_a.getSetIntime()));
					vd_date.setSetOuttime(sdf.parse(teacher_a.getSetOuttime()));
					vd_date.setId(newteacherService.finddateidByStaffid(vd_staff.getId()).get(0).getId());;
					 rowNum3 = newteacherService.updatesign(vd_date);
				
			}
			if (rowNum > 0 && rowNum2 > 0 && rowNum3 > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "Id=" + "," + ":rowNum3=" + rowNum3);

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
	 * 通过班级查找老师
	 */
	@PostMapping(value = "teacher_searchByClass/{class_id}")
	@ApiOperation(value = "通过班级查找老师", notes = "通过班级查找老师")
	@ResponseBody
	public Out<OutList<Tb_teacher>> teacher_searchByClass(@PathVariable("class_id") Integer class_id) {
		logger.info("访问  PostController:teacher_searchByClass,class_id=" + class_id);
		List<Tb_teacher> teacher = null;
		OutList<Tb_teacher> outList = null;
		Out<OutList<Tb_teacher>> back = new Out<OutList<Tb_teacher>>();
		try {
			teacher = addressService.findTeacherByClass(class_id);

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
	 */
	@PostMapping(value = "student_searchByBoss/{staff_id}")
	@ApiOperation(value = "通过园长id查询小朋友并通过班级分类", notes = "园长查询小朋友并通过班级分类")
	@ResponseBody
	public Out<Tb_bossData> student_searchByBoss(@PathVariable("staff_id") Integer staff_id) {
		logger.info("访问  PostController:student_searchByBoss,staff_id=" + staff_id);
		Tb_newstaff staff = newteacherService.findById(staff_id);
		Tb_bossData data = new Tb_bossData();
		List<Tb_address_list> student = null;
		List<Tb_classStudent> student2 = new ArrayList<Tb_classStudent>();

		Tb_classStudent cs = new Tb_classStudent();
		List<Tb_class> classall = addressService.findClassByschool(staff.getSchoolId());
		Out<Tb_bossData> back = new Out<Tb_bossData>();
		try {

			for (Tb_class c : classall) {
				student = addressService.findByClass(c.getId());
				cs = new Tb_classStudent();
				cs.setClassName(c.getTitle());
				for (Tb_address_list list : student) {
					List<Tb_parent> parent = addressService.findparent(list.getId());
					list.getParent().addAll(parent);
				}
				cs.getStudent().addAll(student);
				student2.add(cs);
			}
			List<Tb_teacher> teacherall = addressService.findteacherByschool(staff.getSchoolId());
			List<Tb_newstaff> staffall = newteacherService.findByType(staff.getSchoolId());
			data.getStaff().addAll(staffall);
			data.getTeacher().addAll(teacherall);
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
	 */
	@PostMapping(value = "student_searchByClass/{staff_id}")
	@ApiOperation(value = "通过老师id查询小朋友", notes = "通过老师id查询小朋友")
	@ResponseBody
	public Out<Tb_teacherAndStudent> student_searchByClass(@PathVariable("staff_id") Integer staff_id) {
		logger.info("访问  PostController:student_searchByClass,staff_id=" + staff_id);
		Tb_newstaff staff = newteacherService.findById(staff_id);
		Tb_teacherAndStudent data = new Tb_teacherAndStudent();
		List<Tb_address_list> student = null;
		Tb_classStudent cs = new Tb_classStudent();
		Out<Tb_teacherAndStudent> back = new Out<Tb_teacherAndStudent>();
		try {
			if (staff.getType() == 32) {

				student = addressService.findByTeacher(staff.getId());
				for (Tb_address_list list : student) {
					List<Tb_parent> parent = addressService.findparent(list.getId());
					list.getParent().addAll(parent);
				}
				cs.setClassName(classService.selectNameByPrimaryKey(student.get(1).getClass_id()));
				cs.getStudent().addAll(student);
				List<Tb_teacher> classstaff = addressService.findTeacherByClass(student.get(1).getClass_id());
				List<Tb_newstaff> doctor = newteacherService.findByType(staff.getSchoolId());
				data.getTeacher().addAll(classstaff);
				data.getDoctor().addAll(doctor);
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
		logger.info("访问  PostController:parent_edit,parent_edit=" + parent_edit);
		List<Tb_parent> parentall = new ArrayList<Tb_parent>();
		Out<String> back = new Out<String>();
		try {
			parentall.addAll(parent_edit);
			int rowNum = 0;// insert
			for (Tb_parent parent : parentall) {
				addressService.UpdateParent(parent);
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
		logger.info("访问  PostController:deleteByChildId,student_id=" + student_id);
		Out<String> back = new Out<String>();
		try {
			int rowNum = addressService.delete(student_id);
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
		logger.info("访问  PostController:parent_searchByChildId,student_id=" + student_id);
		List<Tb_parent> parentall = null;
		OutList<Tb_parent> outList = null;
		Out<OutList<Tb_parent>> back = new Out<OutList<Tb_parent>>();
		try {
			parentall = addressService.findparent(student_id);
			outList = new OutList<Tb_parent>(parentall.size(), parentall);
			back.setBackTypeWithLog(outList, BackType.SUCCESS_SEARCH_NORMAL);
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 编辑小朋友信息
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value = "编辑小朋友信息", notes = "编辑小朋友信息")
	@PostMapping(value = "addresslist_edit")
	@ResponseBody
	public Out<String> addresslist_edit(
			@ApiParam(value = "编辑小朋友信息", required = true) @RequestBody In_Student_Edit student_a) {
		logger.info("访问  PostController:addresslist_edit,student_a=" + student_a);
		Tb_address_list list = new Tb_address_list();
		Tb_schoolparent vd_parent = new Tb_schoolparent();
		Tb_studentparent vd_studentparent = new Tb_studentparent();
		Out<String> back = new Out<String>();
		try {
			BeanUtils.copyProperties(list, student_a);
			int rowNum = addressService.Update(list);// insert
			int row = addressService.deleteparent(list.getId());
			int row2=0;
			for (Tb_parent add : student_a.getParent()) {
				vd_parent.setSchoolId(classService.selectById(list.getClass_id()).getSchoolId());
				
				vd_parent.setPhone(add.getParent_phone());
				vd_parent.setType(1);
				vd_parent.setStatus((byte) 1);
				vd_parent.setCreated(new Date());
				newstudentService.insertParentSelective(vd_parent);
				
				vd_studentparent.setSchoolId(classService.selectById(list.getClass_id()).getSchoolId());
				vd_studentparent.setClassId(list.getClass_id());
				vd_studentparent.setStudentId(list.getId());
				vd_studentparent.setParentId(vd_parent.getId());
				vd_studentparent.setRelationId(add.getRelation_id());
				if(add.getRelation_id()!=99){
					vd_studentparent.setRelationTitle(addressService.findrealtionById(add.getRelation_id()).getTitle());
					}else{
						vd_studentparent.setRelationTitle(add.getParent_name());
					}
				vd_studentparent.setCreated(new Date());
				newstudentService.insertStudentParentSelective(vd_studentparent);
			  row2++;
			}
			if (rowNum > 0 && row > 0&& row2>0) {
				back.setBackTypeWithLog(BackType.SUCCESS_UPDATE, "rowNum=" + (rowNum + row));
			} else {
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_NORMAL, "rowNum=" + (rowNum + row));
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
	 * 通讯录首页 通过小朋友id查询小朋友及其家长信息
	 * 
	 * @param teacher_id
	 * @return
	 */
	@PostMapping(value = "student_searchById/{student_id}")
	@ApiOperation(value = "通过小朋友id查询小朋友及其家长信息", notes = "通过小朋友id查询")
	@ResponseBody
	public Out<Tb_address_list> student_searchById(@PathVariable("student_id") Integer student_id) {
		logger.info("访问  PostController:student_searchById,student_id=" + student_id);
		Tb_address_list student = null;
		Out<Tb_address_list> back = new Out<Tb_address_list>();
		try {
			student = addressService.findById(student_id);
			List<Tb_parent> parent = addressService.findparent(student.getId());
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
	public Out<OutList<Tb_address_list>> student_searchall() {
		logger.info("访问  PostController:student_searchall");
		List<Tb_address_list> studentall = null;
		OutList<Tb_address_list> outList = null;
		Out<OutList<Tb_address_list>> back = new Out<OutList<Tb_address_list>>();
		try {
			studentall = addressService.findAll();
			for (Tb_address_list list : studentall) {
				List<Tb_parent> parent = addressService.findparent(list.getId());
				list.getParent().addAll(parent);
			}
			outList = new OutList<Tb_address_list>(studentall.size(), studentall);
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
	 */
	@ApiOperation(value = "新增小朋友", notes = "新增小朋友")
	@PostMapping(value = "Student_add")
	@ResponseBody
	public Out<String> Student_add(@ApiParam(value = "新增小朋友", required = true) @RequestBody In_Student_Edit student_a) {
		logger.info("访问  PostController:Student_add,student_a=" + student_a);
		Tb_newstudent vd_student = new Tb_newstudent();
		Tb_schoolparent vd_parent = new Tb_schoolparent();
		Tb_studentparent vd_studentparent = new Tb_studentparent();
		Out<String> back = new Out<String>();
		try {
			BeanUtils.copyProperties(vd_student, student_a);
			vd_student.setStatus((byte) 1);
			vd_student.setCreated(new Date());
			vd_student.setSchoolId(classService.selectById(vd_student.getClass_id()).getSchoolId());
			int rowNum = newstudentService.insertStudentSelective(vd_student);// insert
			
			if(student_a.getParent().size()!=0){
			for (Tb_parent add : student_a.getParent()) {
				vd_parent.setSchoolId(classService.selectById(vd_student.getClass_id()).getSchoolId());
				
				vd_parent.setPhone(add.getParent_phone());
				vd_parent.setType(1);
				vd_parent.setStatus((byte) 1);
				vd_parent.setCreated(new Date());
				newstudentService.insertParentSelective(vd_parent);
				vd_studentparent.setSchoolId(vd_student.getSchoolId());
				vd_studentparent.setClassId(vd_student.getClass_id());
				vd_studentparent.setStudentId(vd_student.getId());
				vd_studentparent.setParentId(vd_parent.getId());
				vd_studentparent.setRelationId(add.getRelation_id());
				if(add.getRelation_id()!=99){
				vd_studentparent.setRelationTitle(addressService.findrealtionById(add.getRelation_id()).getTitle());
				}else{
					vd_studentparent.setRelationTitle(add.getParent_name());
				}
				vd_studentparent.setCreated(new Date());
				newstudentService.insertStudentParentSelective(vd_studentparent);
				
			}
			}
			if (rowNum > 0 ) {
				back.setBackTypeWithLog(BackType.SUCCESS_INSERT,
						"Id=" + vd_student.getId() + "," + vd_parent.getId() );

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
	 * 新建小朋友
	 * 
	 * 根据条件创建小朋友，创建小朋友之后，再根据生成的小朋友ID建立父母的联系
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value = "新增或编辑小朋友", notes = "新增或编辑")
	@PostMapping(value = "Student_addoredit")
	@ResponseBody
	public void Student_addoredit(@ApiParam(value = "新增或编辑小朋友", required = true) @RequestBody In_Student_Edit student_a) {
		logger.info("访问  PostController:Student_addoredit,student_a=" + student_a);
		if(student_a.getId()!=null){
			addresslist_edit(student_a);
		}else{
			Student_add(student_a);
			
		}
	}
}
