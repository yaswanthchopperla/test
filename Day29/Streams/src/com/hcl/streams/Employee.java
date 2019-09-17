package com.hcl.streams;

public class Employee {
   private int empnNo;
   private String empName;
   private int salary;
   private char band;
public Employee(int empnNo, String empName, int salary, char band) {
	super();
	this.empnNo = empnNo;
	this.empName = empName;
	this.salary = salary;
	this.band = band;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmpnNo() {
	return empnNo;
}
public void setEmpnNo(int empnNo) {
	this.empnNo = empnNo;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public char getBand() {
	return band;
}
public void setBand(char band) {
	this.band = band;
}
   
   
   
   

}
