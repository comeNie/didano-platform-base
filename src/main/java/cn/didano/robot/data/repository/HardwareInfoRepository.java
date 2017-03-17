package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.HardwareInfo;
/**
 * 版本信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface HardwareInfoRepository extends MongoRepository<HardwareInfo, String> {
	public HardwareInfo findByDeviceNo(String device_no);
}
