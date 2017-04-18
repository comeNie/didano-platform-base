package cn.didano.video.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.exception.ServiceException;
import cn.didano.base.interaction.StorageService;
import cn.didano.base.model.Tb_interactive_catalog;
import cn.didano.base.model.Tb_interactive_model;
import cn.didano.base.service.InteractiveModelService;
import cn.didano.video.constant.BackType;
import cn.didano.video.entity.OssInfo;
import cn.didano.video.json.In_InteractiveModel_add;
import cn.didano.video.json.Out;
import cn.didano.video.json.OutList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "互动模板编写", tags = "互动模板服务，提供编写新的模块")
@RestController
@RequestMapping(value = "/base/interactive/post/")
public class InteractiveModelWritingController {

	static Logger logger = Logger.getLogger(InteractiveModelWritingController.class);
     @Autowired
     private InteractiveModelService interactiveService;
     @Autowired
     private StorageService storageService;
     @Autowired
 	 OssInfo ossInfo;
	/**
	 * 新增模板
	 * 
	 * @param c_channel
	 * @return
	 */
	
	@ApiOperation(value = "新增模板", notes = "新增模板")
	@PostMapping(value = "InteractiveModel_add")
	@ResponseBody
	public Out<String> InteractiveModel_add(
			@ApiParam(value = "新增模板", required = true) @RequestBody In_InteractiveModel_add model) {
		logger.info("访问  InteractiveModelWritingController:InteractiveModel_add,model=" + model);

		Out<String> back = new Out<String>();
		Tb_interactive_model interactive_model = null;
		Tb_interactive_catalog interactive_catalogParent = null;
		Tb_interactive_catalog interactive_catalog = null;
		XMLWriter writer = null;
		try {
			//生成Xml文件
			Document document = DocumentHelper.createDocument();
			Element root = document.addElement("package");
			Element template = root.addElement("pictemplate").addAttribute("name", model.getName());
			template.addElement("occasion").addAttribute("name", "key").addAttribute("key", model.getCorrect());
			template.addElement("occasion").addAttribute("name", "prepare").addElement("item").addAttribute("word",
					model.getPrepare());
			template.addElement("occasion").addAttribute("name", "question").addElement("item").addAttribute("word",
					model.getQuestion());
			template.addElement("occasion").addAttribute("name", "answerOk").addElement("item")
					.addAttribute("word", model.getAnswerOk().split(";")[0])
					.addAttribute("look", model.getAnswerOk().split(";")[1]);
			template.addElement("occasion").addAttribute("name", "answerError").addElement("item")
					.addAttribute("word", model.getAnswerError().split(";")[0])
					.addAttribute("look", model.getAnswerError().split(";")[1]);
			template.addElement("occasion").addAttribute("name", "goodBye").addElement("item")
					.addAttribute("word", model.getGoodbye().split(";")[0])
					.addAttribute("look", model.getGoodbye().split(";")[1]);
			template.addElement("occasion").addAttribute("name", "suitable_age").addElement("item")
			.addAttribute("word", model.getSuitable_age());
			template.addElement("occasion").addAttribute("name", "kinds").addElement("item")
			.addAttribute("word", model.getKinds());
			FileOutputStream fos = new FileOutputStream(ossInfo.getLinuxXmlAddress());
			writer = new XMLWriter(fos, OutputFormat.createPrettyPrint());
			writer.write(document);
			//存入种类到数据库
			interactive_catalogParent = new Tb_interactive_catalog();
			interactive_catalogParent.setName(model.getKinds().split("-")[0]);
			interactive_catalogParent.setParentId(0);
			interactive_catalogParent.setCreated(new Date());
			interactiveService.insertCatalogSelective(interactive_catalogParent);
			interactive_catalog = new Tb_interactive_catalog();
			interactive_catalog.setName(model.getKinds().split("-")[1]);
			interactive_catalog.setParentId(interactive_catalogParent.getId());
			interactive_catalog.setCreated(new Date());
			interactiveService.insertCatalogSelective(interactive_catalog);
			// 生成的ZIP包p
			byte[] buffer = new byte[1024];			
			Date date = new Date();
			long time = date.getTime();
			//存入模板信息到数据库
			String location = ossInfo.getLinuxZipAddress()+String.valueOf(time)+".zip";
			interactive_model= new Tb_interactive_model();
			interactive_model.setAuthor(model.getAuthor());
			interactive_model.setCreated(new Date());
			interactive_model.setCatalog(interactive_catalog.getId());;
			interactive_model.setLocation(location);
			interactive_model.setSchoolId(model.getSchool_id());
			interactive_model.setStatus((byte)1);
			interactive_model.setSuitableAge(model.getSuitable_age());
			int row=interactiveService.insertModelSelective(interactive_model);

			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(location));
			// 获得照片文件夹下的所有照片
			File[] file1 = new File(ossInfo.getLinuxPicAddress()).listFiles();
			for (int i = 0; i < file1.length; i++) {
				FileInputStream fis = new FileInputStream(file1[i]);
				out.putNextEntry(new ZipEntry(file1[i].getName()));
				int len;
				// 读入需要下载的文件的内容，打包到zip文件
				while ((len = fis.read(buffer)) > 0) {
					out.write(buffer, 0, len);
				}
				out.closeEntry();
				fis.close();
			}
			FileInputStream fis = new FileInputStream(new File(ossInfo.getLinuxXmlAddress()));
			out.putNextEntry(new ZipEntry(new File(ossInfo.getLinuxXmlAddress()).getName()));
			int len;
			// 读入需要下载的文件的内容，打包到zip文件
			while ((len = fis.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
			out.closeEntry();
			fis.close();
			out.close();
			
			if(row>0){
			back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "生成Demo.zip成功！");

			}else{				
					// 更新有问题
					back.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, "rowNum=" + row);
				
			}
		} catch (ServiceException e) {
			// 服务层错误，包括 内部service 和 对外service
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		} catch (Exception ex) {
			back.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, ex.getMessage());
		}
		return back;
	}
	/**
	 * 下载
	 */
	@PostMapping(value = "download/{time}")
	@ApiOperation(value = "下载", notes = "下载")
	@ResponseBody
	public Out<OutList<Tb_interactive_model>> download(@PathVariable("time")long time) {
		logger.info("访问   InteractiveModelWritingController :download,time="+time);
		List<Tb_interactive_model> models = null;
		OutList<Tb_interactive_model> outList = null;
		Out<OutList<Tb_interactive_model>> back = new Out<OutList<Tb_interactive_model>>();
		try {
			// 查找所有time时间之后的zip包
			models= interactiveService.findByUpdate(time);
			Tb_interactive_catalog catalog=null;
			Tb_interactive_catalog catalogParent=null;
			for (int i = 0; i < models.size(); i++) {
			   catalog = interactiveService.findCatalogById(models.get(i).getCatalog());
               catalogParent=interactiveService.findCatalogById(catalog.getParentId());
			   StringBuilder sb=new StringBuilder(catalogParent.getName());
			   sb.append("-"+catalog.getName());
			   models.get(i).setCatalogName(sb.toString());
			}
			
			if (models.size() > 0) {
				
				outList = new OutList<Tb_interactive_model>(models.size(), models);
				back.setBackTypeWithLog(outList, BackType.SUCCESS_SEARCH_NORMAL);
			} else {
				
				back.setBackTypeWithLog(outList, BackType.FAIL_SEARCH_NORMAL);
			}
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}
	
	/**
	 * 查找所有模块
	 */
	@PostMapping(value = "findAllModel")
	@ApiOperation(value = "查找所有模块", notes = "查找所有模块")
	@ResponseBody
	public Out<OutList<Tb_interactive_model>> findAllModel() {
		logger.info("访问   InteractiveModelWritingController :findAllModel");
		List<Tb_interactive_model> models = null;
		OutList<Tb_interactive_model> outList = null;
		Out<OutList<Tb_interactive_model>> back = new Out<OutList<Tb_interactive_model>>();
		try {
			// 查找所有time时间之后的zip包
			models= interactiveService.findAllModel();
			Tb_interactive_catalog catalog=null;
			Tb_interactive_catalog catalogParent=null;
			for (int i = 0; i < models.size(); i++) {
			   catalog = interactiveService.findCatalogById(models.get(i).getCatalog());
               catalogParent=interactiveService.findCatalogById(catalog.getParentId());
			   StringBuilder sb=new StringBuilder(catalogParent.getName());
			   sb.append("-"+catalog.getName());
			   models.get(i).setCatalogName(sb.toString());
			}
			
			if (models.size() > 0) {
				
				outList = new OutList<Tb_interactive_model>(models.size(), models);
				back.setBackTypeWithLog(outList, BackType.SUCCESS_SEARCH_NORMAL);
			} else {
				
				back.setBackTypeWithLog(outList, BackType.FAIL_SEARCH_NORMAL);
			}
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}
}
