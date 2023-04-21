<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오전 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello2</title>
</head>
<body>
    <h2>여기는 hello2</h2>
    <a href="/req-param1?name=홍길동&age=599"> 파라미터 보내기</a>
    <button onclick="param1()">파라2 </button>

</body>
<script>
    const param1=()=>{
        const name= "나나핑";
        const age = 3;
        location.href="/req-param1?name="+name+"&age="+age;
    }




</script>
</html>
