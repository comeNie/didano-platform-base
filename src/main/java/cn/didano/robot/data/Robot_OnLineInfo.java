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
 * 运行在线信息类
 */
@ApiModel
@TypeAlias("运行在线")
public class Robot_OnLineInfo extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	
	@ApiModelProperty(value = "Linux在线", required = true)
	private String linuxOnLine;
	
	@ApiModelProperty(value = "安卓在线", required = true)
	private String androidOnLine;
	
	@ApiModelProperty(value = "运行控制模版在线", required = true)
	private String exerciseOnline;

	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getLinuxOnLine() {
		return linuxOnLine;
	}
	public void setLinuxOnLine(String linuxOnLine) {
		this.linuxOnLine = linuxOnLine;
	}
	public String getAndroidOnLine() {
		return androidOnLine;
	}
	public void setAndroidOnLine(String androidOnLine) {
		this.androidOnLine = androidOnLine;
	}
	public String getExerciseOnline() {
		return exerciseOnline;
	}
	public void setExerciseOnline(String exerciseOnline) {
		this.exerciseOnline = exerciseOnline;
	}
	@Override
	public String toString() {
		return "{\"deviceNo\":\"" + deviceNo + "\",\"linuxOnLine\":\"" + linuxOnLine + "\",\"androidOnLine\":\""
				+ androidOnLine + "\",\"exerciseOnline\":\"" + exerciseOnline + "\"}  ";
	}
}
