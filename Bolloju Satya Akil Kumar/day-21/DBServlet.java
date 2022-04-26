package com.akhil;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DBServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("org.gjt.mm.mysql.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM product");
			ResultSetMetaData rsmd = rs.getMetaData();
			
			PrintWriter out = res.getWriter();
			out.println("<table border='1'>");
			out.println("<tr>");
			// header
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				out.println("<td>"+rsmd.getColumnLabel(i)+"</td>");
			}
			out.println("</tr>");

			while(rs.next()) {
				out.println("<tr>");
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					out.println("<td>"+rs.getString(i)+"</td>");
				}
				out.println("</tr>");
			}
			
			out.println("</table>");
			
			rs.close(); stmt.close(); conn.close();
		} catch(Exception e) {
			System.err.println(e);
		}
	}
}