package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Empshow {
	public static void main(String[] args) {
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = 
	    	DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpratice","root","root");
		    //System.out.println("connected");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Emp");
			while (rs.next()) {  
				System.out.println("employ no " + rs.getInt("empno" ));
				System.out.println("employ name " + rs.getString("ename"));
				System.out.println("employ job is " + rs.getString("job"));
				System.out.println("employ Mgr is " + rs.getInt("mgr"));
				System.out.println("employ sal " + rs.getInt("sal"));
				System.out.println("employ hiredate " + rs.getDate("hiredate"));
				System.out.println("employ comm is " +rs.getInt("comm"));
				System.out.println("employ dept no " + rs.getInt("deptno"));
			}
		} catch (ClassNotFoundException e) { 
			
			e.printStackTrace();
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
