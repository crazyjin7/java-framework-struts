window.onload = function() {
	document.getElementById("btn_submit").onclick = send;
};

var xhr;

function send() {
	var method = "GET";
	var url = "HelloWorld";
	createXHR();

	//파라미터 구성
	var name = document.getElementById("name").value;
	
	url = url + "?" + "name=" + encodeURIComponent(name);
	
	xhr.open(method, url, true);
	xhr.onreadystatechange = callback;
	xhr.send(null);
}

function callback() {
	if (xhr.readyState == 4 && xhr.status == 200) {
		document.getElementById("div_result").innerHTML = xhr.responseText;
	}
}

function createXHR() {
	try {
		xhr = new XMLHttpRequest();
	}
	catch (e) {
		try {
			xhr = new ActiveXObject("Msxml2.XMLHTTP");
		}
		catch (ee) {
			try {
				xhr = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (eee) {
				alert("Ajax를 지원하지 않습니다.");
			}
		}
	}
}