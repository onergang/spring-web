<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <!--引入静态文件-->
    <link href="<c:url value="/common/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/common/css/common.css"/>" rel="stylesheet">
    <script type="text/javascript" src="<c:url value="/common/js/jquery-3.1.0.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/common/js/bootstrap.min.js"/>"></script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <!--brand和toggle为了更好的在移送端显示-->
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="nav navbar-brand" href="<c:url value="/"/>">
                <%--导入图片的两种方式--%>
                <img alt="Brand" src="<c:url value="/common/images/logo/32.png"/>">
                <%--<img alt="Brand" src="<%=request.getContextPath()%>/common/images/logo/32.png">--%>
            </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="<c:url value="/"/>">首页 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">课堂</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">分类 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Java</a></li>
                        <li><a href="#">SQL</a></li>
                        <li><a href="#">Redis</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">AngularJS</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">其他</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="搜索...">
                    <span class="input-group-btn">
                        <button class="btn btn-info" type="button" >Go!</button>
                     </span>
                </div>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="<%=path%>/users/1">登陆</a></li>
                <li><a href="<%=path%>/users/2">注册</a></li>
                <%--<li class="dropdown">--%>
                <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"--%>
                <%--aria-expanded="false">Dropdown <span class="caret"></span></a>--%>
                <%--<ul class="dropdown-menu">--%>
                <%--<li><a href="#">Action</a></li>--%>
                <%--<li><a href="#">Another action</a></li>--%>
                <%--<li><a href="#">Something else here</a></li>--%>
                <%--<li role="separator" class="divider"></li>--%>
                <%--<li><a href="#">Separated link</a></li>--%>
                <%--</ul>--%>
                <%--</li>--%>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
