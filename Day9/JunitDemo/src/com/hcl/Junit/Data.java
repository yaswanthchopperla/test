package com.hcl.Junit;

import java.util.HashMap;
import java.util.Map;

public class Data {
	public int div(int a,int b){
		int c=1;
		try {
			c=a/b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	public String getPropertyTest(String Key){
		Map<String,String> m=new HashMap<String,String>();
		m.put("Meena","java");
		m.put("Bharghav", "Reddy");
		m.put("Harish", "K");
		m.put("yaswanth", "Chopperla");
		return m.get(Key);
	}
	public boolean even(int x){
		if(x%2==0){
			return true;
		} else {
			return false;
		}
	}
	public int minArray(int[] x){
		int min=x[0];
		for(int i=0;i<x.length;i++){
			if(min > x[i]){
				min = x[i];
			}
		}
		return min;
	}
	public int max(int a,int b,int c){
		int m=a;
		if(m<b){
			m=b;
		}
		if(m<c){
			m=c;
		}
		return m;
	}
	public String message(){
		return "welcome to junit";
	}
	public int sum(int a,int b){
		return a+b;
	}
	
}
