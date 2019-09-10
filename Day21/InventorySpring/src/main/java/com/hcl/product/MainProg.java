package com.hcl.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
   public static void main(String[] args) {
   ApplicationContext ctx= new ClassPathXmlApplicationContext("Product.xml");
   Logic l=(Logic)ctx.getBean("logic");
   l.display();
}
}
