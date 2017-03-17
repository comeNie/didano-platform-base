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
 * @类描述：硬件信息（将两个摄像头分开） @创建人：杨朝强
 * @创建时间：2017年3月17日 下午3:38:14：
 * @version
 */
@ApiModel
public class TemperatureInfo extends RInfo {

	@ApiModelProperty(value = "环境温度", required = true)
	private String environmentTemperature;
	@ApiModelProperty(value = "CPU温度", required = true)
	private String CPUTemperature;

	public String getEnvironmentTemperature() {
		return environmentTemperature;
	}

	public void setEnvironmentTemperature(String environmentTemperature) {
		this.environmentTemperature = environmentTemperature;
	}

	public String getCPUTemperature() {
		return CPUTemperature;
	}

	public void setCPUTemperature(String cPUTemperature) {
		CPUTemperature = cPUTemperature;
	}

	/**
	 * 
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	public TemperatureInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TemperatureInfo(String environmentTemperature, String cPUTemperature) {
		super();
		this.environmentTemperature = environmentTemperature;
		CPUTemperature = cPUTemperature;
	}

	@Override
	public String toString() {
		return "TemperatureInfo [environmentTemperature=" + environmentTemperature + ", CPUTemperature="
				+ CPUTemperature + "]";
	}
}
