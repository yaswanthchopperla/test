package com.hcl.dept;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DeptShow {
     public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department");
		List<Department> lst=q.list();
		for (Department d : lst) {
			System.out.println("Dept No :" +d.getDeptno());
			System.out.println("Dept Name :"+d.getDname());
			System.out.println("Location :"+d.getLoc());
			System.out.println("Head :"+d.getHead());
			System.out.println("-------------------");
		}
	}
}
