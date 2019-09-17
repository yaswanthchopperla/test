package com.hcl.lambda;

public class MultipleMethods  {
   public static void main(String[] args) {
	   String res="yaswanth";
	   MultipleMethodsI mi=(res1)->{System.out.println(res);return res;};
	   mi.sayHello(res);
	  
	   System.out.println(MultipleMethodsI.add(13, 45));
	   
	   System.out.println(mi.defaultMethod(45));
	   
	   MultipleMethodsI myinterface1 =(name) ->(name);
	   System.out.println(myinterface1.sayHello("yaswanth"));
	   
	    System.out.println(myinterface1.equals(mi.sayHello(res)));
	   
	   
   
   }
}
