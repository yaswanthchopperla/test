package com.hcl.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   PrintWriter out = response.getWriter();
	   Cookie ckAnand=new Cookie("Anand","52");
	   ckAnand.setMaxAge(1000*24*60*60);
	   response.addCookie(ckAnand);
	   
	   Cookie ckSharma=new Cookie("Sharma","62");
	   ckAnand.setMaxAge(1000*24*60*60);
	   response.addCookie(ckSharma);
	   
	   Cookie ckYash=new Cookie("yash","90");
	   ckAnand.setMaxAge(1000*24*60*60);
	   response.addCookie(ckYash);
	   
	   Cookie ckTushar=new Cookie("Tushar","82");
	   ckAnand.setMaxAge(1000*24*60*60);
	   response.addCookie(ckTushar);
	   
	   Cookie ckAmit=new Cookie("Amit","42");
	   ckAnand.setMaxAge(1000*24*60*60);
	   response.addCookie(ckAmit);
	    out.println("cookie created successfully<br/><br/>");
	    out.println("<a href='ShowCookieServlet'>show Cookie</a>");
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
