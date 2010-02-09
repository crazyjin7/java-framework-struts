window.onload = function() {
	document.getElementById("id").onkeyup = checkId;
};

function checkId(e) {
	var targetEl;
	if (e) {	// IE 이외
		targetEl = e.target;
	}
	else {		// IE
		targetEl = window.event.srcElement;
	}
	
	var url = "CheckIdServlet";
	var id = targetEl.value;
	var params = "id=" + id;
	
	var ajax = new AJAX();
	ajax.sendGET(url, params, callback);
	
}

function callback(responseText) {
	if (responseText == "true") {
		document.getElementById("result_id").innerHTML = "아이디가 중복되었습니다.";
	}
	else {
		document.getElementById("result_id").innerHTML = "";
	}
		
}