/**
 * 
 */
$(function(){
	
	$("div [name='show']:eq("+$("#i_modify").prop('selectedIndex')+")").show();
	$("#i_modify").live('change',function(){
		$("div [name='show']").hide();
		var vlaue=$("#i_modify").find("option:selected").val()-1;
		$("div [name='show']:eq("+vlaue+")").show();
	}); 
	var winner = $("#win").val();
	$("select").children("option").each(function(){  
        var temp_value = $(this).text();  
       if(temp_value == winner){  
             $(this).attr("selected","selected");  
       }  
  }); 
});