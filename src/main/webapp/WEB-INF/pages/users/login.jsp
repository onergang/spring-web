<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/footer.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登陆</title>
    <!--引入静态文件-->
    <%-- boostrap 各个元素参考http://getbootstrap.com/components/#panels-basic--%>
    <link href="<c:url value="/common/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/common/css/common.css"/>" rel="stylesheet">
    <script type="text/javascript" src="<c:url value="/common/js/jquery-3.1.0.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/common/js/bootstrap.min.js"/>"></script>
</head>
<body>

<div class="center container-fluid">
    <form role="form" class="form-horizontal" name="form" action="<%=request.getContextPath()%>/users/login"
          method="post">
        <h2 class="page-header">登陆</h2>
        <div class="row form-group">
            <div class="input-group">
                <span class="input-group-addon" id="basic-addon1">用户名：</span>
                <input type="text" class="form-control" placeholder="用户名" aria-describedby="basic-addon1">
            </div>
        </div>
        <div class="row form-group">
            <div class="input-group">
                <span class="input-group-addon" id="basic-addon2">密&nbsp;&nbsp;  码：</span>
                <input type="password" class="form-control" placeholder="密&nbsp;&nbsp;码"
                       aria-describedby="basic-addon2">
            </div>
        </div>
        <div class="row center">
            <input type="submit" value="提交" class="addButton">&nbsp;
            <a href="<%=request.getContextPath()%>/users/add">没有账号？注册一个</a>
        </div>
    </form>
</div>
</body>
</html>