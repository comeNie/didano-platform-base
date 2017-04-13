package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.ManageInfo;
/**
 * 硬件信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface ManageInfoRepository extends MongoRepository<ManageInfo, String> {
	public ManageInfo findByDeviceNo(String device_no);
}
