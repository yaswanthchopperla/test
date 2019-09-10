package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		int accountno = AccountBaL.generateAccountBal();
		//System.out.println(accountno);
		Accounts objAccount = new Accounts();
		objAccount.setAccountno(accountno);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstname: ");
		objAccount.setFirstName(sc.nextLine());
		System.out.println("enter lastname : ");
		objAccount.setLastName(sc.nextLine());
		System.out.println("enter city : ");
		objAccount.setCity(sc.nextLine());
		System.out.println("enter state : ");
		objAccount.setState(sc.nextLine());
		System.out.println("enter amount: ");
		objAccount.setAmount(Integer.parseInt(sc.nextLine()));
		System.out.println("enter checkfacil : ");
		objAccount.setCheqFacil(sc.nextLine());
		System.out.println("enter accounttype : ");
		objAccount.setAccountType(sc.nextLine());
		System.out.println(AccountBaL.createAccountBal(objAccount));
	}

}
