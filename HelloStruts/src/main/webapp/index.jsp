<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Test</title>
</head>
<body>
<h2>Hello~ Struts2 Test World!</h2>

<hr />
<h2>Action Sample</h2>
<il><a href="${pageContext.request.contextPath}/hello/helloIndex.action"> execute() 이외의 메소드 사용 예제</a></il>
<il><a href="${pageContext.request.contextPath}/helloWildCard/helloIndex.action"> 와일드 카드 매핑 예제</a></il>
<hr />

<h2>Result Sample</h2>
<ul>
<il><a href="${pageContext.request.contextPath}/user/init.action">회원검색</a></il>
<il><a href="${pageContext.request.contextPath}/globaluser/init.action">Globel 회원검색</a></il>
</ul>


<hr />
<h2>실습예제</h2>
<a href="${pageContext.request.contextPath}/test/calculation.jsp">사칙연산</a>

</body>
</html>