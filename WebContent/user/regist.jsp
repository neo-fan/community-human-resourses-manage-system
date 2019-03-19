<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
</head>
<body>
<div style="width:350px;height:240px; margin:10% auto;border: 1px solid red;text-align: center;padding:auto;" >
<h1>用户注册</h1>
	<form action=" <c:url value='/RegistServlet' />" method="post" >
		<span style="display:block; height:2.0em;width:300px; text-align:left;margin-left:50px;">
			用户名：<input type="text" name="username" value="${form.username}" size="14" /> 
			<sapn style="color: red;size:1.4em;"> ${msg }</span><br/>
		<span style="display:block; height:2.0em;width:300px; text-align:left;margin-left:50px;">
			密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" value="${form.password }" size="14"/>
		</span><br/>
		<input type="submit" value="注册"/>
		<a href="<c:url value='/user/login.jsp' />"> 登录</a>
	</form>
</div>
	
</body>
</html>