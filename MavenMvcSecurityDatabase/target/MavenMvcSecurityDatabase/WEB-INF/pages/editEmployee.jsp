<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container mt-3">

  <h1>Edit Employee Form</h1>
  <form action="updateEmployee" method="post">
  <table>
      <tr>
        <td><label for="id">Id</label> </td>
        <td><input type="text" value="${employee.id}" class="form-control" id="id" name="id" 
                readonly="readonly"></td>
      </tr>
  
      <tr>
          <td><label for="name">Name</label> </td>
          <td><input type="text" value="${employee.name }" class="form-control" id="name"
                 name="name" placeholder="Enter Name"></td>
      </tr>
    
      <tr>
          <td><label for="department">Department</label></td> 
          <td><input type="text" class="form-control" id="department" value="${employee.department }" 
                name="department" placeholder="Enter department"></td>
      </tr>
      
      <tr>
          <td><label for="salary">Salary</label> </td>
          <td><input type="number" value="${employee.salary }" class="form-control" id="salary"
                  name="salary" placeholder="Enter Salary"></td>
      </tr>
    
      <tr>
          <td><label for="address">Address</label></td>
          <td><textarea class="form-control" id="address" name="address"
                  rows="5" placeholder="Enter Address"> ${employee.address } </textarea></td>
      </tr>
    
  </table>
    <button type="submit" class="btn btn-primary">Submit</button>
    
  </form>

</div>

</body>
</html>