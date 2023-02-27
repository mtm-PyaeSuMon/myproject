<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel='stylesheet' href='<c:url value="/resources/css/login.css"/>' />
<title>Insert title here</title>
</head>
<body>
<div id="login">
        <h3 class="text-center text-white pt-5">Login form</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form:form action="login" modelAttribute="login" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                                <form:label path="email" for="email" class="text-info">Email:</form:label><br>
                                <form:input path="email" type="email" name="email" id="email" class="form-control" placeholder="Your Email(example@gmail.com)"/>
                                <form:errors path="email" class="error" />
                            </div>
                            <div class="form-group">
                                <form:label path="password" for="password" class="text-info">Password:</form:label><br>
                                <form:input path="password" type="password" name="password" id="password" class="form-control" placeholder="password"/>
                                <form:errors path="password" class="error" />
                            </div>
                            <div class="form-group">
                               <button type="submit" class="btn btn-info btn-md">Login</button>
                            </div>
                            <div id="register-link" class="text-right">
                                <a href="register" class="text-info">Register here</a>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>