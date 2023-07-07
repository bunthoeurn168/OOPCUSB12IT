<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta content="utf-8">
	<title>List Employee</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<style>
		table {
			border-collapse: collapse;
			width: 100%;
		}
		
		table, th, td {
			border: 1px solid black;
			text-align: center;
			padding: 10px;
		}
		
		th {
			background-color: #04AA6D;
			color: white;
		}
	</style>
	<script type="text/javascript">
	   function removeEmployee(id){
		    //alert(id);
			if(confirm("Are you want to delete?") == true){
				$.ajax({
					type:"POST",
					url:"deleteEmployee",
					data:{"id":id},
					success: function(msg){
						location.reload();
					}
				});
			}else{
				return;
			}
		} 
	</script>
</head>
<body>
	<h1 style="text-align: center;">List Employee</h1>
	<table>
		<thead>
			<tr>
				<th>No</th>
				<th>Name</th>
				<th>Salary</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.getId()}</td>
					<td>${list.getName()}</td>
					<td>${list.getSalary()}</td>
					<td><a href="goEditEmployee?id=${list.getId() }"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></a></td>
					<td><a href="#" data-toggle="modal" id="id_emp"	onclick="removeEmployee(${list.getId()})"><i class="fa fa-times" aria-hidden="true" style="color:red"></i></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div style="margin: 20px;">
		<a href="showEmployeePage"
			style="background-color: rgb(22, 5, 255); color: white; padding: 10px; text-decoration: none;">Create
			Product</a>
	</div>

</body>
</html>