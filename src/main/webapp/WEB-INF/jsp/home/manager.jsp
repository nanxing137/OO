<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>manager</title>
</head>
<jsp:include page="../include/head.jsp"></jsp:include>
<body>

<div>球队管理
<a href="manager/teamAdd">增加球队</a>
</div>
<div>球员管理</div>
<div>比赛管理
<a href="/manager/madd">增加比赛</a>
<a href="/manager/mdelete">删除比赛</a>
<a href="/manager/modify">修改比赛</a>
<a href="/manager/mquery">查询比赛</a>
</div>

</body>
</html>