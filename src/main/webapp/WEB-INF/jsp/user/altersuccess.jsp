<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.alsp{ font-family:"黑体"; font-size:36px;}
</style>
</head>
<body>
<div align="center">
<div style="width:100%;height:50px; background-color: #7ED321">
<br>
</div>
<div style="width:100%;height:50px;">
<br>
</div>
<div class="alsp">
<p >操作成功</p>
</div>
<form action="/login">
<input type="hidden" name="userName" value="${user.uname}">
<input type="hidden" name="password" value="${user.upassword}">
<input type="submit" value="返回主页" style="background-color: #7ED321;border:0px;border-radius:10px; height:45px; weight:173px;">
</form>
</div>
</body>
</html>