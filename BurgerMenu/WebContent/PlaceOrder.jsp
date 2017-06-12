<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Place Order</title>
</head>
<body>
<h1>Hamilton Burger</h1>
What would you like on your burger? Choose as many as you would like.<p> 
<form action="OrderProcessing.jsp">
<ul>
<li><input type="checkbox" name="Mayonnaise" value="1">Mayonnaise</li>
<li><input type="checkbox" name="Ketchup" value="2">Ketchup</li>
<li><input type="checkbox" name="Pickles" value="4">Pickles</li>
<li><input type="checkbox" name="Onions" value="8">Onions</li>
<li><input type="checkbox" name="Tomatoes" value="16">Tomatoes</li>
<li><input type="checkbox" name="Lettuce" value="32">Lettuce</li>
<li><input type="checkbox" name="Mustard" value="64">Mustard</li>
<li><input type="checkbox" name="Relish" value="128">Relish</li>
</ul>
<input type="submit" name="Order" value="Order">
</form>
</body>
</html>	