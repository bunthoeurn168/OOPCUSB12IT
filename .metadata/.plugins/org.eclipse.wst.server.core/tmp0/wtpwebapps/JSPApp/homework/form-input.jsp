<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Input</title>
</head>
<body>
	<form action="display.jsp" method="GET">
		First Name: <input type="text" name="firstname"><br><br>
		Last Name: <input type="text" name="lastname"><br><br>
		Course :<select name="course">
					<option>BA</option>
					<option>MBA</option>
					<option>Phd</option>
				</select><br><br>
		Gender: <input type="radio" name="gender" value="Male" checked>Male
				<input type="radio" name="gender" value="Female">Female
				<input type="radio" name="gender" value="Other">Other <br><br>
		Require Subject:
		<input type="checkbox" name="subject" value="Math"> Math
		<input type="checkbox" name="subject" value="Physics"> Physics
		<input type="checkbox" name="subject" value="Chemistry"> Chemistry <br><br>
		Address: <textarea rows="5" cols="80" name="address"></textarea> <br><br>
		<input type="submit" value="Submit">
		<input type="reset" value="Cancel">
	</form>
</body>
</html>