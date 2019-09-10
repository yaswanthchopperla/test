<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.html"></jsp:include>
<form method="get" action="DepositAccount.jsp">
 <center>
  Account No :
  <input type="text" name="accno"/> <br/><br/>
  
  DepositAmount :
  <input type="text" name="depositamount"/> <br/><br/>
  
  <input type="submit" value="deposit"/>
 
 </center>
</form>
</body>
</html>