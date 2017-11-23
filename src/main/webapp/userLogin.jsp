<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>福大社团管理</title>
</head>
<body>
<h1>个 人 登 陆</h1>
<form method="POST" action="user/login.do">
    <a>用户名（学号）：</a><input type="text" name="name" value=""/><br>
    <a>请 输 入 密 码：</a><input type="text" name="pwd" value=""/><br>
    <input type="submit" value="提交"/>
</form>
<a href="userRegister.jsp" rel="external nofollow">个人注册</a>
<a>|</a>
<a href="communityLogin.jsp" rel="external nofollow">社团登陆</a>
<a>|</a>
<a href="communityRegister.jsp" rel="external nofollow">社团注册</a>
</body>
</html>
