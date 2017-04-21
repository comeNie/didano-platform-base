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
 *机器的识别速度
 *主要是上行和下行的信息容器
 */
@ApiModel
@TypeAlias("识别速度")
public class Robot_MeetSpeedInfo extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "最大识别时间", required = true)
	private String maximumMeetTime;
	@ApiModelProperty(value = "最小识别时间", required = true)
	private String minimumMeetTime;
	@ApiModelProperty(value = "平均识别时间", required = true)
	private String vaerageMeetTime;
	
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getMaximumMeetTime() {
		return maximumMeetTime;
	}
	public void setMaximumMeetTime(String maximumMeetTime) {
		this.maximumMeetTime = maximumMeetTime;
	}
	public String getMinimumMeetTime() {
		return minimumMeetTime;
	}
	public void setMinimumMeetTime(String minimumMeetTime) {
		this.minimumMeetTime = minimumMeetTime;
	}
	public String getVaerageMeetTime() {
		return vaerageMeetTime;
	}
	public void setVaerageMeetTime(String vaerageMeetTime) {
		this.vaerageMeetTime = vaerageMeetTime;
	}
}
