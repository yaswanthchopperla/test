package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		//Comparator<Student> c=new CityComparator();
		Comparator<Student> c=new CgpComparator();
		Set<Student> s=new TreeSet<Student>(c);
		s.add(new Student("hari","kiran","kurnool",9.8));
		s.add(new Student("manju","nadh","hyderabad",7.8));
		s.add(new Student("yaswanth","chopperla","kothapeta",6.8));
		s.add(new Student("sai","epuri","chennai",5.8));
		s.add(new Student("satya","sai","banglore",9));
		System.out.println("student list ");
		s.forEach(System.out::println);
		
	}
}


