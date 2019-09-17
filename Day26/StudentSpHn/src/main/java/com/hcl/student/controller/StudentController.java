package com.hcl.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.student.model.Student;
import com.hcl.student.service.StudentService;


@Controller
public class StudentController {
	
   @Autowired
   private StudentService ss;
   //@RequestMapping(value = "/")
   
}
