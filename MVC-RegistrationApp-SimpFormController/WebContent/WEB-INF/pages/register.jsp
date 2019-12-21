<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h2 style="color: red;" align="center">Register page</h2>

<form:form method="POST" commandName="mCmd">

	<b>Item Name</b>  <form:input path="itemName" /><br>
	
  <b>Item category</b>  <form:input path="category" /><br>
	
	<b>Item price</b> <form:input path="price" /><br>
	
  	<b>status</b> <form:input path="status" /><br>
  	
	<b>restaurant</b> <form:input path="restaurant" /><br>
	
	 <input type="submit" value="register">
</form:form>