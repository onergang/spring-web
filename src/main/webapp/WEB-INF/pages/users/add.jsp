<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/header.jsp"%>
<%--<%@ include file="../common/footer.jsp"%>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>注册</title>
    <link href="<c:url value="/common/css/common.css"/>" rel="stylesheet" media="screen">
    <link href="<c:url value="/common/css/bootstrap-datetimepicker.min.css"/>" rel="stylesheet" media="screen">
    <script type="text/javascript" src="<c:url value="/common/js/bootstrap-datetimepicker.js"/>"></script>
    <script type="text/javascript">
//        $('.form_datetime').datetimepicker({
//            weekStart: 1,
//            todayBtn:  1,
//            todayHighlight: 1,
//            startView: 2,
//            forceParse: 0,
//            showMeridian: 1
//        });
        $('.datetimepicker').datetimepicker({
            format: 'yyyy-mm-dd hh:ii'
        });
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="center">
        <h2 class="page-header">用户注册</h2>
        <form action="<%=request.getContextPath()%>/users/add" method="post" class="form-horizontal">
            <div class="form-group">
                <input type="text" name="userName" class="form-control" placeholder="用户名">
            </div>
            <div class="form-group">
                <input type="text" name="password" class="form-control" placeholder="密码">
            </div>
            <div class="form-group">
                <input type="text" name="birthday" class="form-control" placeholder="生日">
            </div>
            <div class="form-group">
                <input type="textarea" name="address" class="form-control" placeholder="地址">
            </div>
            <button class="btn  btn-info btn-block">注册</button>
        </form>
    </div>
</div>
${ok}
</body>
</html>