package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Tb_address_listMapper;
import cn.didano.base.model.Tb_address_list;
import cn.didano.base.model.Tb_class;
import cn.didano.base.model.Tb_newstaff;
import cn.didano.base.model.Tb_parent;
import cn.didano.base.model.Tb_relation;
import cn.didano.base.model.Tb_staffData;
import cn.didano.base.model.Tb_studentData;
import cn.didano.base.model.Tb_teacher;
@Service
public class AddressService {

	@Autowired
	private Tb_address_listMapper addressMapper;
	
	/**
	 * 查询
	 */
	public Tb_newstaff findbystaffbyid(Integer id){
		return addressMapper.findBystaffbyId(id);
	}
	
	/**
	 * 通过小朋友id删除父母信息
	 */
	public int deleteparent(Integer id){
		return addressMapper.deleteparent(id);
	}
	/**
	 * 通过关系id查询关系名称
	 */
	public Tb_relation findrealtionById(byte id){
		return addressMapper.findrelationById(id);
	}
	/**
	 * 查询家长关系
	 * 
	 */
	public List<Tb_relation> findrelation(){
		return addressMapper.findrelation();
	}
	/**
	 * 通过名字查询小朋友
	 */
	public List<Tb_address_list> findByname(Tb_studentData data){
		return addressMapper.findByName(data);
	}
	/**
	 * 通过名字班级查询小朋友
	 */
	public List<Tb_address_list> findBynameClass(Tb_studentData data){
		return addressMapper.findByNameClass(data);
	}
	/**
	 * 通过学校查询所有老师
	 */
	public List<Tb_teacher> findteacherByschool(Integer id){
		return addressMapper.findteacherByschool(id);
	}
	/**
	 * 通过学校查询该学校所有班级
	 */
	public List<Tb_class> findClassByschool(Integer id){
		return addressMapper.findClassByschool(id);
	}
	/**
	 * 通过学校查询
	 */
	public List<Tb_address_list> findBySchool(Integer id){
		return addressMapper.findByschool(id);
	}
	/**
	 * 编辑老师
	 */
	public int UpdateTeacher(Tb_teacher teacher){
		return addressMapper.UpdateTeacher(teacher);
	}
	/**
	 * 通过班级查询该班的老师
	 */
	public List<Tb_teacher> findTeacherByClass(Integer id){
		return addressMapper.findTeacherByClass(id);
	}
	/**
	 * 通过名字班级查询该班的老师
	 */
	public List<Tb_newstaff> findTeacherByNameClass(Tb_staffData data2){
		return addressMapper.findTeacherByNameClass(data2);
	}
	/**
	 * 通过班级查询该班的所有小朋友
	 */
	public List<Tb_address_list> findByClass(Integer id){
		return addressMapper.findByClass(id);
	}
	/**
	 * 通过小朋友id编辑父母信息
	 */
	public int UpdateParent(Tb_parent parent){
		return addressMapper.UpdateParent(parent);
	}
	/**
	 * 通过小朋友id删除其以及其父母信息
	 */
	public int delete(Integer id){
		return addressMapper.delete(id);
	}
	/**
	 * 通过小朋友id查找其所有父母联系方式
	 */
	public List<Tb_parent> findparent(Integer id){
		return addressMapper.findParentById(id);
	}
	/**
	 * 编辑小朋友信息
	 */
	public int Update(Tb_address_list list){
		return addressMapper.Update(list);
	}
	/**
	 * 通过学生id查询小朋友及其家长信息
	 */
	public Tb_address_list findById(Integer id){
		return addressMapper.findById(id);
	}
	/**
	 * 通过老师id查询该班上所有学生及其家长信息
	 * @param id
	 * @return
	 */
	public List<Tb_address_list> findByTeacher(Integer id){
		return addressMapper.findByTeacher(id);
	}
	
	/**
	 * 查询所有孩子及其家长信息
	 */
	public List<Tb_address_list> findAll(){
		return addressMapper.findAll();
	}
}
