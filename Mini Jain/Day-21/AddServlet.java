
	package com.mini;



	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@SuppressWarnings("serial")
	public class AddServlet extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			int start = Integer.parseInt(req.getParameter("first"));
			int second = Integer.parseInt(req.getParameter("second"));
			int sum = start + second;
			
			PrintWriter out = res.getWriter();
			out.println("The first number is " + start + "<br>");
			out.println("The second number is " + second + "<br>");
			out.println("The SUM is " + sum + "<br>");
			out.println("<br>");
			out.println("<a href='multiply?first="+start+"&second="+second+"'>Multiply</a>");
			out.println("<br>");
		}
	}

