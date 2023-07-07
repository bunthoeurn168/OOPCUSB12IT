<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Processing</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String[] addresses = request.getParameterValues("address");
		// datatyp[] arrName; datatype arrName[]; datatype []arrName;
	%>
	
	<table style="width:100%">
	  <tr>
	    <th>Username</th>
	    <th>Password</th> 
	    <th>First Name</th>
	    <th>Last Name</th>
	    <th>Gender</th> 
	    <th>Address</th>
	  </tr>
	  <tr>
	    <td><%=username %></td>
	    <td><%=password %></td>
	    <td><%=firstname %></td>
	    <td><%=lastname %></td>
	    <td><%=gender %></td>
	    <td>
	    	<% if(addresses!=null){
				for(String address:addresses){		
				%>
					<%=address%>
			<%} }%>
	    </td>
	  </tr>
	</table>
	
	
	User Name: <%=username %><br>
	Password: <%=password %><br>
	FirstName: <%=firstname %><br>
	LastName: <%=lastname %><br>
	Gender: <%=gender %><br>
	Address:
	<% if(addresses!=null){
		for(String address:addresses){	// for(datatype variable : arrayName){}	
		%>
			<%=address%>
	<%} }%>
	
	
</body>
</html>