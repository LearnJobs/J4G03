package com.lj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeNo extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		PrintWriter out=res.getWriter();
		int count=0;
		boolean yn;
		
		out.println("<table border='1' celpadding='5'>");
		out.println("<tr>");
		for(int i=1000;i<=2000;i++) {
			yn=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					yn=false;
					break;
				}
			}
			if(yn) {
				out.println("<td>"+i+"<td>");
				count++;
				if(count>=15) {
					out.println("/tr");
					out.println("/tr");
					count=0;
				}
			}
		}
		out.println("/tr");
		out.println("/table");
	}

}
