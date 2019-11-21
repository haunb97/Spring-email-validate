<%--
  Created by IntelliJ IDEA.
  User: haunq
  Date: 11/20/2019
  Time: 9:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Validate</title>
</head>
<body>
<h1>Email Validate</h1>
<h3 style="color:chartreuse">${message}</h3>
<form action="validate" method="post">
    <input type="text" name="email"><br/>
    <input type="submit" value="validate">
</form>
</body>
</html>
