package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {
     public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		List<Employ> lst=q.list();
		for (Employ employ : lst) {
			System.out.println("Empno :" +employ.getEmpno());
			System.out.println("Employ Name :" +employ.getName());
			System.out.println("Department :" +employ.getDept());
			System.out.println("Designation :" +employ.getDesig());
			System.out.println("Salary :" + employ.getBasic());
			System.out.println("-------------------------------");
		}
				
	}
}
