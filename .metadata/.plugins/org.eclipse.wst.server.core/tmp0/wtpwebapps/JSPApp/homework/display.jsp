<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
	<% 
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String course = request.getParameter("course");
		String address = request.getParameter("address");
		String subject[] = request.getParameterValues("subject");
	%>
	<table border=1>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Address</th>
			<th>Course</th>
			<th>Subject</th>
		</tr>
		<tr>
			<td> <%=fname %> </td>
			<td> <%=lname %> </td>
			<td> <%=gender %> </td>
			<td> <%=address %> </td>
			<td> <% if(course != null){ %> 
						<%=course %>
				 <%} %>
			</td>
			<td> <% for(int i=0; i < subject.length; i++){ %>
					<%=subject[i] %>,
				 <%} %>
			</td>
		</tr>
	</table>
	
	
</body>
</html>





