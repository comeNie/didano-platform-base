package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Tb_newstaffMapper;
import cn.didano.base.dao.Tb_staff_classMapper;
import cn.didano.base.dao.Tb_staff_signdateMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_newstaff;
import cn.didano.base.model.Tb_newstaffExample;
import cn.didano.base.model.Tb_staff_class;
import cn.didano.base.model.Tb_staff_signdate;
import cn.didano.video.constant.DeletedType;


@Service
public class NewTeacherService {

	@Autowired
	private Tb_newstaffMapper newstaffMapper;
	@Autowired
	private Tb_staff_classMapper classMapper;
	@Autowired
	private Tb_staff_signdateMapper dateMapper;
	
	
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
