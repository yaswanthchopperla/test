package com.hcl.java;

public class Switch2 {
	public void check(String opt){
		switch(opt.toUpperCase()){
		case "INSERT":
			System.out.println("insert operation");
			break;
		case "UPDATE":
			System.out.println("UPDATE OPERTAION");
			break;
		case "DELETE":
			System.out.println("delete operation");
			break;
		default:
			System.out.println("invalid");
		}
	}

	public static void main(String[] args) {
		String op="Hold";
		new Switch2().check(op);
		
	}

}
