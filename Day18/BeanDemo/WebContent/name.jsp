<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="bean1" class="com.hcl.beans.Name"></jsp:useBean>
 <jsp:setProperty property="firstname" name="bean1"/>
 <jsp:setProperty property="lastname" name="bean1"/>
 First Name :
 <b>
  <jsp:getProperty property="firstname" name="bean1"/></b> <br/>
 Last name :
 <b><jsp:getProperty property="lastname" name="bean1"/></b><br/>
 Full Name :
  <b>
     <%=bean1.fullname() %>
  </b>
</body>
</html>