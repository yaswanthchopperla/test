package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchBooksServlets
 */
public class SearchBooksServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBooksServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     PrintWriter out=response.getWriter();
	     String searchtype=request.getParameter("searchtype");
	     String input=request.getParameter("userchoice");
	     List<Library> obj=LibraryBaL.searchbal(searchtype, input);
	     out.println("<form method='get' action='IssueServlet'><table border = '3'>");
			out.println("<tr><th>Book Id</th><th>Book Name</th><th>Author</th><th>Edition</th><th>Dept</th><th>Total Books</th>");
			for (Library lib : obj) {
				out.println("<tr><td>" + lib.getId() + "</td>");
				out.println("<td>" + lib.getName() + "</td>");
				out.println("<td>" + lib.getAuthor() + "</td>");
				out.println("<td>" + lib.getEdition() + "</td>");
				out.println("<td>" + lib.getDept() + "</td>");
				out.println("<td>" + lib.getTotalbooks() + "</td>");
				if (lib.getTotalbooks() > 0) {
					out.println("<td><input type = 'checkbox' name = 'bookid' value = " + lib.getId() + "</td></tr>");
				} else {
					out.println("<td><input type = 'checkbox' name = 'bookid' disabled </td></tr>");
				}
			}
out.println("<tr><td><center><input type='submit' value='issue' /></center></form></td></tr>");
	     
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
