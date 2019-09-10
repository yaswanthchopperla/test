package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepartmentSearchServlet
 */
public class DepartmentSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Connection con=DaoConnection.getConnection();
	   String cmd="select*from department where deptno=?";
	   try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(request.getParameter("deptno")));
		ResultSet rs=pst.executeQuery();
		if(rs.next()){
			out.println("deapartment is " + rs.getString("dname")+ "<br/>" );
			out.println("location is " + rs.getString("loc")+ "<br/>" );
			out.println("head is " + rs.getString("head")+ "<br/>" );
			
		} else {
			out.println("****record not found****");
		}
        
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
