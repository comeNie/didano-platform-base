package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Tb_address_listMapper;
import cn.didano.base.model.Tb_address_list;
import cn.didano.base.model.Tb_parent;
import cn.didano.base.model.Tb_teacher;
@Service
public class AddressService {

	@Autowired
	private Tb_address_listMapper addressMapper;
	
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
