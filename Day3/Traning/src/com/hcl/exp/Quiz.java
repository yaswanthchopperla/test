package com.hcl.exp;

public class Quiz {
public static void main(String[] args) {
	int[] a=new int[]{12,3,4};
	try {
		a[6]=5/0;
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("array size is small");
	}
	catch(ArithmeticException e){
		System.out.println("divison is impossible");
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
