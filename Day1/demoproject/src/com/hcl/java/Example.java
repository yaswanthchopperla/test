package com.hcl.java;

public class Example {
	public void show(int age,String name, String city, String course ){
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		if(age<=20){
			sbError.append("age must be greater than 20"+"\r\n");
			isValid=false;
		}
		if(name.indexOf(' ')==-1){
			sbError.append("name must contains both firstname and lastname");
			isValid=false;
		}
		if(isValid==true){
			System.out.println(age);
			System.out.println(name);
			System.out.println(city);
			System.out.println(course);
		}else{
			
			System.out.println(sbError);
		}
		
		/*System.out.println("age is"+age);
		System.out.println("name is"+name);
		System.out.println("city is"+city);
		System.out.println("course is"+course);*/
	}
	public static void main(String[] args) {
		int age;
		String name;
		String city;
		String course;
		age=12;
		name="yash ch";
		city="banglore";
		course="java";
		new Example().show(age,name,city,course);


	}

}
