<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>用户修改</title>
    <!--引入静态文件-->
    <%--<link href="<c:url value="/common/css/bootstrap.min.css"/>" rel="stylesheet">--%>
    <script type="text/javascript" src="<c:url value="/common/js/jquery-3.1.0.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/common/js/bootstrap.min.js"/>"></script>
    <link href="<c:url value="/common/css/common.css"/>" rel="stylesheet">
</head>
<body>
<form action="<%=request.getContextPath()%>/users/edit" method="post">
    <fieldset style="margin:0px auto;width: 200px">
        <legend>用户修改</legend>
        <table>
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
                <td colspan="2"><input type="submit" value="提交" class="addButton"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>