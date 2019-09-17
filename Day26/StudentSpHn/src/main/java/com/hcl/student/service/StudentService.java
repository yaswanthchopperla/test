package com.hcl.student.service;

import java.util.List;

import com.hcl.student.model.Student;

public interface StudentService {
	public boolean addStudent(Student s);
	public List<Student> getAllStudents();
    public boolean updateStudent(Student s);
    public Student getStudent(int RollNum);
}
