package com.xworkz.jspform.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonServlet
 */
@WebServlet(loadOnStartup = 1,urlPatterns ="/Per")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public PersonServlet() {
    	
        // TODO Auto-generated constructor stub
    	System.out.println("created : "+getClass().getSimpleName());
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("running dopost in perso servlet.........");
		
		String ref=request.getParameter("first");
		String ref1=request.getParameter("last");
		String ref2=request.getParameter("gen");
		String ref3=request.getParameter("reason");
		String ref4=request.getParameter("address");
		
		System.out.println(ref);
		System.out.println(ref1);
		System.out.println(ref2);
		System.out.println(ref3);
		System.out.println(ref4);

	 RequestDispatcher dispatcher=request.getRequestDispatcher("display.jsp");
	 request.setAttribute( "first",ref);
	 request.setAttribute( "last",ref1);
	 request.setAttribute( "gen",ref2);
	 request.setAttribute( "reason",ref3);
	 request.setAttribute( "address",ref4);
	 dispatcher.forward(request, response);
	}

}
