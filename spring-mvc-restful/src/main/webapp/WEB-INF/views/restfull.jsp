<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rest测试</title>
</head>
<body>
    <form action="/test/rest/1" method="post">
        <input type="submit" value="POST-增">
    </form>

    <form action="/test/rest/1" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="DELETE-删">
    </form>

    <form action="/test/rest/1" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="PUT-改">
    </form>

    <form action="/test/rest/1" method="get">
        <input type="submit" value="GET-增">
    </form>
</body>
</html>