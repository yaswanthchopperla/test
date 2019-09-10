package com.hcl.bank;

public class WithdrawAccount {
private int accno;
private int withdrawamount;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public int getWithdrawamount() {
	return withdrawamount;
}
public void setWithdrawamount(int withdrawamount) {
	this.withdrawamount = withdrawamount;
}
public String WithdrawAccount() {
	return AccountBaL.withdrawAmountBal(accno, withdrawamount);
}
}
