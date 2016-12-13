<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%! int counter = 0; // '!' is used in the opener when declaring a variable%>
<% counter += 1; %>

<html>
<head>
    <title>Hello world from JSP</title>
</head>
<body>
<h1>Hello world from body of JSP</h1>
<h1>
    this page has been viewed:
    <%= counter // '=' is used when you are trying to System.out.println();%>
    times since last server restart
</h1>
<h3>names</h3>

<c:if test="${names.isEmpty}">
    <h4>There are no names</h4>
</c:if>
<c:forEach var="name" items="${names}">
     <p>${name}</p>
</c:forEach>





</body>
</html>
