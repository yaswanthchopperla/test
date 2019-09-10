package com.hcl.obj;

public class SbExample {
	public StringBuilder show(int age,String name, String city, String course ){
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
			sbError.append(age);
			sbError.append(name);
			sbError.append(city);
			sbError.append(course);
		}
		return sbError;
	}
	public static void main(String[] args) {
		int age;
		String name;
		String city;
		String course;
		age=11;
		name="ram";
		course="java";
		city="delhi";
		 StringBuilder sbRes=new SbExample().show(age, name, city, course );
		System.out.println(sbRes);
		
	}

}
