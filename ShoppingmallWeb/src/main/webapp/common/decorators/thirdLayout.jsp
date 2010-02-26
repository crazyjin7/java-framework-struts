<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" scope="request"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><decorator:title/></title>
<decorator:head/>
</head>
<body>

<!-- header S -->
헤더2
<br/>
<decorator:getProperty property="meta.findMember"/>
<!-- header E -->
<hr />

<!-- body S -->

	<!-- ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ content S ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ -->
	<div id="content">
		<decorator:body />
	</div>
	<!-- ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ content E ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ -->

<!-- body E -->

<hr />

<!-- footer S -->
푸터2

<!-- footer E -->

</body>
</html>