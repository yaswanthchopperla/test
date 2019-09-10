package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
  /**
  * treeset.
  * @param args object.
  */
  public static void main(String[] args) { 
    SortedSet s = new TreeSet();
    s.add(new Emp(1,"hema",7477476));
    s.add(new Emp(2,"sihma",75378));
    s.add(new Emp(3,"gari",7574764));
    System.out.println("sorted list is");
    s.forEach(System.out::println);
  }
}
