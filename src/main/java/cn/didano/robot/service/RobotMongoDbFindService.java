package cn.didano.robot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
	private MeetSpeedInfoRepository m_repository;
	@Autowired
	private MeetPropertyInfoRepository mp_repository;
	@Autowired
	private OnLineInfoRepository or_repository;
	@Autowired
	private PhotographicQualityInfoRepository p_repository;
	@Autowired
	private ManageInfoRepository mr_repository;
	
	
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
	public List<RVersionInfo> queryRVersionInfo() {
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
	public List<SelfLnspectionInfo> querySelfLnspectionInfo() {
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
	public List<HardwareInfo> queryHardwareInfo() {
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
	public List<TemperatureInfo> queryTemperatureInfo() {
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
	public List<MeetSpeedInfo> queryMeetSpeedInfo() {
		return this.m_repository.findAll();
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
	public List<MeetPropertyInfo> queryMeetPropertyInfo() {
		return this.mp_repository.findAll();
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
	public List<OnLineInfo> queryOnLineInfo() {
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
	public List<PhotographicQualityInfo> queryPhotographicQualityInfo() {
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
	public List<ManageInfo> queryManageInfo() {
		return this.mr_repository.findAll();
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
	public List<OperationInfo> queryOperationInfo() {
		return this.o_repository.findAll();
	}
	
}
