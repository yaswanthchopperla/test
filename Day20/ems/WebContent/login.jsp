<%@page import="com.hcl.ems.EmployeeBaL"%>
<%@page import="java.io.PrintWriter"%>
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

  int id=Integer.parseInt(request.getParameter("emp_id"));
  String code=request.getParameter("secretcode");
  String result=EmployeeBaL.logindao(id,code);
  if(result=="Login Successfully"){
	  session.setAttribute("empid",id);
%>
<jsp:forward page="dashboard.jsp"></jsp:forward>
<%
 } 
  else {
	  out.println("sorry wrong credentials");
%>
<jsp:forward page="login.html"></jsp:forward>
<%	  
  }
%>


  
</body>
</html>