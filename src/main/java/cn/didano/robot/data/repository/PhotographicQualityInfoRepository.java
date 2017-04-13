package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.PhotographicQualityInfo;
/**
 * 照片质量信息
 * @author stephen.wang  2017年3月14日 
 */
public interface PhotographicQualityInfoRepository extends MongoRepository<PhotographicQualityInfo, String> {
	public PhotographicQualityInfo findByDeviceNo(String device_no);
}
