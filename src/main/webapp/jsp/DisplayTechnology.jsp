<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page import="java.util.*"%>
    <%@page import="com.mentorondemand.mentorondemandproject.model.Technologies"%>
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
</style>
<body>
<div class="jumbotron">
<h1><center>Display Technology</center></h1>
</div>
<br><br>
<div class="container">       

  	<%
			List techList = (List) request.getAttribute("techList");
	
     %>    
  <table class="table table-condensed">
    <thead>
      <tr>
        <th>TECHNOLOGY</th>
        <th>TOC</th>
        <th>PREREQUISITES</th>
      </tr>
    </thead>
    <tbody>
    
               <%
					for (int i = 0; i < techList.size(); i++) {
					
				    Technologies techno = (Technologies) techList.get(i);
				%>
				
      <tr>
        <td><%=techno.getId() %></td>
        <td><%=techno.getName() %></td>
        <td><%=techno.getPrerequisites() %></td>
      </tr>
      <% }%>
    </tbody>
  </table>
</div>

</body>
</html>
