package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_LinuxStartUpRecord;
/**
 * 自检信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface SelfLnspectionInfoRepository extends MongoRepository<Robot_LinuxStartUpRecord, String> {
	public Robot_LinuxStartUpRecord findByDeviceNo(String device_no);
}
