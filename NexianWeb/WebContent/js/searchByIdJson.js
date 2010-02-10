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
	initialize();
	
	// eval 사용시 '(' ')' 문자열을 덧붙이면 json 객체로 변환됨
	var results = eval("(" + responseText + ")").list;
	
	var ulEl = document.createElement("ul");
	
	for (var i = 0; i < results.length; i++) {
		var name = results[i].name;
		
		var textEl = document.createTextNode(name);
		var liEl = document.createElement("li");
		liEl.appendChild(textEl);
		ulEl.appendChild(liEl);
	}
	
	document.getElementById("div_result").appendChild(ulEl);
}

function initialize() {
	var divResultEl = document.getElementById("div_result")
	var ulList = divResultEl.childNodes;
	
	for (var i = 0; i < ulList.length; i++) {
		divResultEl.removeChild(ulList[i]);
	}
	
}