<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>carAtlas-CountryAdd</title>
</head>
<body>
<form:form method="post" modelAttribute="country">
    <label>Country name
    <form:input path="name" placeholder="Country" />
    </label>
</br>
    <form:button type="submit"> Add</form:button>
</form:form>
<a href="/"><button>Logout</button></a>
</body>
</html>
