<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculation</title>

<script type="text/javascript">
	function addition() {
		var calculationForm = document.getElementById("calculationForm");
		calculationForm.action = "${pageContext.request.contextPath}/test/calculation_addition.action";
		calculationForm.submit();
	}

	function subtraction() {
		var calculationForm = document.getElementById("calculationForm");
		calculationForm.action = "${pageContext.request.contextPath}/test/calculation_subtraction.action";
		calculationForm.submit();
	}

	function multiplication() {
		var calculationForm = document.getElementById("calculationForm");
		calculationForm.action = "${pageContext.request.contextPath}/test/calculation_multiplication.action";
		calculationForm.submit();
	}

	function division() {
		var calculationForm = document.getElementById("calculationForm");
		calculationForm.action = "${pageContext.request.contextPath}/test/calculation_division.action";
		calculationForm.submit();
	}
</script>

</head>
<body>

	<form id="calculationForm" action="" method="post">
		값1 : <input name="value1" type="text"/><br/>
		값2 : <input name="value2" type="text"/><br/>
		<input value="    +    " type="button" onclick="addition();">
		<input value="    -    " type="button" onclick="subtraction();">
		<input value="    *    " type="button" onclick="multiplication();">
		<input value="    /    " type="button" onclick="division();">
	</form>
</body>
</html>