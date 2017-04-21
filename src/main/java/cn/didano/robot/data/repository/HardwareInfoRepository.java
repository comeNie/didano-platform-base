package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_HardwareInfo;
/**
 * 硬件信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface HardwareInfoRepository extends MongoRepository<Robot_HardwareInfo, String> {
	public Robot_HardwareInfo findByDeviceNo(String device_no);
}
