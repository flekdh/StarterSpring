<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hello Main</title>
</head>
<body>
	<div>����� <c:out value="${viewName}"/> ȭ���Դϴ�.</div>
	
	<div style="border: 1px solid;">
	<c:forEach items="${resultList}" var="resultItem">
		<div style="display: flex;">
			<p>${resultItem.no}</p>
			<p>${resultItem.name}</p>
		</div>
	</c:forEach>
	</div>
	<div>
		<button onclick="location.href='/hello';">HelloMain �̵�</button>
	</div>
</body>
</html>