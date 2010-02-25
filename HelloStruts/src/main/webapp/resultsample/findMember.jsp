<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Test</title>
</head>
<body>
<h1>회원찾기</h1>
	<form action="${pageContext.request.contextPath}/user/find.action" method="post">
		ID : <input type="text" name="id"/><br/>
		<input type="submit" value="찾기"/>
	</form>

</body>
</html>