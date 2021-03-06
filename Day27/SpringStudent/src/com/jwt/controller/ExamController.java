package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Exam;
import com.jwt.model.Student;
import com.jwt.service.ExamService;
@Controller
public class ExamController {
	
	@Autowired
	private ExamService ExamService;
	
	@RequestMapping(value = "/addSubMarks", method = RequestMethod.GET)
	public ModelAndView newContact1(ModelAndView model,HttpServletRequest req) {
		Exam exam = new Exam();
		exam.setStudentid(Integer.parseInt(req.getParameter("id")));
		model.addObject("exam", exam);
		model.setViewName("ExamForm");
		return model;
	}
	
	@RequestMapping(value = "/saveSubMarks", method = RequestMethod.POST)
	public ModelAndView saveSubMarks(@ModelAttribute Exam exam) {
		if (exam.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			ExamService.addSubMarks(exam);
		} else {
			ExamService.updateSubMarks(exam);
		}
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/MarksList")
	public ModelAndView listSubMarks(ModelAndView model,int id) throws IOException {
		List<Exam> listSubMarks = ExamService.getAllSubMarks(id);
		model.addObject("listSubMarks", listSubMarks);
		model.setViewName("home1");
		return model;
	}
	
	@RequestMapping(value = "/deleteSubject", method = RequestMethod.GET)
	public ModelAndView deleteStudent(HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));
	    ExamService.deleteSubject(studentId);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/editSubject", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));
		Exam exam = ExamService.getSubject(studentId);
		ModelAndView model = new ModelAndView("ExamForm");
		model.addObject("exam", exam);

		return model;
	}
}
