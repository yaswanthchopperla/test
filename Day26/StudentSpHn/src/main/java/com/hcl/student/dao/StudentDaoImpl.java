package com.hcl.student.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hcl.student.model.Student;

public class StudentDaoImpl implements StudentDao {

	public boolean addStudent(Student s) {
		SessionFactory sf=HibernateUtil.getConnection();
		Session se=sf.openSession();
		if(s!=null){
		Transaction t=se.beginTransaction();
		se.save(s);
		t.commit();
		return true;
		} else {
			return false;
		}
	}

	public boolean updateStudent(Student s) {
		SessionFactory sf=HibernateUtil.getConnection();
		Session se=sf.openSession();
		Query q=se.createQuery("from student where RollNum="+s.getRollNum());
		List<Student> lst=q.list();
		if(lst!=null){
		Transaction t=se.beginTransaction();
		se.update(s);
		t.commit();
		return true;
		} else {
			return false;
		}
	}

	public Student getStudent(int RollNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getAllStudents() {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Student");
		List<Student> lst=q.list();
		return lst;
	}
   
}
