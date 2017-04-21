package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_ManageInfo;
/**
 * 硬件信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface ManageInfoRepository extends MongoRepository<Robot_ManageInfo, String> {
	public Robot_ManageInfo findByDeviceNo(String device_no);
}
