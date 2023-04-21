<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오전 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring2</title>
</head>
<body>
    <h2>index</h2><br>
    <a href="/hello1" >hello1</a><br>
    <button onclick="fun1()">hello2</button>
    <a href="/hello3">hello3</a>
    <a href="/hello4">hello4</a>
    <a href="/hello5">hello5</a>
</body>
<script>
    const fun1 = () => {
        location.href ="hello2";
    }
</script>
</html>
