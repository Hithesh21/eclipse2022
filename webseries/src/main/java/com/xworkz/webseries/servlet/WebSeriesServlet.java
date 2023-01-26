package com.xworkz.webseries.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/web")
public class WebSeriesServlet extends HttpServlet {
	
	
	public WebSeriesServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("created : "+getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in servlet");
	String name	=req.getParameter("NAME");
	String lang	=req.getParameter("LANGUAGE");
	String episodes	=req.getParameter("EPISODES");
	String ott=req.getParameter("OTT");
	String budget	=req.getParameter("BUDGET");
	
	System.out.println(name);
	System.out.println(lang);
	System.out.println(episodes);
	System.out.println(ott);
	System.out.println(budget);

		PrintWriter write=resp.getWriter();
		//String data="Send succesfully";
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span style='color:orange'>");
		write.print("web series name : " + name + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:blue'>");
		write.print("web series language : " + lang + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("web series episodes : " + episodes + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("web series ott : " + ott + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("web series budget : " + budget + " is sent successfully");
		write.print("<br>");
		write.print("</h1>");
		write.print("</body>");

		write.print("</html>");
		
		resp.setContentType("text/html");

		
	}

}
