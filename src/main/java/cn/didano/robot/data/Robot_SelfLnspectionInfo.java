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

import org.springframework.data.annotation.TypeAlias;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author stephen.wang
 * @Todo 没有安卓操作系统版本号
 */
@ApiModel
@TypeAlias("自检信息")
public class Robot_SelfLnspectionInfo extends RInfo {
	
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "彩色摄像头检查结果", required = true)
	private String selfcheck_color_camera;
	@ApiModelProperty(value = "黑白摄像头检查结果", required = true)
	private String selfcheck_black_camera;
	@ApiModelProperty(value = "射频卡模块检查结果", required = true)
	private String selfcheck_rfid;
	@ApiModelProperty(value = "运动控制模块检查结果", required = true)
	private String selfcheck_motion;
	@ApiModelProperty(value = "温度模块检查结果", required = true)
	private String selfcheck_lepton;
	@ApiModelProperty(value = "语音模块检查结果", required = true)
	private String selfcheck_voice;
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getSelfcheck_color_camera() {
		return selfcheck_color_camera;
	}
	public void setSelfcheck_color_camera(String selfcheck_color_camera) {
		this.selfcheck_color_camera = selfcheck_color_camera;
	}
	public String getSelfcheck_black_camera() {
		return selfcheck_black_camera;
	}
	public void setSelfcheck_black_camera(String selfcheck_black_camera) {
		this.selfcheck_black_camera = selfcheck_black_camera;
	}
	public String getSelfcheck_rfid() {
		return selfcheck_rfid;
	}
	public void setSelfcheck_rfid(String selfcheck_rfid) {
		this.selfcheck_rfid = selfcheck_rfid;
	}
	public String getSelfcheck_motion() {
		return selfcheck_motion;
	}
	public void setSelfcheck_motion(String selfcheck_motion) {
		this.selfcheck_motion = selfcheck_motion;
	}
	public String getSelfcheck_lepton() {
		return selfcheck_lepton;
	}
	public void setSelfcheck_lepton(String selfcheck_lepton) {
		this.selfcheck_lepton = selfcheck_lepton;
	}
	public String getSelfcheck_voice() {
		return selfcheck_voice;
	}
	public void setSelfcheck_voice(String selfcheck_voice) {
		this.selfcheck_voice = selfcheck_voice;
	}
	@Override
	public String toString() {
		return "Robot_SelfLnspectionInfo [deviceNo=" + deviceNo + ", selfcheck_color_camera=" + selfcheck_color_camera
				+ ", selfcheck_black_camera=" + selfcheck_black_camera + ", selfcheck_rfid=" + selfcheck_rfid
				+ ", selfcheck_motion=" + selfcheck_motion + ", selfcheck_lepton=" + selfcheck_lepton
				+ ", selfcheck_voice=" + selfcheck_voice + "]";
	}
}
