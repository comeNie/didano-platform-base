package cn.didano.base.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Vd_auth_time_controlMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
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
}
