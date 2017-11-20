<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 12852
  Date: 2017/11/16
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h1>Success</h1>
    <table border="1">
        <tr>
            <th>id</th>
            <th>message</th>
        </tr>
        <tr>
            <th>${message.id}</th>
            <th>${message.message}</th>
        </tr>
    </table>
</body>
</html>
