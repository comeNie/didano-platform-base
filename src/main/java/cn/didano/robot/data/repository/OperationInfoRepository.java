package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_HardwareInfo;
import cn.didano.robot.data.Robot_LinuxHardWareUsed;
/**
 * 运行环境信息
 * @author stephen.wang  2017年3月14日 
 */
public interface OperationInfoRepository extends MongoRepository<Robot_LinuxHardWareUsed, String> {
	public Robot_LinuxHardWareUsed findByDeviceNo(String device_no);
}
