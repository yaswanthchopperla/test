package com.hcl.boxing;

public class ConDemo {
	static{
		System.out.println("static constructor");
	}

	
	
	public ConDemo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		new ConDemo();
	}

}
