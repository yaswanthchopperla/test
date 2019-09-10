package com.hcl.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccountServlet
 */
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Accounts objaccounts=new Accounts();
	    PrintWriter out= response.getWriter();
	    RequestDispatcher disp=request.getRequestDispatcher("MenuServlet");
        disp.include(request, response);
	    int accno= new AccountDaO().generateAccountnoDao();
	    objaccounts.setAccountno(accno);
	    objaccounts.setFirstName(request.getParameter("firstName"));
	    objaccounts.setLastName(request.getParameter("lastName"));
	    objaccounts.setCity(request.getParameter("city"));
	    objaccounts.setState(request.getParameter("state"));
	    int amount=Integer.parseInt(request.getParameter("amount"));
	    objaccounts.setAmount(amount);
	    objaccounts.setCheqFacil(request.getParameter("cheqFacil"));
	    objaccounts.setAccountType(request.getParameter("accountType"));
	    String result=AccountBaL.createAccountBal(objaccounts); 
	      out.println(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
