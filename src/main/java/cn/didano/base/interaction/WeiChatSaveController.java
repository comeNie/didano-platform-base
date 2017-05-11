package cn.didano.base.interaction;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.didano.base.model.Tb_org;
import cn.didano.base.service.WeiChatService;
import cn.didano.video.entity.Interactive;
import io.swagger.annotations.Api;

@Api(value = "微信机构信息存储")
@Controller
@RequestMapping("/weiChatInfo")
public class WeiChatSaveController {

	@Autowired
	private StorageService storageService;

	@Autowired
	private WeiChatService weiChatService;

	@Autowired
	private Interactive info;

	//保存
	@PostMapping("/save")
	public String weixinSave(@RequestParam("file") MultipartFile file, @RequestParam("name") String name,
			@RequestParam("des") String des, @RequestParam("contact_phone") String contact_phone,
			@RequestParam("contact_person") String contact_person) {

		//对logo进行存储
		if (file != null) {
			Path rootlocation = Paths.get(info.getWeiXinAddress());
			storageService.init(rootlocation);

			storageService.store(file, name, rootlocation);
		}
		//将机构信息存入数据库
		Tb_org org = new Tb_org();
		org.setContactPerson(contact_person);
		org.setContactPhone(contact_phone);
		org.setCreated(new Date());
		org.setDes(des);
		StringBuilder sb = new StringBuilder(info.getWeiXinAddress());
		sb.append("/" + name + file.getOriginalFilename().split("\\.")[1]);
		org.setLogo(sb.toString());
		org.setName(name);
		weiChatService.insertTb_orgSelective(org);

		return "video/right/interactiveModule";
	}

	//编辑
	@PostMapping("/update")
	public String weixinUpdate(@RequestParam("file") MultipartFile file, @RequestParam("id") int id,
			@RequestParam("name") String name, @RequestParam("des") String des,
			@RequestParam("contact_phone") String contact_phone,
			@RequestParam("contact_person") String contact_person) {
		Tb_org org = new Tb_org();
		org.setId(id);
		org.setContactPerson(contact_person);
		org.setContactPhone(contact_phone);
		org.setDes(des);
		org.setName(name);
		if (file != null) {
			Path rootlocation = Paths.get(info.getWeiXinAddress());
			storageService.init(rootlocation);
			storageService.store(file, name, rootlocation);
			StringBuilder sb = new StringBuilder(info.getWeiXinAddress());
			sb.append("/" + name + file.getOriginalFilename().split("\\.")[1]);
			org.setLogo(sb.toString());
		}

		weiChatService.updateTb_org(org);

		return "video/right/interactiveModule";
	}
	
	//删除
	@PostMapping("/delete")
	public String weixindelete(@RequestParam("id") int id) {
		

		weiChatService.deleteTb_org(id);

		return "video/right/interactiveModule";
	}

}
