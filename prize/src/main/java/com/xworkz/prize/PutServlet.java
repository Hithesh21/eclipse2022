package com.xworkz.prize;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/put")
public class PutServlet extends HttpServlet {
	
	public PutServlet() {
System.out.println("created : "+getClass().getSimpleName());
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPUT IN SERVER...");
//		String data="this is PUT----- method respose to client";
//		PrintWriter write=resp.getWriter();
//		write.print(data);
//		resp.setContentType("text/plain");
	
	}

}
