<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.xriva.burger.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order Processing</title>
</head>
<body>
<h1>Burger # <%= request.getParameter("Toppings") %></h1>
<h2>
<%=  DecodeOrder.decoder(Integer.parseInt(request.getParameter("Toppings"))) %>
</h2>
</body>
</html>