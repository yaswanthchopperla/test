package com.jwt.dao;

import java.util.List;

import com.jwt.model.Exam;
import com.jwt.model.Student;

public interface ExamDAO {
	
	public void addSubMarks(Exam exam);
	
	public Exam updateSubMarks(Exam exam);
	
	public List<Exam> getAllSubMarks(int id);
	
	public void deleteSubject(int studentid);
	
	public Exam getSubject(int studentid);
	
	//public void getAvgMarks(int studentid);
	
	
}
