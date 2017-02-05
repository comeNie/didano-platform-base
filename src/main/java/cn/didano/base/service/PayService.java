package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.didano.base.dao.Bs_payMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Bs_pay;
import cn.didano.base.model.Bs_payExample;


/**
 * 
 * @author stephen
 *
 */
@Service
public class PayService {
	@Autowired
	private Bs_payMapper payMapper;

	/**
	 * 查询所有
	 * @return
	 */
	public List<Bs_pay> selectAll() {
		Bs_payExample condition = new Bs_payExample();
		Bs_payExample.Criteria criteria = condition.createCriteria();
		return new PageInfo<Bs_pay>(payMapper.selectByExample(condition)).getList();
	}

	/**
	 * 查询集合
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Bs_pay> selectAll(int page,int size) {
		PageHelper.startPage(page, size);
		Bs_payExample condition = new Bs_payExample();
		Bs_payExample.Criteria criteria = condition.createCriteria();
		return new PageInfo<Bs_pay>(payMapper.selectByExample(condition)).getList();
	}

	/**
	 * 查询单条
	 * @param id
	 * @return
	 */
	public Bs_pay selectByPrimaryKey(Integer id) {
		return payMapper.selectByPrimaryKey(id);
	}

	/**
	 * 插入
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertSelective(Bs_pay record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return payMapper.insertSelective(record);
	}

	/**
	 * 删除
	 * @param id
	 * @return 删除行数
	 */
	public int deleteByPrimaryKey(int id) {
		if (id < 1)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_LESS_1); 
		return payMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 更新
	 * @param record
	 * @return 更新行数
	 */
	public int updateByPrimaryKey(Bs_pay record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return payMapper.updateByPrimaryKey(record);
	}
}
