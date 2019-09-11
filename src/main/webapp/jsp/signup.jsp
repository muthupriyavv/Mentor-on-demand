<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Mentor on Demand Application</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
  .container
  {
 
  }
  
  th, td {
  padding: 15px;

  }
  

.u
{
  margin: auto;
  width: 50%;
  padding: 10px;
}

.m
{
  margin: auto;
  width: 50%;
  padding: 10px;
}

input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
input[type=submit] {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    margin:auto;
    display:block;
    width:100%;
}

button:hover {
  opacity:1;
}

  
  </style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MentorOnDemand</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Sign Up</a></li>
    </ul>
  </div>
</nav>
<br><br>
 
<div class="container">
   <br><br>
   <ul class="nav nav-pills  nav-justified ">
                <li class="active"><a data-toggle="pill" href="#user">User</a></li>
                <li><a data-toggle="pill" href="#mentor" >Mentor</a></li>
   </ul>
        <br><br><br>
        
 
     
        <div class="tab-content">
 

                <div id="user" class="tab-pane fade in active">
                
                        <h1 style="text-align:center">User Signup</h1>
                <div class="u">
               
                
                <form:form method="POST"  action="/addUser" modelAttribute="user">
             <table  style="align:center">
                <tr>
                    <td><form:label path="name">NAME</form:label></td>
                    <td><form:input type="text"  path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">PASSWORD</form:label></td>
                    <td><form:input type="password"  path="password"/></td>
                </tr>
                <tr>
                    <td><form:label path="email">
                      EMAIL</form:label></td>
                    <td><form:input type="text"  path="email"/></td>
                </tr>
                
                 <tr>
                    <td><form:label path="phone_number">
                      PHONE NUMBER</form:label></td>
                    <td><form:input type="text"  path="phone_number"/></td>
                </tr>
                
                <tr>
                    <td><center><input type="submit" value="Submit"/></center></td>
                </tr>
            </table>
        </form:form>
        </div>
                  
                </div>
                
                <div id="mentor" class="tab-pane">
                <br><br>
                <h1><center>Mentor Signup</center></h1>
                <div class="m">
                 <form:form method="POST"  action="/addMentor" modelAttribute="mentor">
                
             <table>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input type="text" path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:input  type="password" path="password"/></td>
                </tr>
                <tr>
                    <td><form:label path="email">
                      Email</form:label></td>
                    <td><form:input type="text" path="email"/></td>
                </tr>
                
                 <tr>
                    <td><form:label path="phone_number">
                      Phone Number</form:label></td>
                    <td><form:input type="text" path="phone_number"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="timeslot">
                      Time Slot</form:label></td>
                    <td>
                      <form:select path="timeslot">  
        			  <form:option value="8-10" />  
                      <form:option value="10-12"/>  
                      <form:option value="12-2"/>  
                      <form:option value="2-4"/>  
                      </form:select>  
                    </td>
                </tr>
                
                <tr>
                    <td><form:label path="linkedin_url">
                      Linked in URL</form:label></td>
                    <td>
                      <form:input type="text" path="linkedin_url"/>  
                    </td>
                </tr>
                
                     
                <tr>
                    <td><form:label path="mentor_profile">
                      Mentor Profile</form:label></td>
                    <td>
                      <form:input type="text" path="mentor_profile"/>  
                    </td>
                </tr>
                
                    <tr>
                    <td><form:label path="experience">
                     Experience</form:label></td>
                    <td>
                      <form:input type="text" path="experience"/>  
                    </td>
                </tr>
               
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
              
            </table>
        </form:form>
        </div>
                
                </div>     
       </div>
      
      
    </div>
 

</body>
</html>