package com.hcl.lambda;

public class WithoutLambdaExp  {

	public static void main(String[] args) {
		MyInterface my=new MyInterface() {
			
			@Override
			public void sayMessage() {
                   System.out.println("Welcome to my interface");				
			}
		};
		my.sayMessage();
	}
	

}
