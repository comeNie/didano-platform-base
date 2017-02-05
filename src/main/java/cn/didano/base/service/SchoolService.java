package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.didano.base.dao.Tb_schoolMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_school;
import cn.didano.base.model.Tb_schoolExample;
import cn.didano.video.constant.DeletedType;
import cn.didano.video.constant.StatusType;
import cn.didano.video.json.In_School_Search;

/**
 * 学校服务
 * @author stephen
 */
@Service
public class SchoolService {
	@Autowired
	private Tb_schoolMapper schoolMapper;

	/**
	 * 查询所有
	 * 不论状态和是否删除
	 * @return
	 */
	public List<Tb_school> selectAll() {
		Tb_schoolExample condition = new Tb_schoolExample();
		return schoolMapper.selectByExample(condition);
	}
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Tb_school> selectAll4onUse() {
		Tb_schoolExample condition = new Tb_schoolExample();
		Tb_schoolExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示 禁用不显示
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		criteria.andStatusEqualTo(StatusType.IS_USE.getIndex());
		return schoolMapper.selectByExample(condition);
	}
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Tb_school> selectAll(In_School_Search search) {
		if(search==null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		Tb_schoolExample condition = new Tb_schoolExample();
		Tb_schoolExample.Criteria criteria = condition.createCriteria();
		if(search!=null){
			criteria.andTitleLike("%"+search.getTitle()+"%");
		}
		// 对于已经deleted=1的不显示
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		criteria.andStatusEqualTo(StatusType.IS_USE.getIndex());
		return schoolMapper.selectByExample(condition);
	}

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public String selectNameByPrimaryKey(int schoolId) {
		if(schoolId<0)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_LESS_1);
		return schoolMapper.selectByPrimaryKey(schoolId).getTitle();
	}
	
	/**
	 * 查询集合
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Tb_school> selectAll(int page, int size) {
		PageHelper.startPage(page, size);
		Tb_schoolExample condition = new Tb_schoolExample();
		Tb_schoolExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
		criteria.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		return new PageInfo<Tb_school>(schoolMapper.selectByExample(condition)).getList();
	}

}
