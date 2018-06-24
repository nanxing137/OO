<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
select {
  /*Chrome和Firefox里面的边框是不一样的，所以复写了一下*/
  border: solid 1px #000;


  /*很关键：将默认的select选择框样式清除*/ /*Larry*/ 
  appearance:none;
  -moz-appearance:none;
  -webkit-appearance:none;

  /*在选择框的最右侧中间显示小箭头图片*/
  background: url("http://ourjs.github.io/static/2015/arrow.png") no-repeat scroll right center transparent;


  /*为下拉小箭头留出一点位置，避免被文字覆盖*/
  padding-right: 14px;
  
  width:175px;
  height:45px;
}

</style>
</head>
<body>
<div align="middle">
<div style="width:100%;height:50px; background-color: #7ED321">
<br>
</div>
<div style="width:100%;height:50px;">
<br>
</div>
输入队名：
<form action="/dropTeam" >
	<select id="one" name="teamName">
		<c:forEach items="${teams}" var="team">
			 <option  value ="${team.teamName }">${team.teamName }</option>	
		</c:forEach>
	</select>
<input type="submit" value="删除" style="background-color: #7ED321;border:0px;border-radius:10px; height:45px; weight:173px;">
</form>
</div>
</body>
</html>