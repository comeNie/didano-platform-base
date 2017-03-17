package cn.didano.robot.controller;

import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.exception.BackType;
import cn.didano.base.exception.ServiceException;
import cn.didano.robot.core.DownInfo;
import cn.didano.robot.core.RobotSession;
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
	 * 执行,上传硬件信息
	 * @param service_no
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
