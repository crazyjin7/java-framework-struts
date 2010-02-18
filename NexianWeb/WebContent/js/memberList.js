$(document).ready(function() {
	$("#memberForm").hide();

	callInitData();

	eventBind();
});

function callInitData() {
	var url = "FindAllMemberServlet";
	var params = null;

	$.getJSON(url, params, callback);
}

function callback(responseObj, status) {
	var results = responseObj.list;
	for (var i = 0; i < results.length; i++) {
		
		var trEl = $("<tr>");

		/*$("<td>").text(results[i].id).appendTo(trEl);
		$("<td>").text(results[i].name).appendTo(trEl);
		$("<td>").text(results[i].nick).appendTo(trEl);
		$("<td>").text(results[i].email).appendTo(trEl);
		$("<td>").text(results[i].note).appendTo(trEl);*/
		
		var obj = results[i];
		for (var prop in obj) {
			$("<td>").text(obj[prop]).appendTo(trEl);
		}
		
		$("#memberList tbody").append(trEl);
	}
	
	eventBind();
}

function eventBind() {
	$("#memberList tbody tr").click(findMember);
}

function findMember(e) {
	var id = $(e.target).parent().children()[0].innerHTML;
	
	var url = "FindMemberServlet";
	var params = "id=" + id;
	$.getJSON(url, params, findMemberCallback);
}

function findMemberCallback(responseObj, status) {
	var obj = responseObj.member;
	
	for (var prop in obj) {
		$("#" + prop).val(obj[prop]);
	}
	
	$("#memberForm").show();
}

