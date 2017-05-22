package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_AndroidHardWareUsed;
/**
 * 硬件信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface AndroidHardWareUsedRepository extends MongoRepository<Robot_AndroidHardWareUsed, String> {
	public Robot_AndroidHardWareUsed findByDeviceNo(String device_no);
}
