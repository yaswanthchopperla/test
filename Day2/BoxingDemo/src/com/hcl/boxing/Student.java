package com.hcl.boxing;

public class Student {
	int sno;
	String name;
	String city;
	double cgp;
	
	

	@Override
	public boolean equals(Object obj) {
		
		Student s1 = (Student) obj;
		if(s1.city.equals(city) && s1.cgp==cgp){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	

}
