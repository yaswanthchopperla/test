package com.hcl.java;

public class posNeg {
	public void check(int a){
		if(a>=0){
			System.out.println("number is positive");
		}else{
			System.out.println("number is negative");
		}
	}
	public static void main(String[] args) {
		int a=2;
		posNeg obj=new posNeg();
		obj.check(a);
	}
}
