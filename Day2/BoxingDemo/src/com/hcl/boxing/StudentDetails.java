package com.hcl.boxing;

public class StudentDetails {
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sno=1;
		s1.name="grp";
		s1.city="delhi";
		s1.cgp=8.9;
		Student s2=new Student();
		s2.sno=2;
		s2.name="grpf";
		s2.city="delhi";
		s2.cgp=7.9;
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
				
	
	}
}
