package cn.didano.robot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.exception.BackType;
import cn.didano.robot.core.UpInfo;
import cn.didano.robot.data.Robot_HardwareInfo;
import cn.didano.robot.data.Robot_ManageInfo;
import cn.didano.robot.data.Robot_MeetPropertyInfo;
import cn.didano.robot.data.Robot_MeetSpeedInfo;
import cn.didano.robot.data.Robot_OnLineInfo;
import cn.didano.robot.data.Robot_LinuxHardWareUsed;
import cn.didano.robot.data.Robot_PhotographicQualityInfo;
import cn.didano.robot.data.Robot_SelfLnspectionInfo;
import cn.didano.robot.data.Robot_TemperatureInfo;
import cn.didano.robot.data.Robot_UploadType;
import cn.didano.robot.data.Robot_VersionInfo;
import cn.didano.robot.data.Robot_school;
import cn.didano.robot.service.RobotMongoDbDataService;
import cn.didano.video.json.Out;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 诊断平台api服务
 * 诊断rest服务
 * 
 * @author stephen Created on 2016年12月17日 下午6:38:30
 */
@Api(value = "诊断rest服务", tags = "诊断rest服务")
@RestController
@RequestMapping(value = "/robot/up/")
public class RobotUpController {
	static Logger logger = Logger.getLogger(RobotUpController.class);
	@Autowired
	private RobotMongoDbDataService robotMongoDbDataService;

	@PostMapping(value = "reportVersionInfo")
	@ApiOperation(value = "上报版本信息", notes = "上报版本信息")
	@ResponseBody
	public Out<String> reportVersionInfo(
			@ApiParam(value = "远程机器人版本信息", required = true) @RequestBody Robot_VersionInfo robotVersionInfo) {
		logger.info("访问  RobotController :reportVersionInfo RobotVersionInfo=" + robotVersionInfo);
		System.err.println("上报版本信息");
		Out<String> out = new Out<String>();
		try {
			Object o = robotMongoDbDataService.saveRVersionInfo(robotVersionInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}

	/**
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reporThardwareInfo 
	 * @Description: （上报机器人的硬件信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */

	@PostMapping(value = "reporThardwareInfo")
	@ApiOperation(value = "上报硬件信息", notes = "上报硬件信息")
	@ResponseBody
	public Out<String> reporThardwareInfo(
			@ApiParam(value = "远程机器人硬件信息", required = true) @RequestBody Robot_HardwareInfo hardwareInfo) {
		logger.info("访问  RobotController :reporThardwareInfo HardwareInfo=" + hardwareInfo);
		System.err.println("上报硬件信息");
		Out<String> out = new Out<String>();
		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveHardwareInfo(hardwareInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}

	/**
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportTemperatureInfo 
	 * @Description: （上报机器的的温度信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportTemperatureInfo")
	@ApiOperation(value = "上报温度信息", notes = "上报温度信息")
	@ResponseBody
	public Out<String> reportTemperatureInfo(
			@ApiParam(value = "远程机器人温度信息", required = true) @RequestBody Robot_TemperatureInfo temperatureInfo) {
		logger.info("访问  RobotController :reportTemperatureInfo HardwareInfo=" + temperatureInfo);
		System.err.println("上报温度信息");
		Out<String> out = new Out<String>();

		try {
			UpInfo u=new UpInfo();
			System.err.println(u.getDeviceNo()+"-------上报温度----");
			// 直接保存信息
			Object o = robotMongoDbDataService.saveTemperatureInfo(temperatureInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	
	
	/**
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportTemperatureInfo 
	 * @Description: （上报机器的的运行环境信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportLinuxHardWareUsed")
	@ApiOperation(value = "上报linux运行环境的信息", notes = "上报linux运行环境的信息")
	@ResponseBody
	public Out<String> reportLinuxHardWareUsed(
			@ApiParam(value = "上报linux运行环境的信息", required = true) @RequestBody Robot_LinuxHardWareUsed linuxHardWareUsed) {
		logger.info("访问  RobotController :Robot_LinuxHardWareUsed Robot_LinuxHardWareUsed=" + linuxHardWareUsed);
		System.err.println("上报linux运行环境的信息");
		Out<String> out = new Out<String>();
		try {
			//将设备号保存进来
			System.err.println("123");
			UpInfo u=new UpInfo();
			System.err.println(u.getDeviceNo()+"-----------");
			// 直接保存信息
			Object o = robotMongoDbDataService.saveOperationInfo(linuxHardWareUsed);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	

	/**
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportSelfLnspectionInfo 
	 * @Description: （上报机器的的自检信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportSelfLnspectionInfo")
	@ApiOperation(value = "上报机器人的自检信息", notes = "上报机器人的自检信息")
	@ResponseBody
	public Out<String> reportSelfLnspectionInfo(
			@ApiParam(value = "远程机器人自检信息", required = true) @RequestBody Robot_SelfLnspectionInfo SelfLnspectionInfo) {
		logger.info("访问  RobotController :reportSelfLnspectionInfo HardwareInfo=" + SelfLnspectionInfo);
		System.err.println("上报机器人的自检信息");
		Out<String> out = new Out<String>();
		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveSelfLnspectionInfo(SelfLnspectionInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	/**
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportMeetSpeedInfo 
	 * @Description: （上报机器的识别速度信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportMeetSpeedInfo")
	@ApiOperation(value = "上报机器人的识别速度信息", notes = "上报机器人的别速度信息")
	@ResponseBody
	public Out<String> reportMeetSpeedInfo(
			@ApiParam(value = "远程机器人别速度信息", required = true) @RequestBody Robot_MeetSpeedInfo meetSpeedInfo) {
		logger.info("访问  RobotController :reportreportMeetSpeedInfo reportMeetSpeedInfo=" + meetSpeedInfo);
		System.err.println("上报机器人的别速度信息");
		Out<String> out = new Out<String>();

		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveMeetSpeedInfo(meetSpeedInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	
	/**
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportMeetSpeedInfo 
	 * @Description: （上报机器的识别性能信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportMeetPropertyInfo")
	@ApiOperation(value = "上报机器人的别性能信息", notes = "上报机器人的别性能信息")
	@ResponseBody
	public Out<String> reportMeetPropertyInfo(
			@ApiParam(value = "远程机器人别性能信息", required = true) @RequestBody Robot_MeetPropertyInfo meetPropertyInfo) {
		logger.info("访问  RobotController :reportreportMeetSpeedInfo reportMeetSpeedInfo=" + meetPropertyInfo);
		System.err.println("上报机器人的别性能信息");
		Out<String> out = new Out<String>();

		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveMeetPropertyInfo(meetPropertyInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	
	/**
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportMeetSpeedInfo 
	 * @Description: （上报机器的运行在线信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportOnLineInfo")
	@ApiOperation(value = "上报机器人的运行在线信息", notes = "上报机器人的运行在线信息")
	@ResponseBody
	public Out<String> reportOnLineInfo(
			@ApiParam(value = "远程机器人运行在线信息", required = true) @RequestBody Robot_OnLineInfo onLineInfo) {
		logger.info("访问  RobotController :reportreportMeetSpeedInfo reportMeetSpeedInfo=" + onLineInfo);
		System.err.println("上报机器人的运行在线信息");
		Out<String> out = new Out<String>();

		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveOnLineInfo(onLineInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	
	/**
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportMeetSpeedInfo 
	 * @Description: （上报机器的照片质量信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportPhotographicQualityInfo")
	@ApiOperation(value = "上报机器人的照片质量信息", notes = "上报机器人的照片质量信息")
	@ResponseBody
	public Out<String> reportPhotographicQualityInfo(
			@ApiParam(value = "远程机器人照片质量信息", required = true) @RequestBody Robot_PhotographicQualityInfo photographicQualityInfo) {
		logger.info("访问  RobotController :reportreportMeetSpeedInfo reportMeetSpeedInfo=" + photographicQualityInfo);
		System.err.println("上报机器人的照片质量信息");
		Out<String> out = new Out<String>();
		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.savePhotographicQualityInfo(photographicQualityInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	
	/**
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportMeetSpeedInfo 
	 * @Description: （上报机器的照片质量信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportManageInfo")
	@ApiOperation(value = "上报机器人的信息管理", notes = "上报机器人的信息管理")
	@ResponseBody
	public Out<String> reportManageInfo(
			@ApiParam(value = "远程机器人信息管理", required = true) @RequestBody Robot_ManageInfo manageInfo) {
		logger.info("访问  RobotController :reportreportMeetSpeedInfo reportMeetSpeedInfo=" + manageInfo);
		System.err.println("上报机器人的信息管理");
		Out<String> out = new Out<String>();

		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveManageInfo(manageInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	
	
	/**------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportMeetSpeedInfo 
	 * @Description: （上报机器的照片质量信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "saveSchool")
	@ApiOperation(value = "保存学校信息", notes = "保存学校信息")
	@ResponseBody
	public Out<String> saveSchool(
			@ApiParam(value = "远程机器人信息管理", required = true) @RequestBody Robot_school manageInfo) {
		logger.info("访问  RobotController :reportreportMeetSpeedInfo reportMeetSpeedInfo=" + manageInfo);
		System.err.println("上报机器人的信息管理");
		Out<String> out = new Out<String>();
		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveRobot_school(manageInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	/**
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportMeetSpeedInfo 
	 * @Description: （上报机器的照片质量信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "saveType")
	@ApiOperation(value = "保存上传类型信息", notes = "保存上传类型信息")
	@ResponseBody
	public Out<String> saveType(
			@ApiParam(value = "保存上传类型信息", required = true) @RequestBody Robot_UploadType robot_UploadType) {
		logger.info("访问  RobotController :reportreportMeetSpeedInfo reportMeetSpeedInfo=" + robot_UploadType);
		System.err.println("保存上传类型信息");
		Out<String> out = new Out<String>();
		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveRobot_UploadType(robot_UploadType);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
}
