package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_AndroidHardWareUsed;
import cn.didano.robot.data.Robot_FinalRecogResult;
/**
 * 硬件信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface FinalRecogResultRepository extends MongoRepository<Robot_FinalRecogResult, String> {
	public Robot_FinalRecogResult findByDeviceNo(String device_no);
}
