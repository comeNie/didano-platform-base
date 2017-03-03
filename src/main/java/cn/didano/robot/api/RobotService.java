package cn.didano.robot.api;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.ControllerBeanNameHandlerMapping;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;
import cn.didano.base.service.RobotMongoDbDataService;
import cn.didano.robot.data.RobotVersionInfo;
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
@Api(value = "诊断平台api服务", tags = "诊断平台api服务")
@RestController
@RequestMapping(value = "/robot/api/")
public class RobotService {
	static Logger logger = Logger.getLogger(RobotService.class);
	@Autowired
	private RobotMongoDbDataService robotMongoDbDataService;
	
	
	@PostMapping(value = "reportVersion")
	@ApiOperation(value="上传版本信息", notes = "上传版本信息")
	@ResponseBody
	public Out<String> reportVersion(@ApiParam(value = "远程机器人版本信息" ,required=true) @RequestBody RobotVersionInfo robotVersionInfo) {
		logger.info("访问  RobotServer:uploadVersion RobotVersionInfo=" + robotVersionInfo);
		Out<String> out = new Out<String>();
		try {
			Object o = robotMongoDbDataService.save(robotVersionInfo);
			out.setBackTypeWithLog(o.toString(), BackType.SUCCESS);
		} catch (Exception e) {
			logger.error(e.getMessage());
			out.setBackTypeWithLog(BackType.FAIL_SEARCH_NORMAL, e.getMessage());
		}
		return out;
	}
	
}
