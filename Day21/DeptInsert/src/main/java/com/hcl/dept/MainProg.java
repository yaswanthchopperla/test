package com.hcl.dept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DeptInsertDao i=(DeptInsertDao)ctx.getBean("myDao");
		i.insertDept();
		System.out.println("Record inserted...");
	}
}


