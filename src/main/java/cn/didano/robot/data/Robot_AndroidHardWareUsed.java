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
 *机器的运行环境类
 *主要是上行和下行的信息容器
 */
@ApiModel
@TypeAlias("安卓的运行环境")
public class Robot_AndroidHardWareUsed extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "Android版CPU最高使用率", required = true)
	private String android_cpu_used;
	@ApiModelProperty(value = "Android板CPU使用率最高对应的app", required = true)
	private String android_cpu_used_app;
	@ApiModelProperty(value = "Android版CPU最高使用率的时间", required = true)
	private String android_cpu_used_time;
	
	@ApiModelProperty(value = "Android版flash的CPU使用率", required = true)
	private String android_flash_used;
	@ApiModelProperty(value = "Androidflash的CPU使用率的时间", required = true)
	private String android_flash_used_time;
	
	@ApiModelProperty(value = "Android板内存最高使用率", required = true)
	private String android_memory_used;
	@ApiModelProperty(value = "Android板内存最高使用率对用的app", required = true)
	private String android_memory_used_app;
	@ApiModelProperty(value = "Android板内存最高使用率的时间", required = true)
	private String android_memory_used_time;
	
	@ApiModelProperty(value = "wifi信号", required = true)
	private String linux_wifi_signal;
	@ApiModelProperty(value = "wifi信号的时间", required = true)
	private String linux_wifi_signal_time;
	
	
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getAndroid_cpu_used() {
		return android_cpu_used;
	}
	public void setAndroid_cpu_used(String android_cpu_used) {
		this.android_cpu_used = android_cpu_used;
	}
	public String getAndroid_cpu_used_app() {
		return android_cpu_used_app;
	}
	public void setAndroid_cpu_used_app(String android_cpu_used_app) {
		this.android_cpu_used_app = android_cpu_used_app;
	}
	public String getAndroid_cpu_used_time() {
		return android_cpu_used_time;
	}
	public void setAndroid_cpu_used_time(String android_cpu_used_time) {
		this.android_cpu_used_time = android_cpu_used_time;
	}
	public String getAndroid_flash_used() {
		return android_flash_used;
	}
	public void setAndroid_flash_used(String android_flash_used) {
		this.android_flash_used = android_flash_used;
	}
	public String getAndroid_flash_used_time() {
		return android_flash_used_time;
	}
	public void setAndroid_flash_used_time(String android_flash_used_time) {
		this.android_flash_used_time = android_flash_used_time;
	}
	public String getAndroid_memory_used() {
		return android_memory_used;
	}
	public void setAndroid_memory_used(String android_memory_used) {
		this.android_memory_used = android_memory_used;
	}
	public String getAndroid_memory_used_app() {
		return android_memory_used_app;
	}
	public void setAndroid_memory_used_app(String android_memory_used_app) {
		this.android_memory_used_app = android_memory_used_app;
	}
	public String getAndroid_memory_used_time() {
		return android_memory_used_time;
	}
	public void setAndroid_memory_used_time(String android_memory_used_time) {
		this.android_memory_used_time = android_memory_used_time;
	}
	public String getLinux_wifi_signal() {
		return linux_wifi_signal;
	}
	public void setLinux_wifi_signal(String linux_wifi_signal) {
		this.linux_wifi_signal = linux_wifi_signal;
	}
	public String getLinux_wifi_signal_time() {
		return linux_wifi_signal_time;
	}
	public void setLinux_wifi_signal_time(String linux_wifi_signal_time) {
		this.linux_wifi_signal_time = linux_wifi_signal_time;
	}
	@Override
	public String toString() {
		return "Robot_AndroidHardWareUsed [deviceNo=" + deviceNo + ", android_cpu_used=" + android_cpu_used
				+ ", android_cpu_used_app=" + android_cpu_used_app + ", android_cpu_used_time=" + android_cpu_used_time
				+ ", android_flash_used=" + android_flash_used + ", android_flash_used_time=" + android_flash_used_time
				+ ", android_memory_used=" + android_memory_used + ", android_memory_used_app="
				+ android_memory_used_app + ", android_memory_used_time=" + android_memory_used_time
				+ ", linux_wifi_signal=" + linux_wifi_signal + ", linux_wifi_signal_time=" + linux_wifi_signal_time
				+ "]";
	}
}
