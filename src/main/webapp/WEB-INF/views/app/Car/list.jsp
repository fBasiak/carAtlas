<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>carAtlas-CarList</title>
</head>
<body>
<table border="5">
    <tr>
        <th>ID</th>
        <th>Brand</th>
        <th>Model</th>
        <th>Generation</th>
    </tr>
    <c:forEach items="${carList}" var="car">
        <tr>
            <td>${car.id}</td>
            <td>>${car.brand.name}</td>
            <td>${car.model}</td>
            <td>${car.generation}</td>
            <td><a href=/car/delete?id=${car.id}><button>Delete</button></a></td>
            <td><a href="/car/edit?id=${car.id}"><button>Edit</button></a></td>
        </tr>
    </c:forEach>
</table>
<a href="/car/add"><button>Add new Car</button></a>

<h5><a href="/brand/all">Brands</a></h5>
<h5><a href="/country/all">Countries</a></h5>
<a href="/"><button>Logout</button></a>

</body>
</html>
