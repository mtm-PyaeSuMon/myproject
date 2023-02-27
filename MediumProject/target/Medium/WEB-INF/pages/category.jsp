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
<title>Insert title here</title>
</head>
<body>
<form:form action="insertCategory" modelAttribute="categoryForm" method="post">
<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row justify-content-center align-items-center h-100">
      <div class="col-12 col-lg-9 col-xl-7">
        <div class="card shadow-2-strong card-registration" style="border-radius: 15px;">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Category</h3>
            <form>
              <div class="row">
                <div class="col-md-6 mb-4">
                  <div class="form-outline">
                    <form:label path="categoryName"  class="form-label" for="categoryName">Name</form:label><br>
                    <form:input path="categoryName" type="text" id="categoryName" class="form-control form-control-lg" placeholder="Name" />
                    <form:errors path="categoryName" class="error" />
                  </div>
                </div>               
              </div>
              <div class="mt-4 pt-2">
                <input class="btn btn-primary btn-lg" type="submit" value="Submit" />
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
 </form:form>
</body>
</html>