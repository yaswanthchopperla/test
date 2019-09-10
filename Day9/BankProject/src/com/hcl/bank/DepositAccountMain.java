package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {
	public static void main(String[] args) {
		int accountno;
		int depAmount;
		System.out.println("enter accountno:");
		Scanner sc = new Scanner(System.in);
		accountno = sc.nextInt();
		System.out.println("enter deposit amount : ");
		depAmount = sc.nextInt();
		System.out.println(AccountBaL.depositAccountBal(accountno, depAmount));
		
	}

}
