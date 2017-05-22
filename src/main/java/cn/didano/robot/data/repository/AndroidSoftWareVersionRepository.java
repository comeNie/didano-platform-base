package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_AndroidSoftWareVersion;
/**
 * 硬件信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface AndroidSoftWareVersionRepository extends MongoRepository<Robot_AndroidSoftWareVersion, String> {
	public Robot_AndroidSoftWareVersion findByDeviceNo(String device_no);
}
