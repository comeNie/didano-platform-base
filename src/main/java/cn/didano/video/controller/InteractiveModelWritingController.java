package cn.didano.video.controller;

import java.io.FileOutputStream;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.exception.ServiceException;
import cn.didano.video.constant.BackType;
import cn.didano.video.json.In_InteractiveModel_add;
import cn.didano.video.json.Out;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "互动模板编写", tags = "互动模板服务，提供编写新的模块")
@RestController
@RequestMapping(value = "/base/interactive/post/")
public class InteractiveModelWritingController {

	static Logger logger = Logger.getLogger(InteractiveModelWritingController.class);
	/**
	 * 新增模板
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value = "新增模板", notes = "新增模板")
	@PostMapping(value = "Teacher_add")
	@ResponseBody
	public Out<String> InteractiveModel_add(
			@ApiParam(value = "新增模板", required = true) @RequestBody In_InteractiveModel_add model) {
		logger.info("访问  InteractiveModelWritingController:InteractiveModel_add,model=" + model);
		
		Out<String> back = new Out<String>();
		XMLWriter writer = null;
		try{
			Document document = DocumentHelper.createDocument();
			Element root = document.addElement("package");
			Element template = root.addElement("pictemplate").addAttribute("name", model.getName());
			template.addElement("occasion").addAttribute("name", "key").addAttribute("key", model.getCorrect());
			template.addElement("occasion").addAttribute("name", "prepare").addElement("item").addAttribute("word", model.getPrepare());
			template.addElement("occasion").addAttribute("name", "question").addElement("item").addAttribute("word", model.getQuestion());
			template.addElement("occasion").addAttribute("name", "answerOk").addElement("item").addAttribute("word", model.getAnswerOk().split(";")[0]).addAttribute("look", model.getAnswerOk().split(";")[1]);
			template.addElement("occasion").addAttribute("name", "answerError").addElement("item").addAttribute("word", model.getAnswerError().split(";")[0]).addAttribute("look", model.getAnswerError().split(";")[1]);
			template.addElement("occasion").addAttribute("name", "goodBye").addElement("item").addAttribute("word", model.getGoodbye().split(";")[0]).addAttribute("look", model.getGoodbye().split(";")[1]);			
			FileOutputStream fos = new FileOutputStream("Create-Xml/InteractiveModel2.xml");		
			writer = new XMLWriter(fos,OutputFormat.createPrettyPrint());
			writer.write(document);
            back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "写出成功！" );

					
			
			
		} catch (ServiceException e) {
			// 服务层错误，包括 内部service 和 对外service
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		} catch (Exception ex) {
			back.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, ex.getMessage());
		}
		return back;
	}
}
