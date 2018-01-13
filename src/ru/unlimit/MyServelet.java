package ru.unlimit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServelet
 */
@WebServlet("/MyServelet")
public class MyServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name  = request.getParameter("firstname");
		String lastname  = request.getParameter("lastname");
		String[] jobs  = request.getParameterValues("job");
		String gender  = request.getParameter("gender");
		if (gender==null) {
				gender="-"; 
		}
		String age18  = request.getParameter("age18");
		if (age18==null) {
			age18="-"; 
	}
		
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF8");
		//response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<h3>People</h3>");
		out.println("Name: "+name+"<br>");
		out.println("Family: "+lastname+"<br>");
		out.println("Job: "+Arrays.deepToString(jobs)+"<br>");
		 
		out.println("Gender: "+gender+"<br>");
		out.println("Age18: "+age18+"<br>");
		
		out.close();
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name  = request.getParameter("firstname");
		String lastname  = request.getParameter("lastname");
		String job  = request.getParameter("job");
		String gender  = request.getParameter("gender");
		String age18  = request.getParameter("age18");
		
		
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF8");
		//response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<h3>People</h3>");
		out.println("Name: "+name+"<br>");
		out.println("Family: "+lastname+"<br>");
		out.println("Job: "+job+"<br>");
		out.println("Gender: "+gender+"<br>");
		out.println("Age18: "+age18+"<br>");
		
		out.close();
	}

}
