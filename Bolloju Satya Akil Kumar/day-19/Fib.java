package com.lij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fib extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		try {
            res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			int n1 = 0, n2 = 1, n3, i;
			int no= Integer.parseInt(req.getParameter("no"));
			// printing 0 and 1
			out.println("<html>");
			out.println("<body>");
			out.print("<table border='3'>");
			out.print("<tr>");
			out.print("<td>" +0+ "</td>");
			out.print("</tr>");
			out.print("<tr>");
			out.print("<td>" +1+ "</td>");
			out.print("</tr>");

			for (i = 2; i < no; i++)
			// loop starts from 2 because 0 and 1 are already printed
			{

				n3 = n1 + n2;
				out.print("<tr>");
			
				out.print("<td>" + n3 + "</td>");
				out.print("</tr>");
				n1 = n2;
				n2 = n3;
			}
			
			out.print("</table>");
			out.println("</body>");
			out.println("</html>");

		} catch (IOException e) {
		}
	}
}
