package com.hcl.ems;

import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class EmployDaO {
   public static String logindao(int emp_id,String secretcode) {

	   Connection con=DaoConnection.getConnection();
	   String cmd="select * from Employlogin where emp_id=? and secretcode=?";
	   String result="";
	   PreparedStatement pst;
	   try {
		pst=con.prepareStatement(cmd);
		pst.setInt(1, emp_id);
		pst.setString(2, secretcode);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			result="Login Successfully";
		} else {
			result="Invalid Credentials";
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return result;
   }
public Employee SearchEmployee(int emp_id) {

	Connection con=DaoConnection.getConnection();
	Employee obj=null;
	String cmd="select * from employee where emp_id=?";
	try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, emp_id);
		ResultSet rs=pst.executeQuery();
		rs.next();
		obj=new Employee();
		obj.setEmp_id(rs.getInt("emp_id"));
		obj.setEmp_name(rs.getString("emp_name"));
		obj.setEmp_email(rs.getString("emp_email"));
		obj.setEmp_mob_no(rs.getLong("emp_mob_no"));
		obj.setEmp_dpt_name(rs.getString("emp_dpt_name"));
		obj.setEmp_date_joined(rs.getDate("emp_date_joined"));
		obj.setMgr_id(rs.getInt("EMP_MGR_ID"));
		obj.setEmp_leave_balance(rs.getInt("emp_leave_balance"));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return obj;
}
public String  ApplyLeave(LeaveHistory obj) {

	Connection con=DaoConnection.getConnection();
    Date dt=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    String lea_applied_on=sdf.format(dt);
	String cmd="insert into Leave_History (lea_start_date,lea_end_date,lea_no_of_days,lea_reason,lea_type,lea_applied_on,emp_id,lea_status)"
			+ "values(?,?,?,?,?,?,?,?)";
	String result="";
	PreparedStatement pst;
	try {
		pst=con.prepareStatement(cmd);
		pst.setString(1,obj.getLea_start_date());
		pst.setString(2, obj.getLea_end_date());
		pst.setInt(3, obj.getLea_No_of_days());
		pst.setString(4, obj.getLea_reason());
		pst.setString(5, lea_type.EL.toString());
		pst.setString(6,lea_applied_on);
		pst.setInt(7, obj.getEmp_id());
		pst.setString(8, "Approved");
		pst.executeUpdate();
		result="Applied Successfully";
		String cmd1="update employee set emp_leave_balance=emp_leave_balance-1 where emp_id=?";
		pst=con.prepareStatement(cmd1);
		pst.setInt(1, obj.getEmp_id());
		pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
}
public List<LeaveHistory> myLeave(int emp_id) {

	Connection con=DaoConnection.getConnection();
	String cmd="select * from Leave_history where emp_id=?";
   List<LeaveHistory> lst = new ArrayList<LeaveHistory>();
	LeaveHistory l= null;
	PreparedStatement pst;
	try {
		pst=con.prepareStatement(cmd);
		pst.setInt(1, emp_id);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			l = new LeaveHistory();
			l.setLea_id(rs.getInt("LEA_ID"));
			l.setLea_start_date(rs.getString("lea_start_date"));
			l.setLea_end_date(rs.getString("lea_end_date"));
			l.setLea_No_of_days(rs.getInt("lea_no_of_days"));
			l.setLea_reason(rs.getString("lea_reason"));
			l.setLea_type(rs.getString("lea_type"));
			l.setLea_applied_on(rs.getInt("lea_applied_on"));
			l.setLea_mgr_comments(rs.getString("lea_mgr_comments"));
			l.setEmp_id(rs.getInt("emp_id"));
			l.setLea_status(rs.getString("lea_status"));
			lst.add(l);
		}
		
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return lst;
}
}