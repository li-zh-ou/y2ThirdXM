var data={
	ip:"http://localhost:8080/",
	perms:[]
}
//加载权限内容.
function loadPerms(){
	$.ajax({
		url: data.ip + "findPerms",
		type: "get",
		dataType: "json",
		success: function(response) {
			data.perms = response;
		},
		error: function(error) {

		}
	});
}
loadPerms();
