

	package com.mini;



	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Enumeration;

	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;



	@SuppressWarnings("serial")
	public class LoginServlet extends HttpServlet {
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			String username = req.getParameter("user");
			String password = req.getParameter("password");

			PrintWriter out = res.getWriter();
			
			out.println("<h2>" + username + "</h2>");
			out.println("<h2>" + password + "</h2>");
			
			/* ----------------------------------------------------------- */
			
			Enumeration<String> pNames = req.getParameterNames();
			String parameter;
			String value;
			out.println("<table border='1' cellspacing='5'>");
			while(pNames.hasMoreElements()) {
				parameter = pNames.nextElement();
				value = req.getParameter(parameter);
				out.println("<tr>");
				out.println("<td>"+ parameter + "</td>");
				out.println("<td>" + value + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<br><br>");
		}
	}

}
