<%@page import="com.hcl.ems.EmployeeDAO"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
 LeaveHistory obj =new LeaveHistory();
 obj.setEmp_Id(Integer.parseInt(request.getParameter("empId")));
 out.println(obj.getEmp_Id());
 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
 Date sfDate=sdf.parse(request.getParameter("sfDate"));
 obj.setLea_Start_Date(sfDate);
 
 Date edfDate=sdf.parse(request.getParameter("edfDate"));
 obj.setLea_End_Date(edfDate);
 
 obj.setLea_No_Of_Days(Integer.parseInt(request.getParameter("LEA_NO_OF_DAYS")));
 obj.setLea_Reason(request.getParameter("LEA_REASON"));
 EmployeeDAO dao=new EmployeeDAO();
 out.println(dao.myLeave(obj));
 %>
 
 
 
 
 
 
 
 
 	
</body>
</html>