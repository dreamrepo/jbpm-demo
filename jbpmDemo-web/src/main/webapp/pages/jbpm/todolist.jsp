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
	
	<title>待办任务</title>
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
    		var actualName = $(this).attr("actualName");
    		var taskId = $(this).attr("taskId");
			window.location="/jbpmFrom-detail.action?formId="+formId+"&processId="+processId+"&actualName="+actualName+"&taskId="+taskId;
    	});
    	
    	$('.delegate').click(function(){
    		var taskId = $(this).attr("taskId");
    		
    		$('#delegeteDIV').dialog({
				   width:400,
				   height:300,
				   buttons: [ { text: "确定", click: function() {
					    var targetUser = $("#targetUser").val();
					    var data = "taskId="+taskId+"&targetUser="+targetUser;
					    $.ajax({
							type : 'POST',
							url: 'jbpmFrom-delegate.action',
							dataType:'json',
							data:data,
							success: function(json){
								if(json==1){
									alert("委托成功");
								}else{
									alert("委托失败");
								}
							}
						});	
				   } },{text: "取消", click: function() { $( this ).dialog( "close" ); } } ]
			   });
    	});
    });
    </script>
</head>
  
<body style="padding:10px;height:100%; text-align:center;">
<div id="main-content">	

    <div id="delegeteDIV" style="display:none">
	  <div background-color:#ffffff;'>
	    <select id="targetUser">
	      <option key="abc">abc</option>
	      <option key="aaa">aaa</option>
	      <option key="bbb">bbb</option>
	      <option key="fwzy">fwzy</option>
	      <option key="fhjl">fhjl</option>
	      <option key="zlqyjl">zlqyjl</option>
	      <option key="qyjl">qyjl</option>
	      <option key="qyzj">qyzj</option>
	    </select>
	  </div>
	</div>
	
	<table>
		<tr>
			<td align="right" class="l-table-edit-td">流程类型</td>
            <td align="left" class="l-table-edit-td">
            	<select class="l-text" style="width:120px;">
					<option>成交报告审批</option>
				</select>
            </td>
            <td align="right" class="l-table-edit-td">申请日期</td>
            <td align="left" class="l-table-edit-td">
            	<input type="text" class="l-text"/>-<input type="text" class="l-text"/>
            </td>
            <td align="right" class="l-table-edit-td">物业名称</td>
            <td align="left" class="l-table-edit-td">
            	<input type="text" class="l-text"/>
            </td>
		</tr>
		<tr>
			<td align="right" class="l-table-edit-td">所属区域</td>
            <td align="left" class="l-table-edit-td">
            	<select class="l-text" style="width:120px;">
					<option>全部</option>
				</select>
            </td>
			<td align="right" class="l-table-edit-td">所属部门</td>
            <td align="left" class="l-table-edit-td">
            	<select class="l-text" style="width:120px;">
					<option>全部</option>
				</select>
            </td>
            <td align="right" class="l-table-edit-td">事项类型</td>
            <td align="left" class="l-table-edit-td">
            	<input type="radio" checked="checked"/>全部
				<input type="radio" />非委托
				<input type="radio" />委托
            </td>
            
			<td align="left">
				<input type="button" value="查询" class="l-button l-button-submit"/>
				<input type="button" value="重置" class="l-button l-button-submit"/>
				<input type="button" value="批量审批" class="l-button l-button-submit"/>
			</td>
		</tr>
	</table>
	
	<div>
		<table border="1">
			<thead>
				<tr>
	                <td>流程名称</td>
	                <td>申请日期</td>
	                <td>所属区域</td>
	                <td>申请内容</td>
	                <td>当前步骤</td>
	                <td>审批者</td>
	                <td>处理</td>
	                <td>流程图</td>
	                <td>释放</td>
	                <td>事项类型</td>
	                <td>选择</td>
				</tr>
			</thead>
			<tbody>
			   <s:iterator value="formTasks">
			   <tr>
					<td><s:property value="processName"/></td>
					<td><s:property value="applyDate"/></td>
					<td><s:property value="name"/></td>
					<td><s:property value="remark"/></td>
					<td><s:property value="actualName"/></td>
					<td><s:property value="actualOwner"/></td>
					<td><input type="button" value="处理" class="deal"  taskId="<s:property value="taskId"/>" actualName="<s:property value="actualName"/>" formId="<s:property value="formId"/>" processId="<s:property value="processId"/>"/></td>
					<td><input type="button" value="委托" class="delegate"  taskId="<s:property value="taskId"/>"/></td>
					<td></td>
					<td></td>
					<td><input type="checkbox"/></td>
				</tr>
			   </s:iterator>
			</tbody>
		</table>
	</div>
	
</div>
</body>
  
</html>