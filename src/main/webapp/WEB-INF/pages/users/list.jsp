<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户添加</title>
    <!--引入静态文件-->
    <link href="<c:url value="/common/css/bootstrap.min.css"/>" rel="stylesheet">
    <script type="text/javascript" src="<c:url value="/common/js/jquery-3.1.0.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/common/js/bootstrap.min.js"/>"></script>
    <style type="text/css">

    </style>
</head>
<body>
<div class="container">
    <h2 class="page-header">用户列表</h2>
    <table class="table">
        <thead>
        <tr>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>生日</td>
            <td>手机号</td>
            <td>住址</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.userName}</td>
                <td>${user.sex}</td>
                <td>${user.age}</td>
                <td>${user.birthday}</td>
                <td>${user.mobile}</td>
                <td>${user.address}</td>
                <td>${user.creator}</td>
                <td>${user.createTime}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>