<%@ taglib prefix ="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<%@ include file="/pages/common/header.jsp"%>
	<link rel="stylesheet" href="/css/reset.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="/css/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="/resources/css/invalid.css" type="text/css" media="screen" />
	<title>流程管理</title>
	  <style type="text/css">
        .l-table-edit-td{ padding:4px;font-size:12px;height:20px;}
        .l-button-submit,.l-button-reset{width:80px; float:left; margin-left:10px; padding-bottom:2px;}
        .l-verify-tip{ left:230px; top:120px;}
        .text-width{width: 176px;height:25px;}
        #search{height:60px;padding-top: 20px;}
        .tr{height:35px;}
    </style>
    <script type="text/javascript">
    $(function (){
    	$('.deal').click(function(){
    		var formId = $(this).attr("formId");
    		var processId = $(this).attr("processId");
			window.location="/jbpmFrom-doneDetail.action?formId="+formId+"&processId="+processId;
    	});
    	
    	$('.change').click(function(){
    		var processId = $(this).attr("processId");
    		$.ajax({
				type : 'POST',
				url: 'jbpmFrom-queryNodes.action?processId='+processId,
				dataType:'json',
				success: function(json){
					$('#nodeSelect').empty();
					for(var i=0;i<json.length;i++){
						$("#nodeSelect").append("<option value='"+json[i].id+"'>"+json[i].name+"</option>");
					}
					 $('#nodedIV').dialog({
						   width:400,
						   height:300,
						   buttons: [ { text: "确定", click: function() {
							    var nodeId = $("#nodeSelect").val();
							    var data = "processId="+processId+"&id="+nodeId;
							    $.ajax({
									type : 'POST',
									url: 'jbpmFrom-assignNode.action',
									dataType:'json',
									data:data,
									success: function(json){
										if(json==1){
											alert("分配成功");
										}else{
											alert("分配失败");
										}
									}
								});	
						   } },{text: "取消", click: function() { $( this ).dialog( "close" ); } } ]
					   });
				}
			});	
    	});
    });
    
    
    </script>
</head>
  
<body style="padding:10px;height:100%; text-align:center;">
<div id="main-content">	
	
	<div id="nodedIV" style="display:none">
	  <div background-color:#ffffff;'>
	    <select id="nodeSelect">
	      <option key=""></option>
	    </select>
	  </div>
	</div>
	
	<div>
		<table border="1">
			<thead>
				<tr>
	                <td>流程名称</td>
	                <td>申请日期</td>
	                <td>所属区域</td>
	                <td>申请内容</td>
	                <td>流程图</td>
	                <td>释放</td>
	                <td>事项类型</td>
	                <td>详情</td>
	                <td>流程变更</td>
				</tr>
			</thead>
			<tbody>
			   <s:iterator value="formTasks">
			   <tr>
					<td><s:property value="processName"/></td>
					<td><s:property value="applyDate"/></td>
					<td><s:property value="name"/></td>
					<td><s:property value="remark"/></td>
					<td></td>
					<td></td>
					<td></td>
					<td><input type="button" value="详情" class="deal"  formId="<s:property value="formId"/>" processId="<s:property value="processId"/>"/></td>
					<td><input type="button" value="修复流程" class="change"  processId="<s:property value="processId"/>"/></td>
				</tr>
			   </s:iterator>
			</tbody>
		</table>
	</div>
	
</div>
</body>
</html>