<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서검색</title>

	<link rel="stylesheet" type="text/css" href="./css/default.css" media="screen"/>
	<link rel="stylesheet" type="text/css" href="./css/bookstore.css" media="screen"/>
	
</head>
<body>
	<form action="SearchBooksServlet" method="get">
		카테고리 1 : 
		<select name="topCategoryId">
			<option value="-1">선택하세요.</option>
			<c:forEach var="cat" items="${topCategories}">
				<option value="${cat.id}" <c:if test="${cat.id == topCategoryId}">selected="selected"</c:if>>${cat.name}</option>
			</c:forEach>
		</select> &nbsp; &nbsp;
	
		카테고리 2 : 
		<select name="subCategoryId">
			<option value="-1">선택하세요.</option>
			<c:forEach var="cat" items="${subCategories}">
				<option value="${cat.id}" <c:if test="${cat.id == subCategoryId}">selected="selected"</c:if>>${cat.name}</option>
			</c:forEach>
		</select> &nbsp; &nbsp;
		
		<input type="submit" value="검색"/>
	</form>
	
	<br/><br/><br/>
	<div id="div_result">
		<c:if test="${books != null}">
		
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
					<c:forEach var="book" items="${books}" varStatus="status">
						<tr id="${book.id}" <c:if test="${status.index mod 2 == 1}">class="odd"</c:if>>
							<td>${book.name}</td>
							<td>${book.author}</td>
							<td>${book.price}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>		
		</c:if>
	</div>
</body>
</html>