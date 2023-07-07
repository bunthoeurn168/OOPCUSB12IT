<%@ page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta content="utf-8">
<title>Add Employee</title>
</head>
<body>
	<fieldset>
		<legend>Add Employee</legend>
		<form action="saveEmployee" method="POST">
			Name: <input type="text" name="name" placeholder="Enter Name..." /><br /><br />
			Salary: <input type="text" name="salary" placeholder="Enter Salary..." /><br /><br />
			<input type="submit" value="Save" />
		</form>
	</fieldset>
</body>
</html>