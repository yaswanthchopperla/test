package com.hcl.collections;

import java.util.Comparator;

public class CgpComparator implements Comparator<Student> {  
  @Override
  public int compare(Student o1, Student o2) { 
    if (o1.cgp < o2.cgp) { 
      return 1;
    }
    return -1;
  }
}
