package com.hcl.inh;

public class CustomString {
		String name="yash";
		String name1="raj";
		public int length(String name)
		{	
		char[] arr=name.toCharArray();
		int i=0;
		for(char a:arr){
			i++;	
		}
		return i;
		}
		public int length1(String name1)
		{	
		char[] arr1=name1.toCharArray();
		int j=0;
		for(char a:arr1){
			j++;	
		}
		return j;	
		}
		
		public static void main(String[] args) {
			CustomString obj=new CustomString();
			int res =obj.length("yash");
			int res1 =obj.length1("yash");
			System.out.println( "length is "+res);
			System.out.println("length is "+res1);
			
		}
		}

