<%@page import="com.hcl.ems.EmployeeBaL"%>
<%@page import="com.hcl.ems.Employee"%>
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
  int emp_id = (int)session.getAttribute("EMP_ID");
  Employee obj=EmployeeBaL.SearchEmployeebal(emp_id);
  String result="";
  int mgr_id = obj.getMgr_id();
  if(mgr_id != 0) {
	  obj = EmployeeBaL.SearchEmployeebal(mgr_id);
%>
	    Manager Id :
		<%=obj.getEmp_id() %>
		
		Manager Name :
        <%=obj.getEmp_name() %>

        manager Email :
        <%=obj.getEmp_email() %>

        Manager MobileNo :
         <%=obj.getEmp_mob_no() %>

        Manager Department Name :
          <%=obj.getEmp_dpt_name() %>

        Manager Date of Join :
         <%=obj.getEmp_date_joined() %>
		
<%
  } else {
	  out.println("No Manager");
  }
%>
</body>
</html>