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
		String pwd = (String)request.getAttribute("pwd");
	%>
	
	<h1>Your Fullname is: <%=fullname %></h1>
	<h2>Your password is: <%=pwd %></h2>
</body>
</html>