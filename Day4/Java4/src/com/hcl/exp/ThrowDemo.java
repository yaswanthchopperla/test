package com.hcl.exp;
/**
 * throw demo.
 * @author yaswanth
 *
 */

public class ThrowDemo { 
  /**
  * example for exception.
  * @param x ji.
  */

  public void show(int x) { 
    boolean flag = true;
    if (x < 0) { 
      flag = false;
      throw new NumberFormatException("negative numbers not allowed");
    }
    if (x == 0) { 
      flag = false;
      throw new NumberFormatException("zero is invalid");
    } 
    if (x > 0) { 
      System.out.println(x);
    } 
  }
  /**
  * exception meassages.
  * @param args n.
  */
  
  public static void main(String[] args) { 
    int n = 0;
    try { 
      new ThrowDemo().show(n);
    } catch (NumberFormatException e) {  
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) { 
      System.out.println(e.getMessage());
    } catch (Exception e) { 
      e.printStackTrace();
    }
  }
}
