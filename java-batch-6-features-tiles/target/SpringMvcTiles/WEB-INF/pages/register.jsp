<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="">
.alert{
  color: #ff0000;
}
</style>
</head>
<body>


  <div class="container mt-3">

    <h1>Add Employee Form</h1>
    <form action="insertEmployee" method="post">

      <div class="row">
        <div class="col">
          <div class="form-group">
            <label for="name">Name</label> <input type="text"
              class="form-control" id="name" name="name"
              placeholder="Enter Name">
          </div>
          <c:if test="${message != null }">
            <div class="alert alert-danger">
              <span>User Name is Required!</span>
            </div>
          </c:if>
        </div>
      </div>

      <div class="row">
        <div class="col">
          <div class="form-group">
            <label for="department">Department</label> <input
              type="text" class="form-control" id="department"
              name="department" placeholder="Enter department">
          </div>
          <c:if test="${message != null }">
            <div class="alert alert-danger">
              <span>Department is Required!</span>
            </div>
          </c:if>
        </div>
        
        <div class="col">
          <div class="form-group">
            <label for="salary">Salary</label> <input type="number"
              class="form-control" id="salary" name="salary"
              placeholder="Enter Salary">
          </div>
          <c:if test="${message != null }">
            <div class="alert alert-danger">
              <span>Salary is Required!</span>
            </div>
          </c:if>
        </div>
      </div>

      <div class="row">
        <div class="col">
          <div class="form-group">
            <label for="address">Address</label>
            <textarea class="form-control" id="address" name="address"
              rows="5" placeholder="Enter Address"> </textarea>
          </div>
          <c:if test="${message != null}">
            <div class="alert alert-danger">
              <span>Address is Required!</span>
            </div>
          </c:if>
        </div>
      </div>

      <a href="${pageContext.request.contextPath }/"
        class="btn btn-warning"> Back </a>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>

  </div>

</body>
</html>