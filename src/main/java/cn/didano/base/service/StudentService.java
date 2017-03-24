package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Tb_newstudentMapper;
import cn.didano.base.dao.Tb_schoolparentMapper;
import cn.didano.base.dao.Tb_student_detection4photoWallMapper;
import cn.didano.base.dao.Tb_studentparentMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_newstudent;
import cn.didano.base.model.Tb_newstudentExample;
import cn.didano.base.model.Tb_schoolparent4;
import cn.didano.base.model.Tb_student_detection4photoWall;
import cn.didano.base.model.Tb_student_detection4photoWallExample;
import cn.didano.base.model.Tb_studentparent;
import cn.didano.video.constant.DeletedType;
import cn.didano.video.constant.StatusType;

/**
 * 
 * @author guitar
 *
 */
@Service
public class StudentService {

	@Autowired
	private Tb_student_detection4photoWallMapper photoWallMapper;
	@Autowired
	private Tb_newstudentMapper newstudentMapper;
	@Autowired
	private Tb_studentparentMapper studentparentMapper;
	@Autowired
	private Tb_schoolparentMapper schoolparentMapper;

	/**
	 * 通过id查询
	 */
	public List<Tb_student_detection4photoWall> selectById(Integer student_id) {

		Tb_student_detection4photoWallExample condition = new Tb_student_detection4photoWallExample();
		Tb_student_detection4photoWallExample.Criteria criteria = condition.createCriteria();
		criteria.andStudentIdEqualTo(student_id);
		condition.setOrderByClause("created");
		criteria.andOrgImgUrlNotLike("");
		return photoWallMapper.selectByExample(condition);
	}

	/**
	 * 查找所有学生
	 */
	public List<Tb_newstudent> findAll() {
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
	 * 
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
	 * 
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertParentSelective(Tb_schoolparent4 record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return schoolparentMapper.insertSelective(record);
	}
}
