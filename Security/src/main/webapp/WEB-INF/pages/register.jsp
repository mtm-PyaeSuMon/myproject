<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
<h2>Employee Form</h2>
  <form:form method="POST" action="insertStudent" modelAttribute="student">
    <table>
      <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" placeholder="Enter Student Name"/></td>
      </tr>
      
      <tr>
        <td><form:label path="email">Email</form:label></td>
        <td><form:input type="email" path="email" placeholder="Enter Email"/></td>
      </tr>
      
      <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:input type="password" path="password" placeholder="Enter Password" /></td>
      </tr>
        
      <tr>
        <td><form:label path="type">Type</form:label></td>
        <td><form:radiobutton path="type" name="type-admin" value="1" checked="checked" />             
             <form:label path="type">Admin</form:label>
        <form:radiobutton path="type" name="type-student" value="0" checked="checked" />
        <form:label path="type">Student</form:label></td>
        </tr>
                
      <tr>
        <td><form:label path="course">Course</form:label></td>
        <td><form:input path="course" placeholder="Enter Course"/></td>
      </tr>
      
       <tr>
          <td><form:label path="ph">Phone Number</form:label></td>
          <td><form:input path="ph" placeholder="Enter Phone"/></td>
        </tr>
             
      <tr>
        <td><form:label path="address">Address</form:label></td>
        <td><textarea class="form-control" id="address" name="address" rows="5" placeholder="Enter Address"> </textarea></td>
      </tr>
      
      <tr>
      <td><a href="${pageContext.request.contextPath }/"> Back </a></td>
      <td ><button type="submit">Submit</button></td>
      </tr>
    </table>
  </form:form>
  </div>
</body>
</html>