package com.hcl.ems;

import java.sql.Date;

public class Employee {
   private int emp_id;
   private String emp_name;
   private String emp_email;
   private long emp_mob_no;
   private String emp_dpt_name;
   private Date emp_date_joined;
   private int mgr_id;
   private int emp_leave_balance;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getEmp_email() {
	return emp_email;
}
public void setEmp_email(String emp_email) {
	this.emp_email = emp_email;
}
public long getEmp_mob_no() {
	return emp_mob_no;
}
public void setEmp_mob_no(long emp_mob_no) {
	this.emp_mob_no = emp_mob_no;
}
public String getEmp_dpt_name() {
	return emp_dpt_name;
}
public void setEmp_dpt_name(String emp_dpt_name) {
	this.emp_dpt_name = emp_dpt_name;
}
public Date getEmp_date_joined() {
	return emp_date_joined;
}
public void setEmp_date_joined(Date emp_date_joined) {
	this.emp_date_joined = emp_date_joined;
}
public int getMgr_id() {
	return mgr_id;
}
public void setMgr_id(int mgr_id) {
	this.mgr_id = mgr_id;
}
public int getEmp_leave_balance() {
	return emp_leave_balance;
}
public void setEmp_leave_balance(int emp_leave_balance) {
	this.emp_leave_balance = emp_leave_balance;
}
   
}
