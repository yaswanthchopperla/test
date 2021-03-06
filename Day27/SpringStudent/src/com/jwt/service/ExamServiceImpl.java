package com.jwt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.dao.ExamDAO;
import com.jwt.model.Exam;
import com.jwt.model.Student;

@Service
@Transactional
public class ExamServiceImpl implements ExamService{
	
	@Autowired
	private ExamDAO ExamDAO;
	
	@Override
	@Transactional
	public void addSubMarks(Exam exam) {
		ExamDAO.addSubMarks(exam);
	}

	@Override
	@Transactional
	public Exam updateSubMarks(Exam exam) {
		return ExamDAO.updateSubMarks(exam);
	}

	@Override
	@Transactional
	public List<Exam> getAllSubMarks(int id) {
		return ExamDAO.getAllSubMarks(id);
	}
	@Override
	public void deleteSubject(int studentid) {
		ExamDAO.deleteSubject(studentid);		
	}

	@Override
	public Exam getSubject(int studentid) {
		return ExamDAO.getSubject(studentid);

	}

	
}
