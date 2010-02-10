$(document).ready( function () {
	//$("#searchId").bind("keyup", searchById);
	$("#searchId").keyup(searchById);
	
});

function searchById(e) {
	var url = "SearchByIdJsonServlet";
	
	//var id = e.target.value;
	var id = $(e.target).val();
	
	var params = "searchId=" + id;
	
	$.post(url, params, callback);
	
}

function callback(responseText, status) {
	alert(responseText);
}