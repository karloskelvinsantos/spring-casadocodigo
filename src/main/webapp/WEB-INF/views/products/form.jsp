<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kelvin
  Date: 2019-05-20
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Cadastro de Produtos</title>
</head>
<body>

<form method="post" action="/spring-casadocodigo/produtos">
  <div>
    <label for="title">Título</label>
    <input type="text" name="title" id="title" />
  </div>
  <div>
    <label for="description">Descrição</label>
    <textarea rows="10" cols="20" name="description" id="description"></textarea>
  </div>
  <div>
    <label for="pages">Número de páginas</label>
    <input type="text" name="pages" id="pages" />
  </div>
  <div>
    <input type="submit" value="Enviar" />
  </div>

  <c:forEach items="${types}" var="bookType" varStatus="status">
    <div>
      <label for="price_${bookType}">${bookType}</label>
      <input type="text" name="prices[${status.index}].value" id="price_${bookType}"/>
      <input type="hidden" name="prices[${status.index}].bookType" id="${bookType}"/>
    </div>
  </c:forEach>
</form>
</body>
</html>
