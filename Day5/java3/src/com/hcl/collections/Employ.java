package com.hcl.collections;
/**
* employ code.
* @author yaswanth.
*
*/

public class Employ { 
  int empno;
  String name;
  double basic;
  /**
  *program about empploy  for camparator. 
  * @param empno int.
  * @param name string.
  * @param basic double.
  */
  
  public Employ(int empno, String name, double basic) { 
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }

  @Override
  public String toString() { 
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
}
