<%--
  Created by IntelliJ IDEA.
  User: weng
  Date: 2017/11/23
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>福大社团管理</title>
</head>
<body>
<div>
    <h1>社 团 注 册</h1>
    <form action="register.do" method="post">
        <a>用户名（社团号）：</a><input type="text" name="name" value="10001"/><br>
        <a>请输入社团名称：</a><input type="text" name="cname" value="棋牌社"/><br>
        <a>请 输 入 密 码：</a><input type="password" name="pwd" value="maliu"/><br>
        <a>请 再 次 输 入：</a><input type="password" name="pwd2" value="maliu"/><br>
        <a>请输入社团简介：</a><textarea name="introduction" style="width:200px;height:80px;" value="棋牌社是****，欢迎加入！"></textarea><br>
        <a>${score}</a><br>
        <input type="submit" value="注 册"/>
    </form>
    <a href="../user/userLogin.jsp" rel="external nofollow">个人登陆</a>
    <a>|</a>
    <a href="../user/userRegister.jsp" rel="external nofollow">个人注册</a>
    <a>|</a>
    <a href="communityLogin.jsp" rel="external nofollow">社团登陆</a>
</div>
</body>
</html>
