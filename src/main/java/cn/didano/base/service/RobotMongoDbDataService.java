package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.exception.DBExceptionEnums;
import cn.didano.base.exception.ServiceException;
import cn.didano.robot.data.RobotVersionInfo;
import cn.didano.robot.data.RobotVersionInfoRepository;


/**
 * 诊断平台信息服务，面对mongodb数据库
 * @author stephen.wang
 *
 */
@Service
public class RobotMongoDbDataService {
	@Autowired
	private RobotVersionInfoRepository repository;

	/**
	 * 查询所有
	 * @return
	 */
	public RobotVersionInfo find(String device_no) {
		return this.repository.findByDeviceNo(device_no);
	}


	/**
	 * 保存数据
	 * @param record
	 * @return 更新行数
	 */
	public int save(RobotVersionInfo record) {
		
		if (record == null)
			throw new ServiceException(DBExceptionEnums.ERROR_DB_CONTENT_NULL);
		this.repository.save(record);
		return 0;
	}
}
