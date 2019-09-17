package com.hcl.MRef;

public class InstanceMain {
   public static void main(String[] args) {
	InstanceInterface i1=() -> {System.out.println(11);};
      i1.myInterface();
      
    InstanceMethodReference i2=new InstanceMethodReference();
    InstanceInterface i3=i2 :: saySomething;
    i3.myInterface();
   }
}
