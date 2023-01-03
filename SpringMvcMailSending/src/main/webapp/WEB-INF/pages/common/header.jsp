<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<spring:url value="/resources/css/style.css"  var="styleCss"></spring:url>
<link href="${styleCss }" rel="stylesheet" />
</head>
<body>
<header class="border-bottom py-3">
  <div class="container">
    <div class="header">
      <h3>Spring MVC CRUD Header</h3>
    </div>
  </div>
</header>
</body>
</html>