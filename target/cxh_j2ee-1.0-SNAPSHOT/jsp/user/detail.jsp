<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/9
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail User Info</title>
</head>
<body>

<div>

</div>

    <% User user = (User) request.getAttribute("user"); %>

    id: <%= user.getId() %><br>
    username: <%= user.getUsername() %><br>
    birthday: <%= user.getBirthday() %><br>
    sex: <%= user.getSex() %><br>
    address: <%= user.getAddress() %><br>
    englishScore: <%= user.getEnglishScore() %><br>

</body>
</html>
