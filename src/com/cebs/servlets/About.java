package com.cebs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class About
 */
public class About extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public About() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher dis=getServletContext().getRequestDispatcher("/header.html");
		dis.include(request, response);
		
		out.println("<div class='content'>");
		
		out.println("<h1>About Page</h1>");
		out.println("<p>");
		out.println("This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.");
		out.println("</p>");
		
		out.println("</div>");
		
		dis=getServletContext().getRequestDispatcher("/footer.html");
		dis.include(request, response);
	}

}
