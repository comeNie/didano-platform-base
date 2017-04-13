package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.MeetPropertyInfo;
/**
 * 识别性能信息
 * @author stephen.wang  2017年3月14日 
 */
public interface MeetPropertyInfoRepository extends MongoRepository<MeetPropertyInfo, String> {
	public MeetPropertyInfo findByDeviceNo(String device_no);
}
