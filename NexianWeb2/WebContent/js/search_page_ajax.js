$(document).ready(function() {
	//첫번째 셀렉트 박스 option값 불러오기
	initialize();
	
	//이벤트 바인딩
	bindEvent();
});

//1.첫번째 카테고리 리스트 셀렉트 박스가 선택되었을 경우,
//  셀렉트 박스에서 선택된 id값을 가지고,
//  서버로 하위 카테고리 리스트 값을 요청

//2.하위 카테고리 리스트 값을 로딩 후,
//  두번째 셀렉트 박스에 옵션으로 추가


function initialize() {
	var url = "FindFirstLevelCategoryListServlet";
	var params = null;
	
	$.getJSON(url, params, initializeCallback);
}

function initializeCallback(responseObj, status) {
	var results = responseObj.list;
	
	for (var i = 0; i < results.length; i++) {
		$("<option>")
			.text(results[i].name)
			.val(results[i].id)
			.appendTo("#div_form select[name='topCategoryId']");
	}
}

function bindEvent() {
	$("#div_form select[name='topCategoryId']").change(findSecondCategory);
	$("#div_form select[name='subCategoryId']").change(searchBook);
}

function findSecondCategory(e) {
	var url = "FindSecondLevelCategoryListServlet";
	var params = "id=" + $(e.target).val();
	
	$.getJSON(url, params, findSecondCategoryCallback);
}

function findSecondCategoryCallback(responseObj, status) {
	var results = responseObj.list;
	
	$("#div_form select[name='subCategoryId'] option")
		.not("[value='-1']").remove();
	
	for (var i = 0; i < results.length; i++) {
		$("<option>")
			.text(results[i].name)
			.val(results[i].id)
			.appendTo("#div_form select[name='subCategoryId']");
	}
}

function searchBook(e) {
	var url = "SearchBookJsonServlet";
	var params = "id=" + $(e.target).val();
	
	$.getJSON(url, params, searchBookCallback);
}

function searchBookCallback(responseObj, status) {
	$("#div_result tbody").empty();
	
	var results = responseObj.list;
	for (var i = 0; i < results.length; i++) {
		
		var trEl = $("<tr>");

		var obj = results[i];
		for (var prop in obj) {
			if (prop == "id" || prop == "image" || prop == "categoryId")
				continue;
			$("<td>").text(obj[prop]).appendTo(trEl);
		}
		
		$("#div_result tbody").append(trEl);
	}
}
