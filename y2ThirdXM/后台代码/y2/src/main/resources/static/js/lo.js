$(function(){
	let user=sessionStorage.getItem("user");
	if(user==undefined && user==null){
		window.location.href="login.html";
	}
})
