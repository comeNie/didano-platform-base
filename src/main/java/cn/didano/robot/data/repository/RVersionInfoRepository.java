package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cn.didano.robot.data.RVersionInfo;

@Repository
public interface RVersionInfoRepository extends MongoRepository<RVersionInfo, String> {
	RVersionInfo findByDeviceNo(String device_no);
}
