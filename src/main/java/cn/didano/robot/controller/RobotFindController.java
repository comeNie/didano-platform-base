package cn.didano.robot.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
import cn.didano.robot.service.RobotMongoDbFindService;
import cn.didano.video.json.Out;
import cn.didano.video.json.OutList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 诊断平台api服务
 * 
 * @author stephen Created on 2016年12月17日 下午6:38:30
 */
@Api(value = "诊断查询服务", tags = "诊断查询服务")
@RestController
@RequestMapping(value = "/robot/find/")
public class RobotFindController {
	static Logger logger = Logger.getLogger(RobotFindController.class);
	@Autowired
	private RobotMongoDbFindService robotMongoDbFindService;

	/**
	 * 查询所有的机器人自检信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "querySelfLnspectionInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询自检信息,并且不分页", notes = "查询自检信息,并且不分页")
	@ResponseBody
	public List<SelfLnspectionInfo> querySelfLnspectionInfoAll() {
		List<SelfLnspectionInfo> selectSelfLnspectionInfo=null;
		try {
			
			selectSelfLnspectionInfo = robotMongoDbFindService.querySelfLnspectionInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return selectSelfLnspectionInfo;
	}
	/**
	 * 查询所有的机器人自检信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryVersionInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询自检信息,并且不分页", notes = "查询自检信息,并且不分页")
	@ResponseBody
	public List<RVersionInfo> queryVersionInfoAll() {
		System.err.println("queryVersionInfoAll");
		List<RVersionInfo> rVersionInfo=null;
		try {
			rVersionInfo = robotMongoDbFindService.queryRVersionInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return rVersionInfo;
	}
	/**
	 * 查询所有的机器人自检信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryHardwareInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询自检信息,并且不分页", notes = "查询自检信息,并且不分页")
	@ResponseBody
	public List<HardwareInfo> queryHardwareInfoAll() {
		List<HardwareInfo> hardwareInfo=null;
		try {
			hardwareInfo = robotMongoDbFindService.queryHardwareInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return hardwareInfo;
	}
	/**
	 * 查询所有的机器人自检信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryTemperatureInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询自检信息,并且不分页", notes = "查询自检信息,并且不分页")
	@ResponseBody
	public List<TemperatureInfo> queryTemperatureInfoAll() {
		List<TemperatureInfo> temperatureInfo=null;
		try {
			temperatureInfo = robotMongoDbFindService.queryTemperatureInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return temperatureInfo;
	}
	/**
	 * 查询所有的机器人自检信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryMeetSpeedInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询自检信息,并且不分页", notes = "查询自检信息,并且不分页")
	@ResponseBody
	public List<MeetSpeedInfo> queryMeetSpeedInfoAll() {
		List<MeetSpeedInfo> meetSpeedInfo=null;
		try {
			meetSpeedInfo = robotMongoDbFindService.queryMeetSpeedInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return meetSpeedInfo;
	}
	/**
	 * 查询所有的机器人自检信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryMeetPropertyInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询自检信息,并且不分页", notes = "查询自检信息,并且不分页")
	@ResponseBody
	public List<MeetPropertyInfo> queryMeetPropertyInfoAll() {
		List<MeetPropertyInfo> meetPropertyInfo=null;
		try {
			meetPropertyInfo = robotMongoDbFindService.queryMeetPropertyInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return meetPropertyInfo;
	}
	/**
	 * 查询所有的机器人自检信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryOnLineInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询自检信息,并且不分页", notes = "查询自检信息,并且不分页")
	@ResponseBody
	public List<OnLineInfo> queryOnLineInfoAll() {
		List<OnLineInfo> onLineInfo=null;
		try {
			onLineInfo = robotMongoDbFindService.queryOnLineInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return onLineInfo;
	}
	/**
	 * 查询所有的机器人自检信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryPhotographicQualityInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询自检信息,并且不分页", notes = "查询自检信息,并且不分页")
	@ResponseBody
	public List<PhotographicQualityInfo> queryPhotographicQualityInfoAll() {
		List<PhotographicQualityInfo> photographicQualityInfo=null;
		try {
			photographicQualityInfo = robotMongoDbFindService.queryPhotographicQualityInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return photographicQualityInfo;
	}
	/**
	 * 查询所有的机器人自检信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryManageInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询自检信息,并且不分页", notes = "查询自检信息,并且不分页")
	@ResponseBody
	public List<ManageInfo> queryManageInfoAll() {
		List<ManageInfo> ManageInfo=null;
		try {
			ManageInfo = robotMongoDbFindService.queryManageInfo();
			System.err.println(ManageInfo.size());
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return ManageInfo;
	}
	/**
	 * 查询所有的机器人自检信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryOperationInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询自检信息,并且不分页", notes = "查询自检信息,并且不分页")
	@ResponseBody
	public List<OperationInfo> queryOperationInfoAll() {
		List<OperationInfo> operationInfo=null;
		try {
			operationInfo = robotMongoDbFindService.queryOperationInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return operationInfo;
	}
}