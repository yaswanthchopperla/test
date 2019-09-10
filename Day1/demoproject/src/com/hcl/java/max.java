package com.hcl.java;

public class max {
	public void check(int a,int b,int c){
		if(a>b&&a>c){
			System.out.println("max is a");
		}else if(b>c){
			System.out.println("max is b");}
			else{
				System.out.println("max is c");
			}			
	}
public static void main(String[] args) {
	int a=2,b=2,c=4;
	max obj=new max();
	obj.check(a,b,c);
	
	
}
}
