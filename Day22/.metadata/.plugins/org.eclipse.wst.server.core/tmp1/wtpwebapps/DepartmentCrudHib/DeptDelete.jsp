<%@page import="com.hcl.hib.DeptCrud"%>
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
   int deptno=Integer.parseInt(request.getParameter("deptno"));
   DeptCrud obj=new DeptCrud();
   out.println(obj.deleteDept(deptno));
 %>
 <jsp:forward page="DeptShow.jsp"></jsp:forward>
</body>
</html>