package com.hcl.boxing;

public class St {
	void show(){
		System.out.println("hai");
	}
	static void display(){
		System.out.println("bye");
	}

	public static void main(String[] args) {
		display();
		new St().show();
	

	}

}