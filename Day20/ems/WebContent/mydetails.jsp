<%@page import="com.hcl.ems.Employee"%>
<%@page import="com.hcl.ems.EmployeeBaL"%>
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
    Employee obj=EmployeeBaL.SearchEmployeebal(emp_id);
    session.setAttribute("EMP_ID", obj.getEmp_id());
%>

Employee Id :
<%=obj.getEmp_id() %>

Employee Name :
<%=obj.getEmp_name() %>

Employee Email :
<%=obj.getEmp_email() %>

Employee MobileNo :
<%=obj.getEmp_mob_no() %>

Employee Department Name :
<%=obj.getEmp_dpt_name() %>

Employee Date of Join :
<%=obj.getEmp_date_joined() %>

Employee Manager ID :
<%=obj.getMgr_id() %>

Employee Leave Balance :
<%=obj.getEmp_leave_balance() %>

</body>
</html>