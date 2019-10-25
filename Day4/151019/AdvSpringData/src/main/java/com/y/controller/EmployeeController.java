package com.y.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.y.Dao.EmployeeRepository;
import com.y.model.Employee;

@RestController
public class EmployeeController {
	int pages = 5;
	@Autowired
	EmployeeRepository employeeDao;

	@RequestMapping(value = "/")
	public ModelAndView getEmployee() {
		ModelAndView mv = new ModelAndView();
		List<Employee> lst=(List<Employee>) employeeDao.findAll();
		mv.addObject("pagesize",pages);
		mv.addObject("totalrecords",lst.size());
		mv.addObject("ListEmployee", employeeDao.findAll());
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAll/page/{pageno}")
	public ModelAndView getJavaContractors(@PathVariable("pageno")int pageno) {
		ModelAndView mv1=new ModelAndView();
		mv1.addObject("pagesize",pages);
		mv1.addObject("ListEmployee",(employeeDao.findAll(PageRequest.of(pageno,pages))).getContent());
		mv1.setViewName("home");
		return mv1;
	}
//	@RequestMapping("/displayjava")
//	public ModelAndView getJava() {
//		ModelAndView mv1=new ModelAndView();
//		mv1.addObject("ListEmployee",employeeDao.findByNameDept("sai", "java"));
//		mv1.setViewName("home");
//		return mv1;
//	}
//	
//	@RequestMapping("/displayjavaSalary")
//	public ModelAndView getJavaSalary() {
//		ModelAndView mv1=new ModelAndView();
//		mv1.addObject("ListEmployee",employeeDao.findByDeptDesigSalary("java","developer",40000));
//		mv1.setViewName("home");
//		return mv1;
//	}
//	
//	@RequestMapping("/displayjavaSalaryName")
//	public ModelAndView getJavaSalaryName() {
//		ModelAndView mv1=new ModelAndView();
//		mv1.addObject("ListEmployee",employeeDao.findByDeptDesigSalaryName("dotnet","programmer",40000,Sort.by("basic").descending()));
//		mv1.setViewName("home");
//		return mv1;
//	}
//	@RequestMapping("/displayAllSortByDesig")
//	public ModelAndView displayAllSortByDesig() {
//		ModelAndView mv1=new ModelAndView();
//		mv1.addObject("ListEmployee",employeeDao.findAll(Sort.by("desig")));
//		mv1.setViewName("home");
//		return mv1;
//	}
//	@RequestMapping("/displayAllSortByDesigDes")
//	public ModelAndView displayAllSortByDesigDes() {
//		ModelAndView mv1=new ModelAndView();
//		mv1.addObject("ListEmployee",employeeDao.findAll(Sort.by("desig").descending()));
//		mv1.setViewName("home");
//		return mv1;
//	}
//	@RequestMapping("/displayAllSortByDesigDeptDes")
//	public ModelAndView displayAllSortByDesigDesDept() {
//		ModelAndView mv1=new ModelAndView();
//		mv1.addObject("ListEmployee",employeeDao.findAll(Sort.by("desig").descending().and(Sort.by("basic").descending())));
//		mv1.setViewName("home");
//		return mv1;
//	}
//	@RequestMapping("/displayJavaSortBySalary")
//	public ModelAndView displayJavaSortByDept() {
//		ModelAndView mv1=new ModelAndView();
//		mv1.addObject("ListEmployee",(employeeDao.findByDept("java",Sort.by("basic").descending())));
//		mv1.setViewName("home");
//		return mv1;
//	}
	
}
