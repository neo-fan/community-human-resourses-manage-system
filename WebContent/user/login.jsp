<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
</head>
<body>
<div style="width:350px;height:240px; margin:10% auto;border: 1px solid red;text-align: center;padding:auto;" >
<h1>用户登录</h1>
	<form action=" <c:url value='/LoginServlet' />" method="post" >
		<span style="display:block; height:2.0em;width:300px; text-align:left;margin-left:50px;">
			用户名：<input type="text" name="username" value="${form.username}" size="14" /> 
			<span style="color: red;size:1.4em;"> ${msg }</span>
		</span><br/>
		<span style="display:block; height:2.0em;width:300px; text-align:left;margin-left:50px;">
			密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" value="${form.password }" size="14"/>
			<span style="color: red;size:1.4em;"> ${msg }</span>
		</span><br/>
		<input type="submit" value="登录"/>
		<a href="<c:url value='/user/regist.jsp' />"> 注册</a>
	</form>
</div>
</body>
</html>