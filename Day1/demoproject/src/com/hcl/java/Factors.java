package com.hcl.java;

public class Factors {
	public void fact(int n){
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.println("factor"+i);
			}
		}
	}

	public static void main(String[] args) {
		int n=10;
		Factors obj=new Factors();
		obj.fact(n);
		
		

	}

}
