package com.hcl.bank;

import java.util.Scanner;

public class UpdateAccountMain {
	public static void main(String[] args) {
		int accountno;
		String city;
		String state;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter accountno :");
		accountno=Integer.parseInt(sc.nextLine());
		System.out.println("enter city :");
		city=sc.nextLine();
		System.out.println("enter state :");
		state=sc.nextLine();
		System.out.println(AccountBaL.updateAccountBal(accountno, city, state));
		
		
	}

}
