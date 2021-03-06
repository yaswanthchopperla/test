<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Exam Management Screen</title>
</head>
<body>
	<div align="center">
		<table border="1">
			<tr>
			<th>Id</th>
			<th>Subject</th>
			<th>Marks</th>
			<th>Student id</th>
			<th>Action</th>
			</tr>

			<c:forEach var="exam" items="${listSubMarks}">
				<tr>

					<td>${exam.id}</td>
					<td>${exam.subjectname}</td>
					<td>${exam.mark}</td>
					<td>${exam.studentid}</td>
					<td><a href="editSubject?id=${exam.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; 
						<a href="deleteSubject?id=${exam.id}">Delete</a></td>
						
				</tr>
			</c:forEach>
		</table>
		<h4>
			Add Exam Details<a href = "addSubMarks?id=<%=request.getParameter("id")%> ">here</a>
		</h4>
	</div>
</body>
</html>