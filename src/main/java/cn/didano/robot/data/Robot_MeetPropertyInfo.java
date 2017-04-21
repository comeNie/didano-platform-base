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
 * 识别性能信息类
 */
@ApiModel
@TypeAlias("识别性能信息")
public class Robot_MeetPropertyInfo extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "园区注册人数", required = true)
	private String theRegistrationNumber;
	@ApiModelProperty(value = "当天检测人数", required = true)
	private String theNumberTest;
	@ApiModelProperty(value = "成功检测人数", required = true)
	private String successFulTestNumber;
	@ApiModelProperty(value = "识别人数", required = true)
	private String meetTheNumber;
	@ApiModelProperty(value = "重复识别人数", required = true)
	private String repeatIdentificationNumber;
	@ApiModelProperty(value = "接送人数", required = true)
	private String takeTheNumber;
	//m_webSocket.sendTextMessage(QStringLiteral("{\"methodName\":\"reportMeetPropertyInfo\",\"info\":{\"deviceNo\":\"2sf21\",\"theRegistrationNumber\":\"你是我的眼\",\"theNumberTest\":\"3.2\",\"successFulTestNumber\":\"5.1\",\"meetTheNumber\":\"3.2.44\",\"repeatIdentificationNumber\":\"2.3.8\",\"takeTheNumber\":\"6.3\"}}"));

	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getTheRegistrationNumber() {
		return theRegistrationNumber;
	}
	public void setTheRegistrationNumber(String theRegistrationNumber) {
		this.theRegistrationNumber = theRegistrationNumber;
	}
	public String getTheNumberTest() {
		return theNumberTest;
	}
	public void setTheNumberTest(String theNumberTest) {
		this.theNumberTest = theNumberTest;
	}
	public String getSuccessFulTestNumber() {
		return successFulTestNumber;
	}
	public void setSuccessFulTestNumber(String successFulTestNumber) {
		this.successFulTestNumber = successFulTestNumber;
	}
	public String getMeetTheNumber() {
		return meetTheNumber;
	}
	public void setMeetTheNumber(String meetTheNumber) {
		this.meetTheNumber = meetTheNumber;
	}
	public String getRepeatIdentificationNumber() {
		return repeatIdentificationNumber;
	}
	public void setRepeatIdentificationNumber(String repeatIdentificationNumber) {
		this.repeatIdentificationNumber = repeatIdentificationNumber;
	}
	public String getTakeTheNumber() {
		return takeTheNumber;
	}
	public void setTakeTheNumber(String takeTheNumber) {
		this.takeTheNumber = takeTheNumber;
	}
	@Override
	public String toString() {
		return "{\"deviceNo\":\"" + deviceNo + "\",\"theRegistrationNumber\":\"" + theRegistrationNumber
				+ "\",\"theNumberTest\":\"" + theNumberTest + "\",\"successFulTestNumber\":\"" + successFulTestNumber
				+ "\",\"meetTheNumber\":\"" + meetTheNumber + "\",\"repeatIdentificationNumber\":\""
				+ repeatIdentificationNumber + "\",\"takeTheNumber\":\"" + takeTheNumber + "\"}  ";
	}
}
