<%@page import="com.hcl.ems.Employee"%>
<%@page import="com.hcl.ems.LeaveHistory"%>
<%@page import="java.util.List"%>
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
<form method="get" action="ApproveDeny.jsp">
<table border="3">
	<%
		String user=(String)session.getAttribute("user");
		out.println("Showing Pending Leaves for " +user);
		EmployeeDAO dao=new EmployeeDAO();
		List<Integer> lstData=dao.showSubordinates(Integer.parseInt(user));
		out.println(lstData);
		Employee emp=null;
		List<LeaveHistory> history=dao.pendingLeaves(Integer.parseInt(user));
		for(int i :lstData) {
			emp=dao.myDetails(i);
		%>
		<tr bgcolor="blue">
			<th>Employee ID </th>
			<td> <%=i%></td>
			<th>Employee Name </th>
			<td> <%=emp.getEmp_name() %>
			<th>Employee Leave Balance </th>
			<td><%=emp.getEmp_leave_balance() %> </td>
		</tr>
		
		<%
		for(LeaveHistory h : history) {
			if(i==h.getEmp_Id()) {
		%>
		<tr>
			<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th>Leave ID </th>
			<th>No.Of days</th>
			<th>Start date</th>
			<th>End Date</th>
			<th>Leave Type</th>
			<th>Leave Status</th>
			<th>Leave Reason</th>
			<th>Apply Status</th>
		</tr>
		<tr>
			<td></td>
			 <td><%=h.getLea_Id() %> </td>
			 <td><%=h.getLea_No_Of_Days() %>  </td>
			 <td><%=h.getLea_Start_Date() %> </td>
			 <td><%=h.getLea_End_Date() %> </td>
			 <td> <%=h.getLea_Type() %> </td>
			 <td> <%=h.getLea_Status() %> </td>
			 <td><%=h.getLea_Reason() %> </td>
			 <td>
			 	<input type="checkbox" name="chkStatus" value=<%=h.getLea_Id() %> />
			 </td>
		</tr>
		<%
			}
		}
		}
		%>
		
</table>
<input type="submit" value="Approve/Deny" />
</form>
</body>
</html>