package com.xworkz.signUp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/up")
public class SignUpServlet extends HttpServlet {
	
	public SignUpServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("created : " +getClass().getSimpleName());
	}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          System.out.println("running doPost in signUp servlet");
          String name=req.getParameter("name");
          String email=req.getParameter("email");
          String start=req.getParameter("start");
          String dest=req.getParameter("dest");
          String gender=req.getParameter("gender");
          
          System.out.println(name);
          System.out.println(email);
          System.out.println(start);
          System.out.println(dest);
          System.out.println(gender);
          
          PrintWriter write=resp.getWriter();
          write.print("<html>");
  		write.print("<body>");
  		
  		write.print("<h1>");
  		
  		if(name.length()>3) {
  		System.out.println("name is valid");	
  		write.print("<span style='color:orange'>");
  		write.print("sent successfully name : " + name );
  		write.print("<br>");
  		}else {
  			write.print("<span style='color:red'>");
  	  		write.print("invalid name : " + name );
  	  		write.print("<br>");

  		}
  		if(start.length()>3) {
  	  		System.out.println("start is valid");	
  	  		write.print("<span style='color:orange'>");
  	  		write.print("sent successfully start : " +start );
  	  		write.print("<br>");
  	  		}else {
  	  			write.print("<span style='color:red'>");
  	  	  		write.print("invalid start : " + start );
  	  	  		write.print("<br>");

  	  		}
  		if(dest.length()>3) {
  	  		System.out.println("destination is valid");	
  	  		write.print("<span style='color:orange'>");
  	  		write.print("sent successfully Destination : " + name );
  	  		write.print("<br>");
  	  		}else {
  	  			write.print("<span style='color:red'>");
  	  	  		write.print("invalid Destination : " +dest );
  	  	  		write.print("<br>");

  	  		}
  		write.print("</h1>");
  		write.print("<a href=index.html>");
  		write.print("<input type=submit value=Home >");
  		write.print("</a href>");
		write.print("</body>");
        write.print("</html>");
		resp.setContentType("text/html");
		
    }
}
