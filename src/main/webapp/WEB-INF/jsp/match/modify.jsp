<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="/matchmodify.js"></script>
<title>matchmodify</title>
</head>
<jsp:include page="../include/head.jsp"></jsp:include>
<body>
	<select id="i_modify" name="n_modify">
		<c:forEach items="${matchList}" var="List">
			 <option  value ="${List.mId}">${List.name }</option>	
		</c:forEach>
	</select>
	<div>
	<form action="modify1" method="get">
			<c:forEach items="${matchList }" var="macth">
				<div name="show" style="display:none">
					<p >比赛ID ：<input name="mid" value="${macth.mId }" readonly="true"></p>
					<p>比赛名称：<input name="mname" value="${macth.name }"> </p>
					<p>比赛双方 ：${macth.team_a.teamName }   VS   ${macth.team_b.teamName }</p>
					<p>比赛胜者 ：
					<select id="winer" name="winner">
						<option  value ="${macth.team_a.teamId }">${macth.team_a.teamName }</option>
						<option  value ="${macth.team_b.teamId }">${macth.team_b.teamName }</option>
						<option id="win" style="display:none" value="${macth.winner.teamName}"></option>	
					</select></p>
					<p>比赛比分 ：<input name="mscore" value="${macth.scores }"></p>
					<p>比赛时间 ：<input name="mtime" value="${macth.m_date }"></p>
					<p>比赛地点 ：<input name="maddress" value="${macth.address }"></p>
				</div>
			</c:forEach>
			<input type="submit">
	</form>
	</div>
	</div>
</body>
</html>