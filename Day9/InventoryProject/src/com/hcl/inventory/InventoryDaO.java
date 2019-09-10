package com.hcl.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * program for data.
 * @author yaswanth.
 */
public class InventoryDaO {
  Connection con;
  PreparedStatement pst;
  /**
  * data layer program.
  * @param stid passed.
  * @param orderedquantity passed.
  * @return result.
  */

  public String placeorderDao(String stid, int orderedquantity) { 
    con = DaoConnection.getConnection();
    Inventory objstock = searchstockDao(stid);
    String result = "";
    if (objstock != null) { 
      int qa = objstock.getQuantityAvail();
      if (qa - orderedquantity >= 0) { 
        int price = objstock.getPrice();
        int billamount = price * orderedquantity;
        String cmd = "insert into orders values(?,?,?,?)";
        try {
          InventoryDaO id = new InventoryDaO();
          int orderid = id.generateordernoDao();
				pst=con.prepareStatement(cmd);
				pst.setInt(1, orderid);
				pst.setString(2, stid);
				pst.setInt(3, orderedquantity);
				pst.setInt(4, billamount);
				pst.executeUpdate();
				cmd="update stock set quantityAvail=quantityavail-? where stockid=?";
				pst=con.prepareStatement(cmd);
				pst.setInt(1,orderedquantity );
				pst.setString(2, stid);
				pst.executeUpdate();
				cmd="select gamt from amount";
				pst=con.prepareStatement(cmd);
				ResultSet rs = pst.executeQuery();
				rs.next();
				int gross= rs.getInt("gamt");
				cmd="update amount set gamt=gamt+? ";
				pst=con.prepareStatement(cmd);
				pst.setInt(1, billamount);
				pst.executeUpdate();
				result = "order placed";	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} else {
			result= "Quantity not available";
		}
	} else {
		result="stockid is not available";
	}
	return result;
	
}
	public Inventory searchstockDao(String stid){
		con=DaoConnection.getConnection();
		String cmd="select * from stock where stockid = ?";
		Inventory objstock=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, stid);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				objstock=new Inventory();
				objstock.setItemName(rs.getString("ItemName"));
				objstock.setPrice(rs.getInt("Price"));
				objstock.setQuantityAvail(rs.getInt("QuantityAvail"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objstock;
		
	}
	public String createStockDao(Inventory objstock){
		con= DaoConnection.getConnection();
		String cmd="insert into stock(stockid,ItemName,Price,QuantityAvail) values(?,?,?,?)";
		String result="";
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, objstock.getStockid());
			pst.setString(2, objstock.getItemName());
			pst.setInt(3, objstock.getPrice());
			pst.setInt(4,objstock.getQuantityAvail());
			pst.executeUpdate();
			result="stock added";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		return result;
	}
	public String generateStockIdDao(){
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
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		return stid;
}
	public int generateordernoDao() {
		con = DaoConnection.getConnection();
          int orderno = 0;
          String cmd = "select case when max(OrderId) is null then 1" 
          +"  else max(OrderId)+1 end orderno from Orders";
          try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			orderno = rs.getInt("orderno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          return orderno;      
	}
	
}
	