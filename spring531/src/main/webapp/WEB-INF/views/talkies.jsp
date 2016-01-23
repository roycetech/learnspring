<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>

<head>
<title>Talkr</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css" />">
</head>

<body>

	<div class="talkieForm">
		<h1>Talk it out...</h1>
		<form method="POST" name="talkieForm">
			<input type="hidden" name="latitude"> <input type="hidden"
				name="longitude">
			<textarea name="message" cols="80" rows="5"></textarea>
			<br /> <input type="submit" value="Add" />
		</form>
	</div>

	<div class="listTitle">

		<h1>Recent Talkies</h1>

		<ul class="talkieList">
			<c:forEach items="${talkieList}" var="talkie">
				<li id="talkie_<c:out value="talkie.id"/>">
					<div class="talkieMessage">
						<c:out value="${talkie.message}" />
					</div>
					<div>
						<span class="talkieTime"><c:out value="${talkie.time}" /></span>
						<span class="talkieLocation">(<c:out
								value="${talkie.latitude}" />, <c:out
								value="${talkie.longitude}" />)
						</span>
					</div>
				</li>
			</c:forEach>
		</ul>

		<c:if test="${fn:length(talkieList) gt 20}">
			<hr />
			<s:url value="/talkies?count=${nextCount}" var="more_url" />
			<a href="${more_url}">Show more</a>
		</c:if>

	</div>
</body>

</html>