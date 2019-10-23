<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>"> 
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/login2" method="post">
		用户名：<input type="text" name="username">
		密码：<input type="password" name="password">
		<input type="submit" value="登录">
	</form>
</body>
</html>