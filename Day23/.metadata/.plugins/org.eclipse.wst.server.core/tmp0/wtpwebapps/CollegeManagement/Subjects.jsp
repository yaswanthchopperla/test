
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.hcl.college.Subjects"%>
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
  function subject(val) {
	 var element=document.getElementById('theory');
	 var element1=document.getElementById('practical');
	   if(val=="C programming") {
		   element.value="30";
		   element1.value="12";
	   }
	   if(val=="Java") {
		   element.value="50";
		   element1.value="16";
	   }
	   if(val=="Mp & Mc") {
		   element.value="70";
		   element1.value="18";
	   }
	   if(val=="Python") {
		   element.value="40";
		   element1.value="20";
	   }
	   if(val=="Mathematics") {
		   element.value="20";
		   element1.value="12";
	   }
	   if(val=="OOPS") {
		   element.value="100";
		   element1.value="42";
	   }
  }

</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="Subjects.jsp">
   <center>
   Course:
    <select name="subjects" onchange="subject(this.value)">
      <option>Select option</option>
      <option value="C programming">C Programming</option>
      <option value="Java">Java</option>
      <option value="Mp & Mc">Mp & Mc</option>
      <option value="Python">Python</option>
      <option value="Mathematics">Maths</option>
      <option value="OOPS">OOPS</option>
    </select> <br/><br/>
    
    Theory :
    <input type="text" name="Theory" id="theory" readonly="readonly"/> <br/><br/>
    
    Pratical :
    <input type="text" name="Practical" id="practical" readonly="readonly"/> <br/><br/>
    
    Year :
    <input type="text" name="year"/> <br/><br/>
    
    Instructor :
    <input type="text" name="instructor"/> <br/><br/>  
    
    
    <input type="submit" value="click" />
   
    </center>
    </form>
    </body>
<%
  if(request.getParameter("subjects")!=null && request.getParameter("year")!=null &&
  request.getParameter("instructor")!=null) {
	  SessionFactory sf=HibernateUtil.getConnection();
	  Session s=sf.openSession();
	  Transaction t=s.beginTransaction();
	  Subjects obj=new Subjects();
	  obj.setSubject(request.getParameter("subjects"));
	  obj.setTheory(Integer.parseInt(request.getParameter("Theory")));
	  obj.setPractical(Integer.parseInt(request.getParameter("Practical")));
	  obj.setYear(Integer.parseInt(request.getParameter("year")));
	  obj.setInstructor(request.getParameter("instructor"));
	  s.save(obj);
	  t.commit();
	  out.println("Record Inserted");   
  }

%>
 <%-- <jsp:forward page="feedback.jsp"></jsp:forward> --%>

</form>
</body>
</html>