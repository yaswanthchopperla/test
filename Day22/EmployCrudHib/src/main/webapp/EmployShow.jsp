<%@page import="com.hcl.hib.Employ"%>
<%@page import="java.util.List"%>
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
<table border="3">
<tr>
      <th>Empno</th>
      <th>Name</th>
      <th>Dept</th>
      <th>Desig</th>
      <th>Basic</th>
      <th>Update</th>
      <th>Delete</th>
</tr>
   <%
       EmployCrud obj=new EmployCrud();
       List<Employ> lst=obj.showEmploy();
       for(Employ e : lst) {
   %>
   <tr>
   <td><%=e.getEmpno()%> </td> 
   <td><%=e.getName() %> </td>
   <td><%=e.getDept() %> </td>
   <td><%=e.getDesig() %> </td>
   <td><%=e.getBasic() %> </td>
   <td><a href="EmployUpdate.jsp?empno=<%=e.getEmpno()%>" >Update</a>
   <td><a href="EmployDelete.jsp?empno=<%=e.getEmpno() %>">Delete</a>
   </tr>
   <%	   
       }
   
   %>


</table>
</body>
</html>