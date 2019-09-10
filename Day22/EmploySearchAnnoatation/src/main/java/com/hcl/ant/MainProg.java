package com.hcl.ant;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg {
   public static void main(String[] args) {
	int empno;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employ No :");
	empno=sc.nextInt();
	Configuration cfg=new AnnotationConfiguration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Query q=s.createQuery("from Employ where empno="+empno);
	List<Employ> lst=q.list();
	for (Object em : lst) {
		Employ e=(Employ)em;
		System.out.println("Employ no..." + e.getEmpno());
		System.out.println("Employ name..." + e.getName());
		System.out.println("Employ dept..." + e.getDept());
		System.out.println("Employ desig..." + e.getDesig());
		System.out.println("Employ salary.." + e.getBasic());
		System.out.println();
		
	}
	}
}
