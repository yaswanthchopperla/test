package com.hcl.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.student.dao.StudentDao;
import com.hcl.student.model.Student;
@Service
public class StudentServiceImpl implements StudentService {
  @Autowired
  StudentDao dao;
	public boolean addStudent(Student s) {
		return dao.addStudent(s);
	}

	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	public Student getStudent(int RollNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return dao.getAllStudents();
	}

}
