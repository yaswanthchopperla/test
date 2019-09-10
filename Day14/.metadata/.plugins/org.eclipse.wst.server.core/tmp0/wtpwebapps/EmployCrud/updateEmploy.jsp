
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jsp.DaoConnection"%>
<%@page import="java.sql.Connection"%>
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
  int empno=Integer.parseInt(request.getParameter("empno"));
  Connection con=DaoConnection.getConnection();
  String cmd="select * from employ  where empno=?";
  PreparedStatement pst=con.prepareStatement(cmd);
  pst.setInt(1, empno);
  ResultSet rs=pst.executeQuery();
  rs.next();

%>
     <form method="get" action="updateEmploy.jsp">
   <center>
     Employ No :
     <input type="text"  name="empno" readonly="readonly"  value=<%=rs.getInt("empno") %> /><br/><br/>
     Employ Name :
     <input type="text" name="name" value=<%=rs.getString("name") %> /> <br/><br/>
     Department :
     <input type="text" name="dept" value=<%=rs.getString("dept") %> /> <br/><br/>
     Designation :
     <input type="text" name="desig" value=<%=rs.getString("desig") %> /> <br/><br/>
     Basic :
     <input type="text" name="basic" value=<%=rs.getString("basic") %> /> <br/><br/>
     <input type="submit" value="update"/>
   </center>
  </form>
 
<% 
    if(request.getParameter("empno") != null && request.getParameter("basic")!=null ) {
    	cmd="update employ set name=?,dept=?,desig=?,basic=? where empno=?";
    	pst=con.prepareStatement(cmd);
    	pst.setString(1, request.getParameter("name"));
    	pst.setString(2, request.getParameter("dept"));
    	pst.setString(3, request.getParameter("desig"));
    	pst.setInt(4, Integer.parseInt(request.getParameter("basic")));
    	pst.setInt(5, empno);
    	pst.executeUpdate();
    	
%>
<jsp:forward page="employShow.jsp"/></jsp.forward>
<%
    }
%>
</body>
</html>