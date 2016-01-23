<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Talker</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Your Profile</h1>
    <c:out value="${talker.username}" /><br/>
    <c:out value="${talker.firstName}" /> <c:out value="${talker.lastName}" /><br/>
    <c:out value="${talker.email}" />
  </body>
</html>
