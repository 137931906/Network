<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/12/2
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>后台登录</title>
    <script src="../JS/demo.js" charset="UTF-8" ></script>
    <script src="../JS/jquery-3.5.1.js"></script>>
    <link rel="stylesheet" type="text/css" href="../layui/css/layui.css" />
    <link rel="stylesheet" type="text/css" href="../css/login.css" />
</head>
<body>
<div class="m-login-bg">
    <div class="m-login">
        <h3>后台系统登录</h3>
        <div class="m-login-warp">
            <form class="layui-form">
                <div class="layui-form-item">
                    <input type="text" name="account" id="account" required lay-verify="required" placeholder="用户名" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-item">
                    <input type="text" name="password" id="pwd" required lay-verify="required" placeholder="密码" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-item">
                    <div class="layui-inline">
                        <input type="text" id="vCode" required lay-verify="required" placeholder="验证码" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-inline">
                        <img id="vImg" src="/verifyCodeServlet" onclick="changeImg()" style="width: 125px" height="38px">
                    </div>
                </div>
                <div class="layui-form-item m-login-btn">
                    <div class="layui-inline">
                        <button class="layui-btn layui-btn-normal" lay-submit lay-filter="login" onclick="login()">登录</button>
                    </div>
                    <div class="layui-inline">
                        <button type="reset" class="layui-btn layui-btn-primary">取消</button>
                    </div>
                </div>
            </form>
        </div>
        <p class="copyright">Copyright 2020-2021 by mmm</p>
    </div>
</div>
<script src="../layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script>
    layui.use(['form', 'layedit', 'laydate'], function() {
        var form = layui.form,
            layer = layui.layer;


        //自定义验证规则
        form.verify({
            account: function(value) {
                if(value.length < 5) {
                    return '账号至少得5个字符';
                }
            },
            password: [/(.+){6,12}$/, '密码必须6到12位'],
            vCode: [/(.+){6}$/, '验证码必须是6位'],

        });


        //监听提交
        form.on('submit(login)', function(data) {
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });

    });


</script>
</body>
</html>
