package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.RVersionInfo;
/**
 * 版本信息容器
 * @author stephen.wang  2017年3月11日 
 */
public interface RVersionInfoRepository extends MongoRepository<RVersionInfo, String> {
	RVersionInfo findByDeviceNo(String device_no);
}
