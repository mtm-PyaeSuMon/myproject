<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
  integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
  crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
.main {
  width: 30%;
  margin: 50px auto;
}

.has-search .form-control {
  padding-left: 2.375rem;
}

.has-search .form-control-feedback {
  position: absolute;
  z-index: 2;
  display: block;
  width: 2.375rem;
  height: 2.375rem;
  line-height: 2.375rem;
  text-align: center;
  pointer-events: none;
  color: #aaa;
}

.input-group {
  margin-top: 20px;
}

.bg-custom-1 {
  background-color: #85144b;
}

.bg-custom-2 {
  background-image: linear-gradient(15deg, #13547a 0%, #80d0c7 100%);
}

.dropdown:hover .dropdown-menu {
  display: block;
}
</style>
</head>
<body>
  <div class="container">
    <div class="container">
      <nav class="navbar navbar-expand-sm navbar-light">
        <div class="container-fluid ">
          <a class="navbar-brand fs-2" href="#"> <img alt=""
            src="<%=request.getContextPath()%>/resources/img/medium-logo.png"
            style="width: 40px">
          </a>
          <div class="input-group rounded rounded-pill">
            <div class="form-group has-search">
              <span class="fa fa-search form-control-feedback"> </span>
              <input type="text" class="form-control"
                placeholder="Search Medium" style="border-radius: 20px;background-color: #ECF0F1">
            </div>
          </div>
          <div class="collapse navbar-collapse "
            id="navbarSupportedContent">
            <i class="fa-regular fa-pen-to-square"></i>
            <ul class="navbar-nav ms-auto">
              <li class="nav-item"><a class="nav-link active"
                aria-current="page" href="post"
                style="padding-top: 15px">Write</a></li>
              <li class="nav-item">
                <button class="navbar-toggler" type="button"
                  data-toggle="collapse" data-target="#navbar-list-4"
                  aria-controls="navbarNav" aria-expanded="false"
                  aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbar-list-4">
                  <ul class="navbar-nav">
                    <li class="nav-item dropdown"><a
                      class="nav-link dropdown-toggle" href="#"
                      id="navbarDropdownMenuLink" role="button"
                      data-toggle="dropdown" aria-haspopup="true"
                      aria-expanded="false"> <img alt=""
                        src="<%=request.getContextPath()%>/resources/img/women.jpg"
                        width="40px" height="40px"
                        class="rounded-circle">
                    </a>
                      <div class="dropdown-menu"
                        aria-labelledby="navbarDropdownMenuLink"
                        id="myDropdown">
                        <a class="dropdown-item" href="editUser">Edit
                          Profile</a>
                      </div></li>
                  </ul>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <hr>
    </div>
  </div>
</body>
</html>