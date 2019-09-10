package com.hcl.inventory;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class InventoryTestcase {
	@Test
	public void testplaceorder(){
		assertEquals("order placed",InventoryBaL.placeorderbal("S004", 2));
		assertEquals("Quantity not available", InventoryBaL.placeorderbal("S004", 50));
		assertEquals("stockid is not available",InventoryBaL.placeorderbal("S400", 40));
	}
	@Test
	public void testSearchstock(){
		assertNotNull(InventoryBaL.searchstockIdBal("S001"));
		assertNull(InventoryBaL.searchstockIdBal("S500"));
	}
	@Test
	public void testcreatestock(){
		Inventory objstock=new Inventory();
		String  stid=InventoryBaL.generatestockIdBal();
		objstock.setStockid(stid);
		objstock.setItemName("books");
		objstock.setPrice(12);
		objstock.setQuantityAvail(20);
		assertEquals("stock added",
	    InventoryBaL.createStockBal(objstock));
	}
	
	@Test
	public void testDaoConnection(){
		assertNotNull(DaoConnection.getConnection());
	}
	
	Connection con;
	PreparedStatement pst;
	@Test
	public void testgeneratestockid(){
		con = DaoConnection.getConnection();
		String cmd= "select max(stockid) sid from stock";
		String stid="";
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			stid = rs.getString("sid");
			int id=Integer.parseInt(stid.substring(1));
			id++;
			String formatted = String.format("%03d", id);
			stid = "s"+formatted;
//			if(id >= 1 && id <=9){
//				stid="S00"+id;
//		    }
//			if(id >= 10 && id <=99){
//				stid="S0"+id;
//		    }
//			if(id >= 100 && id <=999){
//				stid="S"+id;
//		    }
//			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		assertEquals(stid, InventoryBaL.generatestockIdBal());
	}
	
	@Test
	public void testgenerateorderid(){
		int orderno=0;
		Connection con=DaoConnection.getConnection();
		String cmd="select max(orderid)+1 orderno from orders";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs= pst.executeQuery();
			rs.next();
			orderno=rs.getInt("orderno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(orderno, InventoryBaL.generateordernoBal());
	}
	
    @Test
	public void testGettersSetters(){
    	Inventory objstock=new Inventory();
    	objstock.setStockid("S005");
		objstock.setItemName("books");
		objstock.setPrice(12);
		objstock.setQuantityAvail(20);
		
		assertEquals("S005", objstock.getStockid());
		assertEquals("books", objstock.getItemName());
		assertEquals(12, objstock.getPrice());
		assertEquals(20, objstock.getQuantityAvail());
	}

}
