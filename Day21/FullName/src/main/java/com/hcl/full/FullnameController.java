package com.hcl.full;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FullnameController {
@RequestMapping("/fullname")
public ModelAndView fullname(HttpServletRequest req ,HttpServletResponse res) {
	String firstname=req.getParameter("firstname");
	String secondname=req.getParameter("secondname");
	String fullname=firstname+secondname;
	String result="";
	result+=fullname;
	return new ModelAndView("result","fullname",result);
}
}
