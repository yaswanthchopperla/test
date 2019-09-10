package com.hcl.boxing;

public class Demo1 {
	public int sum(int x){
		return  x+5;	
	}
	public int sum(int x,int y){
		return  x+y;	
	}
	public int sum(int x,int y,int z){
		return  x+y+z;	
	}
	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		int res=obj.sum(7);
		System.out.println(res);
		res=obj.sum(5);
	}

}
