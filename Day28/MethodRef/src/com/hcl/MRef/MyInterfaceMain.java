package com.hcl.MRef;

import java.util.function.Consumer;

public class MyInterfaceMain {
   public static void main(String[] args) {
	 MyInterface myinterface = (a) -> {System.out.println(a);};
	 myinterface.someMethod("HCL");
	 
	 MyInterface myinterface1 = System.out :: println;
	 myinterface1.someMethod("Java COE");
	 
	 Consumer<String> consumer=System.out :: println;
	 consumer.accept("BYE");
}
}
