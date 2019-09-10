package com.hcl.inh;
class Full{
	static {
		System.out.println("base class static");
	}
	public Full(){
		System.out.println("base class con");
	}
}
class Second extends Full{
	static{
		System.out.println("derived class");
	}
	public Second(){
		System.out.println("derived class");
	}
}
public class First{
	public static void main(String[] args) {
		new Second();

	}

}
