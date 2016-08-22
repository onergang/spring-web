<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>首页</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="/WEB-INF/resource/css/bootstrap.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->

</head>
<body>
<h3 class="page-header">欢迎页</h3>
<table class="table table-bordered">
    <thead>
    <tr>
        <td>ddd</td>
    </tr>
    </thead>
</table>
<img src="<%=request.getContextPath()%>/resource/logo.png" alt="logo"/>
<a href="<%=request.getContextPath()%>/users/index/1">添加用户</a>
<a href="<%=request.getContextPath()%>/users/index/2">修改用户</a>
<a href="<%=request.getContextPath()%>/users/index/index">Default</a>

<script src="/WEB-INF/resource/js/jquery-3.1.0.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="/WEB-INF/resource/js/bootstrap.min.js"></script>
</body>
</html>