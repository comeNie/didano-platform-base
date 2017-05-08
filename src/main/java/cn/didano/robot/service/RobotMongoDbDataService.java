package cn.didano.robot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.robot.data.Robot_HardwareInfo;
import cn.didano.robot.data.Robot_ManageInfo;
import cn.didano.robot.data.Robot_MeetPropertyInfo;
import cn.didano.robot.data.Robot_MeetSpeedInfo;
import cn.didano.robot.data.Robot_OnLineInfo;
import cn.didano.robot.data.Robot_OperationInfo;
import cn.didano.robot.data.Robot_PhotographicQualityInfo;
import cn.didano.robot.data.Robot_SelfLnspectionInfo;
import cn.didano.robot.data.Robot_TemperatureInfo;
import cn.didano.robot.data.Robot_UploadType;
import cn.didano.robot.data.Robot_VersionInfo;
import cn.didano.robot.data.Robot_school;
import cn.didano.robot.data.repository.HardwareInfoRepository;
import cn.didano.robot.data.repository.ManageInfoRepository;
import cn.didano.robot.data.repository.MeetPropertyInfoRepository;
import cn.didano.robot.data.repository.MeetSpeedInfoRepository;
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
public class RobotMongoDbDataService {
	@Autowired
	private RVersionInfoRepository v_repository;
	@Autowired
	private HardwareInfoRepository h_repository;
	@Autowired
	private TemperatureInfoRepsitory t_repository;
	@Autowired
	private OperationInfoRepository o_repository;
	@Autowired
	private SelfLnspectionInfoRepository s_sepository;
	@Autowired
	private MeetSpeedInfoRepository m_sepository;
	@Autowired
	private MeetPropertyInfoRepository mp_sepository;
	@Autowired
	private OnLineInfoRepository or_sepository;
	@Autowired
	private PhotographicQualityInfoRepository p_sepository;
	@Autowired
	private ManageInfoRepository mr_sepository;
	@Autowired
	private SchoolRepository sr_sepository;
	@Autowired
	private TypeNameRepository tn_sepository;
	
	/**
	 * 查询
	 * 
	 * @return
	 */
	public Robot_VersionInfo findRVersionInfo(String device_no) {
		return this.v_repository.findByDeviceNo(device_no);
	}
	
	/**
	 * 保存版本数据
	 * 
	 * @param record
	 * @return 更新行数
	 */
	public Robot_VersionInfo saveRVersionInfo(Robot_VersionInfo record) {
		return this.v_repository.save(record);
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:05:45
	 * @Title: saveHardwareInfo
	 * @Description: （保存硬件数据）
	 * @return HardwareInfo 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public Robot_HardwareInfo saveHardwareInfo(Robot_HardwareInfo hardwareInfo) {
		return this.h_repository.save(hardwareInfo);
	}
	
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （保存机器人的温度信息）
	 * @return TemperatureInfo 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public Robot_TemperatureInfo saveTemperatureInfo(Robot_TemperatureInfo temperatureInfo) {
		return this.t_repository.save(temperatureInfo);
	}
	
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （保存机器人的运行环境信息）
	 * @return saveOperationInfo 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public Robot_OperationInfo saveOperationInfo(Robot_OperationInfo operationInfo) {
		return this.o_repository.save(operationInfo);
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （保存机器人的自检信息）
	 * @return saveOperationInfo 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public Robot_SelfLnspectionInfo saveSelfLnspectionInfo(Robot_SelfLnspectionInfo selfLnspectionInfo) {
		System.err.println("123");//当第二次下控时执行啦两次保存
		return this.s_sepository.save(selfLnspectionInfo);
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （保存机器人的自检信息）
	 * @return saveOperationInfo 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public Robot_MeetSpeedInfo saveMeetSpeedInfo(Robot_MeetSpeedInfo meetSpeedInfo) {
		return this.m_sepository.save(meetSpeedInfo);
	}
	
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （保存机器人的自检信息）
	 * @return saveOperationInfo 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public Robot_MeetPropertyInfo saveMeetPropertyInfo(Robot_MeetPropertyInfo meetSpeedInfo) {
		return this.mp_sepository.save(meetSpeedInfo);
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （保存机器人运行在线信息）
	 * @return saveOperationInfo 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public Robot_OnLineInfo saveOnLineInfo(Robot_OnLineInfo onLineInfo) {
		return this.or_sepository.save(onLineInfo);
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （保存机器人运行在线信息）
	 * @return saveOperationInfo 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public Robot_PhotographicQualityInfo savePhotographicQualityInfo(Robot_PhotographicQualityInfo onLineInfo) {
		return this.p_sepository.save(onLineInfo);
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:13:13
	 * @Title: saveTemperatureInfo
	 * @Description: （保存机器人运行在线信息）
	 * @return saveOperationInfo 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	public Robot_ManageInfo saveManageInfo(Robot_ManageInfo robot_ManageInfo) {
		return this.mr_sepository.save(robot_ManageInfo);
	}
	public Robot_school saveRobot_school(Robot_school robot_school) {
		return this.sr_sepository.save(robot_school);
	}
	public Robot_UploadType saveRobot_UploadType(Robot_UploadType robot_UploadType) {
		return this.tn_sepository.save(robot_UploadType);
	}
}
