<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
	<head>
		<title>Welcome to RealDolmen Education JSF 2.0 Course</title>
	</head>
	<body>
		<h1>Welcome to RealDolmen Education JSF 2.0 Course</h1>
		<p>Let's have some fun!</p>
		<c:url var="helloUrl" value="/hello.faces"/>
		Click <a href="${helloUrl}">here</a> to see if JSF works on your system!
	</body>
</html>