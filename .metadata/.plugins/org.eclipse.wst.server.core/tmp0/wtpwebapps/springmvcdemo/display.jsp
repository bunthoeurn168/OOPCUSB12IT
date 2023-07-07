<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Data</title>
</head>
<body>
	 <!-- JSP view -->
	 Your fullName is <%= request.getAttribute("fullname") %>
	 <br/>
	 <!-- JSTL View -->
	 Your fullName is <c:out value="${fullname }"/><br/>
	 Your fullName is ${fullname}
</body>
</html>