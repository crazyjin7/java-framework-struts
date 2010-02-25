<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Test</title>
</head>
<body>
<h1>액션 execute() 이외의 메소드 사용 예제</h1>

<hr />

<h2>Struts World </h2>
	<form action="${pageContext.request.contextPath}/hello/struts.action" method="post">
		이름은 : <input type="text" name="name"/><br/>
		<input type="submit" value="helloStruts"/>
	</form>

<h2>Spring World </h2>
		<form action="/hello/spring.action" method="post">
		이름은 : <input type="text" name="name"/><br/>
		<input type="submit" value="helloSpring"/>
	</form>

<h2>Test World </h2>
	<form action="/hello/test.action" method="post">
		이름은 : <input type="text" name="name"/><br/>
		<input type="submit" value="helloTest"/>
	</form>

</body>
</html>