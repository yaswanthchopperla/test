<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="con"
     driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost:3306/bank"
     user="root"
     password="root" />
<sql:query var="accounts" dataSource="${con}">
 select * from accounts where accountno=?
 <sql:param value = "${param.accno}"></sql:param>
</sql:query>
<c:forEach var="e" items="${accounts.rows}">
FirstName :
<c:out value="${e.firstname}"/> <br/>
SecondName:
<c:out value="${e.lastname}"/> <br/>
City :
<c:out value="${e.city}"/> <br/>
State :
<c:out value="${e.state}"/> <br/>
Amount :
<c:out value="${e.amount}"/> <br/>
CheqFacility :
<c:out value="${e.cheqfacil}"/> <br/>
Accounttype :
<c:out value="${e.accountype}"/> <br/>
</c:forEach>
</body>
</html>