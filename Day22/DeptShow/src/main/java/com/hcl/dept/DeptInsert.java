package com.hcl.dept;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DeptInsert {
     public static void main(String[] args) {
		Department d=new Department();
		d.setDeptno(654);
		d.setDname("hibernate");
		d.setLoc("chennai");
		d.setHead("Daniel");
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(d);
		t.commit();
		System.out.println("Record Inserted...");
	}
	}

