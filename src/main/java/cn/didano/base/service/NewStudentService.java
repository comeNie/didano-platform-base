package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Tb_newstudentMapper;
import cn.didano.base.dao.Tb_schoolparentMapper;
import cn.didano.base.dao.Tb_studentparentMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_newstudent;
import cn.didano.base.model.Tb_newstudentExample;
import cn.didano.base.model.Tb_schoolparent;
import cn.didano.base.model.Tb_studentparent;
import cn.didano.video.constant.DeletedType;
import cn.didano.video.constant.StatusType;
@Service
public class NewStudentService {

	@Autowired
	private Tb_newstudentMapper newstudentMapper;
	@Autowired
	private Tb_studentparentMapper studentparentMapper;
	@Autowired
	private Tb_schoolparentMapper schoolparentMapper;
	
	/**
	 * 查找所有学生
	 */
	public List<Tb_newstudent> findAll(){
		Tb_newstudentExample condition = new Tb_newstudentExample();
		Tb_newstudentExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示 禁用不显示
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		criteria.andStatusEqualTo(StatusType.IS_USE.getIndex());
		return newstudentMapper.selectByExample(condition);
	}
	/**
	 * 插入学生
	 * 
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertStudentSelective(Tb_newstudent record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return newstudentMapper.insertSelective(record);
	}
 
	/**
	 * 插入学生父母关系表
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertStudentParentSelective(Tb_studentparent record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return studentparentMapper.insertSelective(record);
	}
	
	/**
	 * 插入父母
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertParentSelective(Tb_schoolparent record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return schoolparentMapper.insertSelective(record);
	}
}
