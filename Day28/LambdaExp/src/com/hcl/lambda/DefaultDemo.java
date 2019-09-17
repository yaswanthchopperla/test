package com.hcl.lambda;

public interface DefaultDemo {
   default void hello() {
	   System.out.println("Hello");
   }
}
