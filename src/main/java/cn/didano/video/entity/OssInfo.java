package cn.didano.video.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * oss信息
 * 增加@ConfigurationProperties(prefix = "video.oss")，即可
 * 读取配置文件/didano_video/src/main/resources/application.properties
 * 
 * @author stephen
 * Created on 2016年12月19日 下午1:50:37 
 */
@ConfigurationProperties(prefix = "oss")
@Component
public class OssInfo {
	private String endpoint;
	private String accessKeyId;
	private String accessKeySecret;
	private String bucketname;
	private String domain;
	private String cdn;
	private String imgPath;
	private String linuxPicAddress;
	private String linuxXmlAddress;
	private String linuxZipAddress;
	
	public String getLinuxPicAddress() {
		return linuxPicAddress;
	}

	public void setLinuxPicAddress(String linuxPicAddress) {
		this.linuxPicAddress = linuxPicAddress;
	}

	public String getLinuxXmlAddress() {
		return linuxXmlAddress;
	}

	public void setLinuxXmlAddress(String linuxXmlAddress) {
		this.linuxXmlAddress = linuxXmlAddress;
	}

	public String getLinuxZipAddress() {
		return linuxZipAddress;
	}

	public void setLinuxZipAddress(String linuxZipAddress) {
		this.linuxZipAddress = linuxZipAddress;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getAccessKeyId() {
		return accessKeyId;
	}

	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}

	public String getAccessKeySecret() {
		return accessKeySecret;
	}

	public void setAccessKeySecret(String accessKeySecret) {
		this.accessKeySecret = accessKeySecret;
	}

	public String getBucketname() {
		return bucketname;
	}

	public void setBucketname(String bucketname) {
		this.bucketname = bucketname;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getCdn() {
		return cdn;
	}

	public void setCdn(String cdn) {
		this.cdn = cdn;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
}
