$(document).ready( function () {
	//$("#searchId").bind("keyup", searchById);
	$("#searchId").keyup(searchById);
	
});

function searchById(e) {
	var url = "SearchByIdJsonServlet";
	
	//var id = e.target.value;
	var id = $(e.target).val();
	
	//var params = "searchId=" + id;
	var params = {searchId: id};
	
	//$.post(url, params, callback);
	$.getJSON(url, params, callback);
	
}

function callback(responseText, status) {
	initialize();

	//var results = eval("(" + responseText + ")").list;
	var results = responseText.list;
	
	var ulEl = $("<ul>");
	
	for (var i = 0; i < results.length; i++) {
		var name = results[i].name;
		var liEl = $("<li>").text(name);
		ulEl.append(liEl);
	}
	
	$("#div_result").append(ulEl);
}

function initialize() {
	$("#div_result").empty();
}