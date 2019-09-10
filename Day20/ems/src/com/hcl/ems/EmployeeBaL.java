package com.hcl.ems;

import java.util.List;

public class EmployeeBaL {
	 public static String logindao(int emp_id,String secretcode) {
		 return new EmployDaO().logindao(emp_id, secretcode);
	 }
     public static Employee SearchEmployeebal(int emp_id) {
    	 return new EmployDaO().SearchEmployee(emp_id);
     }
     
     public static String ApplyLeavebal(LeaveHistory obj) {
    	 return new EmployDaO().ApplyLeave(obj);
     }
     public static List<LeaveHistory> myLeavebal(int emp_id) {
    	 return new EmployDaO().myLeave(emp_id);
     }
}
