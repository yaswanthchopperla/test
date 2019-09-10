package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptShow {
public static void main(String[] args) {
	try { 
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=
    	DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpratice","root","root");
	//System.out.println("connected");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select*from dept");
		while(rs.next()){
			System.out.println("dept no is"+ rs.getInt("deptno"));
			System.out.println("dept name is"+ rs.getString("dname"));
			System.out.println("dept location is "+ rs.getString("loc"));
		}
       } catch (ClassNotFoundException e) { 
	
	     e.printStackTrace();
      } catch (SQLException e) { 
	        // TODO Auto-generated catch block
	    e.printStackTrace();
    }
 }
}
