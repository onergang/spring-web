<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>详情页</title>
    <!--引入静态文件-->
    <link href="<c:url value="/common/css/bootstrap.min.css"/>" rel="stylesheet">
    <script type="text/javascript" src="<c:url value="/common/js/jquery-3.1.0.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/common/js/bootstrap.min.js"/>"></script>
</head>
<body>
<h1 class="page-header">个人中心</h1>

<div class="container">
    <table class="table table-bordered">
        <tr>
            <td>姓名：</td>
            <td>${user.userName}</td>
        </tr>
        <tr>
            <td>性别：</td>
            <td>${user.sex}</td>
        </tr>
        <tr>
            <td>创建时间：</td>
            <td>${user.createTime}</td>
        </tr>
    </table>
</div>
</body>
</html>