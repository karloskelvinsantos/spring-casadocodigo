<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kelvin
  Date: 2019-05-21
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
  <title>Listagem de Livros</title>
</head>
<body>
<table>
  <tr>
    <td>Titulo</td>
    <td>Valores</td>
  </tr>
  <c:forEach items="${products}" var="product">
    <tr>
      <td>${product.title}</td>
      <td>
        <c:forEach items="${product.prices}" var="price">
          [${price.values} - ${price.bookType}]
        </c:forEach>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
