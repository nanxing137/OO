<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>matchquery</title>
</head>
<body>

	<c:forEach items="${matchList }" var="macth">
		<p>比赛ID ：${macth.mId }</p>
		<p>比赛双方 ：${macth.team_a.teamName }   VS   ${macth.team_b.teamName }</p>
		<p>比赛胜者 ：${macth.winner.teamName }</p>
		<p>比赛比分 ：${macth.scores }</p>
		<p>比赛时间 ：${macth.m_date }</p>
		<p>比赛地点 ：${macth.address }</p>
	</c:forEach>
</body>
</html>