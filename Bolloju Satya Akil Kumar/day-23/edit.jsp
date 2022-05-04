<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

int id = Integer.parseInt(request.getParameter("edit"));
Class.forName("com.mysql.jdbc.Driver");
String urlString="jdbc:mysql://localhost:3306/STUDENTS";
Connection con=DriverManager.getConnection(urlString,"root","");
Statement st=con.createStatement();



ResultSet se=st.executeQuery("select * from STUDENTS WHERE STUDENT_ID='"+id+"'");

%>
<form action="edit">
<%while(se.next()){ %>
<input type="text" name="id" value='<%= se.getString(1)%>'>
<input type="text" name="name" value="<%= se.getString(2)%>">
<input type="text" name="fname" value="<%= se.getString(3)%>">
<input type="text" name="mname" value="<%= se.getString(4)%>">
<select name="gen">
<option value="male">male</option>
<option value="female">female</option>
<option  value="others">others</option>
</select>
<input type="text"name="db" value="<%= se.getString(5)%>">

<input type="submit" name="" value="edit">
<%} %>
</form>
</body>
</html>