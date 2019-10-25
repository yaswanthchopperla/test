<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <c:set var="pagesize" value="${pagesize}"></c:set>
    <c:set var="totalrecords" value="${totalrecords}"></c:set> --%>
	<%
		int s = (Integer) request.getAttribute("pagesize");
		int t = (Integer) request.getAttribute("totalrecords");
		int k;
		if (t % s > 0) {
			k = (t / s) + 1;
		} else {
			k = (t / s);
		}
		for (int i = 0; i < k; i++) {
	%>
	<a href="/displayAll/page/<%=i%>">page<%=i + 1%></a>
	<%
		}
	%>


	<h1>Employee List</h1>
	<table border="3" style="background-color: yellow">
		<tr style="background-color: pink">
			<th>Empno</th>
			<th>Empname</th>
			<th>Dept</th>
			<th>Desig</th>
			<th>Basic</th>
		</tr>
		<c:forEach var="emp" items="${ListEmployee}">
			<tr style="background-color: gray">
				<td>${emp.empno}</td>
				<td>${emp.empname}</td>
				<td>${emp.dept}</td>
				<td>${emp.desig}</td>
				<td>${emp.basic}</td>
			</tr>
		</c:forEach>
	</table>
	<!-- <a href="/displayjavacontractors">Display Java Contractors</a></br></br>
	<a href="/displayjava">Display Java Employees Having Name Sai</a></br></br>
	<a href="/displayjavaSalary">Display Java Employees Salary>40000</a></br></br>
    <a href="/displayjavaSalaryName">Display Java Employees Salary>40000 and Name Starts with k</a></br></br>
    <a href="/displayAllSortByDesig">Display All Order By Desig</a></br></br>	
    <a href="/displayAllSortByDesigDes">Display All  Descending Order By Desig </a></br></br>
    <a href="/displayAllSortByDesigDeptDes">Display All  Descending Order By Desig And Dept </a></br></br>
    <a href="/displayJavaSortBySalary">Display JAva By Sorting Salary</a></br></br>	 -->


</body>
</html>