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


@ApiModel
@TypeAlias("候选人信息")
public class Robot_CandidatesInfo extends RInfo {
	@ApiModelProperty(value = "产品硬件识别码", required = true)
	private String deviceNo;
	@ApiModelProperty(value = "候选人ID", required = true)
	private String candidates_id;
	@ApiModelProperty(value = "候选人相似度", required = true)
	private String candidates_score;
	@ApiModelProperty(value = "候选人照片", required = true)
	private String candidates_pic;
	
	@ApiModelProperty(value = "整张照片的亮度", required = true)
	private String candidates_whole_brightness;
	@ApiModelProperty(value = "人左脸亮度", required = true)
	private String candidates_lftface_brightness;
	
	@ApiModelProperty(value = "人右脸亮度", required = true)
	private String candidates_rgtface_brightness;
	@ApiModelProperty(value = "候选人身高与历史身高误差", required = true)
	private String candidates_height_diff;
	@ApiModelProperty(value = "候选人体重与历史体重误差", required = true)
	private String candidates_weight_diff;
	
	@ApiModelProperty(value = "候选人最终得分", required = true)
	private String candidates_final_score;

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getCandidates_id() {
		return candidates_id;
	}

	public void setCandidates_id(String candidates_id) {
		this.candidates_id = candidates_id;
	}

	public String getCandidates_score() {
		return candidates_score;
	}

	public void setCandidates_score(String candidates_score) {
		this.candidates_score = candidates_score;
	}

	public String getCandidates_pic() {
		return candidates_pic;
	}

	public void setCandidates_pic(String candidates_pic) {
		this.candidates_pic = candidates_pic;
	}

	public String getCandidates_whole_brightness() {
		return candidates_whole_brightness;
	}

	public void setCandidates_whole_brightness(String candidates_whole_brightness) {
		this.candidates_whole_brightness = candidates_whole_brightness;
	}

	public String getCandidates_lftface_brightness() {
		return candidates_lftface_brightness;
	}

	public void setCandidates_lftface_brightness(String candidates_lftface_brightness) {
		this.candidates_lftface_brightness = candidates_lftface_brightness;
	}

	public String getCandidates_rgtface_brightness() {
		return candidates_rgtface_brightness;
	}

	public void setCandidates_rgtface_brightness(String candidates_rgtface_brightness) {
		this.candidates_rgtface_brightness = candidates_rgtface_brightness;
	}

	public String getCandidates_height_diff() {
		return candidates_height_diff;
	}

	public void setCandidates_height_diff(String candidates_height_diff) {
		this.candidates_height_diff = candidates_height_diff;
	}

	public String getCandidates_weight_diff() {
		return candidates_weight_diff;
	}

	public void setCandidates_weight_diff(String candidates_weight_diff) {
		this.candidates_weight_diff = candidates_weight_diff;
	}

	public String getCandidates_final_score() {
		return candidates_final_score;
	}

	public void setCandidates_final_score(String candidates_final_score) {
		this.candidates_final_score = candidates_final_score;
	}

	@Override
	public String toString() {
		return "Robot_CandidatesInfo [deviceNo=" + deviceNo + ", candidates_id=" + candidates_id + ", candidates_score="
				+ candidates_score + ", candidates_pic=" + candidates_pic + ", candidates_whole_brightness="
				+ candidates_whole_brightness + ", candidates_lftface_brightness=" + candidates_lftface_brightness
				+ ", candidates_rgtface_brightness=" + candidates_rgtface_brightness + ", candidates_height_diff="
				+ candidates_height_diff + ", candidates_weight_diff=" + candidates_weight_diff
				+ ", candidates_final_score=" + candidates_final_score + "]";
	}
}
