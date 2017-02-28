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

import org.springframework.data.annotation.Id;

/**
 * 
 * @author wangyi
 *
 */
public class RobotVersionInfo {
//	产品硬件识别码（产品ID）
//	安卓软件版本
//	表情包版本
//	语音包版本……
//	安卓操作系统版本
//	Linux软件版本
//	Linux操作系统版本
//	运动控制板软件版本
	
	@Id
	private String id;

	private String deviceNo;
	private String emotionZipVersion;
	private String voiceZipVersion;
	private String androidVersion;
	private String linuxSoftVersion;
	private String linuxSystemVersion;
	private String motionControlVersion;
	
	public RobotVersionInfo() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return "RobotVersionInfo [id=" + id + ", deviceNo=" + deviceNo + ", emotionZipVersion=" + emotionZipVersion
				+ ", voiceZipVersion=" + voiceZipVersion + ", androidVersion=" + androidVersion + ", linuxSoftVersion="
				+ linuxSoftVersion + ", linuxSystemVersion=" + linuxSystemVersion + ", motionControlVersion="
				+ motionControlVersion + "]";
	}

	
}
