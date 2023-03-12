package com.cebs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Home() {
        super();    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher dis=getServletContext().getRequestDispatcher("/header.html");
		dis.include(request, response);
		
		out.println("<div class='content'>");
		
		out.println("<h1>Home Page</h1>");
		out.println("<p>");
		out.println("This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.This is dummy text.");
		out.println("</p>");
		
		out.println("</div>");
		
		dis=getServletContext().getRequestDispatcher("/footer.html");
		dis.include(request, response);
	}

}












