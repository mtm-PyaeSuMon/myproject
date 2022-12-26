<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<spring:url value="/resources/css/style.css"  var="styleCss"></spring:url>
<link href="${styleCss }" rel="stylesheet" />
</head>
<footer class="container">
  <div class="mt-3 footer" border-b>Copyright &copy; ${LocalDate.now().year}
    SCM Seattle Consulting Myanmar Co.,Ltd.</div>
</footer>
</html>