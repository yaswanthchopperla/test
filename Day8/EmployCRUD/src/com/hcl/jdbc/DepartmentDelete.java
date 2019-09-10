package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentDelete {
	public static void main(String[] args) {
		int deptno;
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr deptno :");
		deptno = sc.nextInt();
		String cmd = "delete from department where deptno=?";
		Connection con=DaoConnection.getConnection();
		try {
			PreparedStatement pst= con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			pst.executeUpdate();
			System.out.println("****record deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



