/*
 * Create a Java servlet that uses session management to maintain the state of the
	user across multiple requests. The servlet should store the user's name in a session
	object and display it on multiple pages of the web application
 * 
 */



package com.infosys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("sname");
		String age = request.getParameter("sage");
       
		HttpSession session = request.getSession();
		
		session.setAttribute("sname", name);
		session.setAttribute("sage", age);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("form2.html");
		requestDispatcher.forward(request, response);
		
		
	}

	

}
