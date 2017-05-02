package cn.didano.base.interaction;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import cn.didano.video.entity.Interactive;

@Service
public class FileSystemStorageService implements StorageService {
	static Logger logger = Logger.getLogger(FileSystemStorageService.class);
	

	@Autowired
	private Interactive interactive;

	@Override
	public void store(MultipartFile file, String name,Path rootLocation) {

		try {
			if (file.isEmpty()) {
				logger.warn("Failed to store empty file ,file.getOriginalFilename()=" + file.getOriginalFilename());
				//throw new StorageException("Failed to store empty file " + file.getOriginalFilename());
			} else {
				
				Files.copy(file.getInputStream(),
						rootLocation.resolve(name  + "." + file.getOriginalFilename().split("\\.")[1]));
			}

		} catch (IOException e) {
			throw new StorageException("Failed to store file " + file.getOriginalFilename(), e);
		}
	}

	

	

	

	@Override
	public void deleteAll(Path rootLocation) {
		FileSystemUtils.deleteRecursively(rootLocation.toFile());
	}

	@Override
	public void init(Path rootLocation) {
		try {
			if (!Files.exists(rootLocation, new LinkOption[] { LinkOption.NOFOLLOW_LINKS })) {
				Files.createDirectory(rootLocation);
			}
		    File filePic = new File(interactive.getLinuxPicAddress());
		    if(!filePic.exists()){
		    	
		    	throw new StorageFileNotFoundException("Could not read file: " + interactive.getLinuxPicAddress());
		    }
		    File fileXml = new File(interactive.getLinuxXmlAddress());
		    if(!fileXml.exists()){
		    	
		    	throw new StorageFileNotFoundException("Could not read file: " + interactive.getLinuxXmlAddress());
		    }
		    File fileZip = new File(interactive.getLinuxZipAddress());
		    if(!fileZip.exists()){
		    	throw new StorageFileNotFoundException("Could not read file: " + interactive.getLinuxZipAddress());
		    }
		    File fileWx = new File(interactive.getWeiXinAddress());
		    if(!fileWx.exists()){
		    	throw new StorageFileNotFoundException("Could not read file: " + interactive.getLinuxZipAddress());
		    }
		} catch (IOException e) {
			throw new StorageException("Could not initialize storage", e);
		}
	}
}
