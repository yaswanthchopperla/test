<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <h1>ADD SUBJECT MARKS</h1>
        <form:form action="saveSubMarks" method="post" modelAttribute="exam">
        <h1>New Exam Details form for the student : <%=request.getParameter("sname") %></h1>
        <table>
        <form:hidden path="id"/>
            <tr>
				<td>StudentId:</td>
				<td><form:input path = "studentid" value="${exam.studentid}" readonly="true"/></td>
            </tr>
            <tr>
            	<td>Subject :</td>
            	<td><form:select path="subjectname">
            			<form:option value="Maths">Maths</form:option>
            			<form:option value="Physics">Physics</form:option>
            			<form:option value="Chemistry">Chemistry</form:option>
            			<form:option value="Biology">Biology</form:option>
            			<form:option value="Social">Social</form:option>
            	    </form:select>
            	</td>
           </tr>
           <tr>
           		<td>Marks:</td>
           		<td><form:input path="mark"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>