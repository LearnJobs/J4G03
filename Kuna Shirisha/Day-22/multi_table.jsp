<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Multiplication Tables</h1>
	<hr>
	<form action="MultiplicationTables.jsp" method="get">
		<table>
			<tr>
				<td>Start Number: </td>
				<td><input type="text" name="start" /></td>
			</tr>
			<tr>
				<td>End Number: </td>
				<td><input type="text" name="end" /></td>
			</tr>
		</table>
		<br><br>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>