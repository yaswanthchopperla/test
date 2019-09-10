<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
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
	select max(accountno)+1 accno from Accounts
</sql:query>
<c:set var="accno" value="0" />
<c:forEach var="e" items="${accounts.rows}">
	<c:set var="accno" value="${e.accno}" />
	</c:forEach>
Account No : <c:out value="${accno}" />
<sql:update var="accounts" dataSource="${con}">
  insert into accounts(accountno,firstname,lastname,city,state,amount,cheqfacil,accounttype)
  values(?,?,?,?,?,?,?,?)
  <sql:param value="${accno}"/>
  <sql:param value="${param.firstname}"/>
  <sql:param value="${param.lastname}"/>
  <sql:param value="${param.city}"/>
  <sql:param value="${param.state}"/>
  <sql:param value="${param.amount}"/>
  <sql:param value="${param.cheqfacil}"/>
  <sql:param value="${param.accounttype}"/>
</sql:update>
<c:out value="Account created suceesfully"/>
</body>
</html>