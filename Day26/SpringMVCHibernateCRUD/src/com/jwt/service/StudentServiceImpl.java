package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.StudentDAO;
import com.jwt.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDao;

	@Override
	@Transactional
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	@Transactional
	public void deleteStudent(Integer RollNum) {
		studentDao.deleteStudent(RollNum);
	}

	public Student getStudent(int RollNum) {
		return studentDao.getStudent(RollNum);
	}

	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student);
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDao = studentDAO;
	}

}
