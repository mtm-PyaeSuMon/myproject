<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/library/bootstrap.min.css" />"
	rel="stylesheet">
<link rel='stylesheet' href='<c:url value="/resources/css/post.css"/>' />
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
          <th scope="col">Title</th>
          <th scope="col">Category</th>
          <th scope="col">Description</th>
          <th scope="col">Image</th>
          <th scope="col">Detail</th>
          <th scope="col">Edit</th>
		  <th scope="col">Delete</th>
        </tr>
      </thead>
      <tbody class="tbody">
        <c:forEach var="post" items="${post}">
          <tr>
            <td>${post.id}</td>
            <td>${post.title}</td>
            <td>${post.category}</td>
            <td>${post.description}</td>
            <td>
            <c:if test="${not empty post.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${post.photo}"
              id="image" class="detail-image"/>
          </c:if>
          </td>
            <td><a href="postdetail/${post.id}" class="btn"> Detail </a></td>
            <td><a href="editPost/${post.id}" class="btn"> Edit </a></td>
			<td><a href="deletePost/${post.id}" class="btn" onclick="return confirm('Are you sure want to delete?')"> Delete</a></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>
<script src='<c:url value="/resources/js/alert.js"/>'></script>
</body>
</html>