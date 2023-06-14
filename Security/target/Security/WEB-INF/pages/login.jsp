<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%-- <div class="container">
<div class="row">
    <div>
      <h1 class="text-center">Login</h1>
      <form:form action="login" method="post">
        <div class="form-group">
          Email: <input type="text" name="username" />
        </div> <br>
        <div class="form-group">
          Password: <input type="password" name="password" />
        </div>
        <br>
        <div>
          <input type="submit" value="Login"  class="btn btn-danger" />
        </div>
        <br>
      </form:form>
    </div>
  </div>
  </div> --%>
  <div class="container">
  <h1 class="text-center">Login</h1>
   <form:form action="login" method="post">
  <div class="form-group">
    <label for="email">Email address</label>
    <input type="email" class="form-control" name="username" id="email" placeholder="Enter email">
  </div>
  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
  </div>
  <input type="submit" value="Login"  class="btn btn-danger" />
  </form:form>
  </div>
</body>
</html>