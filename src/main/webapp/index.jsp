<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
    <title>首页</title>
</head>
<body>
<h3>欢迎页</h3>
测试页面是否正常
<a href="<%=request.getContextPath()%>/users/index/1">添加用户</a>
<a href="<%=request.getContextPath()%>/users/index/2">修改用户</a>
<a href="<%=request.getContextPath()%>/users/index/index">Default</a>
</body>
</html>