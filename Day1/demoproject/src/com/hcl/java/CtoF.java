package com.hcl.java;

public class CtoF {
	public void calc(double c){
		double f;
		f=((9*c)/5)+32;
		System.out.println("f is"+f);
	}

	public static void main(String[] args) {
	double c=37;
	CtoF obj=new CtoF();
	obj.calc(c);

	}

}
