window.onload = function() {
	document.getElementById("btn_submit").onclick = send;
};


function send() {
	var url = "HelloWorld";

	//파라미터 구성
	var name = document.getElementById("name").value;
	
	var params = "name=" + encodeURIComponent(name);
	
	var ajax = new AJAX();
	//ajax.sendGet(url, params, callback);
	ajax.sendPost(url, params, callback);
}

function callback(responseText) {
	document.getElementById("div_result").innerHTML = responseText;
}
