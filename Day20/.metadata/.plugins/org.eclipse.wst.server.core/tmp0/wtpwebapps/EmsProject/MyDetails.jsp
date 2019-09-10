<%@page import="com.hcl.ems.Employee"%>
<%@page import="com.hcl.ems.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 MY DETAILS SECTION
<%
	int empId=Integer.parseInt((String)session.getAttribute("user"));
	EmployeeDAO dao=new EmployeeDAO();
	Employee employee=dao.myDetails(empId);
%>
<table>
<tr>
<th>
	<% out.println("Employee Id  " +employee.getEmp_id());%>
	</th>
	<th>
	<% out.println("Date Joined " +employee.getEmp_date_joined());%>
	</th>
	</tr>
	<tr>
	<th>
	<% out.println("Full Name  " +employee.getEmp_name());%>
	</th>
	<th>
	<% out.println("Department " +employee.getEmp_dept_name());%>
	</th>
	</tr>
	<tr>
	<% out.println("Email Address " +employee.getEmp_email());%>
	</tr>
	<tr>
	 <% out.println("Mobile No " +employee.getEmp_mob_no());%>
	</tr>
	<br/><br/><br/><br/>
	<center>
	<% out.println("Available leave balance" +employee.getEmp_leave_balance());%>
</center>
</table>
	
	
</body>
</html>