package cn.didano.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.robot.data.RConnectInfo;
import cn.didano.robot.data.RVersionInfo;
//import cn.didano.robot.data.repository.Customer;
//import cn.didano.robot.data.repository.CustomerRepository;
import cn.didano.robot.data.repository.RConnectInfoRepository;
import cn.didano.robot.data.repository.RVersionInfoRepository;

/**
 * 诊断平台信息服务，面对mongodb数据库
 * 
 * @author stephen.wang
 *
 */
@Service
public class RobotMongoDbDataService {
//	@Autowired
//	private RVersionInfoRepository v_repository;
//	@Autowired
//	private RConnectInfoRepository c_repository;
//	@Autowired
//	private CustomerRepository customerRepository;
	
//
//	/**
//	 * 查询
//	 * 
//	 * @return
//	 */
//	public RConnectInfo findRConnectInfo(String device_no) {
//		return this.c_repository.findByDeviceNo(device_no);
//		//return null;
//	}

	
//	/**
//	 * 查询
//	 * 
//	 * @return
//	 */
//	public Customer findCustomer(String name) {
//		return this.customerRepository.findByFirstName(name);
//		//return null;
//	}
//	
//	/**
//	 * 查询
//	 * 
//	 * @return
//	 */
//	public RVersionInfo findRVersionInfo(String device_no) {
//		return this.v_repository.findByDeviceNo(device_no);
//	}

	/**
	 * 保存连接数据
	 * 
	 * @param record
	 * @return 更新行数
	 */
//	public int saveRConnectInfo(RConnectInfo record) {
////		if (record == null)
////			throw new ServiceException(DBExceptionEnums.ERROR_MONGODB_SAVE);
//		this.c_repository.save(record);
//		return 1;
//	}

	/**
	 * 保存版本数据
	 * 
	 * @param record
	 * @return 更新行数
	 */
//	public int saveRVersionInfo(RVersionInfo record) {
////		if (record == null)
////			throw new ServiceException(DBExceptionEnums.ERROR_MONGODB_SAVE);
//		this.v_repository.save(record);
//		return 1;
//	}

}
