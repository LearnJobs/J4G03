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
    Class.forName("com.mysql.jdbc.Driver");
  String urlString="jdbc:mysql://localhost:3306/STUDENTS";
  Connection con=DriverManager.getConnection(urlString,"root","");
  Statement st=con.createStatement();
  ResultSet set=st.executeQuery("select * from STUDENTS");
  %>
  
  <table border="3">
  <%while(set.next()){ %>
  <tr>

  <td><%=set.getString(1) %></td>
  <td><%=set.getString(2) %></td>
  <td><%=set.getString(3) %></td>
  <td><%=set.getString(4) %></td>
  <td><%=set.getString(5) %></td>
  <td><%=set.getString(6) %></td>

   
<td><a href="Delete.jsp?del=<%=set.getString(1)%>">Delete</a></td>
<td><a href="edit.jsp?edit=<%=set.getString(1) %>">Edit</a></td>
<td><a href="AddRow.jsp?AddRow=<%=set.getString(1) %>">AddRow</a></td>

  </tr>
  <%} %>
  </table>
</body>
</html>