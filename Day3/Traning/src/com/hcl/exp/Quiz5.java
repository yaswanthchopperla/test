package com.hcl.exp;

public class Quiz5 {
public static void main(String[] args) {
	Object[] arr=new Object[]
			{ 12,"welcome",12.9,"hcl",11};
	for (Object object : arr) {
		//if we want to access only required data in the given input we use instanceof
		if(object instanceof Integer){
			System.out.println(object);
		}
		if(object instanceof String){
			System.out.println(object);
		}
		if(object instanceof Double){
			System.out.println(object);
		}
	}
}
}
