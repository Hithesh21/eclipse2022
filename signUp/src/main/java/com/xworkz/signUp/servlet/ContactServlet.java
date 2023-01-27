package com.xworkz.signUp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/con")
public class ContactServlet extends HttpServlet {
	
	
	public ContactServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("created : " +getClass().getSimpleName());

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost in contact servlet");
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String mob=req.getParameter("mobile");
        Long convertedMob=Long.parseLong(mob);
        String com=req.getParameter("com");
        
        System.out.println(name);
        System.out.println(email);
        System.out.println(mob);
        System.out.println(com);
        
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
  		if(email.length()>10) {
  	  		System.out.println("email is valid");	
  	  		write.print("<span style='color:orange'>");
  	  		write.print("sent successfully email : " +email );
  	  		write.print("<br>");
  	  		}else {
  	  			write.print("<span style='color:red'>");
  	  	  		write.print("invalid email : " + email );
  	  	  		write.print("<br>");

  	  		}
  		if(convertedMob>0) {
  	  		System.out.println("mobile is valid");	
  	  		write.print("<span style='color:orange'>");
  	  		write.print("sent successfully mobile : " +convertedMob );
  	  		write.print("<br>");
  	  		}else {
  	  			write.print("<span style='color:red'>");
  	  	  		write.print("invalid Mobile : " +convertedMob );
  	  	  		write.print("<br>");

  	  		}
   		write.print("</h1>");
   		write.print("<a href=contact.html>");
   		write.print("<input type=submit value=Back>");
        write.print("</a href>");
        write.print("<a href=index.html>");
   		write.print("<input type=submit value=HOME>");
        write.print("</a href>");
         write.print("</body>");
  		 write.print("</html>");


	}

}
