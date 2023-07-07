<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form Information</title>
</head>
<body>
	<form action="savedata" method="get">
	  <label>First name:</label><br>
	  <input type="text" name="fname"><br>
	  <label>Last name:</label><br>
	  <input type="text" name="lname"><br>
	  
	  <label>Gender: </label>
	  <input type="radio" name="gender" value="Male" checked>
	  <label>Male</label>
	  <input type="radio" name="gender" value="Female">
	  <label>Female</label>
	  <input type="radio" name="gender" value="Other">
	  <label>Other</label><br>
	  
	  <label>Property: </label>
	  <input type="checkbox" name="vehicle" value="I have a bike">
	  <label for="vehicle1"> I have a bike</label>
	  <input type="checkbox" name="vehicle" value="I have a car">
	  <label for="vehicle2"> I have a car</label>
	  <input type="checkbox" name="vehicle" value="I have a boat">
	  <label for="vehicle3"> I have a boat</label><br>
	  
	  <labe>Choose a car:</label>

	  <select name="cars">
		  <option value="volvo">Volvo</option>
		  <option value="saab">Saab</option>
		  <option value="mercedes">Mercedes</option>
		  <option value="audi">Audi</option>
	   </select>
	   <br><br>
	   <input type="submit" value="Save">
	</form>
</body>
</html>