<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登陆</title>
    <link href="<c:url value="/common/css/common.css"/>" rel="stylesheet">
    <script type="text/javascript">

    </script>
</head>
<body>
<form action="<%=request.getContextPath()%>/users/login" method="post">
    <fieldset style="margin:0px auto;width: 200px">
        <legend>登陆</legend>
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="userName"></td>
            </tr>
            <tr>
                <td>密&nbsp;码：</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="提交" class="addButton">&nbsp;
                    <a href="<%=request.getContextPath()%>/users/add">没有账号？注册一个</a>
                </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>