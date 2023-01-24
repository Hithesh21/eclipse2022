package com.xworkz.prize;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 4,urlPatterns = "/dele")
public class DelServer extends HttpServlet {
	
	
	public DelServer() {
		// TODO Auto-generated constructor stub
		System.out.println("created : "+getClass().getSimpleName());

	}
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doDelete... in server");

    }
    
}
