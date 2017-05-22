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
import cn.didano.robot.data.Robot_AndroidHardWareUsed;
import cn.didano.robot.data.Robot_AndroidSoftWareVersion;
import cn.didano.robot.data.Robot_AppRunningStatus;
import cn.didano.robot.data.Robot_CalibrateInfo;
import cn.didano.robot.data.Robot_CandidatesInfo;
import cn.didano.robot.data.Robot_FinalRecogResult;
import cn.didano.robot.data.Robot_HardwareInfo;
import cn.didano.robot.data.Robot_LinuxEnvTemperatureInfo;
import cn.didano.robot.data.Robot_LinuxHardWareInfo;
import cn.didano.robot.data.Robot_LinuxHardWareUsed;
import cn.didano.robot.data.Robot_LinuxSoftWareVersion;
import cn.didano.robot.data.Robot_LinuxStartUpRecord;
import cn.didano.robot.data.Robot_MotionSoftWareVersion;
import cn.didano.robot.data.Robot_PhotographicQualityInfo;
import cn.didano.robot.data.Robot_SelfLnspectionInfo;
import cn.didano.robot.data.Robot_UploadType;
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

	@PostMapping(value = "reportLinuxSoftWareVersion")
	@ApiOperation(value = "上报linux版本信息", notes = "上报linux版本信息")
	@ResponseBody
	public Out<String> reportLinuxSoftWareVersion(
			@ApiParam(value = "上报linux版本信息", required = true) @RequestBody Robot_LinuxSoftWareVersion linuxSoftWareVersion) {
		logger.info("访问  RobotController :reportVersionInfo RobotVersionInfo=" + linuxSoftWareVersion);
		System.err.println("上报linux版本信息");
		Out<String> out = new Out<String>();
		try {
			Object o = robotMongoDbDataService.saveRVersionInfo(linuxSoftWareVersion);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}

	/****--------------------->已修改
	 * 安卓的版本信息上传
	 * @param reportAndroidSoftWareVersion
	 * @return
	 */
	@PostMapping(value = "reportAndroidSoftWareVersion")
	@ApiOperation(value = "上报Android版本信息", notes = "上报Android版本信息")
	@ResponseBody
	public Out<String> reportAndroidSoftWareVersion(
			@ApiParam(value = "上报Android版本信息", required = true) @RequestBody Robot_AndroidSoftWareVersion androidSoftWareVersion) {
		logger.info("访问  RobotController :reportVersionInfo RobotVersionInfo=" + androidSoftWareVersion);
		System.err.println("上报Android版本信息");
		Out<String> out = new Out<String>();
		try {
			Object o = robotMongoDbDataService.saveRandroidSoftWareVersion(androidSoftWareVersion);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	/****--------------------->已修改
	 * 运动控制软件版本信息
	 * @param reportMotionSoftWareVersion
	 * @return
	 */
	@PostMapping(value = "reportMotionSoftWareVersion")
	@ApiOperation(value = "运动控制软件版本信息", notes = "运动控制软件版本信息")
	@ResponseBody
	public Out<String> reportMotionSoftWareVersion(
			@ApiParam(value = "运动控制软件版本信息", required = true) @RequestBody Robot_MotionSoftWareVersion motionSoftWareVersion) {
		logger.info("访问  RobotController :reportMotionSoftWareVersion Robot_MotionSoftWareVersion=" + motionSoftWareVersion);
		System.err.println("运动控制软件版本信息");
		Out<String> out = new Out<String>();
		try {
			Object o = robotMongoDbDataService.saveRandroidSoftWareVersion(motionSoftWareVersion);
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

	/**------------------已经修改---------------------------------
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportTemperatureInfo 
	 * @Description: （上报机器的的温度信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportLinuxEnvTemperatureInfo")
	@ApiOperation(value = "上报温度信息", notes = "上报温度信息")
	@ResponseBody
	public Out<String> reportLinuxEnvTemperatureInfo(
			@ApiParam(value = "远程机器人温度信息", required = true) @RequestBody Robot_LinuxEnvTemperatureInfo inuxEnvTemperatureInfo) {
		logger.info("访问  RobotController :reportLinuxEnvTemperatureInfo HardwareInfo=" + inuxEnvTemperatureInfo);
		System.err.println("上报温度信息");
		Out<String> out = new Out<String>();                                                                                                                                                                                                                                  
		try {
			UpInfo u=new UpInfo();
			System.err.println(u.getDeviceNo()+"-------上报温度----");
			// 直接保存信息
			Object o = robotMongoDbDataService.saveTemperatureInfo(inuxEnvTemperatureInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	/**------------------已经修改---------------------------------
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
			Object o = robotMongoDbDataService.saveOperationInfo(linuxHardWareUsed);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	/**------------------已经修改---------------------------------
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportCandidatesInfo 
	 * @Description: （上报机器的候选人信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportCandidatesInfo")
	@ApiOperation(value = "上报机器的候选人信息", notes = "上报机器的候选人信息")
	@ResponseBody
	public Out<String> reportCandidatesInfo(
			@ApiParam(value = "上报机器的候选人信息", required = true) @RequestBody Robot_CandidatesInfo candidatesInfo) {
		logger.info("访问  RobotController :reportCandidatesInfo Robot_CandidatesInfo=" + candidatesInfo);
		System.err.println("上报机器的候选人信息");
		Out<String> out = new Out<String>();
		try {
			Object o = robotMongoDbDataService.saveCandidatesInfo(candidatesInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	/**------------------已经修改---------------------------------
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportFinalRecogResult 
	 * @Description: （最终的识别结果） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportFinalRecogResult")
	@ApiOperation(value = "最终的识别结果", notes = "最终的识别结果")
	@ResponseBody
	public Out<String> reportFinalRecogResult(
			@ApiParam(value = "最终的识别结果", required = true) @RequestBody Robot_FinalRecogResult finalRecogResult) {
		logger.info("访问  RobotController :reportFinalRecogResult Robot_FinalRecogResult=" + finalRecogResult);
		System.err.println("最终的识别结果");
		Out<String> out = new Out<String>();
		try {
			Object o = robotMongoDbDataService.saveFinalRecogResult(finalRecogResult);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	
	
	/**------------------已经修改---------------------------------
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportAndroidHardWareUsed 
	 * @Description: （上报机器的的运行环境信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportAndroidHardWareUsed")
	@ApiOperation(value = "上报Android运行环境的信息", notes = "上报Android运行环境的信息")
	@ResponseBody
	public Out<String> reportAndroidHardWareUsed(
			@ApiParam(value = "上报Android运行环境的信息", required = true) @RequestBody Robot_AndroidHardWareUsed androidHardWareUsed) {
		logger.info("访问  RobotController :reportAndroidHardWareUsed reportAndroidHardWareUsed=" + androidHardWareUsed);
		System.err.println("上报Android运行环境的信息");
		Out<String> out = new Out<String>();
		try {
			Object o = robotMongoDbDataService.saveAndroidHardWareUsed(androidHardWareUsed);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	/**------------------已经修改---------------------------------
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportLinuxStartUpRecord 
	 * @Description: （上报机器的的自检信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportLinuxStartUpRecord")
	@ApiOperation(value = "上报机器人linux的重启信息", notes = "上报机器人linux的重启信息")
	@ResponseBody
	public Out<String> reportLinuxStartUpRecord(
			@ApiParam(value = "上报机器人linux的重启信息", required = true) @RequestBody Robot_LinuxStartUpRecord linuxStartUpRecord) {
		logger.info("访问  RobotController :reportLinuxStartUpRecord HardwareInfo=" + linuxStartUpRecord);
		System.err.println("上报机器人linux的重启信息");
		Out<String> out = new Out<String>();
		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveLinuxStartUpRecord(linuxStartUpRecord);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	
	
	/**------------------已经修改---------------------------------
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportSelfLnspectionInfo 
	 * @Description: （上报机器的的自检信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportSelfLnspectionInfo")
	@ApiOperation(value = "上报机器的的自检信息", notes = "上报机器的的自检信息")
	@ResponseBody
	public Out<String> reportSelfLnspectionInfo(
			@ApiParam(value = "上报机器的的自检信息", required = true) @RequestBody Robot_SelfLnspectionInfo selfLnspectionInfo) {
		logger.info("访问  RobotController :reportSelfLnspectionInfo HardwareInfo=" + selfLnspectionInfo);
		System.err.println("上报机器的的自检信息");
		Out<String> out = new Out<String>();
		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveSelfLnspectionInfo(selfLnspectionInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}/**------------------已经修改---------------------------------
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportLinuxHardWareInfo 
	 * @Description: （CPU的ECID号） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportLinuxHardWareInfo")
	@ApiOperation(value = "CPU的ECID号", notes = "CPU的ECID号")
	@ResponseBody
	public Out<String> reportLinuxHardWareInfo(
			@ApiParam(value = "CPU的ECID号", required = true) @RequestBody Robot_LinuxHardWareInfo linuxHardWareInfo) {
		logger.info("访问  RobotController :reportLinuxHardWareInfo HardwareInfo=" + linuxHardWareInfo);
		System.err.println("CPU的ECID号");
		Out<String> out = new Out<String>();
		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveLinuxHardWareInfo(linuxHardWareInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	
	/**--------------------------------------------已修改
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportAppRunningStatus 
	 * @Description: （上报机器的运行在线信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportAppRunningStatus")
	@ApiOperation(value = "上报机器人的运行在线信息", notes = "上报机器人的运行在线信息")
	@ResponseBody
	public Out<String> reportAppRunningStatus(
			@ApiParam(value = "远程机器人运行在线信息", required = true) @RequestBody Robot_AppRunningStatus appRunningStatus) {
		logger.info("访问  RobotController :reportAppRunningStatus reportMeetSpeedInfo=" + appRunningStatus);
		System.err.println("上报机器人的运行在线信息");
		Out<String> out = new Out<String>();
		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveOnLineInfo(appRunningStatus);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_MONGO_SAVE, e.getMessage());
		}
		return out;
	}
	/**--------------------------------------------已修改
	 * 创建人：SevenYang 
	 * @创建时间：2017年3月17日 下午3:59:48 
	 * @Title:
	 * reportCalibrateInfo 
	 * @Description: （上报机器的运行在线信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */
	@PostMapping(value = "reportCalibrateInfo")
	@ApiOperation(value = "上报体重校准信息", notes = "上报体重校准信息")
	@ResponseBody
	public Out<String> reportCalibrateInfo(
			@ApiParam(value = "上报体重校准信息", required = true) @RequestBody Robot_CalibrateInfo calibrateInfo) {
		logger.info("访问  RobotController :reportCalibrateInfo reportMeetSpeedInfo=" + calibrateInfo);
		System.err.println("上报体重校准信息");
		Out<String> out = new Out<String>();
		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveCalibrateInfo(calibrateInfo);
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
