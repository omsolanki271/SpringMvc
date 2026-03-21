<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>
<!-- second way to print  -->
	
	<%-- <h1>Welcome : ${model_uname}</h1>
	<h3>Name : ${model_uname}</h3>
	<h3>Email : ${model_email}</h3>
	<h3>Mobile No : ${model_mobile}</h3> --%>

<!-- Third way to print  -->
	<%-- <h1>Welcome : ${model_user.getUname()}</h1>
	<h3>Name : ${model_user.getUname()}</h3>
	<h3>Email : ${model_user.getEmail()}</h3>
	<h3>Mobile No : ${model_user.getMobileno()}</h3> --%>

<!-- Fourth way to print  -->	
	<h1>Welcome : ${user.getUname()}</h1>
	<h3>Name : ${user.getUname()}</h3>
	<h3>Email : ${user.getEmail()}</h3>
	<h3>Mobile No : ${user.getMobileno()}</h3>
	
</body>
</html>