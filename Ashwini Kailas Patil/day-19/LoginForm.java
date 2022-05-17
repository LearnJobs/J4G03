package com.akhil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 



public class LoginForm extends HttpServlet {
 @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // get response writer
        PrintWriter out = response.getWriter();
        //set response type
        response.setContentType("text/html");
    	// read the data from fields
        String uname = request.getParameter("uname");
        String pwd= request.getParameter("pwd");
        String dob =request.getParameter("dob");
          //gender
        String gender = request.getParameter("gender");
    //speaking languages
        String[] languages = request.getParameterValues("lang");
        List  a1 = Arrays.asList(languages);  
      //qlfy
        String jobCat = request.getParameter("jobCat");
        //mobile
        String phone = request.getParameter("phone");
        //email
        String email = request.getParameter("email");
        //feedback
        String feedback = request.getParameter("feedback");
        
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
        out.println("<html>");
        out.println("<body>");
        out.println("<form>");
     
      out.println("<div style='width:600px;margin:auto;margin-top:50px;'>");
       out.println("<table class='table table-hover table-striped table-dark'>");
       out.println("<tr>");
       out.println("<h2 class='text-primary text-center text-light card-header bg-danger'><br>LoginForm</h2>");
       out.println("</tr>");
             out.println("<tr>");
       out.println("<td>Username</td>");
       out.println("<td>"+uname+"</td>");
       out.println("</tr>");
       out.println("<tr>");
       out.println("<td>Password</td>");
       out.println("<td>"+pwd+"</td>");
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
       out.println("<td>"+a1+"</td>");
       out.println("</tr>");
       out.println("<tr>");
       out.println("<td>Job Category</td>");
       out.println("<td>"+jobCat+"</td>");
       out.println("</tr>");
       out.println("<tr>");
       out.println("<td>MobileNumber</td>");
       out.println("<td>"+phone+"</td>");
       out.println("</tr>");
       out.println("<tr>");
       out.println("<td>Email</td>");
       out.println("<td>"+email+"</td>");
       out.println("</tr>");
       out.println("<tr>");
       out.println("<td>Feedback</td>");
       out.println("<td>"+feedback+"</td>");
       out.println("</tr>");

       out.println("</table");
       out.println("</div>");
       out.println("</form>");
       out.println("</body>");
       out.println("</html>");
    
       //close the stream
       out.close();        
    }
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
    	doPost(request,response);
    }
         
 }