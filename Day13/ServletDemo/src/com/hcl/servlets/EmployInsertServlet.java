package com.hcl.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployInsertServlet
 */
public class EmployInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=DaoConnection.getConnection();
		String cmd="Insert into  Employ values(?,?,?,?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, Integer.parseInt(request.getParameter("empno")));
			pst.setString(2, request.getParameter("name"));
			pst.setString(3, request.getParameter("dept"));
			pst.setString(4, request.getParameter("desig"));
			pst.setInt(5, Integer.parseInt(request.getParameter("basic")));
			pst.executeUpdate();
			response.getWriter().println("***record inserted***");
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
