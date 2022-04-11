<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Count</title>
</head>
<body>
	<p>You have visited this page <c:out value="${count}"/> times</p>
	<a href="/">Test Another Visit?</a>
</body>
</html>