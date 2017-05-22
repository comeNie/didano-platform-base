package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_MotionSoftWareVersion;
/**
 * 硬件信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface MotionSoftWareVersionRepository extends MongoRepository<Robot_MotionSoftWareVersion, String> {
	public Robot_MotionSoftWareVersion findByDeviceNo(String device_no);
}
