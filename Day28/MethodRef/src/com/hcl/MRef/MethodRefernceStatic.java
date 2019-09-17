package com.hcl.MRef;

public interface MethodRefernceStatic {
   public String sayhello(Integer str);
   public static String someMethod(Integer num) {
	   return "Welcome static :" + num;
   }
}
