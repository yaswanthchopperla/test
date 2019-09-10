package com.hcl.java;

public class ctok {
	public void calc(double c){
	double k;
	k=273.15+c;
	System.out.println("k is"+k);
	}
	public static void main(String[] args) {
		int c=37;
		ctok obj=new ctok();
		obj.calc(c);
		

	}

}
