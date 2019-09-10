package com.hcl.collections;

import java.util.Scanner;

public class Scan1 { 
  /**
  *program about scanner for integer.
  * @param args name.
  */

  public static void main(String[] args) { 
    System.out.println("enter name");
    Scanner name = new Scanner(System.in);
    String sc = name.nextLine();
    System.out.println("name is" + sc);
  }
}
