<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>修改个人信息</title>
</head>
<body>
<form action="/updataUser">
用户名：<input type="text" name="username" value="${userName}"><br>
密码：<input type="text" name="userpassword" value="input your password" id="psw"><br>
<input type="button" id="btn" value="我想好啦">
</form>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
$(function(){
    $("#btn").click(function(){
        var t=$("#psw").val();
        if(t=="input your password"){
            alert("请修改密码")
        }else{
            $(this).prop("type","submit");
        }
    });
});
</script>
</body>
</html>