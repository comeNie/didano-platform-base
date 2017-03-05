package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cn.didano.robot.data.RConnectInfo;

/**
 * 连接信息容器
 * @author stephen.wang  2017年3月5日 
 */
@Repository
public interface RConnectInfoRepository extends MongoRepository<RConnectInfo, String> {
	RConnectInfo findByDeviceNo(String device_no);
}
