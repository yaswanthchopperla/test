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
<form method="get" action="CreateAccount.jsp">
     <center>
     First Name :
       <input type="text" name="firstname"/> <br/><br/>
       
    Last  Name :
       <input type="text" name="lastname"/> <br/><br/>
       
       City :
       <input type="text" name="city"/> <br/><br/>
       
       State :
       <input type="text" name="state"/> <br/><br/>
    
       Amount :
       <input type="text" name="amount"/> <br/><br/>
       
       Cheqfacil :
        <input type="text" name="cheqfacil"/> <br/><br/>
        
        Account Type :
        <input type ="text" name="accounttype"/> <br/><br/>
         <input type="submit" value="AddAccount"/>
    
     </center>
    
     </form>
</body>
</html>