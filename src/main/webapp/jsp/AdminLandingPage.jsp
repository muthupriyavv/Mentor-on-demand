<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Mentor on Demand Application</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<style>
.container
{
background-color: #DCDCDC;
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
</style>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Admin Page</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
    </ul>
  </div>
</nav>
 <br><br>
 <div class="container">
 
        <h1><center>Admin Login</center></h1>
           <div class="u">
                <form:form method="POST"  action="/adminLogin" modelAttribute="adminlogin">
             <table>
                 <tr>
                    <td><form:label path="email">
                      EMAIL</form:label></td>
                    <td><form:input type="text" path="email"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">PASSWORD</form:label></td>
                    <td><form:input type="password" path="password"/></td>
                </tr>
              
                
                <tr>
                   <center> <td><input type="submit" value="Submit"/></td></center>
                </tr>
                
                <tr>
                <td><a href="/registerAdmin">Register here</a></td>
                </tr>
            </table>
        </form:form>
        </div>
 
 </div>

</body>
</html>