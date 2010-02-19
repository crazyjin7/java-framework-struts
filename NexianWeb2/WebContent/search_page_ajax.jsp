<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서검색</title>
	
	<link rel="stylesheet" type="text/css" href="./css/default.css" media="screen"/>
	<link rel="stylesheet" type="text/css" href="./css/bookstore.css" media="screen"/>

	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/search_page_ajax.js"></script>
</head>
<body>
	<div id="div_form">
		<form action="SearchBooksServlet" method="get">
			카테고리 1 : 
			<select name="topCategoryId">
				<option value="-1">선택하세요.</option>
			</select> &nbsp; &nbsp;
		
			카테고리 2 : 
			<select name="subCategoryId">
				<option value="-1">선택하세요.</option>
			</select> &nbsp; &nbsp;
			
			<input type="submit" value="검색"/>
		</form>
	</div>
	
	<div class="marginB20"></div>

	<div id="div_result">
		<h3>검색결과</h3>
		<table>
			<thead>
				<tr>
					<th>책이름</th>
					<th>저자</th>
					<th>가격</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>		
	</div>


</body>
</html>