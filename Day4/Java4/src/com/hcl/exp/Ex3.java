package com.hcl.exp;
/**
 * Class Ex3 about Exception Handling Example.
 * @author Yashwanth.
 */ 

public class Ex3 {
  /**
   * Main Method for core business logic.
   * @param args for reading command line args.
   */
  public static void main(String[] args) {
    try { 
      System.out.println("a");
      throw new NullPointerException();
    } catch (ArithmeticException e) { 
      System.out.println(e);
    } catch (NullPointerException e) { 
      //System.out.println("error");
      throw new NumberFormatException();
    } catch (NumberFormatException e) {
      System.out.println("rethrown error");
    }
  }
}

