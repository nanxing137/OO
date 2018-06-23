<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
操作失败
<form action="/login">
<input type="hidden" name="userName" value="${user.uname}">
<input type="hidden" name="password" value="${user.upassword}">
<input type="submit" value="返回主页">
</form>
</body>
</html>