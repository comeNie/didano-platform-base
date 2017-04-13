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
 *机器的运行环境类
 *主要是上行和下行的信息容器
 */
@ApiModel
public class OperationInfo extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "安卓CPU占用", required = true)
	private String androidCPU;
	@ApiModelProperty(value = "安卓内存", required = true)
	private String androidBoardMemory;
	@ApiModelProperty(value = "flash占用情况", required = true)
	private String androidFlashOccupation;
	@ApiModelProperty(value = "Linux的CPU", required = true)
	private String linuxCPU;
	@ApiModelProperty(value = "Linux的内存", required = true)
	private String linuxBoardMemory;
	@ApiModelProperty(value = "Linux的flash占用情况", required = true)
	private String linuxFlashOccupation;
	@ApiModelProperty(value = "wifi信号比", required = true)
	private String wifiSignalRation;
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getAndroidCPU() {
		return androidCPU;
	}
	public void setAndroidCPU(String androidCPU) {
		this.androidCPU = androidCPU;
	}
	public String getAndroidBoardMemory() {
		return androidBoardMemory;
	}
	public void setAndroidBoardMemory(String androidBoardMemory) {
		this.androidBoardMemory = androidBoardMemory;
	}
	public String getAndroidFlashOccupation() {
		return androidFlashOccupation;
	}
	public void setAndroidFlashOccupation(String androidFlashOccupation) {
		this.androidFlashOccupation = androidFlashOccupation;
	}
	public String getLinuxCPU() {
		return linuxCPU;
	}
	public void setLinuxCPU(String linuxCPU) {
		this.linuxCPU = linuxCPU;
	}
	public String getLinuxBoardMemory() {
		return linuxBoardMemory;
	}
	public void setLinuxBoardMemory(String linuxBoardMemory) {
		this.linuxBoardMemory = linuxBoardMemory;
	}
	public String getLinuxFlashOccupation() {
		return linuxFlashOccupation;
	}
	public void setLinuxFlashOccupation(String linuxFlashOccupation) {
		this.linuxFlashOccupation = linuxFlashOccupation;
	}
	public String getWifiSignalRation() {
		return wifiSignalRation;
	}
	public void setWifiSignalRation(String wifiSignalRation) {
		this.wifiSignalRation = wifiSignalRation;
	}
	@Override
	public String toString() {
		return "{\"deviceNo\":\"" + deviceNo + "\",\"androidCPU\":\"" + androidCPU + "\",\"androidBoardMemory\":\""
				+ androidBoardMemory + "\",\"androidFlashOccupation\":\"" + androidFlashOccupation
				+ "\",\"linuxCPU\":\"" + linuxCPU + "\",\"linuxBoardMemory\":\"" + linuxBoardMemory
				+ "\",\"linuxFlashOccupation\":\"" + linuxFlashOccupation + "\",\"wifiSignalRation\":\""
				+ wifiSignalRation + "\"}  ";
	}
}
