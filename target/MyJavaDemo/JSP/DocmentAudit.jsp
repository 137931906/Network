<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/3
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../layui/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<br>
<div align="center">

</div>
<div class="demoTable" align="center">

    <div class="demoTable" align="center">
       文档标题：
        <div class="layui-inline">
            <input class="layui-input" name="id" id="" autocomplete="off">
        </div>
        上传人：
        <div class="layui-inline">
            <input class="layui-input" name="id"  autocomplete="off">
        </div>
        文档类型：
        <div class="layui-inline">
            <div class="layui-form" lay-filter="myDiv">
                <select name="" id="2" lay-filter="mySelect">
                    <option value="">请选择</option>
                    <option value="zhang">txt</option>
                    <option value="wang">doc</option>
                    <option value="li">png</option>
                </select>
            </div>
        </div>

    </div>
    <br>
    <div class="layui-inline">
        <label class="layui-form-label">上传日期：</label>
        <div class="layui-input-inline" style="width: 200px;">
            <input type="text" class="layui-input" id="beginTime" placeholder="yyyy-MM-dd">
        </div>
        至
        <div class="layui-input-inline" style="width: 200px;">
            <input type="text" class="layui-input" id="endTime" placeholder="yyyy-MM-dd">
        </div>
        <button class="layui-btn" data-type="reload">搜索</button>
    </div>

</div>


<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>


<script src="/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use('laydate', function(){
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#beginTime' //指定元素
        });
        laydate.render({
            elem: '#endTime' //指定元素
        });
    });
    layui.use('table', function(){
        var table = layui.table;

        //方法级渲染
        table.render({
            elem: '#LAY_table_user'
            ,url: '/demo/table/user/'
            ,cellMinWidth:80
            ,cols: [[
                {field:'username', title: '用户名'}
                ,{field:'updateTime', title: '注册时间', sort: true}
                ,{field:'experience', title: '积分', sort: true}
                ,{field:'experience', title: '上传文档数', sort: true}
                ,{field:'experience', title: '下载文档数', sort: true}
                ,{field:'score', title: '用户状态', sort: true}
                ,{field:'classify', title: '操作',toolbar: '#barDemo'}
            ]]
            ,id: 'testReload'
            ,page: true
            ,height: 310
        });

        var $ = layui.$, active = {
            reload: function(){
                var demoReload = $('#demoReload');

                //执行重载
                table.reload('testReload', {
                    page: {
                        curr: 1 //重新从第 1 页开始
                    }
                    ,where: {
                        key: {
                            id: demoReload.val()
                        }
                    }
                }, 'data');
            }
        };

        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
</script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">禁用</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">启用</a>
</script>
</body>
</html>