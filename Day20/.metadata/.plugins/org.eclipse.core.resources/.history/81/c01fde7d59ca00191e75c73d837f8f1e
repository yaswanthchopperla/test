package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeDAO {
	
	public List<Integer> showSubordinates(int mgrId) {
		Connection con= DaoConnection.getConnection();
		String cmd="select Emp_ID eid from Employee where EMP_MGR_ID=?";
		List<Integer> lstData=new ArrayList<Integer>();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, mgrId);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				lstData.add(rs.getInt("eid"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstData;
	}
	
	public LeaveHistory showLeaveDetails(int leaveId) {
		Connection con=DaoConnection.getConnection();
		String cmd="select * from leave_history where LEA_ID=?";
		LeaveHistory lh=null;
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, leaveId);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				lh=new LeaveHistory();
				lh.setEmp_Id(rs.getInt("EMP_ID"));
				lh.setLea_Id(rs.getInt("LEA_ID"));
				lh.setLea_Start_Date(rs.getDate("LEA_START_DATE"));
				lh.setLea_End_Date(rs.getDate("LEA_END_DATE"));
				lh.setLea_No_Of_Days(rs.getInt("LEA_NO_OF_DAYS"));
				lh.setLea_Reason(rs.getString("LEA_REASON"));
				lh.setLea_Type(rs.getString("LEA_TYPE"));
				lh.setLea_Applied_On(rs.getDate("LEA_APPLIED_ON"));
				lh.setLea_Status(rs.getString("LEA_STATUS"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lh;
	}
	
	public List<LeaveHistory> pendingLeaves(int empId) {
		Connection con= DaoConnection.getConnection();
		String cmd="select * from leave_history where LEA_STATUS='PENDING' AND EMP_ID "
				+ " IN(select Emp_ID from "
				+ " Employee where EMP_MGR_ID=?) ORDER BY EMP_ID";
		List<LeaveHistory> history=new ArrayList<LeaveHistory>();
		LeaveHistory objHistory=null;
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, empId);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				objHistory=new LeaveHistory();
				objHistory.setEmp_Id(rs.getInt("EMP_ID"));
				objHistory.setLea_Id(rs.getInt("LEA_ID"));
				objHistory.setLea_Start_Date(rs.getDate("LEA_START_DATE"));
				objHistory.setLea_End_Date(rs.getDate("LEA_END_DATE"));
				objHistory.setLea_No_Of_Days(rs.getInt("LEA_NO_OF_DAYS"));
				objHistory.setLea_Reason(rs.getString("LEA_REASON"));
				objHistory.setLea_Type(rs.getString("LEA_TYPE"));
				objHistory.setLea_Applied_On(rs.getDate("LEA_APPLIED_ON"));
				objHistory.setLea_Status(rs.getString("LEA_STATUS"));
				history.add(objHistory);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return history;
	}
 public Employee myDetails(int empId){
	 Connection con= DaoConnection.getConnection();
	 String cmd="select * from employee where emp_Id=?";
	 Employee employee=null;
	 try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			employee=new Employee();
			employee.setEmp_id(empId);
			employee.setEmp_name(rs.getString("EMP_NAME"));
			employee.setEmp_dept_name(rs.getString("EMP_DPT_NAME"));
			employee.setEmp_email(rs.getString("EMP_EMAIL"));
			employee.setEmp_date_joined(rs.getDate("EMP_DATE_JOINED"));
			employee.setEmp_mgr_id(rs.getInt("EMP_MGR_ID"));
			employee.setEmp_mob_no(rs.getString("EMP_MOB_NO"));
			employee.setEmp_leave_balance(rs.getInt("EMP_LEAVE_BALANCE"));
			
			}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return employee;
 }
 public String myLeave(LeaveHistory obj){
	 Connection con= DaoConnection.getConnection();
	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	 String sfDate=sdf.format(obj.getLea_Start_Date());
	 String edfDate=sdf.format(obj.getLea_End_Date());
	 Date dt=new Date();
	 String appliedOn=sdf.format(dt);
	 LeaveType lt=LeaveType.EL;
	 Employee employ=myDetails(obj.getEmp_Id());
	 LeaveStatus ls;
	 if(employ.getEmp_mgr_id()==0) {
		 ls=LeaveStatus.APPROVED;
	 }else{
		 ls=LeaveStatus.PENDING;
	 }
		 String cmd=" INSERT INTO Leave_History(Lea_Start_Date,Lea_End_Date,Lea_No_Of_Days,Lea_Reason,"
		 		+ "Lea_Type,Lea_Applied_On,Emp_ID,Lea_Status) VALUES(?,?,?,?,?,?,?,?)";

		 String result="";
		 
	 try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setString(1, sfDate);
		pst.setString(2,edfDate);
		pst.setInt(3, obj.getLea_No_Of_Days());
		pst.setString(4, obj.getLea_Reason());
		pst.setString(5,lt.toString());
		pst.setString(6, appliedOn);
		pst.setInt(7, obj.getEmp_Id());
		pst.setString(8, ls.toString());
		pst.executeUpdate();    
			result="Leave Applied Successfully...";
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result=e.getMessage();
	}
	 return result;
 
 
 }
 
 public String myADLeave(LeaveHistory obj){
	 Connection con= DaoConnection.getConnection();
	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	 String sfDate=sdf.format(obj.getLea_Start_Date());
	 String edfDate=sdf.format(obj.getLea_End_Date());
	 Date dt=new Date();
	 String appliedOn=sdf.format(dt);
	 LeaveType lt=LeaveType.EL;
	 Employee employ=myDetails(obj.getEmp_Id());
	 LeaveStatus ls;
	 if(employ.getEmp_mgr_id()==0) {
		 ls=LeaveStatus.APPROVED;
	 }else{
		 ls=LeaveStatus.PENDING;
	 }
	 String cmd="Select * from Leave_History where emp_Id=?";
		 String result="";
		 
		 try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setString(1, sfDate);
			pst.setString(2,edfDate);
			pst.setInt(3, obj.getLea_No_Of_Days());
			pst.setString(4, obj.getLea_Reason());
			pst.setString(5,lt.toString());
			pst.setString(6, appliedOn);
			pst.setInt(7, obj.getEmp_Id());
			pst.setString(8, ls.toString());
			pst.executeUpdate();    
				result="Leave Successfully...";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		 return result;
 }}
