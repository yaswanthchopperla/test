<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form method="post" commandpath="Student" action="addStudent">
<center>
 Roll No :

 <sf:input type="text" path="RollNum"/><br/><br/>
 
 SName :
 <sf:input type="text" path="sName"/><br/><br/>
 
 Age :
 <sf:input type="text" path="Age"/><br/><br/>
 
 Gender :
 <sf:input type="radio" path="Gender" value="Male"/>Male<br/><br/>
 <sf:input type="radio" path="Gender" value="Female"/>Female<br/><br/>
 
 Country :
 <sf:select path="Country">
   <option>Select One option</option>
   <sf:option value="India">INDIA</sf:option>
   <sf:option value="USA">USA</sf:option>
   <sf:option value="Newzland">Newzland</sf:option>
   <sf:option value="Australia">Australia</sf:option>
 </sf:select><br/><br/>
 
 DateOfJoin :
 <sf:input type="date" path="DateofJoin"/><br/><br/>
 
 FianlScore :
 <sf:input type="text" path="FinalScore"/><br/><br/>
 
 <input type="submit" value="AddStudent"/>

</center>
</sf:form>
</body>
</html>