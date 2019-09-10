package com.hcl.college;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FeedbackCrud {
    public static String feedbackId(){
    	SessionFactory sf=HibernateUtil.getConnection();
    	Session s=sf.openSession();
    	Query q=s.createQuery("select max(fid)  from Feedback");
    	List<String> lst=q.list();
    	String fid="";
    	fid=lst.get(0);
    	if(lst==null) {
    		fid="C001";
    	} else {
    	//fid=f.getFid();
		int id=Integer.parseInt(fid.substring(1));
		id++;
		String formatted = String.format("%03d", id);
		fid = "C"+formatted;	
    }
    return fid;
    }
public static List<String> searchByInstructor() {
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	Query q=s.createQuery("select distinct instructor from Subjects");
	List<String> lst=q.list();
    return lst;
}
public static List<String> searchBySubjects(String instructor) {
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	Query q=s.createQuery("select distinct subject from Subjects where instructor='"+instructor+"'");
	List<String> lst=q.list();
	return lst;
	
}
public static String insertFeedback(Feedback obj) {
	  SessionFactory sf=HibernateUtil.getConnection();
	  Session s=sf.openSession();
	  Transaction t=s.beginTransaction();
	  s.save(obj);
	  t.commit();
	 return "Feedback Inserted";
}
public static void count(String instr,String subject){
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	Query q=s.createQuery("select fbvalue,count(*) from feedback where instructor='"+ instr +"'"+ " and subject='"+ subject+ "'" + " group by fbvalue");
	
}

}
