<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel='stylesheet' href='<c:url value="/resources/css/library/bootstrap.min.css"/>' />
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
<form:form action="insertUser" modelAttribute="userForm" method="post">
  <form:hidden path="id"/>
<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row justify-content-center align-items-center h-100">
      <div class="col-12 col-lg-9 col-xl-7">
        <div class="card shadow-2-strong card-registration" style="border-radius: 15px;">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Sign Up</h3>
            <form>

              <div class="row">
                <div class="col-md-6 mb-4">

                  <div class="form-outline">
                    <form:label path="name"  class="form-label" for="name">Name</form:label><br>
                    <form:input path="name" type="text" id="name" class="form-control form-control-lg" placeholder="Name" />
                    <form:errors path="name" class="error" />
                  </div>

                </div>
                <div class="col-md-6 mb-4">

                  <div class="form-outline">
                    <form:label path="email" class="form-label" for="email">Email</form:label><br>
					<form:input path="email" type="email" id="email" class="form-control form-control-lg" placeholder="Your Email(example@gmail.com)" />
					<form:errors path="email" class="error" />
                  </div>

                </div>
              </div>

              <div class="row">
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                    <form:label path="password" class="form-label" for="password">Password</form:label><br>
                    <form:input path="password" type="password" id="password" class="form-control form-control-lg" placeholder="Password" />
                    <form:errors path="password" class="error" />
                  </div>

                </div>
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                    <form:label path="confirmedpassword" class="form-label" for="confirmedpassword">Confirmed Password</form:label><br>
                    <form:input path="confirmedpassword" type="password" id="confirmedpassword" class="form-control form-control-lg" placeholder="Confirmed Password" />
                    <form:errors path="confirmedpassword" class="error" />
                  </div>

                </div>
              </div>
              
                 <div class="row">
                <div class="col-md-6 mb-4 d-flex align-items-center">
                  <div class="form-outline datepicker w-100">
                    <form:label path="bio" for="bio" class="form-label">Bio</form:label><br>
                    <form:textarea path="bio" class="form-control textarea" rows="3" placeholder="Your Bio" ></form:textarea>
                    <form:errors path="bio" class="error" />
                  </div>
                </div>
              </div>
              
            <div class="row">
           <div class="col-md-12">
            <c:set var="jspViewPhoto" value="${pageContext.request.contextPath}/${userForm.photo}"/>
            <c:if test="${fn:contains(userForm.photo,'base64') }">
              <c:set var="jspViewPhoto" value="${userForm.photo}"/>
            </c:if>
          
            <div class="row form-group">
              <c:if test="${not empty userForm.photo}">
                <img
                  src="${jspViewPhoto}"
                  id="image" class="user-image" />
              </c:if>
              <c:if test="${empty userForm.photo}">
                <img
                  src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="user-image  w-25" />
              </c:if>
            </div>
            </div>
		</div>
		<div class="row">
			<div class="row form-group">
              <div class="col-12 col-md-8">
                <form:input id="fileUpload" path="photo"
                  onchange="showImage.call(this)" type="file"
                  accept=".png, .jpg, .jpeg" value="" />
                <form:input type="hidden" path="photo" />
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
 <script src='<c:url value="/resources/js/user.js"/>'></script>
 <script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
</body>
</html>