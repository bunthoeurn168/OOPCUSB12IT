<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	public int sum(int a, int b){
		return a+b;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<% System.out.println("Hello JSP"); %>
	1 + 2 = <%=sum(1,2) %>
</body>
</html>