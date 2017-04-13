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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *机器人自检信息类
 *主要是上行和下行的信息容器
 */
@ApiModel
public class SelfLnspectionInfo extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "液晶屏", required = true)
	private String siLiquidCrystalDisplay;
	@ApiModelProperty(value = "摄像头1", required = true)
	private String siOneCamera;
	@ApiModelProperty(value = "摄像头2", required = true)
	private String siTowcamera;
	@ApiModelProperty(value = "热像仪", required = true)
	private String siThermalImager;
	@ApiModelProperty(value = "运动控制模块", required = true)
	private String siMovementModule;
	@ApiModelProperty(value = "语音模块", required = true)
	private String siVoiceModule;
	@ApiModelProperty(value = "rfid", required = true)
	private String siRfid;
	@ApiModelProperty(value = "上次启动的时间", required = true)
	private String siTheLastTime;
	@ApiModelProperty(value = "本次启动的时间", required = true)
	private String siTheStartTime;
	@ApiModelProperty(value = "启动的原因", required = true)
	private String siStartTheReason;
	
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getSiLiquidCrystalDisplay() {
		return siLiquidCrystalDisplay;
	}
	public void setSiLiquidCrystalDisplay(String siLiquidCrystalDisplay) {
		this.siLiquidCrystalDisplay = siLiquidCrystalDisplay;
	}
	public String getSiOneCamera() {
		return siOneCamera;
	}
	public void setSiOneCamera(String siOneCamera) {
		this.siOneCamera = siOneCamera;
	}
	public String getSiTowcamera() {
		return siTowcamera;
	}
	public void setSiTowcamera(String siTowcamera) {
		this.siTowcamera = siTowcamera;
	}
	public String getSiThermalImager() {
		return siThermalImager;
	}
	public void setSiThermalImager(String siThermalImager) {
		this.siThermalImager = siThermalImager;
	}
	public String getSiMovementModule() {
		return siMovementModule;
	}
	public void setSiMovementModule(String siMovementModule) {
		this.siMovementModule = siMovementModule;
	}
	public String getSiVoiceModule() {
		return siVoiceModule;
	}
	public void setSiVoiceModule(String siVoiceModule) {
		this.siVoiceModule = siVoiceModule;
	}
	public String getSiRfid() {
		return siRfid;
	}
	public void setSiRfid(String siRfid) {
		this.siRfid = siRfid;
	}
	public String getSiTheLastTime() {
		return siTheLastTime;
	}
	public void setSiTheLastTime(String siTheLastTime) {
		this.siTheLastTime = siTheLastTime;
	}
	public String getSiTheStartTime() {
		return siTheStartTime;
	}
	public void setSiTheStartTime(String siTheStartTime) {
		this.siTheStartTime = siTheStartTime;
	}
	public String getSiStartTheReason() {
		return siStartTheReason;
	}
	public void setSiStartTheReason(String siStartTheReason) {
		this.siStartTheReason = siStartTheReason;
	}
	@Override
	public String toString() {
		return "{\"deviceNo\":\"" + deviceNo + "\",\"siLiquidCrystalDisplay\":\"" + siLiquidCrystalDisplay
				+ "\",\"siOneCamera\":\"" + siOneCamera + "\",\"siTowcamera\":\"" + siTowcamera
				+ "\",\"siThermalImager\":\"" + siThermalImager + "\",\"siMovementModule\":\"" + siMovementModule
				+ "\",\"siVoiceModule\":\"" + siVoiceModule + "\",\"siRfid\":\"" + siRfid + "\",\"siTheLastTime\":\""
				+ siTheLastTime + "\",\"siTheStartTime\":\"" + siTheStartTime + "\",\"siStartTheReason\":\""
				+ siStartTheReason + "\"}  ";
	}
}
