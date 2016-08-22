<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>用户修改</title>
	<script type="text/javascript" src="../../resource/js/bootstrap.js"></script>
</head>
<body>
<center>
	<form action="<%=request.getContextPath()%>/users/add" method="post" align="center">
		用户名：<input type="text" name="userName"><br/>
		密   码：<input type="text" name="password"><br/>
		住   址：<input type="text" name="address"><br/>
		<input type="submit" value="提交">

	</form>
</center>
</body>
</html>