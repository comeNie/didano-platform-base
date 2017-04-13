package cn.didano.robot.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.exception.BackType;
import cn.didano.base.exception.ServiceException;
import cn.didano.robot.core.DownInfo;
import cn.didano.robot.core.RobotWebsocketServer;
import cn.didano.video.json.Out;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 诊断平台api服务
 * 
 * @author stephen Created on 2016年12月17日 下午6:38:30
 */
@Api(value = "诊断控制服务", tags = "诊断控制服务")
@RestController
@RequestMapping(value = "/robot/down/")
public class RobotDownController {
	static Logger logger = Logger.getLogger(RobotDownController.class);

	/**
	 * 
	 * 
	 * 有一个最大的问题  在服务器下控的过程中  当下控命令结束后，与服务器连接的设备就会与服务器断开连接
	 * 在功能中需要设备与服务器一直处于连接状态，不然达不到诊断平台的要求
	 * 
	 * 
	 * 执行,上传版本信息
	 * @param service_no
	 */
	@PostMapping(value = "excute_reportVersion")
	@ApiOperation(value = "执行,上传版本信息", notes = "执行,上传版本信息")
	@ResponseBody
	public Out<String> excute_reportVersion(@RequestBody String service_no) {
		Out<String> back = new Out<String>();
		if (RobotWebsocketServer.getRobotInfoMap() != null) {
			DownInfo downInfo = new DownInfo();
			downInfo.setMethodName("excute_reportVersion");
			back.setBackTypeWithLog(BackType.SUCCESS_DIAGNOSE_EXCUTE);
			try{
				RobotWebsocketServer.sendMessage(service_no, downInfo);
			}catch(ServiceException ex){
				back.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_EXCUTE,ex.getExceptionEnums().getMessage());
			}
		}
		return back;
	}

	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:14:06
	 * @Title: excute_hardwareInfo
	 * @Description: （ 执行,上传硬件信息）
	 * @return Out<String> 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	@PostMapping(value = "excute_hardwareInfo")
	@ApiOperation(value = " 执行,上传硬件信息", notes = " 执行,上传硬件信息")
	@ResponseBody
	public Out<String> excute_hardwareInfo(@RequestBody String service_no) {
		Out<String> back = new Out<String>();
		if (RobotWebsocketServer.getRobotInfoMap() != null) {
			System.err.println(RobotWebsocketServer.getRobotInfoMap().toString());
			
			DownInfo downInfo = new DownInfo();
			downInfo.setMethodName("excute_hardwareInfo");
			back.setBackTypeWithLog(BackType.SUCCESS_DIAGNOSE_EXCUTE);
			try{
				RobotWebsocketServer.sendMessage(service_no, downInfo);
			}catch(ServiceException ex){
				back.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_EXCUTE,ex.getExceptionEnums().getMessage());
			}
		}
		return back;
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:15:36
	 * @Title: excute_temperatureInfo
	 * @Description: （执行,上传温度信息）
	 * @return Out<String> 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	@PostMapping(value = "excute_temperatureInfo")
	@ApiOperation(value = " 执行,上传温度信息", notes = " 执行,上传温度信息")
	@ResponseBody
	public Out<String> excute_temperatureInfo(@RequestBody String service_no) {
		Out<String> back = new Out<String>();
		if (RobotWebsocketServer.getRobotInfoMap() != null) {
			System.err.println(RobotWebsocketServer.getRobotInfoMap().toString());
			
			DownInfo downInfo = new DownInfo();
			downInfo.setMethodName("excute_temperatureInfo");
			back.setBackTypeWithLog(BackType.SUCCESS_DIAGNOSE_EXCUTE);
			try{
				RobotWebsocketServer.sendMessage(service_no, downInfo);
			}catch(ServiceException ex){
				back.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_EXCUTE,ex.getExceptionEnums().getMessage());
			}
		}
		return back;
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:15:36
	 * @Title: excute_operationInfo
	 * @Description: （执行,上传机器人运行环境信息）
	 * @return Out<String> 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	@PostMapping(value = "excute_operationInfo")
	@ApiOperation(value = " 执行,上传机器人运行环境信息", notes = " 执行,上传机器人运行环境信息")
	@ResponseBody
	public Out<String> excute_operationInfo(@RequestBody String service_no) {
		Out<String> back = new Out<String>();
		if (RobotWebsocketServer.getRobotInfoMap() != null) {
			System.err.println(RobotWebsocketServer.getRobotInfoMap().toString());
			
			DownInfo downInfo = new DownInfo();
			downInfo.setMethodName("excute_operationInfo");
			back.setBackTypeWithLog(BackType.SUCCESS_DIAGNOSE_EXCUTE);
			try{
				RobotWebsocketServer.sendMessage(service_no, downInfo);
			}catch(ServiceException ex){
				back.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_EXCUTE,ex.getExceptionEnums().getMessage());
			}
		}
		return back;
	}      
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:15:36
	 * @Title: excute_operationInfo
	 * @Description: （执行,上传机器人自检信息）
	 * @return Out<String> 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	@PostMapping(value = "excute_selfLnspectionInfo")
	@ApiOperation(value = " 执行,上传机器人自检信息", notes = " 执行,上传机器人自检信息")
	@ResponseBody
	public Out<String> excute_selfLnspectionInfo(@RequestBody String service_no) {
		Out<String> back = new Out<String>();
		if (RobotWebsocketServer.getRobotInfoMap() != null) {
			System.err.println(RobotWebsocketServer.getRobotInfoMap().toString());
			
			DownInfo downInfo = new DownInfo();
			downInfo.setMethodName("excute_selfLnspectionInfo");
			back.setBackTypeWithLog(BackType.SUCCESS_DIAGNOSE_EXCUTE);
			try{
				RobotWebsocketServer.sendMessage(service_no, downInfo);
			}catch(ServiceException ex){
				back.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_EXCUTE,ex.getExceptionEnums().getMessage());
			}
		}
		return back;
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:15:36
	 * @Title: excute_operationInfo
	 * @Description: （执行,上传机器人识别速度信息）
	 * @return Out<String> 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	@PostMapping(value = "excute_MeetSpeedInfo")
	@ApiOperation(value = " 执行,上传机器人识别速度信息", notes = " 执行,上传机器人识别速度信息")
	@ResponseBody
	public Out<String> excute_MeetSpeedInfo(@RequestBody String service_no) {
		Out<String> back = new Out<String>();
		if (RobotWebsocketServer.getRobotInfoMap() != null) {
			System.err.println(RobotWebsocketServer.getRobotInfoMap().toString());
			
			DownInfo downInfo = new DownInfo();
			downInfo.setMethodName("excute_MeetSpeedInfo");
			back.setBackTypeWithLog(BackType.SUCCESS_DIAGNOSE_EXCUTE);
			try{
				RobotWebsocketServer.sendMessage(service_no, downInfo);
			}catch(ServiceException ex){
				back.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_EXCUTE,ex.getExceptionEnums().getMessage());
			}
		}
		return back;
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:15:36
	 * @Title: excute_operationInfo
	 * @Description: （执行,上传机器人识别性能信息）
	 * @return Out<String> 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	@PostMapping(value = "excute_MeetPropertyInfo")
	@ApiOperation(value = " 执行,上传机器人识别性能信息", notes = " 执行,上传机器人识别性能信息")
	@ResponseBody
	public Out<String> excute_MeetPropertyInfo(@RequestBody String service_no) {
		Out<String> back = new Out<String>();
		if (RobotWebsocketServer.getRobotInfoMap() != null) {
			System.err.println(RobotWebsocketServer.getRobotInfoMap().toString());
			
			DownInfo downInfo = new DownInfo();
			downInfo.setMethodName("excute_MeetPropertyInfo");
			back.setBackTypeWithLog(BackType.SUCCESS_DIAGNOSE_EXCUTE);
			try{
				RobotWebsocketServer.sendMessage(service_no, downInfo);
			}catch(ServiceException ex){
				back.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_EXCUTE,ex.getExceptionEnums().getMessage());
			}
		}
		return back;
	}
	
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:15:36
	 * @Title: excute_operationInfo
	 * @Description: （执行,上传机器人运行在线信息）
	 * @return Out<String> 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	@PostMapping(value = "excute_OnLineInfo")
	@ApiOperation(value = " 执行,上传机器人运行在线信息", notes = " 执行,上传机器人运行在线信息")
	@ResponseBody
	public Out<String> excute_OnLineInfo(@RequestBody String service_no) {
		Out<String> back = new Out<String>();
		if (RobotWebsocketServer.getRobotInfoMap() != null) {
			System.err.println(RobotWebsocketServer.getRobotInfoMap().toString());
			
			DownInfo downInfo = new DownInfo();
			downInfo.setMethodName("excute_OnLineInfo");
			back.setBackTypeWithLog(BackType.SUCCESS_DIAGNOSE_EXCUTE);
			try{
				RobotWebsocketServer.sendMessage(service_no, downInfo);
			}catch(ServiceException ex){
				back.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_EXCUTE,ex.getExceptionEnums().getMessage());
			}
		}
		return back;
	}
	
	/**
	 * 创建人：SevenYang
	 * @创建时间：2017年3月17日 下午4:15:36
	 * @Title: excute_operationInfo
	 * @Description: （执行,上传机器人照片质量信息）
	 * @return Out<String> 
	 * 修改人：
	 * 版本：1.0.0
	 * @throws
	 */
	@PostMapping(value = "excute_PhotographicQualityInfo")
	@ApiOperation(value = " 执行,上传机器人照片质量信息", notes = " 执行,上传机器人照片质量信息")
	@ResponseBody
	public Out<String> excute_PhotographicQualityInfo(@RequestBody String service_no) {
		Out<String> back = new Out<String>();
		if (RobotWebsocketServer.getRobotInfoMap() != null) {
			System.err.println(RobotWebsocketServer.getRobotInfoMap().toString());
			
			DownInfo downInfo = new DownInfo();
			downInfo.setMethodName("excute_PhotographicQualityInfo");
			back.setBackTypeWithLog(BackType.SUCCESS_DIAGNOSE_EXCUTE);
			try{
				RobotWebsocketServer.sendMessage(service_no, downInfo);
			}catch(ServiceException ex){
				back.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_EXCUTE,ex.getExceptionEnums().getMessage());
			}
		}
		return back;
	}
	
	/**
	 * 当有异常时，回复客户端，便于调试
	 * 没有异常时，客户端传送数据上来，不做回复
	 * @param service_no
	 */
	@PostMapping(value = "error")
	@ApiOperation(value = "回复，异常信息", notes = "回复，异常信息")
	@ResponseBody
	public void error(@RequestBody String service_no,@RequestBody Out<String> backError) {
		RobotWebsocketServer.sendMessage(service_no, backError);
	}

}
