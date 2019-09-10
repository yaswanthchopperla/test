package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaO {
	PreparedStatement pst;
	Connection con;
	public String WithdrawAccountDao(int accountno,int withdrawAmount){
		con=DaoConnection.getConnection();
		String result=" ";
		Accounts objAccounts=searchAccountDao(accountno);
		if(objAccounts!=null){
			int amount=objAccounts.getAmount();
			String status=objAccounts.getStatus();
			if(status.equals("inactive")){
				result="Account Closed Already ";
			} else {
				if(amount-withdrawAmount>=1000){
					String cmd="update accounts set amount = amount-? where accountno =? ";
					try {
						pst=con.prepareStatement(cmd);
						pst.setInt(1, withdrawAmount);
						pst.setInt(2, accountno);
						pst.executeUpdate();
						cmd="insert into Trans(Accountno,TransAmount,Transtype) values(?,?,?)";
						pst=con.prepareStatement(cmd);
						pst.setInt(1, accountno);
						pst.setInt(2, withdrawAmount);
						pst.setString(3, "D");
						pst.executeUpdate();
						result = "Amount debited";
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					result = "insufficent balance ";
				}
			}
			
		} else {
			result = "account not found";
		}
		
		return result;
}
	public String depositAccountDao(int accountno,int depAmount){
		con=DaoConnection.getConnection();
		String result=" ";
		Accounts objAccount=searchAccountDao(accountno);
		String cmd="update accounts set amount = amount+? where accountno =? ";
		if(objAccount==null){
			result="Account Not Found ";
		} else { 
			String status=objAccount.getStatus();
			if(status.equals("inactive")){
				result="Account Closed Already ";
			} else {		
			
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, depAmount);
			pst.setInt(2, accountno);
			pst.executeUpdate();
			cmd="insert into Trans(accountno, Transamount,Transtype) values(?,?,?)";
			pst=con.prepareStatement(cmd);
			pst.setInt(1, accountno);
			pst.setInt(2, depAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			result = "amount credited ";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}
		return result;
	}
	public String closeAccountdDao(int accountno){
		con=DaoConnection.getConnection();
		String result = " ";
		Accounts objAccount=searchAccountDao(accountno);
		if(objAccount==null){
			result="Account Not Found ";
		} else {
		String cmd = "update Accounts set status = 'inactive' where accountno = ?";
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, accountno);
			pst.executeUpdate();
			result="Account closed ";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		}
		return result;
	}
	public String updateAccountDao(int accountno ,String city ,String state){
		con=DaoConnection.getConnection();
		Accounts objaccounts=searchAccountDao(accountno);
		String cmd="update Accounts set  city = ?, state = ?"
		             + "where Accountno = ?";
		String result=" ";
		if(objaccounts==null){
			result="Account Not Found";
		} else {
			String status=objaccounts.getStatus();
			if(status.equals("inactive")){
				result="Account Closed Already";
			} else {
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, city);
			pst.setString(2, state);
			pst.setInt(3, accountno);
			pst.executeUpdate();
			result = "Account updated ";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		    }
		}
		}
		return result;
	}
	
	public Accounts searchAccountDao(int accountno) {
		con=DaoConnection.getConnection();
		String cmd="select * from Accounts where accountNo = ?";
		Accounts objAccounts=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, accountno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				objAccounts=new Accounts();
				objAccounts.setFirstName(rs.getString("firstName"));
				objAccounts.setLastName(rs.getString("lastName"));
				objAccounts.setCity(rs.getString("city"));
				objAccounts.setState(rs.getString("state"));
				objAccounts.setAmount(rs.getInt("amount"));
				objAccounts.setCheqFacil(rs.getString("cheqfacil"));
				objAccounts.setAccountType(rs.getString("accounttype"));
				objAccounts.setStatus(rs.getString("status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objAccounts;
	}
	
	public String createAccountDao(Accounts objAccounts){
		con= DaoConnection.getConnection();
		String cmd= "insert into accounts(AccountNo,FirstName,LastName,"
				     + "State,City, Amount,CheqFAcil,AccountType)"
                                + "values(?,?,?,?,?,?,?,?)";
		String result=" ";
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, objAccounts.getAccountno());
			pst.setString(2, objAccounts.getFirstName());
			pst.setString(3, objAccounts.getLastName());
			pst.setString(4, objAccounts.getState());
			pst.setString(5, objAccounts.getCity());
			pst.setInt(6, objAccounts.getAmount());
			pst.setString(7, objAccounts.getCheqFacil());
			pst.setString(8,objAccounts.getAccountType());
			pst.executeUpdate();
			result="Account created successfully....";
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		return result;
		
	}
	public int generateAccountnoDao() {
		con = DaoConnection.getConnection();
          int accno = 0;
          String cmd = "select case when max(accountno) is null then 1" 
          +"  else max(accountno)+1 end accno from accounts";
          try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			accno = rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          return accno;      
	}
}


