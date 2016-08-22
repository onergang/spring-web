<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户添加</title>
    <script type="text/javascript">

    </script>
    <style type="text/css">
        .addTable
        {
            /*background-color: lightgrey;*/
            border: 20px;
            margin-bottom: 10px;
        }
        input {
            height: 20px;

        }
        .addButton {
            position: relative;
            display: inline-block;
            background: #D0EEFF;
            border: 1px solid #99D3F5;
            border-radius: 4px;
            padding: 10px 20px 15px 20px;
            overflow: hidden;
            color: #1E88C7;
            text-decoration: none;
            text-indent: 0;
            line-height: 9px;
        }
        .addButton:hover {
            background: #AADFFD;
            border-color: #78C3F3;
            color: #004974;
            text-decoration: none;
        }
    </style>
</head>
<body>
<form action="<%=request.getContextPath()%>/users/add" method="post">
    <table class="addTable" align="center">
        <caption><b>用户添加</b></caption>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="userName"></td>
        </tr>
        <tr>
            <td>密&nbsp;码：</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td>住&nbsp;址：</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr  align="center">
            <td colspan="2"><input type="submit" value="提交" class="addButton"></td>
        </tr>
    </table>
</form>
${ok}
</body>
</html>