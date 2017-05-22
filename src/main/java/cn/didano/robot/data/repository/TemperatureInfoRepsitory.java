package cn.didano.robot.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.didano.robot.data.Robot_LinuxEnvTemperatureInfo;


/**
 * @创建人：SevenYang
 * @类名称：TemperatureInfoRepsitory  
 * @类描述：温度的上报
 * @创建时间：2017年3月17日 下午4:11:05
 * @version
 */
public interface TemperatureInfoRepsitory extends MongoRepository<Robot_LinuxEnvTemperatureInfo, String> {
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:11:11
	 * @Title: findByDeviceNo
	 * @Description: （方法描述）
	 * @return TemperatureInfo 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public Robot_LinuxEnvTemperatureInfo findByDeviceNo(String device_no);
}
