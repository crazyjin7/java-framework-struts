<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Test</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/helloworld.action" method="post">
		이름은 : <input type="text" name="name"/><br/>
		<input type="submit"/>
	</form>
</body>
</html>