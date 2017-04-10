package cn.didano.base.dao;

import java.util.List;

import cn.didano.base.model.Hand_WholeStudentParents4PhoneBook;
import cn.didano.base.model.Hand_parent4mailList;
import cn.didano.base.model.Hand_staff4PhoneBook;
import cn.didano.base.model.Hand_staffTransit4PhoneBook;
import cn.didano.base.model.Hand_wholeStudent4PhoneBook;
import cn.didano.base.model.Hand_wholeStudentParent4PhoneBook;
import cn.didano.base.model.Tb_deleteParentDate;
import cn.didano.base.model.Tb_relation;
import cn.didano.base.model.Tb_staffData;
import cn.didano.base.model.Tb_student;
import cn.didano.base.model.Tb_studentData;

public interface Hand_MailList_listMapper {

	List<Hand_WholeStudentParents4PhoneBook> findByTeacher(Integer id);
	List<Hand_WholeStudentParents4PhoneBook> findAll();
	Hand_WholeStudentParents4PhoneBook findById(Integer id);
	List<Hand_parent4mailList> findParentById(Integer id);
	List<Hand_WholeStudentParents4PhoneBook> findByClass(Integer id);
	List<Hand_staff4PhoneBook> findTeacherByClass(Integer id);
	List<Hand_staffTransit4PhoneBook> findTeacherByNameClass(Tb_staffData data2);
	Hand_staff4PhoneBook findBystaffbyId(Integer id);
	List<Hand_staff4PhoneBook> findteacherByschool(Integer id);
	List<Hand_WholeStudentParents4PhoneBook> findByschool(Integer id);
	List<Hand_wholeStudentParent4PhoneBook> findWholeStudentParentsByschool(Integer id);
	
	//杨 添加根据学生的ic_number进行查询
	Tb_student findStudentByIcNumber(Tb_student tb_student);
	Hand_wholeStudent4PhoneBook findParentByIcNumber(Tb_student tb_student);
	Hand_staff4PhoneBook selectSchoolBystaffId(Integer id);
	
	
	List<Hand_WholeStudentParents4PhoneBook> findByName(Tb_studentData data);
	List<Hand_WholeStudentParents4PhoneBook> findByNameClass(Tb_studentData data);
	List<Tb_relation> findrelation();
	Tb_relation findrelationById(Integer id);
	Hand_parent4mailList findParentByPid(Integer id);
	Tb_staffData findClassIdBySid(Integer id);
	int UpdateTeacher(Hand_staff4PhoneBook teacher);
	int Update( Hand_WholeStudentParents4PhoneBook list); 
	int UpdateParent(Hand_parent4mailList parent);
	int delete(Integer id);
	int deleteparent(Integer id);
	int deleteparentByid(Tb_deleteParentDate date);
	
	List<Hand_parent4mailList> findParentByStudentId(Integer id);
}
