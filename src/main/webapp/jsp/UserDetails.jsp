<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page import="java.util.*"%>
    <%@page import="com.mentorondemand.mentorondemandproject.model.User"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<style>
th, td {
  padding: 15px;

  }
  
    .btn {
  background-color: #f44336; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

  .btn1 {
  background-color: #f44336; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
<body>
<div class="jumbotron">
<h1><center>User Details</center></h1>
</div>
<br><br>
<div class="container">       

  	<%
			List userList = (List) request.getAttribute("ulist");
	
     %>    
  <table class="table table-condensed">
    <thead>
      <tr>
        <th>User Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>Phone Number</th>
        <th>Edit</th>
      </tr>
    </thead>
    <tbody>
    
               <%
					for (int i = 0; i < userList.size(); i++) {
				    User users = (User) userList.get(i);
				%>
				
      <tr>
        <td><%=users.getId() %></td>
        <td><%=users.getName() %></td>
        <td><%=users.getEmail() %></td>
        <td><%=users.getPassword() %></td>
        <td><%=users.getPhone_number() %></td>
        <td><%=users.getAccess() %>
        <td><a href="/userupdate?id=<%=users.getId()%>"><Button class="btn">Edit</Button></a></td>
      </tr>
      <% }%>
    </tbody>
  </table>
</div>

</body>
</html>
