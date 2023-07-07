<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta content="utf-8">
<title>Update Employee</title>
</head>
<body>
	<fieldset>
		<legend>Update Employee</legend>
		<form action="updateEmployee" method="POST">
			<c:forEach items="${list }" var="list">
				<input type="hidden" name="id" value="${list.getId() }"/>
				Name: <input type="text" name="name" value="${list.getName() }" placeholder="Enter Name..." /><br /><br />
				Salary: <input type="text" name="salary" value="${list.getSalary() }" placeholder="Enter Salary..." /><br /><br />
				<input type="submit" value="Save Change" />
			</c:forEach>
		</form>
	</fieldset>
</body>
</html>