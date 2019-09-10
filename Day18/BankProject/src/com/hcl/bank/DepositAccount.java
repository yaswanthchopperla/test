package com.hcl.bank;

public class DepositAccount {
private int accno;
private int depositamount;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public int getDepositamount() {
	return depositamount;
}
public void setDepositamount(int depositamount) {
	this.depositamount = depositamount;
}
public String DepositAccount() {
	return AccountBaL.depositAccountBal(accno, depositamount);
}
}
