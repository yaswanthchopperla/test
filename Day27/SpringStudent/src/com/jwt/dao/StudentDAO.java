package com.jwt.dao;

import java.util.List;

import com.jwt.model.Exam;
import com.jwt.model.Student;

public interface StudentDAO {

	public void addStudent(Student student);

	public List<Student> getAllStudent();

	public void deleteStudent(Integer studentid);

	public Student updateStudent(Student student);

	public Student getStudent(int studentid);
	
   
}
