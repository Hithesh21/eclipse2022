package com.xworkz.webseries.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/king")
public class KingServlet extends HttpServlet {
	
	public KingServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("created king servlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget of king servlet");
		String ref=req.getParameter("name");
		String ref1=req.getParameter("region");
		String ref2=req.getParameter("queens");
		String ref3=req.getParameter("ruled");
		
		System.out.println(ref);
		System.out.println(ref1);
		System.out.println(ref2);
		System.out.println(ref3);

		PrintWriter write=resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span style='color:orange'>");
		write.print("king name : " + ref + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:blue'>");
		write.print("king region : " + ref1 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("no of queens : " + ref2 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("king ruled : " + ref3 + " is sent successfully");
		
		write.print("</h1>");
		write.print("</body>");

		write.print("</html>");
		
		resp.setContentType("text/html");
		
	}

}
