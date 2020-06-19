package com.nt.servlet;

import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishMessageServlet extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=null;
		Calendar calendar =null;
		int hour=0;

		pw=res.getWriter();

		res.setContentType("text/html");

		calendar = Calendar.getInstance();

		hour=calendar.get(Calendar.HOUR_OF_DAY);

		if(hour<12)
			pw.println("<h1 style='color:orange;text-align:center'>GOOD MORNING</h1>");
		else if(hour<16)
			pw.println("<h1 style='color:black;text-align:center'>GOOD AFTERNOON</h1>");
		else if(hour<20)
			pw.println("<h1 style='color:pink;text-align:center'>GOOD EVENING</h1>");
		else
			pw.println("<h1 style='color:cyan;orange;text-align:center'>GOOD NIGHT</h1>");

		pw.println("<br><a href='http://localhost:4040/Proj3-WishApp/page.html'>HOME</a>");

		//res.setHeader("refresh","1");
		res.setIntHeader("refresh", 1);
		pw.println(java.time.LocalDateTime.now());
		
		pw.close();

	}

}