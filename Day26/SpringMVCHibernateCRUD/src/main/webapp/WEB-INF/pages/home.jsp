<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>student Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Student List</h1>
		
		<table border="1">

			<th>RollNum</th>
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Country</th>
			<th>Date OF Join</th>
			<th>Final Score</th>
			<th>Action</th>

			<c:forEach var="student" items="${listStudent}">
				<tr>

					<td>${student.Rollnum}</td>
					<td>${student.sName}</td>
					<td>${student.Age}</td>
					<td>${student.Gender}</td>
					<td>${student.Country}</td>
					<td>${student.dateOfJoin}</td>
					<td>${student.finalScore}</td>
					<td><a href="editStudent?id=${student.Rollnum}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteStudent?id=${student.Rollnum}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New student Register <a href="newStudent">here</a>
		</h4>
	</div>
</body>
</html>