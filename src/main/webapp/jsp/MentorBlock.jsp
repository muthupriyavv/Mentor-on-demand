<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page import="java.util.*"%>
    <%@page import="com.mentorondemand.mentorondemandproject.model.Mentor"%>
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
<h1><center>Mentor Block</center></h1>
</div>
<br><br>
<div class="container">       

  	<%
			List mentorList = (List) request.getAttribute("mlist");
	
     %>    
  <table class="table table-condensed">
    <thead>
      <tr>
        <th>User Id</th>
        <th>Name</th>
        <th>Block</th>
        <th>UnBlock</th>
      </tr>
    </thead>
    <tbody>
    
               <%
					for (int i = 0; i < mentorList.size(); i++) {
				    Mentor mentor = (Mentor) mentorList.get(i);
				%>
				
      <tr>
        <td><%=mentor.getId() %></td>
        <td><%=mentor.getName() %></td>
        <td><a href="/blockuser"><Button class="btn">Block</Button></a></td>
         <td><a href="/unblockuser"><Button class="btn1">Unblock</Button></a></td>
      </tr>
      <% }%>
    </tbody>
  </table>
</div>

</body>
</html>
