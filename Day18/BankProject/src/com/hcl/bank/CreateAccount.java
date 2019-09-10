package com.hcl.bank;

public class CreateAccount {
   private String firstname;
   private String lastname;
   private String city;
   private String state;
   private int amount;
   private String cheqfacil;
   private String accounttype;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getCheqfacil() {
	return cheqfacil;
}
public void setCheqfacil(String cheqfacil) {
	this.cheqfacil = cheqfacil;
}
public String getAccounttype() {
	return accounttype;
}
public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}
   public String createAccount() {
	   Accounts objaccounts=new Accounts();
	   int accno=AccountBaL.generateAccountBal();
	   objaccounts.setAccountno(accno);
	   objaccounts.setFirstName(firstname);
	   objaccounts.setLastName(lastname);
	   objaccounts.setCity(city);
	   objaccounts.setState(state);
	   objaccounts.setAmount(amount);
	   objaccounts.setCheqFacil(cheqfacil);
	   objaccounts.setAccountType(accounttype);
	   return AccountBaL.createAccountBal(objaccounts);
   }
}
