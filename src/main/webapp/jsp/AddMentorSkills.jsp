<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.mentorondemand.mentorondemandproject.model.MentorSkills,com.mentorondemand.mentorondemandproject.model.Mentor" %>
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
</head>
<body>
<div class="jumbotron">
   <h1><center>Add Mentor Skills</center></h1>
</div>
<div class="container">
                 <div class="u">
                 <form:form method="POST"  action="/addmentorskills" modelAttribute="skills">
             <table>
             
                  
                <tr>
                    <td><form:label path="skillname">
                      TECHNOLOGY</form:label></td>
                    <td>
                      <form:select path="skillname">  
        			  <form:option value="C" />  
                      <form:option value="C++"/>  
                      <form:option value="JAVA"/>  
                      <form:option value="Angular"/>  
                      </form:select>  
                    </td>
                </tr>
                
                <tr>
                    <td><form:label path="facility">
                      FACILITY</form:label></td>
                    <td>
                      <form:select path="facility">  
        			  <form:option value="CLoudlabs" />  
                      <form:option value="Materials"/>  
                      <form:option value="Video Tutorials"/>   
                      </form:select>  
                    </td>
                </tr>
                
                
                <tr>
                    <td><form:label path="start_date">START DATE</form:label></td>
                    <td><form:input type="date"  path="start_date"/></td>
                </tr>
                <tr>
                    <td><form:label path="end_date">END DATE</form:label></td>
                    <td><form:input type="date" path="end_date"/></td>
                </tr>
                
                 <tr>
                    <td><form:label path="fee">
                      Fee</form:label></td>
                    <td><form:input type="text" path="fee"/></td>
                </tr>
                
                <tr>
                 <%
                  List mentorList=(List)request.getAttribute("mentorList");
                  System.out.println(mentorList);
                   %>
                   
               
                   
                    <td><b>MENTOR ID</b></td>
                    <td><form:select path="mentor" class="form-control" maxlength="2" required="required">
                    <option value="" disabled selected>Choose Mentor Id</option>
                   
                         <%for(int i=0;i<mentorList.size();i++)
                   {
          			 Mentor m = (Mentor)mentorList.get(i);
          			 int mentorId = m.getId();
             
                  %>
                 
                    <option value="<%=mentorId %> ">
                    <%=mentorId%></option>

                    <%
                      }
                     %>

                   </form:select></td>
               

                  </tr>
           
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
                
            </table>
        </form:form>
                 </div>
                
                </div>
                


</body>
</html>