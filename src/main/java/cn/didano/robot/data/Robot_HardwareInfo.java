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
 * 硬件信息
 * @Todo 将两个摄像头分开
 */
@ApiModel
@TypeAlias("硬件信息")
public class Robot_HardwareInfo extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "安卓核心板", required = true)
	private String androidCoreBoard;
	@ApiModelProperty(value = "linux核心板", required = true)
	private String linuxCoreBoard;
	@ApiModelProperty(value = "1号个摄像头", required = true)
	private String oneCamera;
	@ApiModelProperty(value = "2号个摄像头", required = true)
	private String twoCamera;
	@ApiModelProperty(value = "热像仪", required = true)
	private String thermalImager;
	@ApiModelProperty(value = "RFID读卡器", required = true)
	private String rfidCardReader;
	@ApiModelProperty(value = "液晶屏", required = true)
	private String liquidCrystalDisplay;
	
	public String getAndroidCoreBoard() {
		return androidCoreBoard;
	}
	public void setAndroidCoreBoard(String androidCoreBoard) {
		this.androidCoreBoard = androidCoreBoard;
	}
	public String getLinuxCoreBoard() {
		return linuxCoreBoard;
	}
	public void setLinuxCoreBoard(String linuxCoreBoard) {
		this.linuxCoreBoard = linuxCoreBoard;
	}
	public String getOneCamera() {
		return oneCamera;
	}
	public void setOneCamera(String oneCamera) {
		this.oneCamera = oneCamera;
	}
	public String getTwoCamera() {
		return twoCamera;
	}
	public void setTwoCamera(String twoCamera) {
		this.twoCamera = twoCamera;
	}
	public String getThermalImager() {
		return thermalImager;
	}
	public void setThermalImager(String thermalImager) {
		this.thermalImager = thermalImager;
	}
	public String getRfidCardReader() {
		return rfidCardReader;
	}
	public void setRfidCardReader(String rfidCardReader) {
		this.rfidCardReader = rfidCardReader;
	}
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getLiquidCrystalDisplay() {
		return liquidCrystalDisplay;
	}
	public void setLiquidCrystalDisplay(String liquidCrystalDisplay) {
		this.liquidCrystalDisplay = liquidCrystalDisplay;
	}
	public Robot_HardwareInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HardwareInfo [androidCoreBoard=" + androidCoreBoard + ", linuxCoreBoard=" + linuxCoreBoard
				+ ", oneCamera=" + oneCamera + ", twoCamera=" + twoCamera + ", thermalImager=" + thermalImager
				+ ", rfidCardReader=" + rfidCardReader + ", liquidCrystalDisplay=" + liquidCrystalDisplay + "]";
	}
}
