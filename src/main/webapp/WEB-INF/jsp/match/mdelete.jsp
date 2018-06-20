<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>matchdelete</title>
</head>
<jsp:include page="../include/head.jsp"></jsp:include>
<body>
	<form action="mdelete1" method="get">
		<select id="i_modify" name="n_modify">
			<c:forEach items="${matchList}" var="List">
				 <option  value ="${List.mId}">${List.name }</option>	
			</c:forEach>
		</select>
		<input type="submit" value="确认删除">
	</form>
</body>
</html>