package com.hcl.java;

public class CalcDemo {
	public void Calc(int a,int b){
		int c=a+b;
		System.out.println("sum is "+c);
	}
	public static void main(String[] args) {
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		CalcDemo obj=new CalcDemo();
		obj.Calc(a,b);
	}

}
