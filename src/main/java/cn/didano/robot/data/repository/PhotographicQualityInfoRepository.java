package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_PhotographicQualityInfo;
/**
 * 照片质量信息
 * @author stephen.wang  2017年3月14日 
 */
public interface PhotographicQualityInfoRepository extends MongoRepository<Robot_PhotographicQualityInfo, String> {
	public Robot_PhotographicQualityInfo findByDeviceNo(String device_no);
}
