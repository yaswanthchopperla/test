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
   <form method="get" action="departmentInsert.jsp">
    <center>
      Dept no :
      <input type="text" name="deptno"/> <br/><br/>
      Dept name :
      <input type="text" name="dname"/> <br/><br/>
      Location :
      <input type="text" name="loc"/> <br/><br/>
      head :
      <input type="text" name="head"/> <br/><br/>
      <input type="submit" value="insert"/>    
    </center>
   </form>
   
   <%
     if(request.getParameter("deptno") != null) {
    	 Connection con=DaoConnection.getConnection();
    	 String cmd="insert into department values(?,?,?,?)";
    	 PreparedStatement pst=con.prepareStatement(cmd);
    	 int deptno=Integer.parseInt(request.getParameter("deptno"));
    	 String  name=request.getParameter("dname");
    	 String loc=request.getParameter("loc");
    	 String head=request.getParameter("head");
    	 pst.setInt(1,deptno);
    	 pst.setString(2, name);
    	 pst.setString(3, loc);
    	 pst.setString(4, head);
    	 pst.executeUpdate();
    	 out.println("****recorded inserted");
     }
   %>
</body>
</html>