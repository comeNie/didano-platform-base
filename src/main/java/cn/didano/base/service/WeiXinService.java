package cn.didano.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Wx_official_account_infoMapper;
import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Wx_official_account_info;

@Service
public class WeiXinService {

	@Autowired
	private Wx_official_account_infoMapper wx_infoMapper;
	
	/**
	 * 插入
	 * @param record
	 * @return 有值，id ,否则返回-1
	 */
	public int insertModelSelective(Wx_official_account_info record) {
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		return wx_infoMapper.insertSelective(record);
	}
	
}
