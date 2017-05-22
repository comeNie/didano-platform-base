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
 *linux的重启信息
 *主要是上行和下行的信息容器
 */
@ApiModel
@TypeAlias("linux的重启信息")
public class Robot_LinuxStartUpRecord extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "上次启动的时间", required = true)
	private String poweroff_time;
	@ApiModelProperty(value = "本次启动的时间", required = true)
	private String startup_time;
	@ApiModelProperty(value = "启动的原因", required = true)
	private String startup_reason;
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getPoweroff_time() {
		return poweroff_time;
	}
	public void setPoweroff_time(String poweroff_time) {
		this.poweroff_time = poweroff_time;
	}
	public String getStartup_time() {
		return startup_time;
	}
	public void setStartup_time(String startup_time) {
		this.startup_time = startup_time;
	}
	public String getStartup_reason() {
		return startup_reason;
	}
	public void setStartup_reason(String startup_reason) {
		this.startup_reason = startup_reason;
	}
	@Override
	public String toString() {
		return "Robot_SelfLnspectionInfo [deviceNo=" + deviceNo + ", poweroff_time=" + poweroff_time + ", startup_time="
				+ startup_time + ", startup_reason=" + startup_reason + "]";
	}
}
