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
	
	var url = "SearchByIdJsonServlet";
	var params = "searchId=" + targetEl.value;
	
	var ajax = new AJAX();
	ajax.sendPOST(url, params, callback);
}

function callback(responseText) {
	
}

function initialize() {
	var divResultEl = document.getElementById("div_result")
	var ulList = divResultEl.childNodes;
	
	for (var i = 0; i < ulList.length; i++) {
		divResultEl.removeChild(ulList[i]);
	}
	
}