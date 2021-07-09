<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>carAtlas-CountryList</title>
</head>
<body>
<table border="5">
    <tr>
        <th>ID</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${countryList}" var="country">
        <tr>
            <td>${country.id}</td>
            <td>${country.name}</td>
           <td><a href=/country/delete?id=${country.id}><button>Delete</button></a></td>
        </tr>
    </c:forEach>
</table>
<a href="/country/add"><button>Add new Country</button></a>

<h5><a href="/brand/all">Brands</a></h5>
<h5><a href="/car/all">Cars </a></h5>
<a href="/"><button>Logout</button></a>

</body>
</html>
