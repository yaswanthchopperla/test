package com.hcl.obj;

public class Demo {
    int x;
	public static void main(String[] args) {
	Demo obj1=new Demo();
	obj1.x=12;
	Demo obj2=obj1;
	obj2.x=13;
	System.out.println(obj1.x);
	System.out.println(obj1.hashCode());
	System.out.println(obj2.hashCode());
	

	}

}
