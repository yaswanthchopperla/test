package com.hcl.boxing;

public class Quiz {
	public void show(Object x){
		System.out.println("object "+x);
	}
		public void show(double x){
			System.out.println("double"+x);	
	}

	public static void main(String[] args) {
		new Quiz().show("sai");
	}

}
