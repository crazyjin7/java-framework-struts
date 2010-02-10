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
	initialize();
	
	//화면에 조회결과를 출력
	var results = responseXML.getElementsByTagName("member");
	
	var ulEl = document.createElement("ul");
	for (var i = 0; i < results.length; i++) {
		var nameEls = results[i].getElementsByTagName("name");
		var name = nameEls[0].firstChild.nodeValue;
		
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