package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenListInt { 
  /**
  * Genlist of integer program.
  * @param args integer.
  */
  public static void main(String[] args) { 
    List<Integer> lstData = new ArrayList<Integer>();
    lstData.add(new Integer(42));
    lstData.add(new Integer(52));
    lstData.add(new Integer(12));
    lstData.add(new Integer(78));
    lstData.add(new Integer(82));
    int sum = 0;
    for (Integer i : lstData) {
      sum += i;
    }
    System.out.println("sum is " + sum);
  }
}
