package com.hcl.java;
class Employ{
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	//tostring
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}
class Amit extends Employ{
//constructor
	public Amit(int empno, String name, double basic) {
		super(empno, name, basic);	
	}	
}
class Vinod extends Employ{
	//constructor
	//super as aconstructor is used because to pass values from derived class to base class
	public Vinod(int empno, String name, double basic) {
		super(empno, name, basic);	
	}
}
public class SupCon {
	public static void main(String[] args) {
		Employ e1=new Amit(1,"amit",5467);
		Employ e2=new Vinod(2,"vinod",65745);
		Employ e3=new Vinod(3,"sai",655745);
		Employ e4=new Vinod(4,"kumar",654745);
//		System.out.println(e1);
//		System.out.println(e2);
		//to print multiple details we have to create employ array
		Employ[] arrEmploy=new Employ[]{e1,e2,e3,e4};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}

}
