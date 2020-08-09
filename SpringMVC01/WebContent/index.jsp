<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<br><br>

	<a href="springmvc/testServletAPI">Test ServlerAPI</a>
	<br><br>

	<form action="springmvc/testPOJO" method="post">
		username:<input type="text" name="username"><br>
		password:<input type="password" name="password"><br>
		email:<input type="text" name="email"><br>
		age:<input type="text" name="age"><br>
		province:<input type="text" name="address.province"><br>
		city:<input type="text" name="address.city"><br>
		<input type="submit" value="submit">
	</form>

	<br><br>

	<a href="springmvc/testCookieValue">Test JSESSIONID</a>
	<br><br>

	<br><br>

	<a href="springmvc/headle5">Test headle5</a>
	<br><br>


	<a href="springmvc/testRequestParam?username=TOM&age=20">testRequestParam</a>
	<br><br>

	<form action="springmvc/testRest" method="POST">
		<input type="hidden" name="_method" value="POST">
		<input type="submit" value="Test POST">
	</form>
	<br><br>
	
	<form action="springmvc/testRest" method="POST">
		<input type="hidden" name="_method" value="GET">
		<input type="submit" value="Test GET">
	</form>
	<br><br>
	
	<form action="springmvc/testRest" method="POST">
		<input type="hidden" name="_method" value="PUT">
		<input type="submit" value="Test PUT">
	</form>


	<br><br>
	
	<form action="springmvc/testRest" method="POST">
		<input type="hidden" name="_method" value="DELETE">
		<input type="submit" value="Test DELETE">
	</form>
	
	<br><br>

	<a href="springmvc/testRest/1">Test Rest GET</a>
	<br><br>

	<a href="springmvc/testPathVariable/1">testPathVariable</a>
	<br><br>
	
	<a href="springmvc/testAntPath/xyz/abc">testAntPath</a>
	<br><br>

	<a href="springmvc/testParamsAndHeaders?username=TOM&age=11">testParamsAndHeaders</a>
	<br><br>
	
	
	<form action="springmvc/testMethod" method=POST>
		<input type="submit" value="testMethod-POST">
	</form>
	<br><br>
	
	<a href="springmvc/testMethod">testMethod-GET</a>

	<br><br>
	<a href="springmvc/helloworld">Hello world</a>
	<br><br>
	<a href="springmvc/testRequestMapping">requestmapping</a>
</body>
</html>