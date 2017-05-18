package cn.didano.robot.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
import cn.didano.robot.service.RobotMongoDbFindService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 诊断平台api服务
 * 诊断查询服务
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
	public List<Robot_SelfLnspectionInfo> querySelfLnspectionInfoAll() {
		List<Robot_SelfLnspectionInfo> selectSelfLnspectionInfo=null;
		try {
			
			selectSelfLnspectionInfo = robotMongoDbFindService.querySelfLnspectionInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return selectSelfLnspectionInfo;
	}
	/**
	 * 版本信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryVersionInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询版本信息,并且不分页", notes = "查询版本信息,并且不分页")
	@ResponseBody
	public List<Robot_VersionInfo> queryVersionInfoAll() {
		List<Robot_VersionInfo> rVersionInfo=null;
		try {
			rVersionInfo = robotMongoDbFindService.queryRVersionInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return rVersionInfo;
	}
	/**
	 * 查询所有的硬件信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryHardwareInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询硬件信息,并且不分页", notes = "查询硬件信息,并且不分页")
	@ResponseBody
	public List<Robot_HardwareInfo> queryHardwareInfoAll() {
		List<Robot_HardwareInfo> hardwareInfo=null;
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
	@ApiOperation(value = "查询环境温度信息,并且不分页", notes = "查询环境温度信息,并且不分页")
	@ResponseBody
	public List<Robot_TemperatureInfo> queryTemperatureInfoAll() {
		List<Robot_TemperatureInfo> temperatureInfo=null;
		try {
			temperatureInfo = robotMongoDbFindService.queryTemperatureInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return temperatureInfo;
	}
	/**
	 * 查询所有的机器人识别速度信息----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "queryMeetSpeedInfoAll", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询识别速度信息,并且不分页", notes = "查询识别速度信息,并且不分页")
	@ResponseBody
	public List<Robot_MeetSpeedInfo> queryMeetSpeedInfoAll() {
		List<Robot_MeetSpeedInfo> meetSpeedInfo=null;
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
	@ApiOperation(value = "查询识别性能信息,并且不分页", notes = "查询识别性能信息,并且不分页")
	@ResponseBody
	public List<Robot_MeetPropertyInfo> queryMeetPropertyInfoAll() {
		List<Robot_MeetPropertyInfo> meetPropertyInfo=null;
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
	@ApiOperation(value = "查询运行在线信息,并且不分页", notes = "查询运行在线信息,并且不分页")
	@ResponseBody
	public List<Robot_OnLineInfo> queryOnLineInfoAll() {
		List<Robot_OnLineInfo> onLineInfo=null;
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
	@ApiOperation(value = "查询照片质量信息,并且不分页", notes = "查询照片质量信息,并且不分页")
	@ResponseBody
	public List<Robot_PhotographicQualityInfo> queryPhotographicQualityInfoAll() {
		List<Robot_PhotographicQualityInfo> photographicQualityInfo=null;
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
	@ApiOperation(value = "查询管理信息,并且不分页", notes = "查询管理信息,并且不分页")
	@ResponseBody
	public List<Robot_ManageInfo> queryManageInfoAll() {
		List<Robot_ManageInfo> ManageInfo=null;
		try {
			ManageInfo = robotMongoDbFindService.queryManageInfo();
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
	@ApiOperation(value = "查询运行环境信息,并且不分页", notes = "查询环境信息,并且不分页")
	@ResponseBody
	public List<Robot_LinuxHardWareUsed> queryOperationInfoAll() {
		List<Robot_LinuxHardWareUsed> operationInfo=null;
		try {
			operationInfo = robotMongoDbFindService.queryOperationInfo();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return operationInfo;
	}
	
	/**
	 * 查询所有的学校----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "selectSchool", method = {RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value = "查询所有的学校", notes = "查询所有的学校")
	@ResponseBody
	public List<Robot_school> selectSchool() {
		List<Robot_school> operationInfo=null;
		try {
			operationInfo = robotMongoDbFindService.selectSchool();
			//去掉重复的学校名称并返回
			for  ( int  i  =   0 ; i  <  operationInfo.size()  -   1 ; i ++ )  {       
		        for  ( int  j  =  operationInfo.size()  -   1 ; j  >  i; j -- )  {       
		           if  (operationInfo.get(j).getSchoolName().equals(operationInfo.get(i).getSchoolName()))  {
		        	   operationInfo.remove(j);
		            }        
		        }        
		     }        
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return operationInfo;
	}
	/**
	 * 查询所属学校的小诺----------------------------------------------------------------------------------------------------------------------------
	 * 不带翻页
	 * @return
	 */
	@RequestMapping(value = "selectSchoolName／{schoolName}", method = {RequestMethod.POST})
	@ApiOperation(value = "查询所属学校的小诺", notes = "查询所属学校的小诺")
	@ResponseBody
	public List<Robot_school> selectSchoolName(@PathVariable("schoolName") String schoolName) {
		List<Robot_school> operationInfo=null;
		try {
			operationInfo = robotMongoDbFindService.selectSchoolName(schoolName);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return operationInfo;
	}
	@RequestMapping(value = "selectType", method = {RequestMethod.POST})
	@ApiOperation(value = "查询所有需要上传的类型", notes = "查询所有需要上传的类型")
	@ResponseBody
	public List<Robot_UploadType> selectType() {
		List<Robot_UploadType> operationInfo=null;
		try {
			operationInfo = robotMongoDbFindService.selectType();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return operationInfo;
	}
	
}