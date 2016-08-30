<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%response.setStatus(200);%>
<!DOCTYPE html>
<html>
<head>
    <title>404 - 页面不存在</title>
</head>

<body>
<h2 class="page-header">页面不知道去哪了.</h2>
<p><a href="<c:url value="/"/>">返回首页</a></p>
</body>
</html>