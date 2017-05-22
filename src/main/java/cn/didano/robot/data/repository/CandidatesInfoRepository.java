package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_CandidatesInfo;
/**
 * 硬件信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface CandidatesInfoRepository extends MongoRepository<Robot_CandidatesInfo, String> {
	public Robot_CandidatesInfo findByDeviceNo(String device_no);
}
