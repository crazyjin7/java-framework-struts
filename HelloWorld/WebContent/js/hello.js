document.getElementById("btn_submit").onclick = send;

var xhr = createXHR();

function send() {
	var method = "get";
	var url = "HelloWorld";
	xhr = createXHR();
	
	xhr.open(method, url, true);
	xhr.onreadystatechange = callback;
	xhr.send();
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