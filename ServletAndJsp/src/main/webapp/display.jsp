<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Person</title>
</head>
<body>
	<%
		String fullname = (String)request.getAttribute("fullname");
	%>
	<h1>Hello <%= fullname %></h1>
</body>
</html>