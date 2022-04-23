package com.akhil;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class LoginServlet extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");
         
        System.out.println("username: " + username);
        System.out.println("password: " + password);
 
        String gender = request.getParameter("gender");
        System.out.println("Gender is: " + gender);
        
        String date=request.getParameter("dob");
        System.out.println("dateString:"+date);
        Date utilDate = null;
		try {
			utilDate = new SimpleDateFormat("yyyy-mm-dd").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        System.out.println("date:"+utilDate);
        
        String languages[] = request.getParameterValues("language");
        String langSelect = "";
        if (languages != null) {
        for (int i=0;i<languages.length;i++) {
        	langSelect= langSelect + languages[i]+ " , ";
            }
        }
        
        String phNum = request.getParameter("phone");
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + username + "<br/>";      
        htmlRespone += "Your password is: " + password + "</h2>";    
        htmlRespone += "<h2>Gender is:" + gender +"</h2>";
        htmlRespone += "<h2>DOB is: " + date +"</h2>";
        htmlRespone += "<h2>Speaking language is : " + langSelect +"</h2>";
        htmlRespone += "Phone Number: "+ phNum +"</h2>";
        htmlRespone += "</html>";
         
    
        
        // return response
        writer.println(htmlRespone);
         
    }
 
}