<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<spring:url value="/resources/css/style.css"  var="styleCss"></spring:url>
<link href="${styleCss }" rel="stylesheet" />
<title>Employee Report Page</title>
</head>
<body>
<div class="container">
 <div class="container">
  <c:if test="${not empty message}">
    <div class="alert"
      role="alert">${message}
      <button type="button" class="close" data-dismiss="alert"
        aria-label="Close">
        <span aria-hidden="true">&times;</span>
      </button>
    </div>
  </c:if>
  <div class="row">
    <div class="col">
      <h1>All Employee</h1>
    <div class="col">
      <a href="addEmployee" class="btn"> Add
        Employee </a><br><br>
        <div class="exportimport">
      <c:url value="/export" var="exportUrl" />
      <a href="${exportUrl}" class="btn">Export</a> <br>
      <c:url value="/import?${_csrf.parameterName}=${_csrf.token}"
        var="empImport"></c:url>
      <form:form action="${empImport}" method="post"
        enctype="multipart/form-data" id="importForm">
        <input type="file" name="file" accept=".xlsx" id="empImportExcel">
       <label class="btn" for="empImportExcel">Import</label>
      </form:form>
      </div>
    </div>
    </div>
  </div>

    <table class="table">
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Name</th>
          <th scope="col">Email</th>
          <th scope="col">Department</th>
          <th scope="col">Salary</th>
          <th scope="col">Address</th>
          <th scope="col">Edit</th>
          <th scope="col">Delete</th>
        </tr>
      </thead>
      <tbody class="tbody">
        <c:forEach var="emp" items="${employee}">
          <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.email}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>${emp.address}</td>
            <td><a href="editEmployee/${emp.id}"
              class="btn"> Edit </a></td>
            <td><a href="deleteEmployee/${emp.id}"
              class="btn"> Delete </a></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>
<script src="<c:url value='/resources/js/import.js'/>"></script>
</body>
</html>