package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.didano.base.dao.Hand_auth_switchMapper;
import cn.didano.base.dao.Vd_auth_switchMapper;
import cn.didano.base.dao.View_switch_s_cMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Vd_auth_switch;
import cn.didano.base.model.Vd_auth_switchExample;
import cn.didano.base.model.View_switch_s_c;
import cn.didano.base.model.View_switch_s_cExample;
import cn.didano.video.json.In_Switch_Search;

/**
 * 视频授权开关服务
 * @author stephen
 * Created on 2016年12月20日 上午10:53:40 
 */
@Service
public class AuthSwitchService {
	@Autowired
	private Vd_auth_switchMapper vd_auth_switchMapper;
	@Autowired
	private View_switch_s_cMapper view_switch_s_cMapper;
	@Autowired
	private Hand_auth_switchMapper auth_switchMapper;
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<View_switch_s_c> selectAll() {
		View_switch_s_cExample condition = new View_switch_s_cExample();
		return view_switch_s_cMapper.selectByExample(condition);
	}
	
	/**
	 * 查询集合
	 * @param page
	 * @param size
	 * @return
	 */
	public PageInfo<View_switch_s_c> selectAll(int page,int size) {
		PageHelper.startPage(page, size);
		View_switch_s_cExample condition = new View_switch_s_cExample();
		return new PageInfo<View_switch_s_c>(view_switch_s_cMapper.selectByExample(condition));
	}
	
	
	/**
	 * 查询集合
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Vd_auth_switch> selectSwitch_by_school(int schoolId) {
		Vd_auth_switchExample condition = new Vd_auth_switchExample();
		Vd_auth_switchExample.Criteria cri = condition.createCriteria();
		cri.andSchoolIdEqualTo(schoolId);
		return auth_switchMapper.select_auth_switch(schoolId);
	}
	
	/**
	 * 查询集合
	 * @param page
	 * @param size
	 * @return
	 */
	public PageInfo<View_switch_s_c> selectAll(int page,int size, In_Switch_Search iss) {
		PageHelper.startPage(page, size);
		View_switch_s_cExample condition = new View_switch_s_cExample();
		View_switch_s_cExample.Criteria criteria = condition.createCriteria();
		criteria.andOwnerNameLike("%"+iss.getOwner_name()+"%");
		return new PageInfo<View_switch_s_c>(view_switch_s_cMapper.selectByExample(condition));
	}
	
	/**
	 * 查询集合
	 * @param page
	 * @param size
	 * @return
	 */
	public List<View_switch_s_c> selectAll(In_Switch_Search iss) {
		View_switch_s_cExample condition = new View_switch_s_cExample();
		View_switch_s_cExample.Criteria criteria = condition.createCriteria();
		return view_switch_s_cMapper.selectByExample(condition);
	}
	
	
	/**
	 * 查询集合
	 * @param page
	 * @param size
	 * @return
	 */
	public Vd_auth_switch selectOne(int owner_id,byte owner_type) {
		Vd_auth_switch vd_auth_switch = null;
		Vd_auth_switchExample condition = new Vd_auth_switchExample();
		Vd_auth_switchExample.Criteria criteria = condition.createCriteria();
		//学生
		criteria.andOwnerIdEqualTo(owner_id);
		criteria.andOwnerTypeEqualTo(owner_type);
		List<Vd_auth_switch> list = (vd_auth_switchMapper.selectByExample(condition));
		if(list!=null&&list.size()>0)
			vd_auth_switch = list.get(0);//取第一个值作为判断；
		return vd_auth_switch;
	}

	/**
	 * 查询单条
	 * @param id
	 * @return
	 */
	public Vd_auth_switch selectByPrimaryKey(Integer id) {
		return vd_auth_switchMapper.selectByPrimaryKey(id);
	}

	/**
	 * 插入
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertSelective(Vd_auth_switch record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return vd_auth_switchMapper.insertSelective(record);
	}

	/**
	 * 删除
	 * @param id
	 * @return 删除行数
	 */
	public int deleteByPrimaryKey(int id) {
		if (id < 1)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_LESS_1); 
		return vd_auth_switchMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 更新
	 * @param record
	 * @return 更新行数
	 */
	public int updateByPrimaryKey(Vd_auth_switch record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return vd_auth_switchMapper.updateByPrimaryKey(record);
	}
	
	/**
	 * 更新
	 * @param record
	 * @return 更新行数
	 */
	public int updateByPrimaryKeySelective(Vd_auth_switch record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return vd_auth_switchMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 更新开关
	 * @param record
	 * @return 更新是否成功 1 成功 -1失败
	 */
	public int updateUse(int id,boolean isUse) {
		if (id < 1)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_LESS_1);
		Vd_auth_switch record = new Vd_auth_switch();
		record.setId(id);
		record.setIsUse(isUse);
		return vd_auth_switchMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 更新开关
	 * @param record
	 * @return 更新是否成功 1 成功 -1失败
	 */
//	public void setSwitch(Vd_auth_switch record) {
//		//先查,如果有就更新，无则插入
//		Vd_auth_switchExample condition = new Vd_auth_switchExample();
//		Vd_auth_switchExample.Criteria criteria = condition.createCriteria();
//		criteria.andOwnerIdEqualTo(record.getOwnerId());
//		criteria.andOwnerTypeEqualTo(record.getOwnerType());
//		criteria.andAuthTypeEqualTo(record.getAuthType());
//		List<Vd_auth_switch> checks = vd_auth_switchMapper.selectByExample(condition);
//		if(checks.size()<1){
//			vd_auth_switchMapper.insert(record);//插入
//		}else if(checks.size()==1){
//			vd_auth_switchMapper.updateByPrimaryKeySelective(record);//更新
//		}else{
//			vd_auth_switchMapper.updateByPrimaryKeySelective(record);//更新
//			logger.warn(DBExceptionEnums.ERROR_DB_HAS_MORE_THAN_ONE.message);
//			throw new ServiceException(DBExceptionEnums.ERROR_DB_HAS_MORE_THAN_ONE);  
//		}
//	}
}
