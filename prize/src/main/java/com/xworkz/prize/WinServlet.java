package com.xworkz.prize;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/call")

public class WinServlet extends HttpServlet {
	
	public WinServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("created : "+getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in server");
		String data="this is get method respose to client";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPOST in server");
		String data="this is POST method respose to client";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPUT IN SERVER...");
		String data="this is PUT----- method respose to client";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	
	}

}
