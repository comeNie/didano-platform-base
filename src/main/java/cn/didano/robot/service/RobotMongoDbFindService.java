package cn.didano.robot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.robot.data.Robot_AppRunningStatus;
import cn.didano.robot.data.Robot_HardwareInfo;
import cn.didano.robot.data.Robot_LinuxEnvTemperatureInfo;
import cn.didano.robot.data.Robot_LinuxHardWareUsed;
import cn.didano.robot.data.Robot_LinuxSoftWareVersion;
import cn.didano.robot.data.Robot_LinuxStartUpRecord;
import cn.didano.robot.data.Robot_PhotographicQualityInfo;
import cn.didano.robot.data.Robot_UploadType;
import cn.didano.robot.data.Robot_school;
import cn.didano.robot.data.repository.HardwareInfoRepository;
import cn.didano.robot.data.repository.OnLineInfoRepository;
import cn.didano.robot.data.repository.OperationInfoRepository;
import cn.didano.robot.data.repository.PhotographicQualityInfoRepository;
import cn.didano.robot.data.repository.RVersionInfoRepository;
import cn.didano.robot.data.repository.SchoolRepository;
import cn.didano.robot.data.repository.SelfLnspectionInfoRepository;
import cn.didano.robot.data.repository.TemperatureInfoRepsitory;
import cn.didano.robot.data.repository.TypeNameRepository;

/**
 * 诊断平台信息服务，面对mongodb数据库
 * 
 * @author stephen.wang
 *
 */
@Service
public class RobotMongoDbFindService {
	@Autowired
	private RVersionInfoRepository v_repository;
	@Autowired
	private HardwareInfoRepository h_repository;
	@Autowired
	private TemperatureInfoRepsitory t_repository;
	@Autowired
	private OperationInfoRepository o_repository;
	@Autowired
	private SelfLnspectionInfoRepository s_repository;
	@Autowired
	private OnLineInfoRepository or_repository;
	@Autowired
	private PhotographicQualityInfoRepository p_repository;
	@Autowired
	private SchoolRepository sr_repository;
	@Autowired
	private TypeNameRepository tn_repository;
	
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （查询所有机器人的版本信息，并且不分页查询）
	 * @return queryAllByPage 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public List<Robot_LinuxSoftWareVersion> queryRVersionInfo() {
		System.err.println("123");
		return this.v_repository.findAll();
	}
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （查询所有机器人的自检信息，并且不分页查询）
	 * @return queryAllByPage 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public List<Robot_LinuxStartUpRecord> querySelfLnspectionInfo() {
		return this.s_repository.findAll();
	}
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （查询所有机器人的硬件信息，并且不分页查询）
	 * @return queryAllByPage 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public List<Robot_HardwareInfo> queryHardwareInfo() {
		return this.h_repository.findAll();
	}
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （查询所有机器人的环境温度信息信息，并且不分页查询）
	 * @return queryAllByPage 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public List<Robot_LinuxEnvTemperatureInfo> queryTemperatureInfo() {
		return this.t_repository.findAll();
	}
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （查询所有机器人的环境温度信息信息，并且不分页查询）
	 * @return queryAllByPage 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public List<Robot_AppRunningStatus> queryOnLineInfo() {
		return this.or_repository.findAll();
	}
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （查询所有机器人的环境温度信息信息，并且不分页查询）
	 * @return queryAllByPage 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public List<Robot_PhotographicQualityInfo> queryPhotographicQualityInfo() {
		return this.p_repository.findAll();
	}
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （查询所有机器人的环境温度信息信息，并且不分页查询）
	 * @return queryAllByPage 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public List<Robot_LinuxHardWareUsed> queryOperationInfo() {
		return this.o_repository.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	public List<Robot_school> selectSchool() {
		return this.sr_repository.findAll();
	}
	
	public List<Robot_school> selectSchoolName(String schoolName) {
		return this.sr_repository.findBySchoolName(schoolName);
	}
	
	public List<Robot_UploadType> selectType() {
		return this.tn_repository.findAll();
	}
	
}
