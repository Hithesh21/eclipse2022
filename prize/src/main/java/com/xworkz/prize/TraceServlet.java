package com.xworkz.prize;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 3,urlPatterns = "/trace")
public class TraceServlet extends HttpServlet {
	
	
	public TraceServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("created : "+getClass().getSimpleName());

	}
     @Override
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 System.out.println("running doTRACE IN SERVER...");
// 		String data="this is TRACE----- method respose to client";
// 		PrintWriter write=resp.getWriter();
// 		write.print(data);
// 		resp.setContentType("text/plain");
    }
}
