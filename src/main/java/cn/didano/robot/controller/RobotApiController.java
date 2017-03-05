package cn.didano.robot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.service.RobotMongoDbDataService;
import cn.didano.robot.data.RConnectInfo;
import cn.didano.robot.data.RVersionInfo;
import cn.didano.video.constant.BackType;
import cn.didano.video.json.Out;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
/**
 * 诊断平台api服务
 * 
 * @author stephen Created on 2016年12月17日 下午6:38:30
 */
@Api(value = "诊断平台服务", tags = "诊断平台服务")
@RestController
@RequestMapping(value = "/robot/api/")
@Service
public class RobotApiController{
	static Logger logger = Logger.getLogger(RobotApiController.class);
	@Autowired
	private RobotMongoDbDataService robotMongoDbDataService;
	
	/**
	 * 连接服务器，报备设备编码，无此值，无法向客户端推送
	 * @param robotVersionInfo
	 * @return
	 */
	@PostMapping(value = "connectServer")
	@ApiOperation(value="连接服务器(本方法不要通过Restful方式使用，只用于websocket方式,此处只是作为格式展示)", notes = "连接服务器，传递设备编码")
	@ResponseBody
	public Out<String> connectServer(@ApiParam(value = "设备编码" ,required=true) @RequestBody String device_no) {
		logger.info("访问  RobotApiController : connectServer device_no=" + device_no);
		Out<String> out = new Out<String>();
		try {
			RConnectInfo info = new RConnectInfo();
			info.setDeviceNo(device_no);
			Object o = robotMongoDbDataService.saveRConnectInfo(info);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, e.getMessage());
		}
		return out;
	}
	
	
	@PostMapping(value = "reportVersion")
	@ApiOperation(value="上报版本信息", notes = "上报版本信息")
	@ResponseBody
	public Out<String> reportVersion(@ApiParam(value = "远程机器人版本信息" ,required=true) @RequestBody RVersionInfo robotVersionInfo) {
		logger.info("访问  RobotController :reportVersion RobotVersionInfo=" + robotVersionInfo);
		Out<String> out = new Out<String>();
		try {
			Object o = robotMongoDbDataService.saveRVersionInfo(robotVersionInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, e.getMessage());
		}
		return out;
	}
	
}
