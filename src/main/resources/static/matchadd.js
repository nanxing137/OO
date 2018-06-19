/**
 * 
 */
$(function() {
	GetMessageList();
	function GetMessageList(){
		 xuanze = $("#three").prop('selectedIndex')>=0?$("#three").prop('selectedIndex'):0;
//		alert(xuanze);
		$("#three").find("option:selected").text("");  
		$("#three").empty();  
		$("#one").find("option:selected").text();
		$("#two").find("option:selected").text();
//		var selDom = $("#three");//根据id获取select的jquery对象
		$("#three").append("<option  value="+$("#one").find("option:selected").val()+">"+$("#one").find("option:selected").text()+"</option>");//添加option
		$("#three").append("<option  value="+$("#two").find("option:selected").val()+">"+$("#two").find("option:selected").text()+"</option>");//添加option
		$("#three").get(0).selectedIndex=xuanze;
		selation();
	};
	function selation(){
		setTimeout(GetMessageList, 1000);
	};
});
