<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello World</h3>
	<c:if test="${empty userList}">
		<c:redirect url="/user/queryAll.action"/>
	</c:if>
	<c:if test="${!empty userList}">
		<c:forEach items="${userList }" var="user">
			${user.userName}<br/>
		</c:forEach>
	</c:if>
</body>
</html>