package com.hcl.ant;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import org.hibernate.cfg.Configuration;

public class MainProg {
     public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Dept");
		List<Dept> lst=q.list();
		for (Object dept : lst) {
			Dept d=(Dept)dept;
			System.out.println("Dept No :" +d.getDeptno());
			System.out.println("Dept name :" +d.getDname());
			System.out.println("Dept Loc :" +d.getLoc());
		    System.out.println("Dept Head :" +d.getHead());
		    System.out.println();
		}
	}
}
