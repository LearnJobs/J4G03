<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>

<%
    Date today = new Date();
    String dateStr = request.getParameter("datedebut");
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
    String ddMMyyyyToday = DATE_FORMAT.format(today);
    

    SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("MM/dd/yyyy");
    String MMddyyyyToday = DATE_FORMAT2.format(today);
    

    SimpleDateFormat DATE_FORMAT3 = new SimpleDateFormat("dd/mm/yyyy");
    String ddmmyyyyToday = DATE_FORMAT3.format(today);
    
    SimpleDateFormat DATE_FORMAT4 = new SimpleDateFormat("dd-MMM-yyyy");
    String ddMMMyyyyToday = DATE_FORMAT4.format(today);
    %>



<body>
<h1>JSP Date Demo</h1>

<p>Today's date in raw format is: <%= today %></p>

<p>Today's date in dd-MM-yyyy format is: <%= ddMMyyyyToday %></p>

<p>Today's date in MM/dd/yyyy format is: <%= MMddyyyyToday %></p>

<p>Today's date in dd/mm/yyyy format is: <%= ddmmyyyyToday %></p>

<p>Today's date in dd-MMM-yyyy format is: <%=  ddMMMyyyyToday %></p>

</body>
</html>