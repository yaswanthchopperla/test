package com.hcl.MRef;

public class EmployeeMain {
	public static void main(String[] args) {
    Employee employee=new Employee();
    EmployeeInterface e1=Employee::new;
    employee=e1.getEmployee(3, "yaswanth");
    System.out.println(employee.getEmpno());
    System.out.println(employee.getEmpName());
    
}
}
