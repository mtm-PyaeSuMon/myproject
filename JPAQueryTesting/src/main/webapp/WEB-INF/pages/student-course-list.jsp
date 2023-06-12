<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student-Course List</h1>
    <table>
        <thead>
            <tr>
                <th>Student ID</th>
                <th>Student Name</th>
                <th>Course ID</th>
                <th>Course Name</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="studentCourse" items="${studentCourses}">
                <tr>
                    <td>${studentCourse.student.id}</td>
                    <td>${studentCourse.student.name}</td>
                    <td>${studentCourse.course.id}</td>
                    <td>${studentCourse.course.name}</td>
                    <td>
                        <a href="/student-course/remove?studentId=${studentCourse.student.id}&courseId=${studentCourse.course.id}">
                            Remove
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>