
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link  rel="stylesheet" href='<c:url value="/resources/css/library/bootstrap.min.css" />' />
  <link rel='stylesheet' href='<c:url value="/resources/css/library/bootstrap.min.css.map"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/choices.min.css"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/dataTable.min.css"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/jquery-ui.css"/>' />
<link rel='stylesheet' href='<c:url value="/resources/css/library/select2.min.css"/>' />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel='stylesheet' href='<c:url value="/resources/css/style.css"/>' />
<title>Insert title here</title>
<style>
  .navbar-brand{
  font-weight: 700;
}
</style>
</head>
<body>
<div class="container">
 <div class="container">
	<nav class="navbar navbar-expand-sm navbar-light bg-warning">
	  <div class="container-fluid ">
         <img alt="" src="<%=request.getContextPath()%>/resources/img/medium-logo.png" style="width: 40px"> 
		<a class="navbar-brand fs-2" href="#">Medium</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		  <span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse " id="navbarSupportedContent">
		  <ul class="navbar-nav ms-auto">
			<li class="nav-item">
			  <a class="nav-link active" aria-current="page" href="post">Write</a>
			</li>
			<li class="nav-item">
			  <a class="nav-link" href="login">Sign In</a>
			</li>		
            <li class="nav-item">
             <a href="#" class="btn btn-dark" style="border-radius: 30px"> Get Start</a>
            </li>	
		  </ul>		  
		</div>
	  </div>
	</nav>
  </div>
  </div>
</body>
</html>