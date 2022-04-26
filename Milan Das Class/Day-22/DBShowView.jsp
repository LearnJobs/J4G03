<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%-- STEP-1: Import java.sql package --%>
<%@ page import="java.sql.*" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Database View</h1>
	<hr><br>
	<% String dbName = request.getParameter("dbName"); %>
	<% String tbName = request.getParameter("tbName"); %>

	<%-- STEP-2: Load & Register the Driver --%>
	<% Class.forName("com.mysql.jdbc.Driver"); %>

	<%-- STEP-3: Create Connection Object --%>
	<% Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName,"root",""); %>

	<%-- STEP-4: Create Statement Object --%>
	<% Statement stmt = conn.createStatement(); %>

	<%-- STEP-5: Create ResultSet & ResultSetMetaData Object --%>
	<% ResultSet rs = stmt.executeQuery("SELECT * FROM "+tbName); %>
	<% ResultSetMetaData rsmd = rs.getMetaData(); %>

	<table border='1'><tr>
		<%-- STEP-6: Manipulate ResultSet and ResultSetMetaData --%>
		<% for(int col=1; col<=rsmd.getColumnCount(); col++) { %>
			<th style="background-color:lightgray;"><%=rsmd.getColumnName(col).toUpperCase() %></th>
		<% } %>
		</tr>
	
		<% String data = ""; %>
		<% while(rs.next()) { %>
			<tr>
				<% for(int col=1; col<=rsmd.getColumnCount(); col++) { %>
					<% data = (rs.getString(col)==null) ? "" : rs.getString(col); %>
					<td><%=data %></td>
				<% } %>
			</tr>
		<% } %>
	
	</table>

	<%-- STEP-7: Close Connection --%>
	<% conn.close(); %>
</body>
</html>
