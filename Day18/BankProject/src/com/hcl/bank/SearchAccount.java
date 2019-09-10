package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchAccount {
   private int accno;

public int getAccno() {
	return accno;
}

public void setAccno(int accno) {
	this.accno = accno;
}
  public Accounts SearchAccounts() {
	  return AccountBaL.searchAccountsBal(accno);
  }
}
