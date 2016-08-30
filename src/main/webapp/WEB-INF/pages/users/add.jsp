<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/footer.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>注册</title>
    <link href="<c:url value="/common/css/common.css"/>" rel="stylesheet" media="screen">
    <link href="<c:url value="/common/css/bootstrap-datetimepicker.min.css"/>" rel="stylesheet" media="screen">
    <script type="text/javascript" src="<c:url value="/common/js/bootstrap-datetimepicker.js"/>"></script>
    <script type="text/javascript">
        $('.form_datetime').datetimepicker({
            weekStart: 1,
            todayBtn:  1,
//            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            forceParse: 0,
            showMeridian: 1
        });
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="center">
        <h2 class="page-header">用户注册</h2>
        <form action="<%=request.getContextPath()%>/users/add" method="post" class="form-horizontal">
            <table class="table">
                <tr>
                    <td>用户名：</td>
                    <td><input type="text" name="userName"></td>
                </tr>
                <tr>
                    <td>密&nbsp;码：</td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td>生&nbsp;日：</td>
                    <td><input type="text" name="birthday"></td>
                </tr>
                <tr>
                    <td>住&nbsp;址：</td>
                    <td><input type="text" name="address"></td>
                </tr>
                <tr align="center">
                    <td colspan="2"><input type="submit" value="保存" class="addButton"></td>
                </tr>
            </table>
        </form>
        <div class="control-group">
            <label class="control-label">DateTime Picking</label>
            <input type="hidden" id="dtp_input1" value="" /><br/>
            <div class="input-group date form_datetime">
                <input class="form-control" size="10" type="text" ng-model="czContract.wtDateStart"  readonly>
                <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
            </div>
        </div>
    </div>
</div>
${ok}
</body>
</html>