<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container">
  <div class="row">
    <div>
      <c:url value="/resetPassword" var="reset" />
      <form:form action="${reset}" method="POST"
        modelAttribute="resetForm">
        <div class="row">

          <input type="hidden" name="${_csrf.parameterName}"
            value="${_csrf.token}" />
          <form:hidden path="token" value="${resetForm.token}" />

          <div>
            <label for="email">Password <span class="red">*</span></label>
            <form:input type="password" path="password" name="password"
              id="password" placeholder="" />
            <form:errors path="password" />
          </div>
          <div class="col-12">
            <label for="email" class="form-label">Confirm
              Password <span class="red">*</span>
            </label>
            <form:input type="password" path="confirm_password"
              placeholder="" id="confirm_password" />
            <form:errors path="confirm_password" />
          </div>
          <c:if test="${not empty errorMsg }">
            <div>${errorMsg }</div>
          </c:if>

          <div>
            <button class="btn" type="submit">Change</button>
          </div>
        </div>

      </form:form>
    </div>
  </div>

</div>
