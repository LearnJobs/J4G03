package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VowelCount extends HttpServlet {
	
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter o = res.getWriter();
		String text2count = req.getParameter("str2count");
		String vowels = "AEIOUaeiou";
		int count = 0;
		char c;

		for(int i=0; i<text2count.length(); i++) {
			c = text2count.charAt(i);
			for(int j=0; j<vowels.length(); j++) {
				if(c==vowels.charAt(j)) {
					count++;
					break;
				}
			}
		}
		o.println("<h1>Vowel Count for \"" + text2count + "\" is " + count + "</h2><br><br>");
	}

}
