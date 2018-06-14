<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>球队详细页面</title>
</head>
<body>
	<!-- 序列${team.teamId }</br> -->
	队名: ${team.teamName }</br>
	<c:forEach  var="entity" items="${matchs }">
		<c:out value="${entity.team_a.teamName }"></c:out>
		对阵
		<c:out value="${entity.team_b.teamName }"></c:out>
		</br>
		赢家
		<c:out value="${entity.winner.teamName }"></c:out>
		比分
		<c:out value="${entity.scores }"></c:out>
		日期
		<c:out value="${entity.m_date }"></c:out>
		比赛地址
		<c:out value="${entity.address }"></c:out>
	</c:forEach>
</body>
</html>