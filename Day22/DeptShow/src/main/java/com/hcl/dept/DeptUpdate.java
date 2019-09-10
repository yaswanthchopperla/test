package com.hcl.dept;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DeptUpdate {
	 public static void main(String[] args) {
			int deptno;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Deptno :");
			deptno=sc.nextInt();
			Configuration cfg=new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Query q=s.createQuery("from Department WHERE deptno="+deptno);
			List<Department> lst=q.list();
			System.out.println(lst.size());
			Department d=lst.get(0);
			if(d!=null){
				d.setDname("SQL");
				   d.setLoc("Telangana");
				   d.setHead("Eswar");
				   Transaction t=s.beginTransaction();
				   t.commit();
				   System.out.println("Recorded Updated");
							
			} else {
				System.out.println("Record Not Found");
			}
			
			
		}
}
