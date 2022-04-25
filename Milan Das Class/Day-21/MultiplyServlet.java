package com.learnjobs;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiplyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("first"));
		int n2 = Integer.parseInt(req.getParameter("second"));
		int prod = n1 * n2;
		res.getWriter().println("<h2>Product of the 2 numbers is "+prod+"</h2>");

		res.getWriter().println("This is Mutiplication Servlet");
	}
}
