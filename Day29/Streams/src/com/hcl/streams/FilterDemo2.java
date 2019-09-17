package com.hcl.streams;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo2 {
    public static void main(String[] args) {
    	List<Employee> lst=new ArrayList<Employee>();
		lst.add(new Employee(10,"yaswanth",45000,'E'));
		lst.add(new Employee(11,"sai",46000,'M'));
		lst.add(new Employee(12,"uttam",47000,'C'));
		lst.add(new Employee(13,"laksh",48000,'M'));
		lst.add(new Employee(14,"kumar",49000,'E'));
       lst.stream().filter((emp)-> emp.getEmpName().startsWith("k")).forEach((arg) -> {System.out.println(arg.getEmpName());});
        
        lst.stream().filter((emp1)-> emp1.getBand()=='M').forEach((arg1) -> {System.out.println(arg1.getEmpName());});
        
       // stream with filter and count
        Long noOfRecords = lst.stream().count();
        System.out.println(noOfRecords);
        
        Long empSalGt45000 = lst.stream().filter((var) -> var.getSalary() > 45000).count();
        System.out.println(empSalGt45000);
        
        //stream with two filters and count 
         
        Long empSalGt45000andM = lst.stream().filter((var) -> var.getSalary() > 45000).filter((var1) -> var1.getBand()=='M').count();
        System.out.println(empSalGt45000andM);

        //stream with two filters and count also use between condition
        
        Long empSalGt45000B = lst.stream().filter((var) -> (var.getSalary() > 45000 && var.getSalary() <48000)).count();
        System.out.println(empSalGt45000B);

        
      }
}
