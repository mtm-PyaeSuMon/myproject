<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Create User</h2>

<form action="create" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label for="street">Street:</label>
    <input type="text" id="street" name="address.street" required><br><br>

    <label for="city">City:</label>
    <input type="text" id="city" name="address.city" required><br><br>

    <label for="state">State:</label>
    <input type="text" id="state" name="address.state" required><br><br>

    <label for="country">Country:</label>
    <input type="text" id="country" name="address.country" required><br><br>

    <label for="zipCode">Zip Code:</label>
    <input type="text" id="zipCode" name="address.zipCode" required><br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>