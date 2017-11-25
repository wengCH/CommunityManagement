<%--
  Created by IntelliJ IDEA.
  User: weng
  Date: 2017/11/25
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/html">
<head lang="en">
    <meta charset="utf-8">
    <title>个人简介</title>
</head>
<body>
<div>
    <span></span>
    <div>
        <p>为方便社团内部沟通，请务必填写真实的个人资料哦</p>
    </div>
</div>
<form method="POST" action="">
    <div>
        <label><span>*</span>姓名：</label>
        <input type="text" placeHolder="请输入你的真实姓名" id="p-realName" dbfield="realName" name="club.realName" class="input-l" />
    </div>
    <div>
        <label><span>*</span>性别：</label>
        <label ><input type="radio" value="男" >男</label>
        <label ><input type="radio" value="女" >女</label>
    </div>
    <div>
        <label class="" for="p-phone"><span class="require">*</span>手机：</label>
        <input type="text" placeHolder="请输入你的手机号码" id="p-phone" dbfield="phone" name="club.phone" class="input-l"/>
        <a>手机号码仅作通讯录使用</a>
    </div>
    <div>
        <label>学校：</label>
    </div>
    <div class="s-form-group not-require">
        <label>学院：</label>
    </div>
    <div class="s-form-group not-require">
        <label>年级：</label>
    </div>
    <div>
        <div>
            <input type="submit" value="下一步"/>
        </div>
        <div>
            <input type="submit" value="保存"/>
        </div>
    </div>
</form>
</body>
</html>
