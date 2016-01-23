<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<%@ page session="false"%>

<html>

<head>
<title>Talkr</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css" />">
</head>

<body>

	<h1><s:message code="talker.welcome" text="Welcome" /></h1>
	<a href="<c:url value="/talkies" />">Talkies</a> |
	<a href="<c:url value="/talker/register" />">Register</a>	
	
</body>
</html>