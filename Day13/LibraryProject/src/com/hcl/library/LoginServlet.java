package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   PrintWriter out=response.getWriter();
	   String user=request.getParameter("username");
	   String pwd=request.getParameter("password");
	   String result=LibraryBaL.librarybal(user, pwd);
	   out.println(result);
	  if(result=="login successfully") {
		  RequestDispatcher disp=request.getRequestDispatcher("menu.html");
		  disp.forward(request, response);
	  }  else {
		  RequestDispatcher disp=request.getRequestDispatcher("login.html");
		  disp.include(request, response);
		  
	  }
	  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
