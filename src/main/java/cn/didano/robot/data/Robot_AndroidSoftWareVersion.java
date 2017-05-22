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
@TypeAlias("安卓的版本信息")
public class Robot_AndroidSoftWareVersion extends RInfo {
	
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "Android程序版本号", required = true)
	private String andriod_version_software;
	@ApiModelProperty(value = "Andriod系统版本号", required = true)
	private String andriod_version_system;
	@ApiModelProperty(value = "Andriod内核版本号", required = true)
	private String andriod_version_kernel;
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	@Override
	public String toString() {
		return "Robot_AndroidSoftWareVersion [deviceNo=" + deviceNo + ", andriod_version_software="
				+ andriod_version_software + ", andriod_version_system=" + andriod_version_system
				+ ", andriod_version_kernel=" + andriod_version_kernel + "]";
	}
	public String getAndriod_version_software() {
		return andriod_version_software;
	}
	public void setAndriod_version_software(String andriod_version_software) {
		this.andriod_version_software = andriod_version_software;
	}
	public String getAndriod_version_system() {
		return andriod_version_system;
	}
	public void setAndriod_version_system(String andriod_version_system) {
		this.andriod_version_system = andriod_version_system;
	}
	public String getAndriod_version_kernel() {
		return andriod_version_kernel;
	}
	public void setAndriod_version_kernel(String andriod_version_kernel) {
		this.andriod_version_kernel = andriod_version_kernel;
	}
}
