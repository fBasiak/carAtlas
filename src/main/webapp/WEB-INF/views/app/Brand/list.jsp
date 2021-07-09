<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>carAtlas-BrandList</title>
</head>
<body>
<table border="5">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Founder</th>
        <th>Year of establishment</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${brandList}" var="brand">
        <tr>
            <td>${brand.id}</td>
            <td> ${brand.name}</td>
            <td>${brand.founder}</td>
            <td>${brand.year}</td>
            <td>${brand.country.name}</td>
            <td><a href=/brand/delete?id=${brand.id}><button>Delete</button></a></td>
        </tr>
    </c:forEach>
</table>
<a href="/brand/add"><button>Add new Brand</button></a>

<h5><a href="/country/all">Countries</a></h5>
<h5><a href="/car/all">Cars </a></h5>
<a href="/"><button>Logout</button></a>

</body>
</html>
