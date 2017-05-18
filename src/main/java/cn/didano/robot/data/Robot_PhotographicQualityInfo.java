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
 * 照片的质量信息类
 * @Todo 
 */
@ApiModel
@TypeAlias("照片质量")
public class Robot_PhotographicQualityInfo extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "平均的信心指数", required = true)
	private String confidence_statistics_max;
	@ApiModelProperty(value = "最大信心指数", required = true)
	private String confidence_statistics_average;
	@ApiModelProperty(value = "最小信心指数", required = true)
	private String confidence_statistics_min;
	//m_webSocket.sendTextMessage(QStringLiteral("{\"methodName\":\"reportPhotographicQualityInfo\",\"info\":{\"deviceNo\":\"2sf21\",\"acerageConfidenceIndex\":\"你是我的眼\",\"maximumConfidenceInfo\":\"3.2\",\"minimumConfidenceInfo\":\"5.1\"}}"));
	
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getConfidence_statistics_max() {
		return confidence_statistics_max;
	}
	public void setConfidence_statistics_max(String confidence_statistics_max) {
		this.confidence_statistics_max = confidence_statistics_max;
	}
	public String getConfidence_statistics_average() {
		return confidence_statistics_average;
	}
	public void setConfidence_statistics_average(String confidence_statistics_average) {
		this.confidence_statistics_average = confidence_statistics_average;
	}
	public String getConfidence_statistics_min() {
		return confidence_statistics_min;
	}
	public void setConfidence_statistics_min(String confidence_statistics_min) {
		this.confidence_statistics_min = confidence_statistics_min;
	}
	
}
