<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.ems.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function cancel() {
		document.getElementById("emp_id").value = "";
		document.getElementById("password").value = "";
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<form method = "get" action = "Login.jsp">
		Employee ID :
		<input type = "text" name = "emp_id" id = "emp_id"/><br/><br/>
		PassWord :
		<input type = "password" name = "password" id = "password"/><br/><br/>
		<input type = "submit" value = "LOGIN" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type = "button" value = "CANCEL" onclick = "cancel"/>
	</form>
</center>

<%
	Connection con = DaoConnection.getConnection();
	PreparedStatement pst;
	if ((request.getParameter("emp_id") != null) && (request.getParameter("password") != null)) {
		String cmd = "select * from employLogin where emp_id = ? and secretcode = ?";
		pst = con.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(request.getParameter("emp_id")));
		pst.setString(2, request.getParameter("password"));
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
%>
			<jsp:forward page="ShowEmployee.jsp"></jsp:forward>
<%
		} else {
%>
			<%="Invalid Credentials...." %>
<%
		}
	}
	session.setAttribute("emp_id", request.getParameter("emp_id"));
%>
</body>
</html>