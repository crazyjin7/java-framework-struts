<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member</title>
<script language="javascript" src="${pageContext.request.contextPath}/common/js/jquery.js"></script>
<script type="text/javascript">
	function findMember() {
		alert("findMember");
		var params = $("memberForm").serialize();

		alert(params);

		$.post("ajax/member_findMemberAjax.action", params,
			function(data){
				alert("Data Loaded: " + data);
		});
	}

</script>

</head>
<body>

	<form id="memberForm" action="" method="post">
		찾으실 회원의 아이디를 입력해주세요 <br/>
		<input name="memberId" type="text"/><br/>

		<input value="회원찾기" type="button" onclick="findMember();">
	</form>
</body>
</html>