<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>

<head>
<title>Talkr</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css" />">
</head>

<body>

	<h1>Welcome to Talkr</h1>
	<a href="<c:url value="/talkies" />">Talkies</a> |
	<a href="<c:url value="/talkr/register" />">Register</a>	
	
</body>
</html>