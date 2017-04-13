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
 * 照片的质量信息类
 * @Todo 
 */
@ApiModel
public class PhotographicQualityInfo extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "平均的信心指数", required = true)
	private String acerageConfidenceIndex;
	@ApiModelProperty(value = "最大信心指数", required = true)
	private String maximumConfidenceInfo;
	@ApiModelProperty(value = "最小信心指数", required = true)
	private String minimumConfidenceInfo;
	//m_webSocket.sendTextMessage(QStringLiteral("{\"methodName\":\"reportPhotographicQualityInfo\",\"info\":{\"deviceNo\":\"2sf21\",\"acerageConfidenceIndex\":\"你是我的眼\",\"maximumConfidenceInfo\":\"3.2\",\"minimumConfidenceInfo\":\"5.1\"}}"));

	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getAcerageConfidenceIndex() {
		return acerageConfidenceIndex;
	}
	public void setAcerageConfidenceIndex(String acerageConfidenceIndex) {
		this.acerageConfidenceIndex = acerageConfidenceIndex;
	}
	public String getMaximumConfidenceInfo() {
		return maximumConfidenceInfo;
	}
	public void setMaximumConfidenceInfo(String maximumConfidenceInfo) {
		this.maximumConfidenceInfo = maximumConfidenceInfo;
	}
	public String getMinimumConfidenceInfo() {
		return minimumConfidenceInfo;
	}
	public void setMinimumConfidenceInfo(String minimumConfidenceInfo) {
		this.minimumConfidenceInfo = minimumConfidenceInfo;
	}
	@Override
	public String toString() {
		return "{\"deviceNo\":\"" + deviceNo + "\",\"acerageConfidenceIndex\":\"" + acerageConfidenceIndex
				+ "\",\"maximumConfidenceInfo\":\"" + maximumConfidenceInfo + "\",\"minimumConfidenceInfo\":\""
				+ minimumConfidenceInfo + "\"}  ";
	}
}
