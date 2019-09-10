<%@page import="com.hcl.hib.Subjects"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.hib.FeedBackOperations"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.hcl.hib.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function submit() {
		document.instmethod.submit();
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String fid = FeedBackOperations.feedBackId(); 
		List<String> lst = FeedBackOperations.instructors();
	%>
	<form method = "get" name = "instmethod" action = "FeedBack.jsp">
		<center>
			FeedBack Id :
			<input type = "text" name = "feedBack" value = <%=fid %> /><br/><br/>
			Student Name :
			<input type = "text" name = "studentName" /><br/><br/>
			Instructor :
			<select name = "instructor" onchange = "submit()">
				<option>Select One Option</option>
				<%
					for(String obj : lst) {
				%>
				<option value = <%=obj %> ><%=obj %></option>
				<%
					}
					String inst = request.getParameter("instructor");
					String fbid = request.getParameter("feedBack");
					String name = request.getParameter("studentName");
					session.setAttribute("inst", inst);
					session.setAttribute("fbid", fbid);
					session.setAttribute("name", name);
				%>
			</select><br/><br/>
		</center>
	</form>
	<form method = "get" action = "FeedBackConfirm.jsp">
		<center>
			Select Subject :
			<select name = "subjects" >
			<option>Select One Option</option>
				<%
					FeedBackOperations f = new FeedBackOperations();
					List<String> obj1 = f.subjects(inst);
					for(String obj2 : obj1) {
				%>
				<option value = <%=obj2 %> ><%=obj2 %></option>
				<%
					}
				%>
			</select><br/><br/>
		</center>
	Please give your FeedBack : <br/>
	<input type = "radio" name = "feedback" value = "Excellent" />Excellent<br/>
	<input type = "radio" name = "feedback" value = "Good" />Good<br/>
	<input type = "radio" name = "feedback" value = "Adequate" />Adequate<br/>
	<input type = "radio" name = "feedback" value = "InAdequate" />InAdequate<br/>
	<input type = "radio" name = "feedback" value = "Bad" />Bad<br/>
	<input type = "submit" value = "Enter" />
	</form>
</body>
</html>