<%@page import="com.hcl.college.FeedbackCrud"%>
<%@page import="com.hcl.college.Feedback"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.hcl.college.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <%
         String fbid=(String)session.getAttribute("fbid");
         String Name=(String)session.getAttribute("Name");
         String subject=request.getParameter("subject");
         String inst=(String)session.getAttribute("instr");
         String fbvalue=(request.getParameter("feedback"));
      %>
      <form method="get" action="feedbackconform.jsp">
        <center>
        Fbid :
        <input type="text" name="fid" value=<%=fbid %> /><br/>
        
        Name :
        <input type="text" name="name" value=<%=Name %> /><br/>
        
        Subject :
        <input type="text" name="subject" value=<%=subject %> /><br/>
        
        Instructor :
        <input type="text" name="instructor" value=<%=inst %> /><br/>  
        
        fbvalue :
        <input type="text" name="fbvalue" value=<%=fbvalue %> /><br/>   
        
        <input type="submit" value="confirm"/>   
        
        </center>
      </form>
      
      <%
          if(request.getParameter("fid")!=null && request.getParameter("name")!=null &&
            request.getParameter("subject")!=null) {
        	  Feedback f=new Feedback();
        	  f.setFid(request.getParameter("fid"));
        	  f.setStudentName(request.getParameter("name"));
        	  f.setSubject(request.getParameter("subject"));
        	  f.setInstructor(request.getParameter("instructor"));
        	  f.setFbvalue(request.getParameter("fbvalue"));
        	  String result=FeedbackCrud.insertFeedback(f);
        	  out.println(result);
          }
      
      
      %>
</body>
</html>