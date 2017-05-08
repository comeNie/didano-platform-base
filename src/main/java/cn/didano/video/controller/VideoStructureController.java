package cn.didano.video.controller;
/*
 * Copyright 2012-2016 the original author or authors.
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


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * @author Rob Winch
 * @author Doo-Hwan Kwak
 */
@Controller
@RequestMapping("/video")
public class VideoStructureController {


	@GetMapping
	public ModelAndView welcome() {
		return new ModelAndView("video/right/welcome");
	}
	
	@GetMapping("show_videos")
	public ModelAndView show_videos() {
		return new ModelAndView("video/right/show_videos");
	}
	
	@GetMapping("showgoods")
	public ModelAndView showgoods() {
		return new ModelAndView("video/right/showgoods");
	}
	
	@GetMapping("paymentAuthorization")
	public ModelAndView paymentAuthorization() {
		return new ModelAndView("video/right/paymentAuthorization");
	}
	
	@GetMapping("test_websocket")
	public ModelAndView test_websocket() {
		return new ModelAndView("video/right/test_websocket");
	}
	
	@GetMapping("haode")
	public ModelAndView haode() {
		return new ModelAndView("video/right/haode");
	}
	@GetMapping("selfLnspectionInfo")
	public ModelAndView selfLnspectionInfo() {
		return new ModelAndView("video/robot/selfLnspectionInfo");
	}
	//机器人的版本信息
	
	@GetMapping("versionInfo")
	public ModelAndView versionInfo() {
		return new ModelAndView("video/robot/versionInfo");
	}
	
	@GetMapping("hardwareInfo")
	public ModelAndView hardwareInfo() {
		return new ModelAndView("video/robot/hardwareInfo");
	}
	@GetMapping("temperatureInfo")
	public ModelAndView temperatureInfo() {
		return new ModelAndView("video/robot/temperatureInfo");
	}
	@GetMapping("meetSpeedInfo")
	public ModelAndView meetSpeedInfo() {
		return new ModelAndView("video/robot/meetSpeedInfo");
	}
	@GetMapping("meetPropertyInfo")
	public ModelAndView meetPropertyInfo() {
		return new ModelAndView("video/robot/meetPropertyInfo");
	}
	@GetMapping("onLineInfo")
	public ModelAndView onLineInfo() {
		return new ModelAndView("video/robot/onLineInfo");
	}
	@GetMapping("photographicQualityInfo")
	public ModelAndView photographicQualityInfo() {
		return new ModelAndView("video/robot/photographicQualityInfo");
	}
	@GetMapping("manageInfo")
	public ModelAndView manageInfo() {
		return new ModelAndView("video/robot/manageInfo");
	}
	@GetMapping("operationInfo")
	public ModelAndView operationInfo() {
		return new ModelAndView("video/robot/operationInfo");
	}
	@GetMapping("robotDown")
	public ModelAndView robotDown() {
		return new ModelAndView("video/robot/robotDown");
	}
}
