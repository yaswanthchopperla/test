package com.hcl.ex;

import java.io.Serializable;

public class Employ implements Serializable {
	int empno;
	String name;
	transient double basic;
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
