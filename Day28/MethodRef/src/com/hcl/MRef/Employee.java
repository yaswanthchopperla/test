package com.hcl.MRef;

public class Employee {
    private int empno;
    private String empName;
    
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empno, String empName) {
		super();
		this.empno = empno;
		this.empName = empName;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(int empno) {
		super();
		this.empno = empno;
	}
	public Employee(String empName) {
		super();
		this.empName = empName;
	}
    
    
}
