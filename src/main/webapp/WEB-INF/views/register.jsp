<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>carAtlas-SignUp</title>
</head>
<body>

<form:form method="post"  modelAttribute="user">
    <label >Username:
        <form:input  path="username" placeholder="Username"/>
    </label><br/>
    <label >Email:
        <form:input  path="email" placeholder="Email"/>
    </label><br/>
    <label >Password:
        <form:password path="password" placeholder="Podaj hasło"/>
    </label><br/>
    <form:button type="submit">Add</form:button>
</form:form>
</body>