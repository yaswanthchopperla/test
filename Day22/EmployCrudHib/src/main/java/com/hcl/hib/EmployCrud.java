package com.hcl.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployCrud {
    public List<Employ> showEmploy() {
    	SessionFactory sf=HibernateUtil.getConnection();
    	Session s=sf.openSession();
    	Query q=s.createQuery("from Employ");
    	List<Employ> lst=q.list();
    	return lst;
    }
    public Employ searchEmploy(int empno) {
    	SessionFactory sf=HibernateUtil.getConnection();
    	Session s=sf.openSession();
      	Query q=s.createQuery("from Employ where empno="+empno);
      	List<Employ> lst=q.list();
      	Employ e=null;
      	if(lst.size()!=0) {
      		e=lst.get(0);
      	}
    	return e;
    }
   public String insertEmploy(Employ employ) {
	   SessionFactory sf=HibernateUtil.getConnection();
	   Session s=sf.openSession();
	   Transaction t=s.beginTransaction();
	   s.save(employ);
	   t.commit();
	   return "Record Inserted";
   }
   public String updateEmploy(Employ employ) {
	   Employ res=searchEmploy(employ.getEmpno());
	   res.setName(employ.getName());
	   res.setDept(employ.getDept());
	   res.setDesig(employ.getDesig());
	   res.setBasic(employ.getBasic());
	   SessionFactory sf=HibernateUtil.getConnection();
	   Session s=sf.openSession();
	   Transaction t=s.beginTransaction();
	   s.update(res);
	   t.commit();
	   return "Record Updated";
   }
   public String deleteEmploy(int empno) {
	   Employ res=searchEmploy(empno);
	   SessionFactory sf=HibernateUtil.getConnection();
	   Session s=sf.openSession();
	   Transaction t=s.beginTransaction();
	   s.delete(res);
	   t.commit();
	   return "Record Deleted";
   }
}
