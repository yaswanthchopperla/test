package com.hcl.exp;
/**
 * program to find exceptions.
 */

public class Custom {
  /**
  * custom class exceptions.
  * @param a passed.
  * @param b passed.
  * @throws.
  * @throws.
  */

  public void sum(int a,int b) throws NegativeException,NumberZeroException { 
    int c;
    boolean flag = true;
    if (a < 0 || b < 0) {  
      flag = false;
      throw new NegativeException("negative numbers not allowed");
    }
    if (a == 0 || b == 0) {  
      flag = false;
      throw new NumberZeroException(" numbers  are invalid");
    }
    if (flag == true) { 
      c = a + b;
      System.out.println(c);
    }
  }
  /**
  * main program.
  * @param args a,b.
  */
  
  public static void main(String[] args) { 
    int a = 5;
    int b = 12;
    try {
      new Custom().sum(a,b);
    } catch (NegativeException | NumberZeroException e) {  
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
