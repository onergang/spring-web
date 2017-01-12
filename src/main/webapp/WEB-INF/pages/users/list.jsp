<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../common/tag.jsp"%>
<%@ include file="../common/header.jsp" %>
<%@ include file="../common/footer.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>列表</title>
</head>
<body>
<div class="container">
    <h2 class="page-header">用户列表</h2>
    <table class="table table-bordered table-hover">
        <thead>
        <tr>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>生日</td>
            <td>手机号</td>
            <td>住址</td>
            <td><span class="glyphicon glyphicon-wrench text-blue"></span></td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.userName}</td>
                <td>${user.sex}</td>
                <td>${user.age}</td>
                <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/></td>
                <td>${user.mobile}</td>
                <td>${user.address}</td>
                <td>
                    <a href="<%=request.getContextPath()%>/users/${user.userId}/detail"><span
                            class="glyphicon glyphicon-edit"></span></a>&nbsp;&nbsp;
                    <a href="<%=request.getContextPath()%>/users/${user.userId}/delete"><span
                            class="glyphicon glyphicon-remove-circle text-red"></span></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>