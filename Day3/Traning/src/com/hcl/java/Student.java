package com.hcl.java;
enum Student1{
	AYush,Sharadda,Kabir
}
public class Student {
	public static void show(){
		Student1[] arrStudent=Student1.values();
		for (Student1  student : arrStudent) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		show();
	}

}
