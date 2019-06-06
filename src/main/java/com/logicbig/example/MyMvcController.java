package com.logicbig.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hk.gov.ogcio.esip.service.ConfigUtilService;

@Controller
public class MyMvcController {

	@Autowired
	ConfigUtilService configUtilService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String prepareView(Model model) {
		model.addAttribute("msg", "Spring quick start!!");
		return "my-page";
	}

	@RequestMapping(value = "/esip/home", method = RequestMethod.GET)
	public String showCoverHomePage(ModelMap model, HttpServletRequest request) {
		model.addAttribute("springDispatcherURLPattern", configUtilService.getSpringDispatcherURLPattern());
		model.addAttribute("junctionPath", configUtilService.getJunctionPath());

		return "esip/cover_home_page";
	}
}