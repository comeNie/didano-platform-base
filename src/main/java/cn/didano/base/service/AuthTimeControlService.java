package cn.didano.base.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Hand_benchmarkMapper;
import cn.didano.base.dao.Hand_student_detectionMapper;
import cn.didano.base.dao.Tb_benchmarkMapper;
import cn.didano.base.dao.Tb_studentRecordMapper;
import cn.didano.base.dao.Tb_student_detectionMapper;
import cn.didano.base.dao.Tb_student_selectMapper;
import cn.didano.base.dao.Vd_auth_time_controlMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_benchmark;
import cn.didano.base.model.Tb_studentRecord;
import cn.didano.base.model.Tb_studentRecordExample;
import cn.didano.base.model.Tb_student_detection;
import cn.didano.base.model.Vd_auth_time_control;
import cn.didano.base.model.Vd_auth_time_controlExample;
import cn.didano.video.util.TimeUtil;


/**
 * 频道的时间控制服务
 * @author stephen
 */
@Service
public class AuthTimeControlService {
	@Autowired
	private Vd_auth_time_controlMapper time_controlMapper;
	
	@Autowired
	private Tb_student_detectionMapper student_detectionMapper;
	
	@Autowired
	private Tb_benchmarkMapper benchmarkMapper;
	
	@Autowired
	private Tb_studentRecordMapper studentRecordMapper;
	
	@Autowired
	private Tb_student_selectMapper selectMapper;
	
	@Autowired
	private Hand_benchmarkMapper hand_benchmarkMapper;
	
	@Autowired
	private Hand_student_detectionMapper handMapper;

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Vd_auth_time_control> selectAll() {
		Vd_auth_time_controlExample condition = new Vd_auth_time_controlExample();
		return time_controlMapper.selectByExample(condition);
	}
	
	
	/**
	 * 按频道ID查询
	 * @return
	 */
	public List<Vd_auth_time_control> selectByChannelId(int ChannelId) {
		Vd_auth_time_controlExample condition = new Vd_auth_time_controlExample();
		Vd_auth_time_controlExample.Criteria cri = condition.createCriteria();
		cri.andChannelIdEqualTo(ChannelId);
		return time_controlMapper.selectByExample(condition);
	}
	
	/**
	 * 查询当前时间
	 * @return
	 */
	public boolean checkIsControByRemote(int ChannelId) {
		Vd_auth_time_controlExample condition = new Vd_auth_time_controlExample();
		Vd_auth_time_controlExample.Criteria cri = condition.createCriteria();
		cri.andChannelIdEqualTo(ChannelId);
		List<Vd_auth_time_control> lists=  time_controlMapper.selectByExample(condition);
		boolean isIn = false;
		for (Vd_auth_time_control vd_auth_time_control : lists) {
			//当前时间在TimeUtil带入
			if(TimeUtil.inRange(vd_auth_time_control.getStart(), vd_auth_time_control.getEnd())){
				isIn = true;
				break;
			}
		}
		return isIn;
	}
	
	/**
	 * 按学校ID查询
	 * @return
	 */
	public List<Vd_auth_time_control> selectBySchoolId(int SchoolId) {
		Vd_auth_time_controlExample condition = new Vd_auth_time_controlExample();
		Vd_auth_time_controlExample.Criteria cri = condition.createCriteria();
		cri.andSchoolIdEqualTo(SchoolId);
		return time_controlMapper.selectByExample(condition);
	}

	/**
	 * 插入
	 * 
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertSelective(Vd_auth_time_control record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return time_controlMapper.insertSelective(record);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return 删除行数
	 */
	public int deleteByPrimaryKey(int id) {
		if (id < 1)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_LESS_1);
		return time_controlMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 更新
	 * 
	 * @param record
	 * @return 更新行数
	 */
	public int updateByPrimaryKeySelective(Vd_auth_time_control record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		if (record.getId() == null || record.getId() < 1)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_LESS_1);
		return time_controlMapper.updateByPrimaryKeySelective(record);
	}
	/**
	 * 查询学生的成长记录
	 * 调用
	 * @param id
	 * @return
	 */
	public List<Tb_student_detection> selectBystudent(Integer id){
		return selectMapper.selectByPrimaryKey_student(id);
	}
	/**
	 * 查询学生
	 * 调用
	 * @param id
	 * @return
	 */
	public List<Tb_studentRecord> selectstudent(int id){
		Tb_studentRecordExample detection=new Tb_studentRecordExample();
		Tb_studentRecordExample.Criteria cri=detection.createCriteria();
		cri.andIdEqualTo(id);
		return studentRecordMapper.selectByExample(detection);
	}
	/**
	 * 查询同龄人的平均身高
	 * 调用selectByPrimaryKey
	 * @param id
	 * @return
	 */
	public List<Tb_student_detection> select_student_detection(@Param("birthday") Date birthday,  @Param("birthday1")Date birthday1){
		return handMapper.select_student_detection(birthday,birthday1);
	}
	/**
	 * 查询国家儿童身高体重的标准
	 * 调用selectByPrimaryKey
	 * @param id
	 * @return
	 */
	public List<Tb_benchmark> selectByHeightAddWeight(Tb_benchmark tb){
		return hand_benchmarkMapper.selectByPrimaryKey(tb);
	}
}
