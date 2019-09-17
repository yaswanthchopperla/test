package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Exam;
import com.jwt.model.Student;
@Repository
public class ExamDAOImpl implements ExamDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void addSubMarks(Exam exam) {
		sessionFactory.getCurrentSession().saveOrUpdate(exam);
	      double avg =  (double) sessionFactory.getCurrentSession().createQuery("select avg(mark) from Exam where studentid="+exam.getStudentid()).list().get(0);		
          Student st=(Student) sessionFactory.getCurrentSession().createQuery("from Student where id=" + exam.getStudentid()).list().get(0);
		  st.setFinalScore((float) avg);
		  sessionFactory.getCurrentSession().saveOrUpdate(st);
	}

	@Override
	public Exam updateSubMarks(Exam exam) {
		sessionFactory.getCurrentSession().update(exam);
		 double avg =  (double) sessionFactory.getCurrentSession().createQuery("select avg(mark) from Exam where studentid="+exam.getStudentid()).list().get(0);		
         Student st=(Student) sessionFactory.getCurrentSession().createQuery("from Student where id=" + exam.getStudentid()).list().get(0);
		  st.setFinalScore((float) avg);
		  sessionFactory.getCurrentSession().saveOrUpdate(st);
		return exam;
	}

	@Override
	public List<Exam> getAllSubMarks(int id) {
		return sessionFactory.getCurrentSession().createQuery("from Exam where studentid = " + id).list();
	}

	@Override
	public void deleteSubject(int studentid) {
		Exam exam = (Exam) sessionFactory.getCurrentSession().load(
			Exam.class, studentid);
		if (null != exam) {
			Exam e2=(Exam) sessionFactory.getCurrentSession().createQuery("from Exam where id="+ studentid).list().get(0);
			this.sessionFactory.getCurrentSession().delete(exam);
			 double avg =  (double) sessionFactory.getCurrentSession().createQuery("select avg(mark) from Exam where studentid="+e2.getStudentid()).list().get(0);		
	          Student st=(Student) sessionFactory.getCurrentSession().createQuery("from Student where id="+e2.getStudentid()).list().get(0);
			  st.setFinalScore((float) avg);
			  sessionFactory.getCurrentSession().saveOrUpdate(st);
		}
	}

	@Override
	public Exam getSubject(int studentid) {
		return (Exam) sessionFactory.getCurrentSession().get(
				Exam.class, studentid);		
	}
	
//   @Override
//   public void getAvgMarks(int studentid) {
//      double avg =  (double) sessionFactory.getCurrentSession().createQuery("select avg(mark) from exam where studentid="+studentid).list().get(0);		
//  }

	
	}
