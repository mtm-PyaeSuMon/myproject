<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<spring:url value="/resources/css/style.css"  var="styleCss"></spring:url>
<link href="${styleCss }" rel="stylesheet" />
<title>Register</title>
</head>
<body>
<h2>Employee Form</h2>
  <form:form method="POST" action="insertEmployee" modelAttribute="employee">
    <table>
      <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" placeholder="Enter User Name"/></td>
        <td><form:errors path="name" class="error" /></td>
      </tr>
      
      <tr>
        <td><form:label path="email">Email</form:label></td>
        <td><form:input type="email" path="email" placeholder="Enter Email"/></td>
        <td><form:errors path="email" class="error" /></td>
      </tr>
      
      <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:input type="password" path="password" placeholder="Enter Password" /></td>
        <td><form:errors path="password" class="error" /></td>
      </tr>
        
      <tr>
        <td><form:label path="type">Type</form:label></td>
        <td><form:radiobutton path="type" name="type-admin" value="1" checked="checked" />             
              <form:label path="type">Admin</form:label>
        <form:radiobutton path="type" name="type-admin" value="1" checked="checked" />
        <form:label path="type">User</form:label></td>
        </tr>
                
      <tr>
        <td><form:label path="department">Department</form:label></td>
        <td><form:input path="department" placeholder="Enter Department"/></td>
        <td><form:errors path="department" class="error" /></td>
      </tr>
      
       <tr>
          <td><form:label path="salary">Salary</form:label></td>
          <td><form:input path="salary" placeholder="Enter Salary"/></td>
          <td><form:errors path="salary" class="error" /></td>
        </tr>
             
      <tr>
        <td><form:label path="address">Address</form:label></td>
        <td><textarea class="form-control" id="address" name="address" rows="5" placeholder="Enter Address"> </textarea></td>
        <td><form:errors path="address" class="error" /></td>
      </tr>
      
      <tr>
      <td><a href="${pageContext.request.contextPath }/"> Back </a></td>
      <td ><button type="submit">Submit</button></td>
      </tr>
    </table>
  </form:form>
</body>
</html>