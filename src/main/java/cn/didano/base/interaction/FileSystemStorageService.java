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
	
	private final Path rootLocation;

	@Autowired
	public FileSystemStorageService(StorageProperties properties) {
		this.rootLocation = Paths.get(properties.getLocation());
	}
	@Autowired
	private Interactive interactive;

	@Override
	public void store(MultipartFile file, int i) {

		try {
			if (file.isEmpty()) {
				logger.warn("Failed to store empty file ,file.getOriginalFilename()=" + file.getOriginalFilename());
				//throw new StorageException("Failed to store empty file " + file.getOriginalFilename());
			} else {
				System.err.println(file.getName());
				Files.copy(file.getInputStream(),
						this.rootLocation.resolve("pic" + i + "." + file.getOriginalFilename().split("\\.")[1]));
			}

		} catch (IOException e) {
			logger.error("Failed to store file " + file.getOriginalFilename(), e);
		}
	}

	@Override
	public Stream<Path> loadAll() {
		try {
			return Files.walk(this.rootLocation, 1).filter(path -> !path.equals(this.rootLocation))
					.map(path -> this.rootLocation.relativize(path));
		} catch (IOException e) {
			logger.error("Failed to read stored files:"+e.getMessage(),e);
			return null;
		}

	}

	@Override
	public Path load(String filename) {
		return rootLocation.resolve(filename);
	}

	@Override
	public Resource loadAsResource(String filename) {
		try {
			Path file = load(filename);
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new StorageFileNotFoundException("Could not read file: " + filename);

			}
		} catch (MalformedURLException e) {
			throw new StorageFileNotFoundException("Could not read file: " + filename, e);
		}
	}

	@Override
	public void deleteAll() {
		FileSystemUtils.deleteRecursively(rootLocation.toFile());
	}

	@Override
	public void init() {
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
		}
		catch (IOException e) {
			logger.error("Could not initialize storage", e);
		}
	}
}
