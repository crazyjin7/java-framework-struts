/**
 * 
 * 객체 생성
 * var ajax = new AJAX();
 * 
 * GET 전송 
 * ajax.sendGET(url, param, callback);
 * 		callback 함수의 첫번째 인자로 responseText 전달
 * 
 * POST 전송
 * ajax.sendPOST(url, param, callback);
 * 		callback 함수의 첫번째 인자로 responseText 전달
 * 
 * 
 * POST 전송 XML 객체 수신
 * ajax.sendPOSTXML(url, param, callback);
 * 		callback 함수의 첫번째 인자로 responseXML 전달
 * 
 * @return
 */


var AJAX = function(){
	var ajax;
	
	var getXMLHttpRequest = function (){
		var ajax;
		
		if(XMLHttpRequest){
			ajax = new XMLHttpRequest();
			
		} else if(ActiveXObject){
			
			try{
				ajax = new ActiveXObject('Msxml2.XMLHTTP');
			} catch (e){
				ajax = new ActiveXObject('Microsoft.XMLHTTP');
			}
		
		} else {
			alert('이 브라우저는 Ajax를 지원하지 않습니다.');
		}
		return ajax;
	};
	

	this.sendGET = function (url, param, callback){
		ajax = getXMLHttpRequest();
		
		if(ajax){
			ajax.open('GET', url + '?'  + param , true);
			ajax.onreadystatechange = function(){
				if(ajax.readyState ==4 && ajax.status == 200 ){
					callback(ajax.responseText);
				}
			};
			ajax.send(null);
		}
	};

	this.sendPOST = function (url, param, callback){
		ajax = getXMLHttpRequest();
		
		if(ajax){
			ajax.open('POST', url , true);
			ajax.onreadystatechange = function(){
				if(ajax.readyState == 4 && ajax.status == 200){
					callback(ajax.responseText);
				}
			};
			ajax.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
			ajax.send(param);
		}
	};
	
	this.sendPOSTXML = function (url, param, callback){
		ajax = getXMLHttpRequest();
		
		if(ajax){
			ajax.open('POST', url , true);
			ajax.onreadystatechange = function(){
				if(ajax.readyState == 4 && ajax.status == 200){
					callback(ajax.responseXML);
				}
			};
			ajax.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
			ajax.send(param);
		}
	};
	
	
};

