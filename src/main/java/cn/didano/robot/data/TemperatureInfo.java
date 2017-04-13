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
 * @类名称：TemperatureInfo
 * @类描述：上报环境温度信息 
 * @创建人：杨朝强
 * @创建时间：2017年3月17日 下午3:38:14：
 * @version
 */
@ApiModel
public class TemperatureInfo extends RInfo {

	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "环境温度", required = true)
	private String environmentTemperature;
	@ApiModelProperty(value = "CPU温度", required = true)
	private String cPUTemperature;
	
	public String getEnvironmentTemperature() {
		return environmentTemperature;
	}

	public void setEnvironmentTemperature(String environmentTemperature) {
		this.environmentTemperature = environmentTemperature;
	}

	
	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getcPUTemperature() {
		return cPUTemperature;
	}

	public void setcPUTemperature(String cPUTemperature) {
		this.cPUTemperature = cPUTemperature;
	}

	public TemperatureInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TemperatureInfo(String deviceNo, String environmentTemperature, String cPUTemperature) {
		super();
		this.deviceNo = deviceNo;
		this.environmentTemperature = environmentTemperature;
		this.cPUTemperature = cPUTemperature;
	}

	@Override
	public String toString() {
		return "{\"deviceNo\":\"" + deviceNo + "\",\"environmentTemperature\":\"" + environmentTemperature
				+ "\",\"cPUTemperature\":\"" + cPUTemperature + "\"}  ";
	}
	
}
