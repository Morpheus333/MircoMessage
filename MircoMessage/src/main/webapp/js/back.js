
function submit(id){
	$.post("DeleteServlet",
    {
      id:id
    },
    function(data,status){
    	location.reload(); 
    });
}
function deleteBatch(){	
	if($("input[type='checkbox']").is(':checked')){	
		var txt =  "<center>确认删除吗？</center>";
		window.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.warning,{
			onOk:function(v){
				$("#mainForm").attr("action", "DeleteBatchServlet");
				$("#mainForm").submit();
			}
		});
		return false;
	}
	alert("未勾选任何内容！")
	return false
}