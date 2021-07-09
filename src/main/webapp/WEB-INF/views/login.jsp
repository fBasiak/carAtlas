<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>carAtlas-SignIn</title>
</head>
<body>
<form:form method="post" modelAttribute="user">
    <label>Username:
        <form:input  path="username" placeholder="Username"/>
    </label><br/>
    <label>Password:
        <form:password path="password" placeholder="Podaj hasło"/>
    </label><br/>
    <form:button type="submit">Sign in</form:button>
</form:form>
<button><a href="/register">sign up</a></button>
</body>
</html>
