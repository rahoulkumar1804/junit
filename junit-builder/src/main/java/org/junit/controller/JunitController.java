package org.junit.controller;

import org.junit.pojo.InputFields;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JunitController {

	
	
	@RequestMapping("/JunitHandler")
	public ModelAndView getInputPage() {
		
		return new ModelAndView("inputPage","command", new InputFields());
		
	}
	
	@RequestMapping("/getJunit")
	public ModelAndView getJunit() {
		
		return null;
		
	}
}
