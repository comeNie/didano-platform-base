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
@TypeAlias("识别")
public class Robot_FinalRecogResult extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "本次识别场景", required = true)
	private String recognition_result_scene;
	@ApiModelProperty(value = "最终候选人ID", required = true)
	private String recognition_result_id;
	@ApiModelProperty(value = "选择该ID的原因", required = true)
	private String recognition_result_reason;
	
	@ApiModelProperty(value = "本次识别耗时", required = true)
	private String recognition_result_time_consumed_ms;

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getRecognition_result_scene() {
		return recognition_result_scene;
	}

	public void setRecognition_result_scene(String recognition_result_scene) {
		this.recognition_result_scene = recognition_result_scene;
	}

	public String getRecognition_result_id() {
		return recognition_result_id;
	}

	public void setRecognition_result_id(String recognition_result_id) {
		this.recognition_result_id = recognition_result_id;
	}

	public String getRecognition_result_reason() {
		return recognition_result_reason;
	}

	public void setRecognition_result_reason(String recognition_result_reason) {
		this.recognition_result_reason = recognition_result_reason;
	}

	public String getRecognition_result_time_consumed_ms() {
		return recognition_result_time_consumed_ms;
	}

	public void setRecognition_result_time_consumed_ms(String recognition_result_time_consumed_ms) {
		this.recognition_result_time_consumed_ms = recognition_result_time_consumed_ms;
	}

	@Override
	public String toString() {
		return "Robot_FinalRecogResult [deviceNo=" + deviceNo + ", recognition_result_scene=" + recognition_result_scene
				+ ", recognition_result_id=" + recognition_result_id + ", recognition_result_reason="
				+ recognition_result_reason + ", recognition_result_time_consumed_ms="
				+ recognition_result_time_consumed_ms + "]";
	}
}
