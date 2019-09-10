package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeptCrud {
     public List<Dept> DeptShow() {
    	 SessionFactory sf=HibernateUtil.getConnection();
    	 Session s=sf.openSession();
    	 Query q=s.createQuery("from Dept");
    	 List<Dept> lst=q.list();
    	 return lst;
     }
     public Dept searchDept(int deptno) {
    	 SessionFactory sf=HibernateUtil.getConnection();
    	 Session s=sf.openSession();
    	 Query q=s.createQuery("from Dept where deptno="+deptno);
    	 List<Dept> lst=q.list();
    	 Dept d=null;
    	 if(lst.size()!=0) {
    		 d=lst.get(0);
    	 } 
    	 return d; 
     }
    public String insertDept(Dept dept) {
    	SessionFactory sf=HibernateUtil.getConnection();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	s.save(dept);
    	t.commit();
    	return "Record Inserted";
    }
    public String updateDept(Dept dept) {
    	Dept res=searchDept(dept.getDeptno());
    	res.setDeptno(dept.getDeptno());
    	res.setDname(dept.getDname());
    	res.setLoc(dept.getLoc());
    	res.setHead(dept.getHead());
    	SessionFactory sf=HibernateUtil.getConnection();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	s.update(dept);
    	t.commit();
    	return "Record Inserted";
    }
   public String deleteDept(int deptno) {
	   Dept res=searchDept(deptno);
	   SessionFactory sf=HibernateUtil.getConnection();
	   Session s=sf.openSession();
	   Transaction t=s.beginTransaction();
	   s.delete(res);
	   t.commit();
	   return "Record Deleted";
   }
}
