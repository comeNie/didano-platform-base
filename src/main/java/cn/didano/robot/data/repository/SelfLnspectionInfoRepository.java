package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.SelfLnspectionInfo;
/**
 * 自检信息容器
 * @author stephen.wang  2017年3月14日 
 */
public interface SelfLnspectionInfoRepository extends MongoRepository<SelfLnspectionInfo, String> {
	public SelfLnspectionInfo findByDeviceNo(String device_no);
}
