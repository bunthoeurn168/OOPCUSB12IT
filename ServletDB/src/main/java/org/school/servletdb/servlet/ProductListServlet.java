package org.school.servletdb.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.school.servletdb.bean.Product;
import org.school.servletdb.conn.DatabaseConnection;
import org.school.servletdb.util.DBUtils;


/**
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/productList")
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Initialize the database
		String errorString = null;
		List<Product> list = null;
		try {
			Connection conn = DatabaseConnection.initializeDatabase();
			list = DBUtils.queryProduct(conn);
			
		} catch (ClassNotFoundException e) {
			errorString = e.getMessage();
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Store info in request attribute, before forward to views
		request.setAttribute("errorString", errorString);
		request.setAttribute("productList", list);
		
		// Forward to /WEB-INF/views/productListView.jsp
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/WEB-INF/views/productListView.jsp");
		rd.forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
