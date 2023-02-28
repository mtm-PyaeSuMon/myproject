<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<link rel='stylesheet' href='<c:url value="/resources/css/user.css"/>' />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<title>Insert title here</title>
</head>
<body>
<%-- <form:form action="detail" modelAttribute="userForm" method="post"> --%>
<div class="container-sm">
    <div class="row">
      <div class="col-sm-8 p-3 left">
        <div class="row">
          <div class="col-sm-6">
          	<h3 class="d-inline-block w-100 pl-1 name" >${userDetail.name}</h3>
          </div>
          <div class="col-sm-2">
          	<a href="<%=request.getContextPath()%>/editUser/${userDetail.id}" class="btn btn-danger" style="margin-left: 120px"> Edit </a>
          </div>
        </div><br><br>
        <h3 class="info">Information</h3><hr><br>
        <h5>Email</h5>
        <p>${userDetail.email}</p><br>
        <h5>Post Count</h5>
        <p class="count">5</p><br>
        <h5>Bio</h5>
        <p>${userDetail.bio}</p><br>
        <h4>My Post</h4><hr>
         <c:if test="${not empty userDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${userDetail.photo}"
              id="image" class="detail-image" />
          </c:if>
          <c:if test="${empty userDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image" />
          </c:if>
        <span>Lorem ipsum dolor sit amet.</span><br><br>
        <h6 class="dev">Why Some Developer Will Never Improve</h6>
        <div class="clearfix">
        <p  class="float-start para">Lorem ipsum dolor sit amet consectetur adipisicing elit. Vel totam rerum quos earum nisi nulla unde magnam at ab consectetur, ea error molestiae minima ex, deleniti voluptates iste. Ab pariatur sunt ad animi tempore numquam sequi veniam inventore cum recusandae!</p>
        <c:if test="${not empty userDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${userDetail.photo}"
              id="image" class="detail-image" style="border-radius: revert" />
          </c:if>
          <c:if test="${empty userDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image"/>
          </c:if>
      </div>
        <span class="self-program">Programming</span>
        <span class=""><i class="fa-solid fa-o"></i></span>
        <span><a href=""><i class="fa-solid fa-ellipsis"></i></a></span>
      </div>
      <div class="col-sm-4 p-3">
        <div class="container-sm">
        <p class="post">2022 in latest Posts</p><br>
        <span>
			<c:if test="${not empty userDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${userDetail.photo}"
              id="image" class="detail-image" />
          </c:if>
          <c:if test="${empty userDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image" />
          </c:if>
		</span>
        <span>Zulie Rane</span>
        <p>2022 in a word : Permestressed</p>
        <span>
        <c:if test="${not empty userDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${userDetail.photo}"
              id="image" class="detail-image" />
          </c:if>
          <c:if test="${empty userDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image" />
          </c:if>
        </span>
        <span>Zulie Rane</span>
        <p>2022 in a word : Permestressed</p>
        <span>
        	<c:if test="${not empty userDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${userDetail.photo}"
              id="image" class="detail-image" />
          </c:if>
          <c:if test="${empty userDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image" />
          </c:if>
        </span>
        <span>Zulie Rane</span>
        <p>2022 in a word : Permestressed</p><hr><br>
        <div class="row">
        <p class="col-sm-6 self">Self Improvement</p>
        <p class="col-sm-5 self">Programming</p>
      </div>
      <div class="row">
        <p class="col-sm-4 self">Health</p>
        <p class="col-sm-4 self">Politics</p>
        <p class="col-sm-8 self">Machine Language</p>
      </div>
        <p class="col-sm-4 self">Networking</p>
      </div>
    </div>
    </div>
  </div>
     <script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
<%--   </form:form> --%>
</body>
</html>