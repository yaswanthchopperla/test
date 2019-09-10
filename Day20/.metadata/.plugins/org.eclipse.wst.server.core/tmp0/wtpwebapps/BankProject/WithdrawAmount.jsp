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
<sql:update var="accounts" dataSource="${con}">
 update accounts set amount=amount-? where accountno=?
 <sql:param value="${param.withdrawamount}"></sql:param>
 <sql:param value="${param.accno}"></sql:param>
</sql:update>
<c:out value="Amount debited"/>
<sql:update var="trans" datSource="${con}">
insert into trans(accountno,transamount,transtype) values(?,?,?)
<sql:param value="${param.accno}"></sql:param>
<sql:param value="${param.withdrawamount}"></sql:param>
<sql:param value="${'D'}"/>
</sql:update>
</body>
</html>