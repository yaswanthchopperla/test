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
<%
int empId=Integer.parseInt((String)session.getAttribute("user"));

%>
<form action="ApplyLeaveStatus.jsp" method="get">
<center>
<h1>APPLY LEAVE</h1><BR/><BR/>
</center>

<table border="0">
<tr>
<td>EMPLOYEE ID</td>
<td border:1px><input type="text" name="empId" value="<%=empId%>" readonly="readonly"/></td>
</tr>

<tr>
<td>Start Date</td>
<td border:1px><input type="Date" name="sfDate"/></td>
</tr>

<tr>
<td>End Date</td>
<td border:1px><input type="Date" name="edfDate"/></td>
</tr>


<tr>

<td>Number Of Days</td>
<td border:1px><input type="text" name="LEA_NO_OF_DAYS"/></td>
</tr>

<tr>
<td>LEAVE REASON</td>
<td border:1px><input type="text" name="LEA_REASON"/></td>
</tr>


<tr>
<td>Leave Type:</td>
<td><select name="Lea_Type">
<option value="EL">EL</option>
</select></td>
</tr>

<tr>
<td>
<input type="submit" value="APPLY"/>
</td>
</tr>
</table>
</form>
</body>
</html>