package cn.didano.base.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "interactive")
@Component
public class InteractiveProperties {

	private String interactivePath;
	private String download;
	private String PicAddress = "/upload-dir";
	private String XmlAddress = "/create-Xml/InteractiveModel.xml";
	private String ZipAddress = "/create-Zip/";

	public String getDownload() {
		return download;
	}

	public void setDownload(String download) {
		this.download = download;
	}

	public String getInteractivePath() {
		return interactivePath;
	}

	public void setInteractivePath(String interactivePath) {
		this.interactivePath = interactivePath;
	}

	public String getLinuxPicAddress() {
		return interactivePath + PicAddress;
	}

	public String getLinuxXmlAddress() {
		return interactivePath + XmlAddress;
	}

	public String getLinuxZipAddress() {
		return interactivePath + ZipAddress;
	}

}
