package com.hcl.calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
     public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Calc.xml");
		Calc c=(Calc)ctx.getBean("bean1");
		System.out.println("sum is"+c.sum());
		System.out.println("sub is"+c.sub());
		System.out.println("mult is"+c.mult());
	}
}
