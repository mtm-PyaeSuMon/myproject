<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee Page</title>
</head>
<body>
<div class="container">

  <h1>Edit Employee Form</h1>
  <form:form action="updateEmployee" method="post">
  <table>
      <tr>
        <td><label for="id">Id</label> </td>
        <td><input type="text" value="${employee.id}" id="id" name="id" 
                readonly="readonly"></td>
      </tr>
  
      <tr>
          <td><label for="name">Name</label> </td>
          <td><input type="text" value="${employee.name }" id="name"
                 name="name" placeholder="Enter Name"></td>
      </tr>
    
      <tr>
          <td><label for="department">Department</label></td> 
          <td><input type="text" id="department" value="${employee.department }" 
                name="department" placeholder="Enter department"></td>
      </tr>
      
      <tr>
          <td><label for="email">Email</label></td>
          <td><input type="text" id="email" value="${employee.email }" 
                name="email" placeholder="Enter email"></td>
      </tr>
       
      <tr>
          <td><label for="salary">Salary</label> </td>
          <td><input type="number" value="${employee.salary }" id="salary"
                  name="salary" placeholder="Enter Salary"></td>
      </tr>
    
      <tr>
          <td><label for="address">Address</label></td>
          <td><textarea id="address" name="address"
                  rows="5" placeholder="Enter Address"> ${employee.address } </textarea></td>
      </tr>
    
  </table>
    <button type="submit" class="btn">Submit</button>
    
  </form:form>

</div>

</body>
</html>