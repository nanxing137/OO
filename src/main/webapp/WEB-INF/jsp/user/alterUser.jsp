<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>修改个人信息</title>
</head>
<body>
<div style="width:100%;height:100%;">
<div style="width:100%;height:50px; background-color: #7ED321">
<br>
</div>
<div style="width:100%;height:50px;">
<br>
</div>
<form action="/updataUser">

<div align="middle">
用户名：<input type="text" name="username" value="${userName}" style="border-radius:5px; height:30px; weight:173px;border:1px solid #369;">
</div>
<br>
<div align="middle">
密    码：<input type="text" name="userpassword" value="input your password" id="psw" style="border-radius:5px; height:30px; weight:173px;border:1px solid #369;">
</div>
<br>
<div align="middle">
<input type="button" id="btn" value="我想好啦" style="background-color: #7ED321;border:0px;border-radius:10px; height:30px; weight:173px;">
</div>
</form>
</div>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
$(function(){
    $("#btn").click(function(){
        var t=$("#psw").val();
        if(t=="input your password"||t==""){
            alert("请修改密码")
        }else{
            $(this).prop("type","submit");
        }
    });
});
</script>
</body>
</html>