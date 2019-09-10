<%@page import="com.hcl.inventory.Inventory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.html"></jsp:include>
	<jsp:useBean id="bean1" class = "com.hcl.inventory.SearchStock"></jsp:useBean>
	<jsp:setProperty property="*" name="bean1"/>
	<%
		Inventory obj = bean1.searchStock();
		if (obj != null) {
			out.println("Stock Id : " + obj.getStockId() + "<br/>");
			out.println("Item Name : " + obj.getItemName() + "<br/>");
			out.println("Item Price : " + obj.getPrice() + "<br/>");
			out.println("Quantity Available : " + obj.getQuantityAvail() + "<br/>");
		} else {
			out.println("***Stock Not Found***");
		}
	%>
</body>
</html>