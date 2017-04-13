package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.MeetSpeedInfo;
/**
 * 识别速度信息
 * @author stephen.wang  2017年3月14日 
 */
public interface MeetSpeedInfoRepository extends MongoRepository<MeetSpeedInfo, String> {
	public MeetSpeedInfo findByDeviceNo(String device_no);
}
