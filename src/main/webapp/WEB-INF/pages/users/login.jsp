<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/header.jsp" %>
<%@ include file="../common/footer.jsp" %>
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

        <div class="form-group">
            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="basic-addon1">
                    <i class="glyphicon glyphicon-user"></i>
                </span>
                <input type="text" class="form-control" placeholder="用户名" name="userName">
            </div>
        </div>

        <div class="form-group">
            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="basic-addon2">
                    <i class="glyphicon glyphicon-lock"></i>
                </span>
                <input type="password" class="form-control" placeholder="密码" name="password">
            </div>
        </div>
        <div class="form-group">
            <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
            <a class="btn btn-group" href="<%=request.getContextPath()%>/users/2">没有账号？注册一个</a>
        </div>
    </form>
</div>
</body>
</html>