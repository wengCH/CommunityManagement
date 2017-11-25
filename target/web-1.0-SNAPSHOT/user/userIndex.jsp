<%--
  Created by IntelliJ IDEA.
  User: weng
  Date: 2017/11/24
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%--%>
<%--String path = request.getContextPath();--%>
<%--String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";--%>
<%--%>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>福大社团管理系统</title>
    <meta charset="utf-8">

    <style type="text/css">
        #container {
            width: 1200px;
            height: auto;
            background: gray;
        }

        #header {
            height: 40px;
            background: black;
        }

        #body {
            height: auto;
        }

        #body_left {
            width: 130px;
            height: 1200px;
            margin: 1px;
            float: left;
            background: gray;
        }

        #body_right {
            width: 1055px;
            height: auto;
            margin: 1px;
            float: right;
            border: 1px;
            border-left-color: gray;
        }
    </style>
</head>
<body>
<div id="container">
    <div id="header">
        <div style="margin-left:10px;margin-top:2px;float: left;">
            <img style="margin-top: 6px;width: 20px;height: 20px" src=""/>
            <a style="margin-left: 10px; color: #FFFFFF">返回首页</a>
        </div>
        <div style="margin-top:10px; float: right;">
            <a style="margin-left: 10px; color: #FFFFFF">${name}</a>
            <button style="margin-left: 10px">退出</button>
        </div>
        <h1 style="margin-top: 8px;text-align:center; color: #FFFFFF">社团管理系统</h1>
    </div>
    <div id="body">
        <div id="body_left">
            <div style="margin-top: 15px">
            <a style="margin-left: 10px;">我的信息</a>
            <ul style="margin-top: 1px;">
                <li><a href="personal.jsp" target="content"><span>个人简介</span></a></li>
                <li><a href="" target="content"><span>我的社团</span></a></li>
                <li><a href="" target="content"><span>我的申请</span></a></li>
                <li><a href="" target="content"><span>申请表</span></a></li>
            </ul>
            <a style="margin-left: 10px;">我的活动</a>
            <ul style="margin-top: 1px;">
                <li><a href="" target="content"><span>活动申请</span></a></li>
                <li><a href="" target="content"><span>报名情况</span></a></li>
            </ul>
                </div>
        </div>
        <div id="body_right">
            <iframe id="content" name="content" onload="Javascript:SetWinHeight(this)" frameborder="0"
                    scrolling="no" width="100%" height="1200px"></iframe>
        </div>
    </div>
</div>
</body>
</html>