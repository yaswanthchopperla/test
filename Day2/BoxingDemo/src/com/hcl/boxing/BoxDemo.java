package com.hcl.boxing;

public class BoxDemo {

	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="hcl";
		
		//BOXING
		Object ob1=a;
		Object ob2=b;
		Object ob3=name;
		
		//UNBOXING
		int a1=(Integer)ob1;
		double b1=(double)ob2;
		String n1=(String)name;
		
		a1++;
		System.out.println("integer value is" +a1);
		System.out.println("double value is" + b1);
		System.out.println("string is "+ n1);
		
	}

}
