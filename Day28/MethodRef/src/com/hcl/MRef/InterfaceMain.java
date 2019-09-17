package com.hcl.MRef;

public class InterfaceMain {
	public static void main(String[] args) {
		
	
   Inteface1 i1=Employee::new;
   Employee employee=i1.getEmpno(12);
   System.out.println(employee.getEmpno());
   Interface2 i2=Employee::new;
   Employee e1=i2.getEmpName("yaswanth");
   System.out.println(e1.getEmpName());
	} 
}
