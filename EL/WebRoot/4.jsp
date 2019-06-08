<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="age" value="13" scope="request"></c:set>
<!--	
	<c:if test="${age==12 }">
		您的年龄为12岁
	</c:if>
	-->
	
	
	<c:choose>
		<c:when test="${age==12} }">
		您的年龄为12岁
		</c:when>
		<c:otherwise>
		您的年龄不是12岁
		</c:otherwise>
	</c:choose>
	
</body>
</html>