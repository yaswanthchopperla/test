<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Student</h1>
        <form:form action="saveStudent" method="post" modelAttribute="student">
        <table>
            <tr>
                <td>RollNum:</td>
                <td><form:input path="RollNum" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="sName" /></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><form:input path="Age" /></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td><form:input path="Gender" /></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><form:input path="Country" /></td>
            </tr>
             <tr>
                <td>DateOfJoin:</td>
                <td><form:input path="DateOfJoin" /></td>
            </tr>
             <tr>
                <td>FinalMarks:</td>
                <td><form:input path="FinalScore" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>