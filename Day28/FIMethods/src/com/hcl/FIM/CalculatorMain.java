package com.hcl.FIM;

public class CalculatorMain {
   public static void main(String[] args) {
	Calculator c=new Calculator();
	Integer ans=c.calc((x,y)->x*y,10,5);
	System.out.println(ans);
}
}
