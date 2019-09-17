package com.hcl.streams;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo1 {
    public static void main(String[] args) {
		List<Employee> lst=new ArrayList<Employee>();
		lst.add(new Employee(10,"yaswanth",45000,'E'));
		lst.add(new Employee(11,"sai",46000,'M'));
		lst.add(new Employee(12,"uttam",47000,'C'));
		lst.add(new Employee(13,"laksh",48000,'M'));
		lst.add(new Employee(14,"kumar",49000,'E'));
		lst.stream().forEach((var)-> System.out.println(var.getEmpnNo()+" "+ var.getEmpName() + " " + var.getSalary()));
	}
}
