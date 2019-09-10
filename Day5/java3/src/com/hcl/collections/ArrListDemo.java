package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
  /**
  * arraylist programm for diiferent operations.
  * @param args array.
  */

  public static void main(String[] args) {  
    List lstNames = new ArrayList();
    lstNames.add("anubhav");
    lstNames.add("sai");
    lstNames.add("kumar");
    lstNames.add("yaswanth");
    lstNames.add("prem");
    lstNames.add("raghu");
    System.out.println("names are:");
    //for (Object object : lstNames) {
    //System.out.println(object);
    //}
    System.out.println("JDK 1.8");
    lstNames.forEach(System.out::println);
    //for edit
    lstNames.set(2,"prem reddy");
    System.out.println("list updated after ");
    lstNames.forEach(System.out::println);
    System.out.println("list after removing by index");
    lstNames.remove(1);
    lstNames.forEach(System.out::println);
    lstNames.remove("kumar");
    System.out.println("list after removing object");
    lstNames.forEach(System.out::println);
    System.out.println("4th element" + lstNames.get(3));
  }

}
