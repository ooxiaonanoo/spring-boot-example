<html>
<head>
    <title>SpringBoot整合freemarker</title>
    <meta charset="UTF-8"></meta>
</head>
<body>
<h4>SpringBoot整合freemarker 数据展示</h4>
<table border="1px" width="50%" align="center">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    <!-- list 指令格式  -->
    <#list userList as user>
        <tr>
        <td>${user.userId}</td>
        <td>${user.userName}</td>
        <td>${user.age}</td>
        </tr>
    </#list>
</table>
</body>
</html>