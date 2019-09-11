<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page import="java.util.*"%>
    <%@page import="com.mentorondemand.mentorondemandproject.model.Technologies,com.mentorondemand.mentorondemandproject.model.MentorSkills"%><%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<style>
.panel hover
{
 box-shadow: 0 0 5px #000
}
</style>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">User Portal</a>
    </div>
<!-- <div class="topnav" id="myTopnav"> -->
     <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
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

<div id="content" class="container">

		<h1 align="center">Mentor Search Result</h1>
		<br>

		<%
			List mentorList = (List) request.getAttribute("mentorList");
		
		/*  long orgId =(Long) session.getAttribute("name"); */
		%>
       <div class="panel panel-info">
       <div class="panel-heading">Mentors</div>
       <div class="panel-body">

		<table class="table">

			<tbody>
				<tr>
					<th>Mentor Id</th>
					<th>Name</th>
					<th>Experience</th>
					<th>Facility</th>
					<th>Fees</th>
					<th>Proposal</th>
				</tr>

				<%
					for (int i = 0; i < mentorList.size(); i++) {
					
					
						MentorSkills mentor = (MentorSkills) mentorList.get(i);
				%>
				<tr>
				
					<td><%=mentor.getMentor().getId() %></td>
					<td><%= mentor.getMentor().getName() %></td>
					<td><%=mentor.getMentor().getExperience() %></td>
					<td><%=mentor.getFacility() %></td>
					<td><%=mentor.getFee() %></td>	
				    <td><a href="/proposetraining"><button type="submit" class="btn btn-primary">Propose Training</button></a></td>

				</tr>
				
			</tbody>
		</table>
		</div>
		</div>
		<% }%>

	</div>

</body>
</html>

