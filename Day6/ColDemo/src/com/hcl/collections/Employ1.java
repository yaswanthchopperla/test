package com.hcl.collections;

public class Employ1 {
	int empno;
	  String name;
	  double basic;
	public Employ1(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ1 [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	  
}
