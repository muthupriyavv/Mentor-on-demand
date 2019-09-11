<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page import="java.util.*"%>
    <%@page import="com.mentorondemand.mentorondemandproject.model.Technologies,com.mentorondemand.mentorondemandproject.model.MentorSkills,com.mentorondemand.mentorondemandproject.model.User"%><%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Mentor On Demand</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">User Portal</a>
    </div>
<!-- <div class="topnav" id="myTopnav"> -->
     <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
            <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Options
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/edituserprofile">Edit Profile</a></li>
          
        </ul>
        </li>
      <li>
		<a href="#"> <form:form class="form-inline" action="/searchMentor"
				modelAttribute="tech">

				<label for="email2" class="mb-2 mr-sm-2">Skills</label>


				<form:select class="form-control mb-2 mr-sm-2" id="email2"
					path="name">
					<% ArrayList skillDetails = (ArrayList) request.getAttribute("skillsList");
					Iterator itr = skillDetails.iterator();
					String skillSet=null;
 					%>
					<option class="hidden" value="" selected disabled>Choose
						Skill</option>
					<% while(itr.hasNext()) {
					Technologies skill = (Technologies) itr.next();
					skillSet = skill.getName();%>
					<option value="<%=skillSet %>"><%=skillSet %></option>
					<% 
					}
					%>


				</form:select>
				<button type="submit" class="button">Search</button>
			</form:form>
			</a>
			</li>
			</ul>
			<!-- </div> -->
			  <ul class="nav navbar-nav navbar-right">
      		
      	      <li><a href="/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
           
             </ul>
  </div>
</nav>

</body>
</html>

