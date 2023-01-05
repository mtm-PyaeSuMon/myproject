<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<div class="row">
    <div>
      <h1 class="text-center">Login</h1>
      <font color="red">
        ${SPRING_SECURITY_LAST_EXCEPTION.message} </font>
      <form:form action="login" method="post">
        <div class="form-group">
          Email <span class="red">*</span> <input type="text"
            name="username" />
        </div> <br>
        <div class="form-group">
          Password <span class="red">*</span> <input
            type="password" name="password" />
        </div>
        <br>
        <div class="text-center">
          <input type="submit" value="Login" />
        </div>
        <br>
      </form:form>
      <div class="text-center">
        <a href="passwordReset">Password Reset</a>
      </div>
    </div>
  </div>
</body>
</html>