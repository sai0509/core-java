package com.hcl.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldsController {
	@RequestMapping("/hello")
	public ModelAndView helloWorlds() {
		return new ModelAndView("Result" , "message" , "Welcome to Springs topic");
	}
	
	@RequestMapping("/bhargav")
	public ModelAndView bhargav() {
		return new ModelAndView("Result" , "hai" , "By SAI");
	}
}
