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
@TypeAlias("运行状态")
public class Robot_AppRunningStatus extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	
	@ApiModelProperty(value = "小诺Linux程序在线状态", required = true)
	private String linux_app_status;
	
	@ApiModelProperty(value = "小诺Android程序在线状态", required = true)
	private String android_app_status;
	
	@ApiModelProperty(value = "运动控制程序在线状态", required = true)
	private String motion_app_status;

	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getLinux_app_status() {
		return linux_app_status;
	}
	public void setLinux_app_status(String linux_app_status) {
		this.linux_app_status = linux_app_status;
	}
	public String getAndroid_app_status() {
		return android_app_status;
	}
	public void setAndroid_app_status(String android_app_status) {
		this.android_app_status = android_app_status;
	}
	public String getMotion_app_status() {
		return motion_app_status;
	}
	public void setMotion_app_status(String motion_app_status) {
		this.motion_app_status = motion_app_status;
	}
	@Override
	public String toString() {
		return "Robot_OnLineInfo [deviceNo=" + deviceNo + ", linux_app_status=" + linux_app_status
				+ ", android_app_status=" + android_app_status + ", motion_app_status=" + motion_app_status + "]";
	}
	
}
