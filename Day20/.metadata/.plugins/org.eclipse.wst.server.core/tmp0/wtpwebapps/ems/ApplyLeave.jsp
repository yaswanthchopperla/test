<%@page import="com.hcl.ems.EmployeeBaL"%>
<%@page import="com.hcl.ems.EmployDaO"%>
<%@page import="com.hcl.ems.Employee"%>
<%@page import="com.hcl.ems.LeaveHistory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="apply.jsp">
Start Date :
<input type="date" name="startdate"/> <br/><br/>
End Date :
<input type="date" name="enddate"/> <br/><br/>
No of Days:
<input type="text" name="noofdays"/> <br/><br/>
Leave Type :
<select name=leavetype>
<option value="EL">EL</option> <br/><br/>
</select>
Leave Reason :
<input type="text" name="leavereason"/> <br/><br/>

<input type="Submit" value="apply" />
<input type="button" value="clear"/>
</form>



</body>
</html>