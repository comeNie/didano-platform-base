package cn.didano.robot.api;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.model.Vd_auth_time_control;
import cn.didano.base.model.View_staff_channel;
import cn.didano.base.model.View_student_channel;
import cn.didano.base.service.RobotMongoDbDataService;
import cn.didano.robot.data.RobotVersionInfo;
import cn.didano.video.constant.BackType;
import cn.didano.video.json.In_Channel_Edit;
import cn.didano.video.json.Out;
import cn.didano.video.json.OutList;
import cn.didano.video.json.Out_View_staff_channel;
import cn.didano.video.json.Out_View_student_channel;
import cn.didano.video.util.TimeUtil;
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
public class RobotServer {
	static Logger logger = Logger.getLogger(RobotServer.class);
	@Autowired
	private RobotMongoDbDataService robotMongoDbDataService;
	
	
	@PostMapping(value = "")
	@ApiOperation(value="上传版本信息", notes = "上传版本信息")
	@ResponseBody
	public Out<String> uploadVersion(@ApiParam(value = "远程机器人版本信息" ,required=true) @RequestBody RobotVersionInfo robotVersionInfo) {
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
