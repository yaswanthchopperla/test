package com.hcl.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmploySearch {
         public static void main(String[] args) {
			int empno;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employ No :");
			empno=sc.nextInt();
			Configuration cfg=new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Query q=s.createQuery("from Employ WHERE Empno="+empno);
		    List<Employ> lst=q.list();
		    Employ e=lst.get(0);
		    if(e!=null) {
		    	System.out.println("Name is :" +e.getName());
		    	System.out.println("Dept is :" +e.getDept());
		    	System.out.println("Desig is :" +e.getDesig());
		    	System.out.println("Salary is :" +e.getBasic());
		    } else {
		    	System.out.println("Record Not Found");
		    	
		    }
         }
}
