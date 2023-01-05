<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="/resources/css/style.css"  var="styleCss"></spring:url>
<link href="${styleCss }" rel="stylesheet" />
<div class="container">
  <div class="row">
    <div class="col">
      <c:url value="/actionPasswordReset" var="reset" />
      <form:form action="${reset}" method="POST"
        modelAttribute="resetForm">
        <div class="row">
          <div>
            <label for="email">Email <span class="red">*</span></label> <br><br>
            <form:input type="text" path="email" name="email"
              value="${resetForm.email }" placeholder="you@gmail.com"
              class="form-control" />
            <form:errors path="email" />
            <c:if test="${not empty errorMsg }">
              <div>${errorMsg }</div>
            </c:if>
          </div>

          <div>
            <button type="submit">Reset</button>
          </div><br>
          <div>
            <a href="<c:url value='/' />" class="text-center">Back
              to Home?</a>
          </div>
        </div>

      </form:form>
    </div>
  </div>
</div>
