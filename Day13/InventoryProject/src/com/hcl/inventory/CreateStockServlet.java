package com.hcl.inventory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateStockServlet
 */
public class CreateStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateStockServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   Inventory obj=new Inventory();
	   String stockid=new InventoryDaO().generateStockIdDao();
	   obj.setStockid(stockid);
	   obj.setItemName(request.getParameter("itemname"));
	   obj.setPrice(Integer.parseInt(request.getParameter("price")));
	   obj.setQuantityAvail(Integer.parseInt(request.getParameter("quantityavail")));
	   PrintWriter out=response.getWriter();
	   String result=InventoryBaL.createStockBal(obj);
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
