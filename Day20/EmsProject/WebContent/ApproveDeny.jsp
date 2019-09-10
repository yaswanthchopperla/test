<%@page import="com.hcl.ems.Employee"%>
<%@page import="com.hcl.ems.EmployeeDAO"%>
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
	
	
	<%
		int leavId=Integer.parseInt(request.getParameter("chkStatus"));
		out.println("We display Details for " +leavId + " Shortly...");
		EmployeeDAO dao=new EmployeeDAO();
		LeaveHistory lh=dao.showLeaveDetails(leavId);
		Employee e=dao.myDetails(lh.getEmp_Id());
	%>
	<table border="3">
	<tr>
		<th>Employee ID </th>
		<td><%=e.getEmp_id() %> </td>
	
	
		<th>Start Date</th>
		<td><%=lh.getLea_Start_Date() %> </td>
	</tr>
	<tr>
		<th>Employee Name</th>
		<td><%=e.getEmp_name() %> </td>
		<th>End Date</th>
		<td><%=lh.getLea_End_Date() %> </td>
	</tr>
	<tr>
	    <th>Leave Balance</th>
	    <td><%=e.getEmp_leave_balance() %> </td>
	    <th>No.of Days</th>
	    <td> <%=lh.getLea_No_Of_Days() %> </td>
	</tr>
	<tr>
		<th></th>
		<td></td>
		<th>Leave Type</th>
		<td> <%=lh.getLea_Type() %> </td>
	</tr>
	<tr>
		<th></th>
		<td></td>
		<th>Leave Reason</th>
		<td> <%=lh.getLea_Reason() %> </td>
	</tr>
		</table>
		Comments:
		<input type="text" name="LEA_MGR_COMMENTS"/><br/><br/>
		
		<input type="submit" value="APPROVE"/>
		
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="DENY" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="CANCEL"/>
		
</body>
</html>