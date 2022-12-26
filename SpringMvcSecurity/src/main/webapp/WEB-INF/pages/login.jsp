<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Login Page</h3>
  <font color="red"> ${SPRING_SECURITY_LAST_EXCEPTION.message} </font>
  <form:form action="login" 
    method="post">
    Enter UserName: <input type="text" name="username" /><br /><br />
    Enter Password: <input type="password" name="password" /> <br /><br />
    <input type="submit" value="Login" />
  </form:form>
</body>
</html>