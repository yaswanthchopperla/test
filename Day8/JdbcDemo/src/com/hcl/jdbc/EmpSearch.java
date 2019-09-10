package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpSearch {
public static void main(String[] args) {
	int empno;
	System.out.println("enter the employ no: ");
	Scanner sc=new Scanner(System.in);
	empno=sc.nextInt();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = 
	    DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpratice","root","root");
		String cmd="select * from Emp where empno=?";
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1,empno);
		ResultSet rs=pst.executeQuery();
		if(rs.next()){
			System.out.println("employ name "+ rs.getString("ename"));
			System.out.println("employ job "+ rs.getString("job"));
			System.out.println("employ Mgr "+ rs.getInt("mgr"));
			System.out.println("employ salary "+ rs.getInt("sal"));
			System.out.println("employ hiredate "+ rs.getDate("hiredate"));
			System.out.println("employ comm "+ rs.getInt("comm"));
			System.out.println("employ department "+ rs.getInt("deptno"));
		}else{
			System.out.println(" employ record not found");
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
