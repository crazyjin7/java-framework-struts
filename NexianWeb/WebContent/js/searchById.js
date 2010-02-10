window.onload = function() {
	document.getElementById("searchId").onkeyup = searchById;
};

function searchById(e) {
	var targetEl;
	if (e) {
		targetEl = e.target;
	}
	else {
		targetEl = window.event.srcElement;
	}
	
	var url = "SearchByIdServlet";
	var params = "searchId=" + targetEl.value;
	
	var ajax = new AJAX();
	ajax.sendPOSTXML(url, params, callback);
}

function callback(responseXML) {
	//화면에 조회결과를 출력
	
}