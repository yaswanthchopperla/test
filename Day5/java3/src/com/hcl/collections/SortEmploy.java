package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
  /**
  * treeset.
  * @param args object.
  */
  public static void main(String[] args) {
    Comparator c = new BasicComparator();
    SortedSet s = new TreeSet(c);
    s.add(new Employ(1,"hema",7477476));
    s.add(new Employ(2,"sihma",75378));
    s.add(new Employ(3,"gari",7574764));
    System.out.println("soreted list is");
    s.forEach(System.out::println);
  }
}
