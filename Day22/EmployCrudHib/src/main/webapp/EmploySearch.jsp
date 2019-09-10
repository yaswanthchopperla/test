<%@page import="com.hcl.hib.Employ"%>
<%@page import="com.hcl.hib.EmployCrud"%>
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
   EmployCrud obj=new EmployCrud();
   Employ l=obj.searchEmploy(Integer.parseInt(request.getParameter("empno")));
   if(l!=null) { 
%>
 
 Employ Name :<%=l.getName() %><br/><br/>
 Employ Dept :<%=l.getDept() %><br/><br/>
 Employ Desig :<%=l.getDesig() %><br/><br/>
 Employ Basic :<%=l.getBasic() %><br/><br/>
 <% 
 } else {
	 out.println("Record Not Found");
 }
   %>
</body>
</html>