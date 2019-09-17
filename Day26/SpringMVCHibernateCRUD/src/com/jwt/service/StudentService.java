package com.jwt.service;

import java.util.List;

import com.jwt.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);

	public List<Student> getAllStudents();

	public void deleteStudent(Integer RollNum);

	public Student getStudent(int RollNum);

	public Student updateStudent(Student student);
}
