package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Tb_newstaffMapper;
import cn.didano.base.dao.Tb_staff_classMapper;
import cn.didano.base.dao.Tb_staff_signdateMapper;
import cn.didano.base.dao.tb_sign_typeMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_newstaff;
import cn.didano.base.model.Tb_newstaffExample;
import cn.didano.base.model.Tb_staff_class;
import cn.didano.base.model.Tb_staff_classExample;
import cn.didano.base.model.Tb_staff_signdate;
import cn.didano.base.model.Tb_staff_signdateExample;
import cn.didano.base.model.tb_sign_type;
import cn.didano.video.constant.DeletedType;


@Service
public class NewTeacherService {

	@Autowired
	private Tb_newstaffMapper newstaffMapper;
	@Autowired
	private Tb_staff_classMapper classMapper;
	@Autowired
	private Tb_staff_signdateMapper dateMapper;
	@Autowired
	private tb_sign_typeMapper typeMapper;
	/**
	 * 通过学校查询该学校的医生和保洁
	 */
	public List<Tb_newstaff> findBossByschool(Integer schoolid){
		Tb_newstaffExample condition = new Tb_newstaffExample();
		Tb_newstaffExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示 禁用不显示
		criteria.andTypeEqualTo((byte)31);
		criteria.andSchoolIdEqualTo(schoolid);
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		return newstaffMapper.selectByExample(condition);
	}
	/**
	 * 通过ID查询
	 */
	public tb_sign_type findTypeByID(Integer id){
		return typeMapper.selectByPrimaryKey(id);
	}
	/**
	 * 编辑签到类型
	 */
	public int updateType(tb_sign_type record){
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return typeMapper.updateByPrimaryKeySelective(record);
	}
	/**
	 * 插入签到类型表
	 */
	public int insertTypeSelective(tb_sign_type record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return typeMapper.insertSelective(record);
	}
	/**
	 * 查找班级表id
	 */
	public List<Tb_staff_class> findclassidByStaffid(Integer id){
		Tb_staff_classExample condition = new Tb_staff_classExample();
		Tb_staff_classExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示 禁用不显示
		criteria.andStaffIdEqualTo(id);
		return classMapper.selectByExample(condition);
	}
	
	/**
	 * 查找时间表id
	 */
	public List<Tb_staff_signdate> finddateidByStaffid(Integer id){
		Tb_staff_signdateExample condition = new Tb_staff_signdateExample();
		Tb_staff_signdateExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示 禁用不显示
		criteria.andStaffIdEqualTo(id);
		return dateMapper.selectByExample(condition);
	}
	/**
	 * 编辑职工
	 */
	public int updatestaff(Tb_newstaff record){
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return newstaffMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 编辑班级关系
	 */
	public int updateclass(Tb_staff_class record){
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return classMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 编辑时间关系
	 */
	public int updatesign(Tb_staff_signdate record){
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return dateMapper.updateByPrimaryKeySelective(record);
	}
	/**
	 * 通过员工姓名查询
	 */
	public List<Tb_newstaff> findByName(String name,Integer id){
		Tb_newstaffExample condition = new Tb_newstaffExample();
		Tb_newstaffExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示 禁用不显示
		criteria.andNameEqualTo(name);
		criteria.andSchoolIdEqualTo(id);
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		return newstaffMapper.selectByExample(condition);
	}
	/**
	 * 通过员工id查询
	 */
	public Tb_newstaff findById(Integer id){
		
		return newstaffMapper.selectByPrimaryKey(id);
	}
	/**
	 * 删除员工
	 */
	public int delete(Integer id){
		Tb_newstaff staff=newstaffMapper.selectByPrimaryKey(id);
		staff.setDeleted((byte)1);
		return newstaffMapper.updateByPrimaryKeySelective(staff);
	}
	/**
	 * 通过学校查询该学校的医生和保洁
	 */
	public List<Tb_newstaff> findByType(Integer schoolid){
		Tb_newstaffExample condition = new Tb_newstaffExample();
		Tb_newstaffExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示 禁用不显示
		criteria.andTypeBetween((byte)33, (byte)34);
		criteria.andSchoolIdEqualTo(schoolid);
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		return newstaffMapper.selectByExample(condition);
	}
	/**
	 * 插入老师
	 * 
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertTeacherSelective(Tb_newstaff record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return newstaffMapper.insertSelective(record);
	}
	
	/**
	 * 插入老师与班级关系
	 */
	public int insertClassSelective(Tb_staff_class record){
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return classMapper.insertSelective(record);
	}
	
	/**
	 * 插入老师与班级关系
	 */
	public int insertDateSelective(Tb_staff_signdate record){
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return dateMapper.insertSelective(record);
	}
}
