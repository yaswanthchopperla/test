package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {
	public static void main(String[] args) {
		int accountno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no: ");
		accountno=sc.nextInt();
		Accounts objAccounts=AccountBaL.searchAccountsBal(accountno);
		if(objAccounts!=null){
			System.out.println("FirstName "+ objAccounts.getFirstName());
			System.out.println("lastname "+ objAccounts.getLastName());
			System.out.println("city "+ objAccounts.getCity());
			System.out.println("state "+objAccounts.getState());
			System.out.println("amount "+ objAccounts.getAmount());
			System.out.println("checkfacil "+objAccounts.getCheqFacil());
			System.out.println("accounttype "+objAccounts.getAccountType());
		} else {
			System.out.println("** Account Not found **");
		}
}

}
