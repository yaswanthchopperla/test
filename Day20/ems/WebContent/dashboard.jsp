<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#mainDiv{
	border:1px solid black;
}
#mydetails {
   height:300px;
   width:500px;
  border:1px solid green;
  float:left;
}
#myManagerdetails {
     height:300px;
    border:1px solid red ;
   
}
#MyLeaveAppSec {
   height:250px;
  border:1px solid blue;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <div id="mainDiv" >
   	<div id="mydetails">
      <jsp:include page="mydetails.jsp"></jsp:include>
      
     </div>
     <div id="myManagerdetails">
      <jsp:include page="MyManagerDetails.jsp"></jsp:include>
    </div>
    <div id="MyLeaveAppSec">
       <jsp:include page="MyLeaveAppSec.jsp"></jsp:include>
    </div>
    </div>  
</body>
</html>