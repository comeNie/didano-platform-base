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
@TypeAlias("Linux运行环境")
public class Robot_LinuxHardWareUsed extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "linux版CPU最高使用率", required = true)
	private String linux_cpu_used;
	@ApiModelProperty(value = "linux板CPU使用率最高对应的app", required = true)
	private String linux_cpu_used_app;
	@ApiModelProperty(value = "linux版CPU最高使用率的时间", required = true)
	private String linux_cpu_used_time;
	
	@ApiModelProperty(value = "linux版flash的CPU使用率", required = true)
	private String linux_flash_used;
	@ApiModelProperty(value = "linux版flash的CPU使用率的时间", required = true)
	private String linux_flash_used_time;
	
	@ApiModelProperty(value = "linux板内存最高使用率", required = true)
	private String linux_memory_used;
	@ApiModelProperty(value = "linux板内存最高使用率对用的app", required = true)
	private String linux_memory_used_app;
	@ApiModelProperty(value = "linux板内存最高使用率的时间", required = true)
	private String linux_memory_used_time;
	
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
	public String getLinux_cpu_used() {
		return linux_cpu_used;
	}
	public void setLinux_cpu_used(String linux_cpu_used) {
		this.linux_cpu_used = linux_cpu_used;
	}
	public String getLinux_cpu_used_app() {
		return linux_cpu_used_app;
	}
	public void setLinux_cpu_used_app(String linux_cpu_used_app) {
		this.linux_cpu_used_app = linux_cpu_used_app;
	}
	public String getLinux_flash_used() {
		return linux_flash_used;
	}
	public void setLinux_flash_used(String linux_flash_used) {
		this.linux_flash_used = linux_flash_used;
	}
	public String getLinux_memory_used() {
		return linux_memory_used;
	}
	public void setLinux_memory_used(String linux_memory_used) {
		this.linux_memory_used = linux_memory_used;
	}
	public String getLinux_memory_used_app() {
		return linux_memory_used_app;
	}
	public void setLinux_memory_used_app(String linux_memory_used_app) {
		this.linux_memory_used_app = linux_memory_used_app;
	}
	public String getLinux_wifi_signal() {
		return linux_wifi_signal;
	}
	public void setLinux_wifi_signal(String linux_wifi_signal) {
		this.linux_wifi_signal = linux_wifi_signal;
	}
	public String getLinux_cpu_used_time() {
		return linux_cpu_used_time;
	}
	public void setLinux_cpu_used_time(String linux_cpu_used_time) {
		this.linux_cpu_used_time = linux_cpu_used_time;
	}
	public String getLinux_flash_used_time() {
		return linux_flash_used_time;
	}
	public void setLinux_flash_used_time(String linux_flash_used_time) {
		this.linux_flash_used_time = linux_flash_used_time;
	}
	public String getLinux_memory_used_time() {
		return linux_memory_used_time;
	}
	public void setLinux_memory_used_time(String linux_memory_used_time) {
		this.linux_memory_used_time = linux_memory_used_time;
	}
	public String getLinux_wifi_signal_time() {
		return linux_wifi_signal_time;
	}
	public void setLinux_wifi_signal_time(String linux_wifi_signal_time) {
		this.linux_wifi_signal_time = linux_wifi_signal_time;
	}
	
	
}
