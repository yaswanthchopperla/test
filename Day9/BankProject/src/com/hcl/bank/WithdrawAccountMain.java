package com.hcl.bank;

import java.util.Scanner;

public class WithdrawAccountMain {
	public static void main(String[] args) {
		int accountno;
		int withdrawAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountno: ");
		accountno=sc.nextInt();
		System.out.println("enter withdrawAmount: ");
		withdrawAmount=sc.nextInt();
		System.out.println(AccountBaL.withdrawAmountBal(accountno, withdrawAmount));
	}

}
