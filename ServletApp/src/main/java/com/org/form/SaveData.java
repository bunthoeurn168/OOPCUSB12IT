package com.org.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletHomework
 */
@WebServlet("/SaveData")
public class SaveData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
		out.println("<tr><td>" + fname + " " + lname +"</td></tr>");
		// get the value of the button group
		String gender = request.getParameter("gender");
		// Compare selected value
		if ("Male".equals(gender)) {
			out.println("<tr><td>" + gender + "</td></tr>");
		}else if("Female".equals(gender)) {
			out.println("<tr><td>" + gender + "</td></tr>");
		}else {
			out.println("<tr><td>" + gender + "</td></tr>");
		}
		String vehicle[] = request.getParameterValues("vehicle"); // get checkbox name value "vehicle" and store in vehicle[] array
		for(int i = 0; i < vehicle.length; i++) { // apply loop fetch multiple checkbox value
			out.println("<tr><td>" + vehicle[i] + " " + "</td></tr>"); // fetch with comma seperate
		}
		String car = request.getParameter("cars");
		out.println("<tr><td>" + car + "</td></tr>");
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



















