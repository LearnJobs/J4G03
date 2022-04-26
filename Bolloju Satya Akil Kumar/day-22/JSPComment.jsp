<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! public String padLeft(String data, int length) {
			StringBuffer buf = new StringBuffer(data);
			for(int i=buf.length(); i<length; i++) {
				buf.insert(0,"&nbsp;");
			}
			return buf.toString();
	} %>

	<%-- This JSP comment doesn't go to the HTML  --%>
	<!-- This JSP comment goes to the HTML  -->
	<!--  JSPComment_jsp.java  -->
	<% Date date = new Date(); %>
	<h1><%=date %></h1>
	<h1><%= padLeft("akhil",30) %><marquee>akhil</marquee></h1>
</body>
</html>
