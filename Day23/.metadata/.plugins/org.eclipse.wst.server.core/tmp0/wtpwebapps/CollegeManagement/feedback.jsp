<%@page import="com.hcl.college.Subjects"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.college.FeedbackCrud"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.hcl.college.HibernateUtil"%>
<%@page import="org.hibernate.Hibernate"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
  function submit() {
	  document.insta.submit();
  }

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
  String res=FeedbackCrud.feedbackId();
 List<String> lst=FeedbackCrud.searchByInstructor();
 

%>
<form method="get" name="insta" action="feedback.jsp">
FeedBack Id :
<input type="text" name="fid" value=<%=res %> />
Student Name :
 <input type="text" name="studentname"/> 
Instructor :
  <select name="instructor" onchange="submit()">
        
      <%
         for(String obj:lst) {
      %>
         
         <option ><%=obj%></option>
       
      <%
         }
          String instr=request.getParameter("instructor");
          out.println(instr);
          session.setAttribute("instr", instr);
          String fbid=request.getParameter("fid");
          session.setAttribute("fbid", fbid);
          String Name=request.getParameter("studentname");
          session.setAttribute("Name", Name);
      %>
  </select>
</form>
<form method="get" action="feedbackconform.jsp">
Subject :
 <select name="subject" >
    <%
      List<String> lst1=FeedbackCrud.searchBySubjects(instr);
      for(String obj1 : lst1) {
    %>
      
      <option><%=obj1%></option><br/><br/>
    <%
    }
    %> 
 </select>
 
Feedback :
<input type="radio" name="feedback" value="Excellent"/>Excellent<br/><br/>
<input type="radio" name="feedback" value="Good"/>Good<br/><br/>
<input type="radio" name="feedback" value="Adequate"/>Adequate<br/><br/>
<input type="radio" name="feedback" value="InAdequate"/>InAdequate<br/><br/>
<input type="radio" name="feedback" value="Bad"/>Bad<br/><br/>

<input type="submit" value="click"/>
</form>
</body>
</html>