<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>隊員详细页面</title>
</head>
<body>

	</br>
				<c:out value="名字"></c:out>
		        <c:out value="队伍"></c:out>
		        <c:out value="密码"></c:out>
		        </br>
	<c:forEach var="entity" items="${teams}">

		<c:forEach var="user" items="${entity.users }">
			<c:if test="true">
				<c:out value="${user.uname} >"></c:out>
				<c:out value="${user.team.teamName} >"></c:out>
				<c:out value="${user.upassword} "></c:out>
				</br>
			</c:if>
		</c:forEach>
	</c:forEach>
</body>
</html>