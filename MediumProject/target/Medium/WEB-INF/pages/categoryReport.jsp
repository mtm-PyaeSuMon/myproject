<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
        </tr>
      </thead>
      <tbody class="tbody">
        <c:forEach var="category" items="${category}">
          <tr>
            <td>${category.categoryId}</td>
            <td>${category.categoryName}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>