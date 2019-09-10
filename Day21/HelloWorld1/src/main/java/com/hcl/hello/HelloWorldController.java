package com.hcl.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
	public ModelAndView helloWorld() {
		return new ModelAndView("result","message","Welcome to Springs Class");
	}
    @RequestMapping("/yaswanth")
    public ModelAndView welcome() {
    	return new ModelAndView("result","message","Hi to all");
    }
}
