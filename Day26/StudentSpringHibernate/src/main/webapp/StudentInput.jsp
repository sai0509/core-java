<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method = "get" action = "addStudent">
	<center>
		Roll No :
		<input type = "text" path = "rollNo" /><br/><br/>
		Student Name :
		<input type = "text" path = "sName" /><br/><br/>
		Age :
		<input type = "number" path = "Age" /><br/><br/>
		Gender :
		<input type = "radio" path = "Gender" value = "Male" />Male<br/><br/>
		<input type = "radio" path = "Gender" value = "Female" />Female<br/><br/>
		Country :
		<select path = "Country">
		<option>Select One springForm:option</option>
		<option value = "India">India</option>
		<option value = "USA">USA</option>
		<option value = "Australia">Australia</option>
		<option value = "Europe">Europe</option>
		<option value = "NewZealand">NewZealand</option>
		</select><br/><br/>
		Date Of Join :
		<input type = "date" path = "dateOfJoin" /><br/><br/>
		Final Score :
		<input type = "text" path = "finalScore" /><br/><br/>
		<input type = "submit" value = "Insert" />
	</center>
</form>
</body>
</html>