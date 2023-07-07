<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output Data</title>
</head>
<body>
	
	<p>Username: ${param.username}</p>
	<p>Password: ${param.password}</p>
	<p>Fullname: ${firstname } ${lastname }</p>
	<p>Country: ${param.country}</p>
	<p>Gender: ${param.gender}</p>
</body>
</html>