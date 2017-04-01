package cn.didano.base.dao;

import java.util.List;

import cn.didano.base.model.Hand_parent4mailList;
import cn.didano.base.model.Hand_staff4MailList;
import cn.didano.base.model.Hand_student4MailList;
import cn.didano.base.model.Hand_student4MailListHasParent;
import cn.didano.base.model.Tb_deleteParentDate;
import cn.didano.base.model.Hand_mailList_list;
import cn.didano.base.model.Tb_relation;
import cn.didano.base.model.Tb_staff4List;
import cn.didano.base.model.Tb_staff4MailList;
import cn.didano.base.model.Tb_staffData;
import cn.didano.base.model.Tb_student;
import cn.didano.base.model.Tb_studentData;

public interface Hand_MailList_listMapper {

	List<Hand_mailList_list> findByTeacher(Integer id);
	List<Hand_mailList_list> findAll();
	Hand_mailList_list findById(Integer id);
	List<Hand_parent4mailList> findParentById(Integer id);
	List<Hand_mailList_list> findByClass(Integer id);
	List<Hand_staff4MailList> findTeacherByClass(Integer id);
	List<Tb_staff4List> findTeacherByNameClass(Tb_staffData data2);
	Tb_staff4MailList findBystaffbyId(Integer id);
	List<Hand_staff4MailList> findteacherByschool(Integer id);
	List<Hand_mailList_list> findByschool(Integer id);
	List<Hand_student4MailList> findStudentByschool(Integer id);
	
	//杨 添加根据学生的ic_number进行查询
	Tb_student findStudentByIcNumber(Tb_student tb_student);
	Hand_student4MailListHasParent findParentByIcNumber(Tb_student tb_student);
	Tb_staff4MailList selectSchoolBystaffId(Integer id);
	
	
	List<Hand_mailList_list> findByName(Tb_studentData data);
	List<Hand_mailList_list> findByNameClass(Tb_studentData data);
	List<Tb_relation> findrelation();
	Tb_relation findrelationById(byte id);
	Hand_parent4mailList findParentByPid(Integer id);
	Tb_staffData findClassIdBySid(Integer id);
	int UpdateTeacher(Hand_staff4MailList teacher);
	int Update( Hand_mailList_list list); 
	int UpdateParent(Hand_parent4mailList parent);
	int delete(Integer id);
	int deleteparent(Integer id);
	int deleteparentByid(Tb_deleteParentDate date);
	
	List<Hand_parent4mailList> findParentByStudentId(Integer id);
}
