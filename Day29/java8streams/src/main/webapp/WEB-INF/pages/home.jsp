<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div align="center">
      <h1>Employees</h1>
      <h3> Enter Employ Name </h3>
      <form:form action="search" method="post" modelAttribute="searchemployee">
       EmpName : <form:input path="empname"/><br/><br/>
       EmpBand : <form:select path="band">
                        <form:option value="0">Select</form:option>
            			<form:option value="E">E</form:option>
            			<form:option value="M">M</form:option>
            			<form:option value="C">C</form:option>
            	    </form:select><br/><br/>
       Salary Greater than :<form:input path="salary" value="0.0"/>
       <input type="submit" value="search"/>
      </form:form>
      <h2>No Of Employees "${listemployee.size()}"</h2>
      <table border="2">
        <tr>
          <th>EmpName</th>
          <th>Salary</th>
          <th>Band</th>
          <th>DateOfJoin</th>
        </tr>
        
        
 <c:forEach var="lst" items="${listemployee}">
  <tr>
    <td>${lst.empname}</td>
    <td>${lst.salary}</td>
    <td>${lst.band}</td>
    <td>${lst.dateofjoin}</td>
  </tr>
 </c:forEach>    
 </table> 
  </div>
</body>
</html>