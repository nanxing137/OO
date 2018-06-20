<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="/matchadd.js"></script>

<title>matchadd</title>
</head>
<body>
<jsp:include page="../include/head.jsp"></jsp:include>
<form action="/manager/madd1" method="get">
	<select id="one" name="one1">
		<c:forEach items="${teams }" var="team">
			 <option  value ="${team.teamId }">${team.teamName }</option>	
		</c:forEach>
	</select>
	<select id="two" name="two2">
		<c:forEach items="${teams }" var="team">
			 <option  value ="${team.teamId }">${team.teamName }</option>	
		</c:forEach>
	</select>
	<select id="three" name="three3">
		
	</select>
	比赛名：<input name="mname"></input>
	比分：<input name="score"></input>
	时间：<input name="time"></input>格式为 YYYY-MM-DD
	地点：<input name="address"></input> 
	<button id="sub" type="submit">提交</button>
</form>
</body>
</html>