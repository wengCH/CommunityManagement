<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>福大社团管理</title>
</head>
<body>
<div>
    <h1>个 人 注 册</h1>
    <form action="user/register.do" method="post">
        <a>用户名（学号）：</a><input type="text" name="name" value="031502300"/><br>
        <a>请 输 入 密 码：</a><input type="password" name="pwd" value="maliu"/><br>
        <a>请 再 次 输 入：</a><input type="password" name="pwd2" value="maliu"/><br>
        <a>请输入真实姓名：</a><input type="text" name="relname" value="马六"/><br>
        <a>请 输 入 专 业：</a><input type="text" name="major" value="computer"/><br>
        <a>请 输 入 手 机：</a><input type="text" name="phone" value="13800000000"/><br>
        <a>请 输 入 邮 箱：</a><input type="text" name="email" value="10086@qq.com"/><br>
        <input type="submit" value="注 册"/>
    </form>
    <a href="index.jsp" rel="external nofollow">个人登陆</a>
    <a>|</a>
    <a href="communityLogin.jsp" rel="external nofollow">社团登陆</a>
    <a>|</a>
    <a href="communityRegister.jsp" rel="external nofollow">社团注册</a>
</div>
</body>
</html>


