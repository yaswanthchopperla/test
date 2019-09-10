package com.hcl.boxing;

public class EmployTest {

	public static void main(String[] args) {
		Employ e1=new Employ();
		e1.empno=1;
		e1.name="yash";
		e1.basic=234556;
		Employ e2=new Employ();
		e2.empno=13;
		e2.name="yash raj";
		e2.basic=234556;
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
	}

}
