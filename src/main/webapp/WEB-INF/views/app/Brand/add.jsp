<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>carAtlas-BrandAdd</title>
</head>
<body>
<form:form method="post" modelAttribute="brand">
    <label>Brand name:
        <form:input path="name" placeholder="Brand name" />
    </label>
    </br>
    <label>Founder:
        <form:input path="founder" placeholder="Brand founder" />
    </label>
    </br>
    <label>Year of establishment:
        <form:input path="year" placeholder="Year of establishment" type="number" />
    </label>
    </br>
    <label>Country:
        <form:select path="country" items="${allCountries}" itemLabel="name" itemValue="id" />
    </label>
    </br>
    <form:button type="submit"> Add</form:button>
</form:form>
<a href="/"><button>Logout</button></a>

</body>
</html>
