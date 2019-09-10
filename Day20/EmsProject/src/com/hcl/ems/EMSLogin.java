package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EMSLogin {
public static boolean authenticate(int empId,String secretCode) {
	Connection con=DaoConnection.getConnection();
	String cmd="Select * from EmployLogin where EMP_ID =? AND secretCode=?";
	boolean flag=false;
	try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, empId);
		pst.setString(2, secretCode);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			flag=true;
		}else
			flag=false;
			
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return flag;
	
}
}
