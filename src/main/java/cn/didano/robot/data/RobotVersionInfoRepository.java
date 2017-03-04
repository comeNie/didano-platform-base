package cn.didano.robot.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RobotVersionInfoRepository extends MongoRepository<RobotVersionInfo, String> {
	RobotVersionInfo findByDeviceNo(String device_no);
}
