package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.didano.base.constant.DeletedType;
import cn.didano.base.dao.Hand_channelMapper;
import cn.didano.base.dao.Vd_channelMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.json.In_Channel_Search;
import cn.didano.base.model.ChannelStatus;
import cn.didano.base.model.Vd_channel;
import cn.didano.base.model.Vd_channelExample;

/**
 * 
 * @author stephen
 *
 */
@Service
public class ChannelService {
	@Autowired
	private Vd_channelMapper channelMapper;

	@Autowired
	private Hand_channelMapper hand_channelMapper;

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Vd_channel> selectAll() {
		Vd_channelExample condition = new Vd_channelExample();
		Vd_channelExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		return new PageInfo<Vd_channel>(channelMapper.selectByExample(condition)).getList();
	}

	/**
	 * 查询集合
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Vd_channel> selectAll(int page, int size) {
		PageHelper.startPage(page, size);
		Vd_channelExample condition = new Vd_channelExample();
		Vd_channelExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		return new PageInfo<Vd_channel>(channelMapper.selectByExample(condition)).getList();
	}

	/**
	 * 查询集合
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public PageInfo<Vd_channel> selectAll(int page, int size, In_Channel_Search search) {
		PageHelper.startPage(page, size);
		Vd_channelExample condition = new Vd_channelExample();
		Vd_channelExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		if (search != null) {
			if (search.getName() != null && !"".equals(search.getName())) {
				criteria.andNameLike(search.getName());
			}
			if (search.getEnName() != null && !"".equals(search.getEnName())) {
				criteria.andEnNameLike(search.getName());
			}
			if (search.getEnName() != null && !"".equals(search.getEnName())) {
				criteria.andEnNameLike(search.getName());
			}
			if (search.getType() != null) {
				criteria.andTypeEqualTo((byte) search.getType().intValue());
			}
			if (search.getClassId() != null) {
				criteria.andClassIdEqualTo(search.getClassId());
			}
			if (search.getSchoolId() != null) {
				criteria.andSchoolIdEqualTo(search.getSchoolId());
			}
		}
		return new PageInfo<Vd_channel>(channelMapper.selectByExample(condition));
	}

	/**
	 * 查询某个学校所有视频
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Vd_channel> selectAllBySchoolId(int schoolId) {
		Vd_channelExample condition = new Vd_channelExample();
		Vd_channelExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		criteria.andSchoolIdEqualTo(schoolId);
		return channelMapper.selectByExample(condition);
	}

	/**
	 * 查询单条
	 * 
	 * @param id
	 * @return
	 */
	public Vd_channel selectByPrimaryKey(Integer id) {
		return channelMapper.selectByPrimaryKey(id);
	}

	/**
	 * 插入
	 * 
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertSelective(Vd_channel record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return channelMapper.insertSelective(record);
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
		return channelMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 更新
	 * 
	 * @param record
	 * @return 更新行数
	 */
	public int updateByPrimaryKeySelective(Vd_channel record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		if (record.getId() == null || record.getId() < 1)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_LESS_1);
		return channelMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新
	 * 
	 * @param record
	 * @return 更新行数
	 */
	public int updateByExampleSelective(Vd_channel record, Vd_channelExample example) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return channelMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 查询所有(为client端提供的状态数据)
	 * 
	 * @return
	 */
	public List<ChannelStatus> selectAll4Auth() {
		return hand_channelMapper.selectALL();
	}

	/**
	 * 查询单个频道的状态(为client端提供的状态数据)
	 * 
	 * @param id
	 * @return
	 */
	public ChannelStatus selectStatusById(int id) {
		return hand_channelMapper.selectStatusById(id);
	}

	/**
	 * 设置单个频道的状态(为client端提供的状态数据)
	 * 
	 * @param id
	 * @return
	 */
	public int updateByChannelStatus(ChannelStatus channelStatus) {
		if (channelStatus == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return hand_channelMapper.updateByChannelStatus(channelStatus);
	}
}
