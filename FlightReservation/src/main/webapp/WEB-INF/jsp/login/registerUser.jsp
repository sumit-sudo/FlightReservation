<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register User</title>
<h2>USER REGISTRATION</h2>
</head>
<body>
<form action="userRegistration" method="post">
<pre>
First Name: <input type="text" name="first_name"/><br>
Last Name:  <input type="text" name="last_name"/><br>
Email/UserName: <input type="text" name="email"/><br>
Password: <input type="password" name="password"/><br>
Confirm Password: <input type="password" name="confirmPassword"/><br>
<input type="submit" value="register"/>
</pre>
</form>

</body>
</html>