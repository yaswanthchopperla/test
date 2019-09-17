package com.hcl.lambda;
@FunctionalInterface
public interface MultipleMethodsI {
     public String sayHello(String name);
     public static int add(int num1,int num2){
    	 return num1+num2;
     }
     //redeclaration of the equals() method in the object class
     boolean equals(Object obj);
     
     default public int defaultMethod(int var){
    	 return var+100;
     }
}
