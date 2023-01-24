package com.xworkz.prize;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5,urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
	
public HelloServlet() {
	// TODO Auto-generated constructor stub
	System.out.println("created : "+getClass().getSimpleName());

}	
@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	System.out.println("created doHEAD.....IN SERVER ");

	}
}
