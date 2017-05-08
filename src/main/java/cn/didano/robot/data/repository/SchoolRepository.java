package cn.didano.robot.data.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_school;
/**
 * 硬件信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface SchoolRepository extends MongoRepository<Robot_school, String> {
	public Robot_school findByDeviceNo(String device_no);
	public List<Robot_school> findBySchoolName(String schoolName);
	
}
