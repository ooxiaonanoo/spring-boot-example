<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>SpringBoot整合JSP</title>
</head>
<body>
<table border="1px" align="center" width="50%">
    <tr>
        <th>UserId</th>
        <th>UserName</th>
        <th>Age</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <th>${user.userId}</th>
            <th>${user.userName}</th>
            <th>${user.age}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>