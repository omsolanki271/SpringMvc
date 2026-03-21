<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My form </title>
</head>
<body>
	<form action="submitForm" method="post">
		User Name: <input type="text" name="username" placeholder="Enter your Username" required="required"> <br> <br>
		Email id: <input type="email" name="email " placeholder="Enter your email" required="required"> <br> <br>
		Phone No : <input type="text" name="mobile " placeholder="Enter Mobile NO. " required="required"><br> <br>
		<input type="submit" value="Login" name="submit"> 
	</form> 
</body>
</html>
