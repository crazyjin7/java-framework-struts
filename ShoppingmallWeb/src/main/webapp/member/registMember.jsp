<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member</title>

<script type="text/javascript">
	function registMember() {
		var memberForm = document.getElementById("memberForm");
		memberForm.action = "${pageContext.request.contextPath}/member/member_registMember.action";
		memberForm.submit();
	}

</script>

</head>
<body>

	<form id="memberForm" action="" method="post">
		회원아이디 : <input name="member.id" type="text"/><br/>
		회원명 : <input name="member.name" type="text"/><br/>
		회원비밀번호 : <input name="member.password" type="password"/><br/>
		전화번호 : <input name="member.phone" type="text"/><br/>


		<input value="회원가입" type="button" onclick="registMember();">
	</form>
</body>
</html>