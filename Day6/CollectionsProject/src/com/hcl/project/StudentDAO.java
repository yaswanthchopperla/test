package com.hcl.project;

import java.util.ArrayList;

import java.util.List;
import java.util.ResourceBundle;

public class StudentDAO {
	static List<Student> lststudent=null;
	static {
		lststudent=new ArrayList<Student>();
	}
	public String addStudentDao(Student student){
		//ResourceBundle rb=ResourceBundle.getBundle("project");
		lststudent.add(student);
		//return rb.getString("added");
		return "student created successfully";
	}
	public Student searchStudentDao(int sno){
		Student objStudent=null;
		for (Student student : lststudent) {
			if(student.getSno()==sno){
				objStudent=student;
			}
		}
		return objStudent;		
	}
	public List<Student> showsStudent(){
		return lststudent;
	}
	public String updateStudentDao(Student objStudent){
		Student student=searchStudentDao(objStudent.getSno());
		if(student!=null){
			for (Student  s : lststudent) {
				if(s.getSno()==objStudent.getSno()){
				  s.setName(objStudent.getName());
				  s.setCity(objStudent.getCity());
				  s.setCgp(objStudent.getCgp());
			   }
		   }
		return "record updated";
	}else {
		return "student not found";
    }
}
	public String deleteStudentDao(int sno){
		Student student=searchStudentDao(sno);
		if(student!=null){
			lststudent.remove(student);
			return "student removed";
		}else {
			return "student not found";
		}	
	}
}
