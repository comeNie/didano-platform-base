package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.didano.base.dao.Tb_staffMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_staff;
import cn.didano.base.model.Tb_staffExample;
import cn.didano.video.constant.DeletedType;

/**
 * 学校服务
 * @author stephen
 */
@Service
public class StaffService {
	@Autowired
	private Tb_staffMapper staffMapper;

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Tb_staff> selectAll() {
		Tb_staffExample condition = new Tb_staffExample();
		Tb_staffExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		return staffMapper.selectByExample(condition);
	}

	/**
	 * 查询集合
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Tb_staff> selectAll(int page, int size) {
		PageHelper.startPage(page, size);
		Tb_staffExample condition = new Tb_staffExample();
		Tb_staffExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		return new PageInfo<Tb_staff>(staffMapper.selectByExample(condition)).getList();
	}
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public Tb_staff selectByPrimaryKey(int staffId) {
		if (staffId < 1)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_LESS_1);
		Tb_staffExample condition = new Tb_staffExample();
		Tb_staffExample.Criteria criteria = condition.createCriteria();
		criteria.andIdEqualTo(staffId);
		return staffMapper.selectByPrimaryKey(staffId);
	}

}
