package cn.didano.base.interaction;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    void init(Path rootLocation);

    void store(MultipartFile file,String name,Path rootLocation);

  



    void deleteAll(Path rootLocation);

}
