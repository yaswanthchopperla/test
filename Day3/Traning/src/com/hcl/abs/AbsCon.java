package com.hcl.abs;
abstract class Employ{
	int empno;
	String name;
	double basic;
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
class janani extends Employ{
	
public janani(int empno, String name, double basic) {
		super(empno, name, basic);
		
	}
}
class Raghu extends Employ{

	public Raghu(int empno, String name, double basic) {
		super(empno, name, basic);
		
	}	
}
public class AbsCon {
	public static void main(String[] args) {
		Employ obj1=new janani(1,"janani",64647);
		Employ obj2=new Raghu(11,"raghu",647547);			
		Employ[] arr=new Employ[]{obj1,obj2};
		for (Employ employ : arr) {
			System.out.println(employ);	
		}
	}
}