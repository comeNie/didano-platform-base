package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.didano.base.dao.Bs_goodMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Bs_good;
import cn.didano.base.model.Bs_goodExample;


/**
 * 
 * @author stephen
 *
 */
@Service
public class GoodService {
	@Autowired
	private Bs_goodMapper goodMapper;

	/**
	 * 查询所有
	 * @return
	 */
	public List<Bs_good> selectAll() {
		Bs_goodExample condition = new Bs_goodExample();
		Bs_goodExample.Criteria criteria = condition.createCriteria();
		return goodMapper.selectByExample(condition);
	}

	/**
	 * 查询集合
	 * @param page
	 * @param size
	 * @return
	 */
	public PageInfo<Bs_good> selectAll(int page,int size) {
		PageHelper.startPage(page, size);
		Bs_goodExample condition = new Bs_goodExample();
		return new PageInfo<Bs_good>(goodMapper.selectByExample(condition));
	}

	/**
	 * 查询单条
	 * @param id
	 * @return
	 */
	public Bs_good selectByPrimaryKey(Integer id) {
		return goodMapper.selectByPrimaryKey(id);
	}

	/**
	 * 插入
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertSelective(Bs_good record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return goodMapper.insertSelective(record);
	}

	/**
	 * 删除
	 * @param id
	 * @return 删除行数
	 */
	public int deleteByPrimaryKey(int id) {
		if (id < 0)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_LESS_1); 
		return goodMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 更新
	 * @param record
	 * @return 更新行数
	 */
	public int updateByPrimaryKey(Bs_good record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return goodMapper.updateByPrimaryKey(record);
	}
	
}
