package cn.didano.robot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.robot.data.HardwareInfo;
import cn.didano.robot.data.RVersionInfo;
import cn.didano.robot.data.repository.HardwareInfoRepository;
import cn.didano.robot.data.repository.RVersionInfoRepository;

/**
 * 诊断平台信息服务，面对mongodb数据库
 * 
 * @author stephen.wang
 *
 */
@Service
public class RobotMongoDbDataService {
	@Autowired
	private RVersionInfoRepository v_repository;
	@Autowired
	private HardwareInfoRepository h_repository;
	/**
	 * 查询
	 * 
	 * @return
	 */
	public RVersionInfo findRVersionInfo(String device_no) {
		return this.v_repository.findByDeviceNo(device_no);
	}
	
	/**
	 * 保存版本数据
	 * 
	 * @param record
	 * @return 更新行数
	 */
	public RVersionInfo saveRVersionInfo(RVersionInfo record) {
		return this.v_repository.save(record);
	}
	
	/**
	 * 保存硬件数据
	 *
	 * @param record
	 * @return 更新行数
	 */
	public HardwareInfo saveHardwareInfo(HardwareInfo hardwareInfo) {
		return this.h_repository.save(hardwareInfo);
	}

}
