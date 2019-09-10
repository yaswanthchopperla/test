package com.hcl.hib;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployInsert {

	public static void main(String[] args) {
		Employ e=new Employ();
		e.setEmpno(6777);
		e.setName("Sai");
		e.setDept("Java");
		e.setDesig("Prog");
		e.setBasic(96322);
		
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(e);
		t.commit();
		System.out.println("Record Inserted...");
	}
}
