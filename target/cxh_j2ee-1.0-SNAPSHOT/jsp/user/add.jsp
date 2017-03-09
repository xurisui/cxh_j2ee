<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/9
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Users</title>
</head>
<body>

<div>

    <form method="post">
        username: <input name="username" type="text"><br>
        birthday: <input name="birthday" type="date"><br>

        sex: <input type="radio" name="sex" value="male">
        <input type="radio" name="sex" value="female"><br>

        address: <input name="address" type="text"><br>
        englishScore: <input name="englishScore" type="number"><br>

        <button type="submit">submit</button>
    </form>

</div>

</body>
</html>
