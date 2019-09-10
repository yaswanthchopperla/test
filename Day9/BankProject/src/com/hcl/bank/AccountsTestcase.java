package com.hcl.bank;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class AccountsTestcase {
	@Test
	public void testWithdrawAccount(){
		assertEquals("Amount debited", AccountBaL.withdrawAmountBal(2, 1000));
		assertEquals("insufficent balance ", AccountBaL.withdrawAmountBal(2, 100000));
		assertEquals("account not found", AccountBaL.withdrawAmountBal(-17, 1000));
		assertEquals("Account Closed Already ", AccountBaL.withdrawAmountBal(1, 1000));
			
	}
	@Test
	public void testDepositAccount(){
		assertEquals("amount credited ",AccountBaL.depositAccountBal(3, 3000));
		assertEquals("Account Not Found ",AccountBaL.depositAccountBal(-3, 3000));
		assertEquals("Account Closed Already ",AccountBaL.depositAccountBal(1, 3000));
		
	}
	@Test
	public void testCloseAccount(){
		assertEquals("Account closed ",AccountBaL.closeAccountBal(4));
		assertEquals("Account Not Found ",AccountBaL.closeAccountBal(-4));
	}
	@Test
	public void testUpdateAccount(){
		assertEquals("Account updated ",AccountBaL.updateAccountBal(2, "chennai", "Tn"));
		assertEquals("Account Not Found",AccountBaL.updateAccountBal(-2, "chennai", "Tn"));
		assertEquals("Account Closed Already",AccountBaL.updateAccountBal(1, "tirupati", "Ap"));
	}
	@Test
	public void tsetSearchAccount(){
		assertNotNull(AccountBaL.searchAccountsBal(1));
		assertNull(AccountBaL.searchAccountsBal(-1));
	}
	@Test
	public void testCreateaccount(){
		Accounts objAccounts=new Accounts();
		int accno=AccountBaL.generateAccountBal();
		objAccounts.setAccountno(accno);
		objAccounts.setFirstName("bindhu");
		objAccounts.setLastName("sri");
		objAccounts.setCity("bangalore");
		objAccounts.setState("karanataka");
		objAccounts.setAmount(34543);
		objAccounts.setCheqFacil("yes");
		objAccounts.setAccountType("savings");
		assertEquals("Account created successfully....",
		AccountBaL.createAccountBal(objAccounts));
	}
	@Test
	public void testDaoConnection(){
		assertNotNull(DaoConnection.getConnection());
	}
	@Test
	public void testGenerateAccountNo(){
		int accno=0;
		Connection con=DaoConnection.getConnection();
		String cmd="select max(accountno)+1 accno from Accounts";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs= pst.executeQuery();
			rs.next();
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(accno,AccountBaL.generateAccountBal());
	}

	@Test
	public void testGettersAndSetters(){
		Accounts objAccounts=new Accounts();
		objAccounts.setAccountno(1);
		objAccounts.setFirstName("sai");
		objAccounts.setLastName("kumar");
		objAccounts.setCity("bangalore");
		objAccounts.setState("karnataka");
		objAccounts.setAmount(323243);
		objAccounts.setCheqFacil("yes");
		objAccounts.setAccountType("savings");
		objAccounts.setStatus("active");
		
		assertEquals(1, objAccounts.getAccountno());
		assertEquals("sai", objAccounts.getFirstName());
		assertEquals("kumar", objAccounts.getLastName());
		assertEquals("bangalore", objAccounts.getCity());
		assertEquals("karnataka", objAccounts.getState());
		assertEquals(323243, objAccounts.getAmount());
		assertEquals("yes", objAccounts.getCheqFacil());
		assertEquals("savings", objAccounts.getAccountType());
		assertEquals("active", objAccounts.getStatus());
		
	}

}