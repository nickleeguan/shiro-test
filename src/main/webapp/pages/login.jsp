<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/3/29
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>欢迎登陆</h1>
    <form action="/loginUser" method="post">
        <input type="text" name="username"><br>
        <input type="password" name="password"> <br>
        <button type="submit">提交</button>
    </form>
</body>
</html>
