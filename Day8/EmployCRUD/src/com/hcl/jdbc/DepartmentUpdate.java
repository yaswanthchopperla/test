package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentUpdate {

	public static void main(String[] args) {
		int deptno;
		String loc;
		String head;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr deptno no:");
		deptno=Integer.parseInt(sc.nextLine());
		System.out.println("enter location:");
		loc=sc.nextLine();
		System.out.println("enter head:");
		head=sc.nextLine();
		String cmd= "update department set loc =?, head =? where deptno=?";
		Connection con=DaoConnection.getConnection();
		try {
			PreparedStatement pst= con.prepareStatement(cmd);
			pst.setString(1,loc);
			pst.setString(2, head);
			pst.setInt(3, deptno);
			pst.executeUpdate();
			System.out.println("***record updated***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
