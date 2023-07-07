<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Data</title>
</head>
<body>
	<c:set var="num1" value="${param.number1 }"/>
	<c:set var="num2" value="${param.number2 }"/>
	Number1: <strong><c:out value="${num1 }"/></strong><br/>
	Number2: <strong><c:out value="${num2 }"/></strong><br/>
	Total: <strong><c:out value="${num1 + num2 }"></c:out></strong>
</body>
</html>