package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_LinuxHardWareInfo;
/**
 * 硬件信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface LinuxHardWareInfoRepository extends MongoRepository<Robot_LinuxHardWareInfo, String> {
	public Robot_LinuxHardWareInfo findByDeviceNo(String device_no);
}
