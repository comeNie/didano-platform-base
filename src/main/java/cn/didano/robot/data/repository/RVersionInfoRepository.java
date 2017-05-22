package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_LinuxSoftWareVersion;
/**
 * 版本信息容器
 * @author stephen.wang  2017年3月11日 
 */
public interface RVersionInfoRepository extends MongoRepository<Robot_LinuxSoftWareVersion, String> {
	Robot_LinuxSoftWareVersion findByDeviceNo(String device_no);
}