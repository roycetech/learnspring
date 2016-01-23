<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<title>Talkr</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css" />">
</head>

<body>
	<div class="talkieView">
		<div class="talkieMessage">
			<c:out value="${talkie.message}" />
		</div>
		<div>
			<span class="talkieTime"><c:out value="${talkie.time}" /></span>
		</div>
	</div>
</body>

</html>