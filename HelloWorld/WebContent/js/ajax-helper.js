var AJAX = function() {
	var xhr;

	this.sendGet = function(url, params, callback) {
		createXHR();
		var method = "get";
		xhr.open(method, url + "?" + params, true);
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				callback(xhr.responseText);
			}
		};
		xhr.send(null);
	};
	
	this.sendPost = function(url, params, callback) {
		createXHR();
		var method = "post";
		xhr.open(method, url, true);
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				callback(xhr.responseText);
			}
		};
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send(params);
	};
	
	var createXHR = function() {
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
	};
};