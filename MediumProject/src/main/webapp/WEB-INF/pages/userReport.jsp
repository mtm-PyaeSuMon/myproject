<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/library/bootstrap.min.css" />"
	rel="stylesheet">
	<link rel='stylesheet' href='<c:url value="/resources/css/library/bootstrap.min.css.map"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/choices.min.css"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/dataTable.min.css"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/jquery-ui.css"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/select2.min.css"/>' />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css"/>' />
<title>Insert title here</title>
<style>
.detail-image{
 	width: 100px;
 }
 </style>
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
    <table class="table">
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Name</th>
          <th scope="col">Email</th>
          <th scope="col">Bio</th>
          <th scope="col">Profile</th>
          <th scope="col">Detail</th>
          <th scope="col">Edit</th>
		  <th scope="col">Delete</th>
        </tr>
      </thead>
      <tbody class="tbody">
        <c:forEach var="user" items="${user}">
          <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.bio}</td>
            <td>
            <c:if test="${not empty user.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${user.photo}"
              id="image" class="detail-image" />
          </c:if>
           </td>
            <td><a href="detail/${user.id}" class="btn"> Detail </a></td>
            <td><a href="editUser/${user.id}" class="btn"> Edit </a></td>
			<td><a href="deleteUser/${user.id}" class="btn" onclick="return confirm('Are you sure want to delete?')"> Delete</a></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>
<script src='<c:url value="/resources/js/alert.js"/>'></script>
</body>
</html>