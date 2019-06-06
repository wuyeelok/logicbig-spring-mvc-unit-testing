package com.logicbig.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyMvcController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String prepareView(Model model) {
		model.addAttribute("msg", "Spring quick start!!");
		return "my-page";
	}

	@RequestMapping(value = "/esip/home", method = RequestMethod.GET)
	public String showCoverHomePage(ModelMap model, HttpServletRequest request) {
		model.addAttribute("springDispatcherURLPattern", "");
		model.addAttribute("junctionPath", "");

		return "esip/cover_home_page";
	}
}