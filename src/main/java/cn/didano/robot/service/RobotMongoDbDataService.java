package cn.didano.robot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.robot.data.HardwareInfo;
import cn.didano.robot.data.ManageInfo;
import cn.didano.robot.data.MeetPropertyInfo;
import cn.didano.robot.data.MeetSpeedInfo;
import cn.didano.robot.data.OnLineInfo;
import cn.didano.robot.data.OperationInfo;
import cn.didano.robot.data.PhotographicQualityInfo;
import cn.didano.robot.data.RVersionInfo;
import cn.didano.robot.data.SelfLnspectionInfo;
import cn.didano.robot.data.TemperatureInfo;
import cn.didano.robot.data.repository.HardwareInfoRepository;
import cn.didano.robot.data.repository.ManageInfoRepository;
import cn.didano.robot.data.repository.MeetPropertyInfoRepository;
import cn.didano.robot.data.repository.MeetSpeedInfoRepository;
import cn.didano.robot.data.repository.OnLineInfoRepository;
import cn.didano.robot.data.repository.OperationInfoRepository;
import cn.didano.robot.data.repository.PhotographicQualityInfoRepository;
import cn.didano.robot.data.repository.RVersionInfoRepository;
import cn.didano.robot.data.repository.SelfLnspectionInfoRepository;
import cn.didano.robot.data.repository.TemperatureInfoRepsitory;

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
	/**
	 * 查询
	 * 
	 * @return
	 */
	public RVersionInfo findRVersionInfo(String device_no) {
		return this.v_repository.findByDeviceNo(device_no);
	}
	
	/**
	 * 保存版本数据
	 * 
	 * @param record
	 * @return 更新行数
	 */
	public RVersionInfo saveRVersionInfo(RVersionInfo record) {
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
	public HardwareInfo saveHardwareInfo(HardwareInfo hardwareInfo) {
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
	public TemperatureInfo saveTemperatureInfo(TemperatureInfo temperatureInfo) {
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
	public OperationInfo saveOperationInfo(OperationInfo operationInfo) {
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
	public SelfLnspectionInfo saveSelfLnspectionInfo(SelfLnspectionInfo selfLnspectionInfo) {
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
	public MeetSpeedInfo saveMeetSpeedInfo(MeetSpeedInfo meetSpeedInfo) {
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
	public MeetPropertyInfo saveMeetPropertyInfo(MeetPropertyInfo meetSpeedInfo) {
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
	public OnLineInfo saveOnLineInfo(OnLineInfo onLineInfo) {
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
	public PhotographicQualityInfo savePhotographicQualityInfo(PhotographicQualityInfo onLineInfo) {
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
	public ManageInfo saveManageInfo(ManageInfo onLineInfo) {
		return this.mr_sepository.save(onLineInfo);
	}
	

}
