<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
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
	cm4.jsp<br>
	${user}<br>
	${user.username}<br>
	${user.password}<br>
</body>
</html>