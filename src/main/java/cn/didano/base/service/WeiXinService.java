package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Tb_orgMapper;
import cn.didano.base.dao.Wx_official_accountMapper;
import cn.didano.base.dao.Wx_org_official_accountMapper;
import cn.didano.base.dao.Wx_templateMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Tb_org;
import cn.didano.base.model.Tb_orgExample;
import cn.didano.base.model.Wx_official_account;
import cn.didano.base.model.Wx_official_accountExample;
import cn.didano.base.model.Wx_org_official_account;
import cn.didano.base.model.Wx_org_official_accountExample;
import cn.didano.base.model.Wx_template;
import cn.didano.base.model.Wx_templateExample;

@Service
public class WeiXinService {

	@Autowired
	private Wx_official_accountMapper wx_infoMapper;
	@Autowired
	private Tb_orgMapper tb_orgMapper;
	@Autowired
	private Wx_org_official_accountMapper wx_orgMapper;
	@Autowired
	private Wx_templateMapper wx_templateMapper;
	/**
	 * 删除微信公众信息
	 */
	public int deleteAccount(Integer id){
		Wx_official_account account=wx_infoMapper.selectByPrimaryKey(id);
		account.setDeleted(true);
		return wx_infoMapper.updateByPrimaryKeySelective(account);
	}
	/**
	 * 编辑微信公众信息
	 */
	public int updateAccount(Wx_official_account record){
		Wx_official_accountExample condition = new Wx_official_accountExample();
		Wx_official_accountExample.Criteria criteria = condition.createCriteria();
		criteria.andIdEqualTo(record.getId());
		return wx_infoMapper.updateByExampleSelective(record, condition);
	}
	/**
	 * 查找所有微信公众号信息
	 */
	public List<Wx_official_account> findAllAccount(){
		Wx_official_accountExample condition = new Wx_official_accountExample();
		Wx_official_accountExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
       
		criteria.andDeletedNotEqualTo(true);
		return wx_infoMapper.selectByExample(condition);
	}
	/**
	 * 插入微信公众号信息
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertAccountSelective(Wx_official_account record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return wx_infoMapper.insertSelective(record);
	}
	/**
	 * 查找所有机构
	 */
	public List<Tb_org> findAllTb_org(){
		Tb_orgExample condition = new Tb_orgExample();
		Tb_orgExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
       
		criteria.andDeletedNotEqualTo(true);
		return tb_orgMapper.selectByExample(condition);
	}
	/**
	 * 插入机构
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertTb_orgSelective(Tb_org record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return tb_orgMapper.insertSelective(record);
	}
	/**
	 * 编辑机构
	 */
	public int updateTb_org(Tb_org record){
		Tb_orgExample condition = new Tb_orgExample();
		Tb_orgExample.Criteria criteria = condition.createCriteria();
		criteria.andIdEqualTo(record.getId());
		return tb_orgMapper.updateByExampleSelective(record, condition);
	}
	/**
	 * 删除机构
	 */
	public int deleteTb_org(Integer id){
		Tb_org org=tb_orgMapper.selectByPrimaryKey(id);
		org.setDeleted(true);
		return tb_orgMapper.updateByPrimaryKeySelective(org);
	}
	/**
	 * 插入机构与微信公众信息关联消息
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertOrg_accountSelective(Wx_org_official_account record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return wx_orgMapper.insertSelective(record);
	}
	/**
	 * 查找微信公众号信息关联消息
	 */
	public List<Wx_org_official_account> findOfficialAccount(Wx_official_account record){
		Wx_org_official_accountExample condition = new Wx_org_official_accountExample();
		Wx_org_official_accountExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
		criteria.andOfficialAccountIdEqualTo(record.getId());
		criteria.andDeletedNotEqualTo(true);
		return wx_orgMapper.selectByExample(condition);
	}
	
	/**
	 * 编辑机构与微信公众信息关联消息
	 */
	public int updateOrg_account(Wx_org_official_account record){
		Wx_org_official_accountExample condition = new Wx_org_official_accountExample();
		Wx_org_official_accountExample.Criteria criteria = condition.createCriteria();
		criteria.andIdEqualTo(record.getId());
		return wx_orgMapper.updateByExampleSelective(record, condition);
	}
	/**
	 * 删除机构与微信公众信息关联消息
	 */
	public int deleteOrg_account(Integer id){
		Wx_org_official_accountExample condition = new Wx_org_official_accountExample();
		Wx_org_official_accountExample.Criteria criteria = condition.createCriteria();
		criteria.andOfficialAccountIdEqualTo(id);
		List<Wx_org_official_account> org=wx_orgMapper.selectByExample(condition);
		org.get(0).setDeleted(true);
		return wx_orgMapper.updateByPrimaryKeySelective(org.get(0));
	}
	/**
	 * 插入模板
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertTemplateSelective(Wx_template record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return wx_templateMapper.insertSelective(record);
	}
	/**
	 * 编辑模板
	 */
	public int updateTemplayte(Wx_template record){
		Wx_templateExample condition = new Wx_templateExample();
		Wx_templateExample.Criteria criteria = condition.createCriteria();
		criteria.andIdEqualTo(record.getId());
		return wx_templateMapper.updateByExampleSelective(record, condition);
	}
	/**
	 * 删除微信模板
	 */
	public int deleteTemplate(Integer id){
		Wx_template template=wx_templateMapper.selectByPrimaryKey(id);
		template.setDeleted(true);
		return wx_templateMapper.updateByPrimaryKeySelective(template);
	}
	/**
	 * 查找所有模板
	 */
	public List<Wx_template> findAllTemplate(){
		Wx_templateExample condition = new Wx_templateExample();
		Wx_templateExample.Criteria criteria = condition.createCriteria();
		// 对于已经deleted=1的不显示
       
		criteria.andDeletedNotEqualTo(true);
		return wx_templateMapper.selectByExample(condition);
	}
}
