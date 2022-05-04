package com.mini;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class editable extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("stname");
		String faname=request.getParameter("faname");
		String moname=request.getParameter("moname");
		String gen=request.getParameter("gen");
		String date=request.getParameter("db");
		try {
			String urlString="jdbc:mysql://localhost:3306/STUDENTS";
			Connection con=DriverManager.getConnection(urlString,"root","");
			Statement st=con.createStatement();		
			
			st.executeUpdate("update STUDENTS set ID='"+id+"',ST_Name='"+name+"',Fa_Name='"+faname+"',Mo_Name='"+moname+"',Gender='"+gen+"',Date='"+date+"'");
            response.sendRedirect("View.jsp");
            
		}
		catch(Exception e) {
			
		}
		
	}
}