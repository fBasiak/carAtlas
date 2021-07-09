<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>carAtlas-CarDel</title>
</head>
<body>
<form method="post" >
    <h3>Are you sure?</h3>
    </br>
    <input type="hidden" path="id" value="${car.id}"/>
    <a href="/car/all"> No</a>
    </br>
    <button type="submit"> Yes </button>
</form>
<a href="/"><button>Logout</button></a>

</body>
</html>
