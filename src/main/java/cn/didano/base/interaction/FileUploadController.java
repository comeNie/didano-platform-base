package cn.didano.base.interaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.didano.base.model.Tb_interactive_catalog;
import cn.didano.base.model.Tb_interactive_model;
import cn.didano.base.service.InteractiveModelService;
import cn.didano.video.entity.Interactive;
import io.swagger.annotations.Api;

@Api(value = "互动模块照片模板上传")
@Controller
@RequestMapping("/interaction")
public class FileUploadController {

	private final StorageService storageService;
	@Autowired
	private Interactive interactive;
	@Autowired
	private InteractiveModelService interactiveService;

	@Autowired
	public FileUploadController(StorageService storageService) {
		this.storageService = storageService;
	}

	

	@PostMapping("/upload")
	public String handleFileUpload(@RequestParam("file") List<MultipartFile> files, @RequestParam("name") String name,
			@RequestParam("correct") String correct, @RequestParam("prepare") String prepare,
			@RequestParam("question") String question, @RequestParam("answerOkWords") String answerOkWord,
			@RequestParam("answerOkAction") String answerOkAction,
			@RequestParam("answerErrorAction") String answerErrorAction,
			@RequestParam("answerErrorWords") String answerErrorWord, @RequestParam("goodbyeWords") String goodbyeWord,
			@RequestParam("goodbyeAction") String goodbyeAction, @RequestParam("suitable_age") String suitable_age,
			@RequestParam("ParentKinds") String kindsParent, @RequestParam("kinds") String kinds,
			@RequestParam("author") String author, @RequestParam("school_id") int school_id,
			RedirectAttributes redirectAttributes) {

		storageService.deleteAll();
		storageService.init();
		for (int i = 0; i < files.size(); i++) {
			// Optional.ofNullable(files.get(i)).map(files.get(i)::getName).orElse("no
			// name");
			storageService.store(files.get(i), i + 1);
			redirectAttributes.addFlashAttribute("message",
					"You successfully uploaded " + files.get(i).getOriginalFilename() + "!");
		}
		Tb_interactive_model interactive_model = null;
		Tb_interactive_catalog interactive_catalogParent = null;
		Tb_interactive_catalog interactive_catalog = null;
		XMLWriter writer = null;
		try {
			// 生成Xml文件
			Document document = DocumentHelper.createDocument();
			Element root = document.addElement("package");
			Element template = root.addElement("pictemplate").addAttribute("name", name);
			template.addElement("occasion").addAttribute("name", "key").addAttribute("key", correct);
			template.addElement("occasion").addAttribute("name", "prepare").addElement("item").addAttribute("word",
					prepare);
			template.addElement("occasion").addAttribute("name", "question").addElement("item").addAttribute("word",
					question);
			template.addElement("occasion").addAttribute("name", "answerOk").addElement("item")
					.addAttribute("word", answerOkWord).addAttribute("look", answerOkAction);
			template.addElement("occasion").addAttribute("name", "answerError").addElement("item")
					.addAttribute("word", answerErrorWord).addAttribute("look", answerErrorAction);
			template.addElement("occasion").addAttribute("name", "goodBye").addElement("item")
					.addAttribute("word", goodbyeWord).addAttribute("look", goodbyeAction);
			template.addElement("occasion").addAttribute("name", "suitable_age").addElement("item").addAttribute("word",
					suitable_age);
			template.addElement("occasion").addAttribute("name", "kinds").addElement("item").addAttribute("word",
					kindsParent + "-" + kinds);
			FileOutputStream fos = new FileOutputStream(interactive.getLinuxXmlAddress());
			writer = new XMLWriter(fos, OutputFormat.createPrettyPrint());
			writer.write(document);
			// 存入种类到数据库
			interactive_catalogParent = new Tb_interactive_catalog();
			interactive_catalogParent.setName(kindsParent);
			interactive_catalogParent.setParentId(0);
			interactive_catalogParent.setCreated(new Date());
			interactiveService.insertCatalogSelective(interactive_catalogParent);
			interactive_catalog = new Tb_interactive_catalog();
			interactive_catalog.setName(kinds);
			interactive_catalog.setParentId(interactive_catalogParent.getId());
			interactive_catalog.setCreated(new Date());
			interactiveService.insertCatalogSelective(interactive_catalog);
			// 生成的ZIP包p
			byte[] buffer = new byte[1024];
			Date date = new Date();
			long time = date.getTime();
			// 存入模板信息到数据库
			String location = interactive.getLinuxZipAddress() + String.valueOf(time) + ".zip";
			interactive_model = new Tb_interactive_model();
			interactive_model.setAuthor(author);
			interactive_model.setCreated(new Date());
			interactive_model.setCatalog(interactive_catalog.getId());
			interactive_model.setName(name);
			interactive_model.setLocation(location);
			interactive_model.setSchoolId(school_id);
			interactive_model.setStatus((byte) 1);
			interactive_model.setSuitableAge(suitable_age);
			int row = interactiveService.insertModelSelective(interactive_model);

			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(location));
			// 获得照片文件夹下的所有照片
			File[] file1 = new File(interactive.getLinuxPicAddress()).listFiles();
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
			FileInputStream fis = new FileInputStream(new File(interactive.getLinuxXmlAddress()));
			out.putNextEntry(new ZipEntry(new File(interactive.getLinuxXmlAddress()).getName()));
			int len;
			// 读入需要下载的文件的内容，打包到zip文件
			while ((len = fis.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
			out.closeEntry();
			fis.close();
			out.close();

		} catch (Exception ex) {

		}

		return "video/right/interactiveModule";
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}

}
