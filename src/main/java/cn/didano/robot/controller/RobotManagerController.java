package cn.didano.robot.controller;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
@RequestMapping(value = "/robot/manager/")
public class RobotManagerController {
	static Logger logger = Logger.getLogger(RobotManagerController.class);

	@PostMapping(value = "go_reportVersion")
	@ApiOperation(value = "要求，上传版本信息", notes = "要求，上传版本信息")
	@ResponseBody
	public void go_reportVersion(@RequestBody String service_no) {
		if (RobotWebsocketServer.getRobotInfoMap() != null) {
			DownInfo downInfo = new DownInfo();
			downInfo.setMethodName("go_reportVersion");
			RobotWebsocketServer.sendMessage(service_no, downInfo);
		}
	}

	/**
	 * 当有异常时，回复客户端，便于调试
	 * 没有异常时，客户端传送数据上来，不做回复
	 * @param service_no
	 */
	@PostMapping(value = "go_backError")
	@ApiOperation(value = "回复，异常信息", notes = "要求，上传版本信息")
	@ResponseBody
	public void go_backError(@RequestBody String service_no,@RequestBody Out<String> backError) {
		RobotWebsocketServer.sendMessage(service_no, backError);
	}

}
