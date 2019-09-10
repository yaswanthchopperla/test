package com.hcl.ant;

import java.util.Iterator;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg {
     public static void main(String[] args) {
		EmployInsert ei=new EmployInsert();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ Name :");
		ei.setName(sc.nextLine());
		System.out.println("Enter Employ dept :");
		ei.setDept(sc.nextLine());
		System.out.println("Enter Employ desig :");
		ei.setDesig(sc.nextLine());
		System.out.println("Enter Employ salary :");
		ei.setBasic(sc.nextLine());
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		int empno=0;
		Query q=s.createQuery("Select max(empno) from employ");
		for(Iterator it=q.iterate();it.hasNext();) {
			empno=(Integer)it.next();
		}
		empno++;
		System.out.println(empno);
		ei.setEmpno(sc.nextInt());
		Transaction t=s.beginTransaction();
		s.save(ei);
		t.commit();
		
	}
} 
