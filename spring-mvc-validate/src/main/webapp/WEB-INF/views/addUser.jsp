<%--
  Created by IntelliJ IDEA.
  User: lwx
  Date: 2019/5/10
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<form action="/user/saveUser" method="post">
    用户名<input type="text" name="name"><br/>
    年龄<input type="text" name="age"><br/>
    <input type="submit"><br/>


    ${user}<br/>
    ${user.name}<br/>
</form>
</body>
</html>
