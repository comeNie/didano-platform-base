package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_MeetPropertyInfo;
/**
 * 识别性能信息
 * @author stephen.wang  2017年3月14日 
 */
public interface MeetPropertyInfoRepository extends MongoRepository<Robot_MeetPropertyInfo, String> {
	public Robot_MeetPropertyInfo findByDeviceNo(String device_no);
}
