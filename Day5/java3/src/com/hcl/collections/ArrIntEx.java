package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx { 
  /**
  * main program.
  * @param args arraylist.
  */

  public static void main(String[] args) { 
    List num = new ArrayList();
    num.add(new Integer(44));
    num.add(new Integer(45));
    num.add(new Integer(46));
    num.add(new Integer(47));
    num.add(new Integer(48));
    num.add(new Integer(49));
    num.add(new Integer(50));
    int sum = 0;
    for (Object object : num) { 
      sum += (Integer)object;
    }
    System.out.println("sum" + sum);
  }
}
