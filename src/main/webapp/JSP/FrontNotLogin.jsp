<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/12/4
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>网盘登录前</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link href="../css/FrontNotLogin.css" rel="stylesheet" charset="UTF-8">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">网盘登录界面</div>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item"><a href="Login.jsp">登录</a><>
            <li class="layui-nav-item"><a href="Reg.jsp">注册</a><>
        </ul>
    </div>
    <div class="layui-body">
        <div class="layui-form-item">
            <div class="layui-input-block">
                <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
                <button type="button" class="layui-btn layui-btn-normal">搜索文档</button>
            </div>
        </div>
    </div>
</div>
<script src="../layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;
    });
</script>
</body>
</html>
