package com.hcl.ems;

import java.util.Date;

public class LeaveHistory {

private int Emp_Id;
private int Lea_Id;
private Date Lea_Start_Date;
private Date Lea_End_Date;
private int Lea_No_Of_Days;
private String Lea_Reason;
private String Lea_Type;
private Date Lea_Applied_On;
private String Lea_Mgr_Comments;
private String Lea_Status;

public int getEmp_Id() {
	return Emp_Id;
}
public void setEmp_Id(int emp_Id) {
	Emp_Id = emp_Id;
}
public int getLea_Id() {
	return Lea_Id;
}
public void setLea_Id(int lea_Id) {
	Lea_Id = lea_Id;
}
public Date getLea_Start_Date() {
	return Lea_Start_Date;
}
public void setLea_Start_Date(Date lea_Start_Date) {
	Lea_Start_Date = lea_Start_Date;
}
public Date getLea_End_Date() {
	return Lea_End_Date;
}
public void setLea_End_Date(Date lea_End_Date) {
	Lea_End_Date = lea_End_Date;
}
public int getLea_No_Of_Days() {
	return Lea_No_Of_Days;
}
public void setLea_No_Of_Days(int lea_No_Of_Days) {
	Lea_No_Of_Days = lea_No_Of_Days;
}
public String getLea_Reason() {
	return Lea_Reason;
}
public void setLea_Reason(String lea_Reason) {
	Lea_Reason = lea_Reason;
}
public String getLea_Type() {
	return Lea_Type;
}
public void setLea_Type(String lea_Type) {
	Lea_Type = lea_Type;
}
public Date getLea_Applied_On() {
	return Lea_Applied_On;
}
public void setLea_Applied_On(Date lea_Applied_On) {
	Lea_Applied_On = lea_Applied_On;
}
public String getLea_Mgr_Comments() {
	return Lea_Mgr_Comments;
}
public void setLea_Mgr_Comments(String lea_Mgr_Comments) {
	Lea_Mgr_Comments = lea_Mgr_Comments;
}
public String getLea_Status() {
	return Lea_Status;
}
public void setLea_Status(String lea_Status) {
	Lea_Status = lea_Status;
}

}
