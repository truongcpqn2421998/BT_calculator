<%--
  Created by IntelliJ IDEA.
  User: HI
  Date: 11/9/2021
  Time: 1:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>simple Calculator</title>
</head>
<body>
<form action="/calculator" method="post">
    <h1>Simple Calculator</h1>
    <div>
        <h3>Calculator</h3>
        <div>First operand <input type="text" name="num1"></div>
        <div>Operator <select name="operator">
            <option>Addition</option>
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select></div>
        <div>Second operand <input type="text" name="num2"></div>
        <div><input type="submit" value="Calculator"></div>
    </div>
</form>
</body>
</html>
