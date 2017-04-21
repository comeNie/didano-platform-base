package cn.didano.base.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Tb_interactive_catalogMapper;
import cn.didano.base.dao.Tb_interactive_modelMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_interactive_catalog;
import cn.didano.base.model.Tb_interactive_catalogExample;
import cn.didano.base.model.Tb_interactive_model;
import cn.didano.base.model.Tb_interactive_modelExample;

@Service
public class InteractiveModelService {

	@Autowired
	private Tb_interactive_modelMapper modelMapper;
	@Autowired
	private Tb_interactive_catalogMapper catalogMapper;
	
	/**
	 * 查找种类
	 */
	public Tb_interactive_catalog findCatalogById(int id){
		
		return catalogMapper.selectByPrimaryKey(id);
	}
	/**
	 * 插入种类
	 */
	public int insertCatalogSelective(Tb_interactive_catalog record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return catalogMapper.insertSelective(record);
	}
	/**
	 * 插入
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertModelSelective(Tb_interactive_model record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return modelMapper.insertSelective(record);
	}
	/**
	 * 根据更新时间查找之后的
	 */
	public List<Tb_interactive_model> findByUpdate(long time){
		Tb_interactive_modelExample condition = new Tb_interactive_modelExample();
		Tb_interactive_modelExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
		Date date=new Date();
		date.setTime(time);
		criteria.andUpdatedGreaterThanOrEqualTo(date);
		criteria.andDeletedNotEqualTo(true);
		return modelMapper.selectByExample(condition);
	}
	/**
	 * 查询所有模块
	 */
	public List<Tb_interactive_model> findAllModel(){
		Tb_interactive_modelExample condition = new Tb_interactive_modelExample();
		condition.setOrderByClause("updated");
		
		Tb_interactive_modelExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
       
		criteria.andDeletedNotEqualTo(true);
		return modelMapper.selectByExample(condition);
	}
}
