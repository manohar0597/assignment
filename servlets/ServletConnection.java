package com.cts.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConnection
 */
//@WebServlet("/ServletConnection")
public class ServletConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConnection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter print = response.getWriter();
		
		String user = request.getParameter("email");
		String psw = request.getParameter("pwd");
		
		if(psw.equals("lol")){
//			response.sendRedirect("welcome");
			RequestDispatcher dispatch = request.getRequestDispatcher("/welcome");
			dispatch.forward(request, response);
		}
		else{
			RequestDispatcher dispatch = request.getRequestDispatcher("Login.html");
			dispatch.include(request, response);
			print.println(user + "  " + psw + "  are wrong");
		}
		
		
	}

}
