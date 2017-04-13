package cn.didano.robot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.exception.BackType;
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
import cn.didano.robot.service.RobotMongoDbDataService;
import cn.didano.video.json.Out;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 诊断平台api服务
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

	@PostMapping(value = "reportVersion")
	@ApiOperation(value = "上报版本信息", notes = "上报版本信息")
	@ResponseBody
	public Out<String> reportVersion(
			@ApiParam(value = "远程机器人版本信息", required = true) @RequestBody RVersionInfo robotVersionInfo) {
		logger.info("访问  RobotController :reportVersion RobotVersionInfo=" + robotVersionInfo);
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
	 * reportHardwareInfo 
	 * @Description: （上报机器人的硬件信息） 
	 * @return Out<String> 修改人：
	 * 版本：1.0.0 @throws
	 */

	@PostMapping(value = "reportHardwareInfo")
	@ApiOperation(value = "上报硬件信息", notes = "上报硬件信息")
	@ResponseBody
	public Out<String> reportHardwareInfo(
			@ApiParam(value = "远程机器人硬件信息", required = true) @RequestBody HardwareInfo hardwareInfo) {
		logger.info("访问  RobotController :reportHardwareInfo HardwareInfo=" + hardwareInfo);
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
			@ApiParam(value = "远程机器人温度信息", required = true) @RequestBody TemperatureInfo temperatureInfo) {
		logger.info("访问  RobotController :reportHardwareInfo HardwareInfo=" + temperatureInfo);
		System.err.println("上报温度信息");
		Out<String> out = new Out<String>();

		try {
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
	@PostMapping(value = "reportOperationInfo")
	@ApiOperation(value = "上报运行环境的信息", notes = "上报运行环境的信息")
	@ResponseBody
	public Out<String> reportOperationInfo(
			@ApiParam(value = "远程机器人运行环境的信息", required = true) @RequestBody OperationInfo operationInfo) {
		logger.info("访问  RobotController :reportHardwareInfo HardwareInfo=" + operationInfo);
		System.err.println("上报运行环境的信息");
		Out<String> out = new Out<String>();

		try {
			// 直接保存信息
			Object o = robotMongoDbDataService.saveOperationInfo(operationInfo);
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
			@ApiParam(value = "远程机器人自检信息", required = true) @RequestBody SelfLnspectionInfo SelfLnspectionInfo) {
		logger.info("访问  RobotController :reportHardwareInfo HardwareInfo=" + SelfLnspectionInfo);
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
	@ApiOperation(value = "上报机器人的别速度信息", notes = "上报机器人的别速度信息")
	@ResponseBody
	public Out<String> reportMeetSpeedInfo(
			@ApiParam(value = "远程机器人别速度信息", required = true) @RequestBody MeetSpeedInfo meetSpeedInfo) {
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
			@ApiParam(value = "远程机器人别性能信息", required = true) @RequestBody MeetPropertyInfo meetPropertyInfo) {
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
			@ApiParam(value = "远程机器人运行在线信息", required = true) @RequestBody OnLineInfo onLineInfo) {
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
			@ApiParam(value = "远程机器人照片质量信息", required = true) @RequestBody PhotographicQualityInfo photographicQualityInfo) {
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
			@ApiParam(value = "远程机器人信息管理", required = true) @RequestBody ManageInfo manageInfo) {
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
	
}
