package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.OnLineInfo;
/**
 * 运行在线
 * @author stephen.wang  2017年3月14日 
 */
public interface OnLineInfoRepository extends MongoRepository<OnLineInfo, String> {
	public OnLineInfo findByDeviceNo(String device_no);
}
