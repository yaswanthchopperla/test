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
     url="jdbc:mysql://localhost:3306/sqlpratice"
     user="root"
     password="root"/>
<sql:query var="deptQuery" dataSource="${con}">
    select * from department where deptno=?
    <sql:param value="${param.deptno}" ></sql:param>
</sql:query>
<c:set var="flag" value="0" />
<c:forEach var="d" items="${deptQuery.rows}">
Dept No :
<c:out value="${d.deptno}" /> <br/>
Dept Name :
<c:out value="${d.dname}"/> <br/>
Location :
<c:out value="${d.loc}" /> <br/>
Head :
<c:out value="${d.head}"/> <br/>
<c:set var="flag" value="1"/>
</c:forEach>
<c:if test="${flag==0}">
 <c:out value="Dept Not found"/>
</c:if>
</body>
</html>