<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/library/bootstrap.min.css" />">
	<link rel='stylesheet' href='<c:url value="/resources/css/library/bootstrap.min.css.map"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/choices.min.css"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/dataTable.min.css"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/jquery-ui.css"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/select2.min.css"/>' />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel='stylesheet' href='<c:url value="/resources/css/post.css"/>' />
<title>Insert title here</title>
</head>
<body>
<div class="container-sm">
    <div class="row">
      <div class="col-sm-8">
        <div class="clearfix">
        <div class="float-start clearfix">
        <span class="float-start">
			 <c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image pp" />
          </c:if>
		</span>
        <div class="float-end">
          <p>Julie Zhuo</p>
        </div>
      </div>
      <div class="float-end">
        <a href="<%=request.getContextPath()%>/deletePost/${postDetail.id}" class="btn btn-danger"  onclick="return confirm('Are you sure want to delete?')" style="margin-right: 141px"> Delete</a>
      </div>
    </div>
    <c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image women" />
          </c:if>
          <c:if test="${empty postDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/women.jpg" id="image" class="detail-image women" />
          </c:if>
    <h2>${postDetail.title}</h2>
    <p>${postDetail.description}</p>
      </div>
      <div class="col-sm-4">
       <c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image pp2" />
          </c:if>
          <c:if test="${empty postDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image pp2" />
          </c:if>
        <p>Julie Zhuo</p>
        <p>100 posts</p>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Deserunt tempora necessitatibus ipsam sed corrupti culpa exercitationem nisi accusantium repudiandae blanditiis.</p>
        <h3 class="medium">More from Medium</h3>
        <div class="clearfix">
          <div class="float-start">
            <div class="d-flex">
        <p>
			<c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image pp" />
          </c:if>
          <c:if test="${empty postDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image pp" />
          </c:if>
		</p>
        <p class="name">Alex Mathers</p>
      </div>
        <p class="para1">10 Little Lorem ipsum dolor sit amet Lorem ipsum dolor?</p>
      </div>
      <div class="float-end">
       <c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image pp3" />
          </c:if>
          <c:if test="${empty postDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image pp3" />
          </c:if>
      </div>
      </div>

      <div class="clearfix">
        <div class="float-start">
          <div class="d-flex">
      	<p>
		<c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image pp" />
          </c:if>
          <c:if test="${empty postDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image pp" />
          </c:if>
		</p>
      <p class="name">Alex Mathers</p>
    </div>
      <p class="para1">10 Little Lorem ipsum dolor sit amet Lorem ipsum dolor?</p>
    </div>
    <div class="float-end">
      <c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image pp3" />
          </c:if>
          <c:if test="${empty postDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image pp3" />
          </c:if>
    </div>
    </div>

    <div class="clearfix">
      <div class="float-start">
   <div class="d-flex">
    <p>
		<c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image pp" />
          </c:if>
          <c:if test="${empty postDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image pp" />
          </c:if>
</p>
    <p class="name">Alex Mathers</p>
  </div>
    <p class="para1">10 Little Lorem ipsum dolor sit amet Lorem ipsum dolor?</p>
  </div>
  <div class="float-end">
    <c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image pp3" />
          </c:if>
          <c:if test="${empty postDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image pp3" />
          </c:if>
  </div>
  </div>

  <div class="clearfix">
    <div class="float-start">
      <div class="d-flex">
  	<p>
		<c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image pp" />
          </c:if>
          <c:if test="${empty postDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image pp" />
          </c:if>
	</p>
  <p class="name">Alex Mathers</p>
</div>
  <p class="para1">10 Little Lorem ipsum dolor sit amet Lorem ipsum dolor?</p>
</div>
<div class="float-end">
  <c:if test="${not empty postDetail.photo}">
            <img
              src="<%=request.getContextPath()%>/resources/img/${postDetail.photo}"
              id="image" class="detail-image pp3" />
          </c:if>
          <c:if test="${empty postDetail.photo}">
            <img src="<%=request.getContextPath()%>/resources/img/images.jpg" id="image" class="detail-image pp3" />
          </c:if>
</div>
</div>
    </div>
  </div>
  </div>
  <script src='<c:url value="/resources/js/alert.js"/>'></script>
   <script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
</body>
</html>