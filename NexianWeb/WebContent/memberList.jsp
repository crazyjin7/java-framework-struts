<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 목록</title>
</head>
<body>
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/memberList.js"></script>
	
	<table id="memberList">
		<caption>회원 목록</caption>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>닉네임</th>
				<th>이메일</th>
				<th>비고</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
	
	<form id="memberForm" action="" method="post">
		아이디 : <input type="text" id="id" name="id" /><br/>
		이름 : <input type="text" id="name" name="name" /><br/>
		닉네임: <input type="text" id="nick" name="nick" /><br/>
		이메일 : <input type="text" id="email" name="email" /><br/>
		비고 : <input type="text" id="note" name="note" /><br/>
		<input type="submit" value="수정" />
		<input type="reset" value="취소" />
	</form>

</body>
</html>