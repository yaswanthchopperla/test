package com.hcl.java;

public class StrFunctionDemo {
	public static void main(String[] args) {
		String str="Welcome to java pragramming";
		System.out.println("length of the string="+str.length());
		System.out.println("char at 5th position " +str.charAt(5));
		System.out.println("index of a is"+str.indexOf('a'));
		System.out.println("occurence of a "+str.lastIndexOf('a'));
		System.out.println("substring "+str.substring(2));
		String s1="hello", s2="hello";
		System.out.println(s1.equals(s2));
		String s3="basic", s4="hai";
		System.out.println(s3.equals(s4));
		String s5="java", s6="to";
		System.out.println(s5.compareTo(str.substring(11,15)));		
		
		
		
		
		
		

	}

}
