package com.nt.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = null;
		String name=null;
		int age=0;
		
		pw=res.getWriter();
		
		res.setContentType("text/html");
		
		name=req.getParameter("pname");
		age=Integer.parseInt(req.getParameter("page"));
		
		//b.logic
		
		if(age<18)
			pw.println("<h1 style='color:red;text-align:center'>"+" MR/MISS "+ name +" YOU ARE NOT ELLIGIBLE FOR VOTING</h1>");
		else
			pw.println("<h1 style='color:green;text-align:center'>"+ " MR/MISS/MRS "+ name +" YOU ARE ELLIGIBLE FOR VOTING</h1>");
		
		pw.println("<br> <a href='http://localhost:4040/Proj4-VoteApp/input.html'><h1 style='color:cyan'>HOME</h1></a>");

		pw.close();
	}
}
