package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy { 
  /**
  * main program.
  * @param args array.
  */

  public static void main(String[] args) {   
    List lstemploy = new ArrayList();
    lstemploy.add(new Employ(1,"anisha",65333));
    lstemploy.add(new Employ(2,"hanisha",63733));
    lstemploy.add(new Employ(3,"vanisha",655333));
    lstemploy.add(new Employ(4,"tanisha",65378733));
    lstemploy.add(new Employ(5,"manisha",653663));
    for (Object object : lstemploy) { 
      Employ e = (Employ)object;
      System.out.println(e);
    }
  }
}
