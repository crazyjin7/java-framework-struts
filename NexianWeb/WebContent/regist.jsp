<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
	<script type="text/javascript" src="./js/ajax_helper.js"></script>
	<script type="text/javascript" src="./js/regist.js"></script>
</head>
<body>

	<form action="RegistFormServlet" method="post">
		아 이 디 : <input type="text" id="id" name="id"/><span id="result_id" style="color: red;"></span><br/>
		이  름 : <input type="text" name="name" /><br/>
		비밀번호 : <input type="password" name="password"/><br/>
		별  명 : <input type="text" name="nick" /><br/>
		이 메 일 : <input type="text" name="email"/><br/>
		<input type="submit"  value="등록"/>
		<input type="reset" value="취소"/>
	</form>

</body>
</html>