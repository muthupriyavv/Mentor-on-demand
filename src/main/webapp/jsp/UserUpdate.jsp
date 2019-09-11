<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
	<%@page import="java.util.*"%>
    <%@page import="com.mentorondemand.mentorondemandproject.model.User"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="Style/StockStyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style>

.jumbotron
{
background-color: #87CEFA;
}
</style>

<title>Registration</title>
</head>
<body>
		<div class="jumbotron">
		<h2 align="center">UPDATE USER</h2>
		</div>
		<br> <br>
		<div class="container">
		<table align="center" cellpadding="10">
			<form:form action="/updateuserdetails" method="post"
				modelAttribute="user" class="well form-horizontal">
				
							<%
								User user = (User) request.getAttribute("userupdate");
							%>
				
	           
	            <tr>
					<td><b>USER ID</b></td>
					<td><form:input name="" class="form-control" value="<%=user.getId() %>"
							placeholder="User Id" type="text" path="id"
							required="required" /> </td>
				</tr>
				
				
				<tr>
					<td><b>USER NAME</b></td>
					<td><form:input name="" class="form-control" value="<%=user.getName() %>"
							placeholder="User Name" type="text" path="name"
							required="required" /> </td>
				</tr>

                <tr>
					<td><b>EMAIL</b></td>
					<td><form:input name="" class="form-control"
						value="<%=user.getEmail() %>"	placeholder="Email" type="text" path="email"
							required="required" /> </td>
			      	</tr>
			      	
				<tr>
					<td><b>PASSWORD</b></td>
					<td><form:input name="" class="form-control"
						value="<%=user.getPassword() %>"	placeholder="Password" type="password" path="password"
							required="required" /> </td>
				</tr>
				
					
			      	
			      	<tr>
					<td><b>PHONE NUMBER</b></td>
					<td><form:input name="" class="form-control"
						value="<%=user.getPhone_number() %>"	placeholder="phone number" type="text" path="phone_number"
							required="required" /> </td>
			      	</tr>
			      	
			      	
			      	<tr>
					<td><b>ACCESS</b></td>
					<td><form:input name="" class="form-control"
						value="<%=user.getAccess() %>"	placeholder="Access" type="text" path="access"
							required="required" /> </td>
			      	</tr>
			      	
			      <tr>
					<td></td>
					<td>
						<button type="submit" id="updateuserdetails" class="btn btn-info"
							name="updateuserdetails">Update</button>
				
					</td>
				</tr> 
			</form:form>
		</table>

	</div>
	
</body>
</html>
