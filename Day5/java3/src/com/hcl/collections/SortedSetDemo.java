package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
  /**
  * program about treeset.
  * @param args string.
  */
  public static void main(String[] args) {
    SortedSet s = new TreeSet();
    s.add("visalakshi");
    s.add("raghu");
    s.add("sai");
    s.add("visal");
    s.add("lakshi");

    s.add("visalakshi");
    s.add("raghu");
    s.add("sai");
    s.add("visal");
    s.add("lakshi");

    s.add("visalakshi");
    s.add("raghu");
    s.add("sai");
    s.add("visal");
    s.add("lakshi");
    System.out.println("HashSet Data");
    s.forEach(System.out::println);
  }
}
