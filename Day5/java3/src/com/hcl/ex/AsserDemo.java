package com.hcl.ex;
/**
 * program to find salary increment using assertion.
 * @author yaswanth.
 *
 */

public class AsserDemo { 
  /**
  * main code.
  */
  public void incr() { 
    int basic = 30000;
    for (int i = 0; i < 8;i++) { 
      basic = basic + 4000;
      assert basic <  48000;
      System.out.println("salary" + basic);
    }
  }
  /**
  * main program.
  * @param args basic.
  */

  public static void main(String[] args) {
    new AsserDemo().incr();
  }
}
