<%@page import="com.hcl.ems.EmployeeBaL"%>
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
  <%
int emp_id=(int)session.getAttribute("empid");

int nd = Integer.parseInt(request.getParameter("noofdays"));
  LeaveHistory obj=new LeaveHistory();
   obj.setLea_start_date(request.getParameter("startdate"));
   obj.setLea_end_date(request.getParameter("enddate"));
   obj.setLea_No_of_days(nd);
   obj.setLea_type(request.getParameter("leavetype"));
   obj.setLea_reason(request.getParameter("leavereason"));
   obj.setEmp_id(emp_id);
   String result = EmployeeBaL.ApplyLeavebal(obj);
   out.println(result);
  %>
   </body>
</html>

