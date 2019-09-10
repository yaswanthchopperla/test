package com.hcl.bank;

import java.util.Scanner;

public class CloseAccountMain {
	public static void main(String[] args) {
		int accountno;
		System.out.println("enter accountno: ");
		Scanner sc = new Scanner(System.in);
		accountno = sc.nextInt();
		System.out.println(AccountBaL.closeAccountBal(accountno));
	}

}
