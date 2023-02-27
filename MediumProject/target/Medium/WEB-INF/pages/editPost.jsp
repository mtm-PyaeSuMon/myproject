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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel='stylesheet' href='<c:url value="/resources/css/style.css"/>' />
<title>Insert title here</title>
</head>
<body>
<form:form action="updatePost" modelAttribute="updatePost" method="post">
<form:hidden path="id"/>
<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row justify-content-center align-items-center h-100">
      <div class="col-12 col-lg-9 col-xl-7">
        <div class="card shadow-2-strong card-registration" style="border-radius: 15px;">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Edit Post Form</h3>
            <form>

              <div class="row">
                <div class="col-md-6 mb-4">

                  <div class="mb-3">
   					<form:input value="${post.title}" path="title" type="text" class="form-control" id="exampleInputEmail1" placeholder="Post Title" />
  				  </div>
  				  
  								<div class="col-md-6">
										<c:set var="jspViewPhoto"
											value="${pageContext.request.contextPath}/${postForm.photo}" />
										<c:if test="${fn:contains(postForm.photo,'base64') }">
											<c:set var="jspViewPhoto" value="${postForm.photo}" />
										</c:if>

										<div class="row form-group">
											<c:if test="${not empty postForm.photo}">
												<img src="${jspViewPhoto}" id="image" class="post-photo" />
											</c:if>
											<c:if test="${empty postForm.photo}">
												<img
													src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="post-photo" />
											</c:if>
										</div>
									</div>
									<div class="row">
									<div class="row form-group">
              							<div class="col-12 col-md-8">
               							<form:input id="fileUpload" path="photo" onchange="showImage.call(this)" type="file" accept=".png, .jpg, .jpeg" value="" />
                						<form:input type="hidden" path="photo" />
              						</div>
            						</div>
									</div>
									
									<div class="mb-3">
                					<form:select path="categoryId" class="form-control">
                  					<form:option value="" label="Category" />
                  					<form:options items="${categoryList}" itemValue="categoryId" itemLabel="categoryName" />
                					</form:select>
              					</div>
              					
            <div class="row form-group">
                <div class="mb-3">
                  <div class="form-outline w-100">
                    <form:textarea path="description" value="${post.description}" class="form-control textarea" rows="3" placeholder="Post Description" ></form:textarea>
                  </div>

                </div>
              </div>
              
              <div class="row form-group">
                <div class="mb-3">
                  <div class="form-outline w-100">
                    <button type="submit" class="btn btn-primary">Publish</button>
                  </div>

                </div>
              </div>
		</div>
		</div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</form:form>
 <script src='<c:url value="/resources/js/post.js"/>'></script>
</body>
</html>