package com.hcl.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowEnvServlet
 */
public class ShowEnvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowEnvServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   ServletConfig cfg=getServletConfig();
	   ServletContext ctx=getServletContext();
	   PrintWriter out=response.getWriter();
	   response.setContentType("text/html");
	   out.println("Name of the servlet is :"+cfg.getServletName()+"<br/>");
	   out.println("Major version of servlet is :"+ctx.getMajorVersion()+"<br/>");
	   out.println("Minor version of servlet is :"+ctx.getMinorVersion()+"<br/>");
	   out.println("Servlet path is :"+request.getServletPath()+"<br/>");
	   out.println("Server info :"+ ctx.getServerInfo()+"<br/>");
	   out.println("Port No is:"+request.getServerPort()+"<br/>");
	   out.println("Client IP Adress :"+request.getRemoteAddr()+"<br/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
