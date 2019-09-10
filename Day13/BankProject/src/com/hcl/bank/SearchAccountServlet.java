package com.hcl.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchAccountServlet
 */
public class SearchAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		 RequestDispatcher disp=request.getRequestDispatcher("MenuServlet");
	        disp.include(request, response);
		int accno=Integer.parseInt(request.getParameter("accountno"));
		Accounts objaccounts=AccountBaL.searchAccountsBal(accno);
		if(objaccounts!=null) {
			out.println("First Name "+objaccounts.getFirstName()+"<br/>");
			out.println("Last Name "+objaccounts.getLastName()+"<br/>");
			out.print("City "+ objaccounts.getCity()+"<br/>");
			out.print("State "+ objaccounts.getState()+"<br/>");
			out.print("Amount "+ objaccounts.getAmount()+"<br/>");
			out.print("CheqFacil "+ objaccounts.getCheqFacil()+"<br/>");
			out.print("AccountType "+ objaccounts.getAccountType()+"<br/>");
		} else {
			out.println("Account not found");
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
