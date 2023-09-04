package com.learning.employe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/main")
public class MainController {

	@GetMapping("/")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView("ems");
		return mav;
	}
}
