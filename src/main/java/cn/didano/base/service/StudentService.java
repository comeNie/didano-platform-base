package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Hand_student4MailListHasParentsMapper;
import cn.didano.base.dao.Tb_schoolparentMapper;
import cn.didano.base.dao.Tb_studentMapper;
import cn.didano.base.dao.Tb_student_detection4photoWallMapper;
import cn.didano.base.dao.Tb_studentparentMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Hand_student4MailListHasParents;
import cn.didano.base.model.Hand_student4MailListHasParentsExample;
import cn.didano.base.model.Tb_schoolparent4;
import cn.didano.base.model.Tb_student;
import cn.didano.base.model.Tb_studentExample;
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
	private Hand_student4MailListHasParentsMapper newstudentMapper;
	@Autowired
	private Tb_studentparentMapper studentparentMapper;
	@Autowired
	private Tb_schoolparentMapper schoolparentMapper;
	
	@Autowired
	private Tb_studentMapper tb_studentMapper;

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
	 * 通过id查询student Info
	 */
	public Tb_student selectStudentById(Integer id) {
		Tb_studentExample condition=new Tb_studentExample();
		Tb_studentExample.Criteria criteria=condition.createCriteria();
		criteria.andIdEqualTo(id);
		Tb_student selectByPrimaryKey = tb_studentMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	/**
	 * 查找所有学生
	 */
	public List<Hand_student4MailListHasParents> findAll() {
		Hand_student4MailListHasParentsExample condition = new Hand_student4MailListHasParentsExample();
		Hand_student4MailListHasParentsExample.Criteria criteria = condition.createCriteria();
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
	public int insertStudentSelective(Hand_student4MailListHasParents record) {
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
