<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<form action="/login" method="post">
		用户名：<input name="userName"></br>
		密码：<input name="password"></br>
		<input type="submit">
	</form>
</body>
</html>

<!-- <!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>聊天室</title>
	<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" src="js/jquery.cookie.js"></script>
	<script type="text/javascript" src="js/login.js"></script>
	
	<link href="css/login.css" rel="stylesheet" type="text/css" />
</head>
	<body>
	<div class="divLogin">
		<div class="sLogin">
			<div class="hyzc" data-text="欢迎登录">欢迎登录
			</div>
			<div class="dl">
				<input type="text" class="txtName" id="txtName"value="请输入账号"
					onfocus='if(this.value=="请输入账号"){this.value="";}; '
					onblur='if(this.value==""){this.value="请输入账号";};'>
				<span id="zhcw" class="zhcw"></span>
				<input id="password_text" class="password" value="请输入密码" onfocus="this.style.display='none';document.getElementById('txtPass').style.display='block';document.getElementById('txtPass').focus().select();" />
				<input name="password" class="txtPass" type="password" id="txtPass" style="display:none;"
					 onblur="if(this.value==''){document.getElementById('password_text').style.display='block';this.style.display='none'};"/>
				<span id="mmcw" class="mmcw"></span>
				<input  type="checkbox" value="记住密码" class="jzmm"/><span class="ztq">记住密码</span>
				 <span class="zuce"><a href="register.html" target="_bolck">立即注册</a></span>
				<input type="submit" id ="Button1" class="submit" value="立即登录"/>
			</div>
		</div>
	</div>
	</body>
</html> -->
<!--  <div id="divLogin">
		<fieldset>
			<h3>用户登录</h3>
			<div class="content">
				<div>
					用户名:&nbsp;<input  type="text" id="txtName" class="txt"/></br>
					密   码:&nbsp;&nbsp;&nbsp;<input  type="password" id="txtPass" class="txt"/>
				</div>
				<div class="btnCenter">
					<input type="button" class="btn" id="Button1" value='登录'/>&nbsp;&nbsp;
					<input type="Reset" class="btn" id="Reset1" value='注册'/>
				</div>
				<span id="divMsg" class="clsTip">正在发送登录请求</span>
			</div>
		</fieldset>
	</div>-->