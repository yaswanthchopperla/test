package com.hcl.dept;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DeptDelete {
	 public static void main(String[] args) {
			int deptno;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Deptno :");
			deptno=sc.nextInt();
			Configuration cfg=new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Department d=new Department();
			d.setDeptno(deptno);
			 Transaction t=s.beginTransaction();
			   s.delete(d);
			   t.commit(); 
			   System.out.println("Recorded Delete");
	 }
}
