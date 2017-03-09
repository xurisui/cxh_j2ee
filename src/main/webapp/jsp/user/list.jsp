<%@ page import="java.util.List" %>
<%@ page import="io.cxh.j2ee.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/9
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
</head>
<body>

<div>
    <% List users = (List) request.getAttribute("users"); %>

    <% for (Object o : users) {
        User user = (User) o;
    %>
    id: <%= user.getId() %><br>
    username: <%= user.getUsername() %><br>
    birthday: <%= user.getBirthday() %><br>
    sex: <%= user.getSex() %><br>
    address: <%= user.getAddress() %><br>
    englishScore: <%= user.getEnglishScore() %><br><br><br><br>


    <% } %>
</div>

</body>
</html>
