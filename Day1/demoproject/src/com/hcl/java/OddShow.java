package com.hcl.java;

public class OddShow {
	public void show(int n){
		int i=1;
		while(i<n){
			i=i+2;
			System.out.println("even"+i);
		}
	}

	public static void main(String[] args) {
		int n=7;
		OddShow obj=new OddShow();
		obj.show(n);
		

	}

}
