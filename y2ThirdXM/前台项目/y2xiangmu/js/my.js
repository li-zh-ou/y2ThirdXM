var data={
	ip:"http://localhost:8083/",
	perms:[]
}
//加载权限内容.
function loadPerms(){
	$.ajax({
		url: data.ip + "findPerms",
		type: "get",
		xhrFields: {
			withCredentials: true
		},
		dataType: "JSON",
		success: function(response) {
			data.perms = response;
		},
		error: function(error) {

		}
	});
}
loadPerms();
