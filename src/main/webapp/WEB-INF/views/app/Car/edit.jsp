<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>carAtlas-CarEdit</title>
</head>
<body>
<form:form method="post" modelAttribute="car">
    <label>Brand:
        <form:select path="brand" items="${allBrands}" itemLabel="name" itemValue="id" />
    </label>
    </br>
    <label>Model:
        <form:input path="model" placeholder="Model" />
    </label>
    </br>
    <label>Generation:
        <form:input path="generation"  type="number"/>
    </label>
    </br>

    <form:button type="submit"> Add</form:button>
</form:form>
<a href="/"><button>Logout</button></a>

</body>
</html>