package com.akhil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {
 @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // get response writer
        PrintWriter out = response.getWriter();
        //set response type
        response.setContentType("text/html");
    	// read the data from fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String dob =request.getParameter("dob");
          //gender
        String gender = request.getParameter("gender");
    //speaking languages
        String[] languages = request.getParameterValues("language");
        List  a1 = Arrays.asList(languages);  
        
        //add bootstrap
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n"
        		+ "\r\n"
        		+ "<!-- jQuery library -->\r\n"
        		+ "<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\r\n"
        		+ "\r\n"
        		+ "<!-- Popper JS -->\r\n"
        		+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n"
        		+ "\r\n"
        		+ "<!-- Latest compiled JavaScript -->\r\n"
        		+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n"+ "");
        //print data
       out.println("<div style='width:600px;margin:auto;margin-top:50px;'>");
       out.println("<table class='table table-hover table-striped'>");
       out.println("<tr>");
       out.println("<td>username</td>");
       out.println("<td>"+username+"</td>");
       out.println("</tr>");
        out.println("<tr>");
       out.println("<td>password</td>");
       out.println("<td>"+password+"</td>");
       out.println("</tr>");
       out.println("<tr>");
       out.println("<td>DOB</td>");
       out.println("<td>"+dob+"</td>");
       out.println("</tr>");
       out.println("<tr>");
       out.println("<td>Gender</td>");
       out.println("<td>"+gender+"</td>");
       out.println("</tr>");
       out.println("<tr>");
       out.println("<td>Languages</td>");
       out.println("<td>"+languages+"</td>");
       out.println("</tr>");
       out.println("</table");
       out.println("</div>");
       //close the stream
       out.close();        
    }
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
    	doPost(request,response);
    }
         
 }