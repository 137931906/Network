<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/12/4
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>后台注册</title>
    <script src="../JS/demo.js" charset="UTF-8" ></script>
    <script src="../JS/jquery-3.5.1.js"></script>>
    <link rel="stylesheet" type="text/css" href="../layui/css/layui.css" />
    <link rel="stylesheet" type="text/css" href="../css/login.css" />
</head>
<body>
<div class="m-login-bg">
    <div class="m-reg">
        <h3></h3>
        <div class="m-login-warp">
<%--            <input type="hidden" id="path" action="regServlet?" method="post">--%>
            <form class="layui-form">
                <div class="layui-form-item">
                    <input type="text" id="account" name="account" required lay-verify="required" placeholder="账号" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-item">
                    <input type="text" id="pwd" name="pwd" required lay-verify="required" placeholder="密码" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-item">
                    <input type="text" id="confirmPwd" name="confirmPwd" required lay-verify="required" placeholder="确认密码" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-item">
                    <div class="layui-form-item">
                        <select id="sex" name="sex" lay-verify="required" lay-search="">
                            <option value="0">性别</option>
                            <option value="男">男</option>
                            <option value="女">女</option>
                            <option value="未知">未知</option>
                        </select>
                    </div>
                </div>
                <div class="layui-form-item">
                    <div class="layui-form-item">
                        <select id="education" name="education" lay-verify="required" lay-search="">
                            <option value="0">学历</option>
                            <option value="博士">博士</option>
                            <option value="硕士">硕士</option>
                            <option value="幼儿园">幼儿园</option>
                        </select>
                    </div>
                </div>
                <div class="layui-form-item">
                    <div class="layui-form-item">
                        <select id="profession" name="profession" lay-verify="required" lay-search="">
                            <option value="0">职业</option>
                            <option value="医生">医生</option>
                            <option value="警察">警察</option>
                            <option value="老师">老师</option>
                        </select>
                    </div>
                </div>
                <div class="layui-form-item">
                    <input type="text" id="phone" name="phone " required lay-verify="required" placeholder="手机号" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-item">
                    <input type="text" id="email" name="email " required lay-verify="required" placeholder="邮箱" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-item m-login-btn">
                    <div class="layui-inline">
                        <button class="layui-btn layui-btn-normal" lay-submit lay-filter="login" onclick="insert()">注册</button>
                    </div>
                    <div class="layui-inline">
                        <button type="reset" class="layui-btn layui-btn-primary">取消</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="../layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script>
    layui.use(['form', 'layedit', 'laydate'], function() {
        var form = layui.form,
            layer = layui.layer;


        //自定义验证规则
        form.verify({
            title: function(value) {
                if(value.length < 5) {
                    return '标题至少得5个字符啊';
                }
            },
            password: [/(.+){6,12}$/, '密码必须6到12位'],
            verity: [/(.+){6}$/, '验证码必须是6位'],

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
