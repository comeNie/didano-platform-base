package cn.didano.base.dao;

import java.util.List;

import cn.didano.base.model.Tb_class;
import cn.didano.base.model.Tb_deleteParentDate;
import cn.didano.base.model.Tb_mailList_list;
import cn.didano.base.model.Tb_parent;
import cn.didano.base.model.Tb_relation;
import cn.didano.base.model.Tb_staff;
import cn.didano.base.model.Tb_staff4MailList;
import cn.didano.base.model.Tb_staffData;
import cn.didano.base.model.Tb_studentData;
import cn.didano.base.model.Tb_teacher;

public interface Tb_MailList_listMapper {

	List<Tb_mailList_list> findByTeacher(Integer id);
	List<Tb_mailList_list> findAll();
	Tb_mailList_list findById(Integer id);
	List<Tb_parent> findParentById(Integer id);
	List<Tb_mailList_list> findByClass(Integer id);
	List<Tb_teacher> findTeacherByClass(Integer id);
	List<Tb_staff> findTeacherByNameClass(Tb_staffData data2);
	Tb_staff4MailList findBystaffbyId(Integer id);
	List<Tb_teacher> findteacherByschool(Integer id);
	List<Tb_mailList_list> findByschool(Integer id);
	List<Tb_class> findClassByschool(Integer id);
	List<Tb_mailList_list> findByName(Tb_studentData data);
	List<Tb_mailList_list> findByNameClass(Tb_studentData data);
	List<Tb_relation> findrelation();
	Tb_relation findrelationById(byte id);
	Tb_parent findParentByPid(Integer id);
	Tb_staff findClassIdBySid(Integer id);
	int UpdateTeacher(Tb_teacher teacher);
	int Update( Tb_mailList_list list); 
	int UpdateParent(Tb_parent parent);
	int delete(Integer id);
	int deleteparent(Integer id);
	int deleteparentByid(Tb_deleteParentDate date);
}
