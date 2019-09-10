package com.hcl.bank;

public class AccountBaL {
	public static String withdrawAmountBal(int accountno,int withdrawAmount){
		return new AccountDaO().WithdrawAccountDao(accountno, withdrawAmount);
	}
	public static String depositAccountBal(int accountno, int depAmount){
		return new AccountDaO().depositAccountDao(accountno, depAmount);
	}
	public static String closeAccountBal(int accountno){
		return new AccountDaO().closeAccountdDao(accountno);
	}
	public static String updateAccountBal(int accountno, String city, String state){
		return new AccountDaO().updateAccountDao(accountno, city, state);
	}
	public  static Accounts searchAccountsBal(int accountno){
		return new AccountDaO().searchAccountDao(accountno);
	}
	public static String createAccountBal(Accounts objAccounts){
		return new AccountDaO().createAccountDao(objAccounts);
	}
	public static int generateAccountBal(){
		return new AccountDaO().generateAccountnoDao();
	}
}
