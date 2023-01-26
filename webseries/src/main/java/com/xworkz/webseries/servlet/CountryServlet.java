package com.xworkz.webseries.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 3,urlPatterns = "/country")
public class CountryServlet extends HttpServlet {
	
	
	public CountryServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("created : "+getClass().getSimpleName());

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget of country servlet");

		String ref=req.getParameter("name");
		String ref1=req.getParameter("continent");
		String ref2=req.getParameter("code");
		String ref3=req.getParameter("population");
		String ref4=req.getParameter("pm");
		String ref5=req.getParameter("tenure");
		String ref6=req.getParameter("president");
		String ref8=req.getParameter("ptenure");
		String ref9=req.getParameter("states");
        String ref10=req.getParameter("pci");
		String ref11=req.getParameter("occupation");
		String ref13=req.getParameter("region");
		String ref14=req.getParameter("visa");
		String ref15=req.getParameter("import");
		String ref16=req.getParameter("export");
		String ref18=req.getParameter("currency");
		
		System.out.println(ref);
		System.out.println(ref1);
		System.out.println(ref2);
		System.out.println(ref3);
		System.out.println(ref4);
		System.out.println(ref5);
		System.out.println(ref6);
		System.out.println(ref8);
		System.out.println(ref9);
		System.out.println(ref10);
		System.out.println(ref11);
		System.out.println(ref13);
		System.out.println(ref14);
		System.out.println(ref15);
		System.out.println(ref16);
		System.out.println(ref18);
		
		

		PrintWriter write=resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span style='color:orange'>");
		write.print("country name : " + ref + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:blue'>");
		write.print("continent : " + ref1 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("code : " + ref2 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("population : " + ref3 + " is sent successfully");
		write.print("<br>");
		
		write.print("<span style='color:orange'>");
		write.print("prime minister name : " + ref4 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:blue'>");
		write.print("tenure : " + ref5 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("president : " + ref6 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("ptenure : " + ref8 + " is sent successfully");
		write.print("<br>");
		
		write.print("<span style='color:orange'>");
		write.print("states : " + ref9 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:blue'>");
		write.print("pci : " + ref10 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("main occupation : " + ref11 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("region : " + ref13 + " is sent successfully");
		write.print("<br>");


		write.print("<span style='color:orange'>");
		write.print("visa fees : " + ref14 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:blue'>");
		write.print("main import : " + ref15 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("main export : " + ref16 + " is sent successfully");
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("currency : " + ref18 + " is sent successfully");

		write.print("</h1>");
		write.print("</body>");
        write.print("</html>");
		resp.setContentType("text/html");
		


	}
}
