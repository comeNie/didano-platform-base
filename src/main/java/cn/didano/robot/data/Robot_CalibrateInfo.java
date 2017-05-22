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
@TypeAlias("体重校准")
public class Robot_CalibrateInfo extends RInfo {
	
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "自动零点校准值", required = true)
	private String calibrate_zero_weight;
	@ApiModelProperty(value = "标准体重校准值", required = true)
	private String calibrate_standard_weight;
	@ApiModelProperty(value = "标准体重下秤原始值", required = true)
	private String calibrate_raw_weight;
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getCalibrate_zero_weight() {
		return calibrate_zero_weight;
	}
	public void setCalibrate_zero_weight(String calibrate_zero_weight) {
		this.calibrate_zero_weight = calibrate_zero_weight;
	}
	public String getCalibrate_standard_weight() {
		return calibrate_standard_weight;
	}
	public void setCalibrate_standard_weight(String calibrate_standard_weight) {
		this.calibrate_standard_weight = calibrate_standard_weight;
	}
	public String getCalibrate_raw_weight() {
		return calibrate_raw_weight;
	}
	public void setCalibrate_raw_weight(String calibrate_raw_weight) {
		this.calibrate_raw_weight = calibrate_raw_weight;
	}
	@Override
	public String toString() {
		return "Robot_CalibrateInfo [deviceNo=" + deviceNo + ", calibrate_zero_weight=" + calibrate_zero_weight
				+ ", calibrate_standard_weight=" + calibrate_standard_weight + ", calibrate_raw_weight="
				+ calibrate_raw_weight + "]";
	}
}
