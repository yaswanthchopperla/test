package com.hcl.MRef;

public class MethodRefernceStaticMain {
     public static void main(String[] args) {
		MethodRefernceStatic static1 = (a) -> {return "Welcome" + a;};
		System.out.println((static1.sayhello(22)));
		
		MethodRefernceStatic static2 =MethodRefernceStatic :: someMethod;
		System.out.println(static2.sayhello(33));
	}
}
