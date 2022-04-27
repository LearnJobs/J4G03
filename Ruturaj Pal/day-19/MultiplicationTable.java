package com.lj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MultiplicationTable extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		int start = Integer.parseInt(req.getParameter("start"));
		int end = Integer.parseInt(req.getParameter("end"));
		int count = 0;
		
		try {
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<table border='1'>");
			out.println("<tr>");
			for(int i=start; i<=end; i++) {
				out.println("<td>");
				out.println("<table border='0'>");
				for(int j=1; j<=10; j++) {
					out.println("<tr>");
					out.println("<td align='right'>"+i+"</td>");
					out.println("<td align='center'>x</td>");
					out.println("<td align='right'>"+j+"</td>");
					out.println("<td align='right'>=</td>");
					out.println("<td align='right'>"+(i*j)+"</td>");
					out.println("</tr>");
				}
				out.println("</table>");
				out.println("<td>");
				count++;
				if(count>=8) {
					out.println("</tr>");
					out.println("<tr>");
					count = 0;
				}
			}
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		} catch(IOException e) {
			System.err.println(e);
		} catch(Exception e) {
			System.err.println(e);
		}
}
}
