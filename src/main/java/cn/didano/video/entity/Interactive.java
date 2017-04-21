package cn.didano.video.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "interactive")
@Component
public class Interactive {

	private String interactivePath;
	
	private String PicAddress="/upload-dir";
	private String XmlAddress="/create-Xml/InteractiveModel.xml";
	private String ZipAddress="/create-Zip/";
	
	public String getInteractivePath() {
		return interactivePath;
	}
	public void setInteractivePath(String interactivePath) {
		this.interactivePath = interactivePath;
	}
	public String getLinuxPicAddress() {
		return interactivePath+PicAddress;
	}
	
	public String getLinuxXmlAddress() {
		return interactivePath+XmlAddress;
	}
	
	public String getLinuxZipAddress() {
		return interactivePath+ZipAddress;
	}
	
	
}
