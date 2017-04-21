/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.didano.robot.data;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author stephen.wang
 * @Todo 没有安卓操作系统版本号
 */
@ApiModel
public class RVersionInfo extends RInfo {

	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "表情包版本", required = true)
	private String emotionZipVersion;
	@ApiModelProperty(value = "语音包版本", required = true)
	private String voiceZipVersion;
	@ApiModelProperty(value = "安卓软件版本", required = true)
	
	private String androidVersion;
	@ApiModelProperty(value = "linux软件版本", required = true)
	private String linuxSoftVersion;
	@ApiModelProperty(value = "linux操作系统版本", required = true)
	private String linuxSystemVersion;
	@ApiModelProperty(value = "运动控制板软件版本", required = true)
	private String motionControlVersion;

	public RVersionInfo() {
		
	}

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getEmotionZipVersion() {
		return emotionZipVersion;
	}

	public void setEmotionZipVersion(String emotionZipVersion) {
		this.emotionZipVersion = emotionZipVersion;
	}

	public String getVoiceZipVersion() {
		return voiceZipVersion;
	}

	public void setVoiceZipVersion(String voiceZipVersion) {
		this.voiceZipVersion = voiceZipVersion;
	}

	public String getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}

	public String getLinuxSoftVersion() {
		return linuxSoftVersion;
	}

	public void setLinuxSoftVersion(String linuxSoftVersion) {
		this.linuxSoftVersion = linuxSoftVersion;
	}

	public String getLinuxSystemVersion() {
		return linuxSystemVersion;
	}

	public void setLinuxSystemVersion(String linuxSystemVersion) {
		this.linuxSystemVersion = linuxSystemVersion;
	}

	public String getMotionControlVersion() {
		return motionControlVersion;
	}

	public void setMotionControlVersion(String motionControlVersion) {
		this.motionControlVersion = motionControlVersion;
	}

	@Override
	public String toString() {
		return "RobotVersionInfo [deviceNo=" + deviceNo + ", emotionZipVersion=" + emotionZipVersion
				+ ", voiceZipVersion=" + voiceZipVersion + ", androidVersion=" + androidVersion + ", linuxSoftVersion="
				+ linuxSoftVersion + ", linuxSystemVersion=" + linuxSystemVersion + ", motionControlVersion="
				+ motionControlVersion + "]";
	}
}
