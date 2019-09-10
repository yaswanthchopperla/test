package com.hcl.java;

public class Attendance {
	public static void display(Object...name){
		
		for (Object object : name) {
			System.out.println(object);
		}
	}
	public static void show(int day,String...name){
		System.out.println(day + " ");
		for(String s:name){
			System.out.print( s+ " ");
		}
		System.out.println();
	}
public static void main(String[] args) {
	show(1);
	show(2,"sai","kumar","tushar");
	show(3,"sai","satya","mahesh");
}
}
