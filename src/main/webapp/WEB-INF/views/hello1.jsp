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
    <title>hello1</title>
</head>
<body>
    <h2>여기는 hello1</h2><br>
    <form action="/form-param2" method="get">
        <input type="text" name="p1" > <br>
        <input type="text" name="p2" > <br>
        <input type="submit"  value="전송">
    </form>
    <form action="/form-param3" method="post">
        <input type="text" name="p3"> <br>
        <input type="text" name="p4"> <br>
        <input type="submit" value="전송">
    </form>

</body>
<script>
    // const sub1=()=>{
    //     const name= param1.getElementById("idparam2name").value;
    //     const age = param1.getElementById("idparam2age").value;
    //     location.href="/form-param2?name="+name+"&age="+age;
    // }
</script>

</html>
