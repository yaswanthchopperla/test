<%@page import="com.hcl.inventory.Inventory"%>
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
<jsp:useBean id="bean1" class="com.hcl.inventory.SearchStock"></jsp:useBean>
<jsp:setProperty property="*" name="bean1"/>
<%
  Inventory obj=bean1.SearchStock();
  if(obj!=null) {
	  out.println("ItemName is :"+ obj.getItemName());
	  out.println("Price is :"+obj.getPrice());
	  out.println("QuantityAvail is :"+obj.getQuantityAvail());
  } else {
	  out.println("***stock not found***");
  }
%>
</body>
</html>