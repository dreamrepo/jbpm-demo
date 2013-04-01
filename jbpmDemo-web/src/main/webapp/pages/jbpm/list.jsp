<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix ="s" uri="/struts-tags"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<%@ include file="/pages/common/header.jsp"%>
	<link rel="stylesheet" href="/css/reset.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="/css/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="/css/invalid.css" type="text/css" media="screen" />
	<title>待办任务</title>
	<script type="text/javascript">
	$(function (){
		$('.view').click(function(){
			var id = $(this).attr("idValue");
			window.location="/jbpmFrom-view.action?id="+id;
		});
		
		$('#newForm').click(function(){
			window.location="/pages/jbpm/apply.jsp";
		});
		
		$('.delete').click(function(){
			var id = $(this).attr("idValue");
			window.location="/jbpmFrom-remove.action?id="+id;
		});
		
		$('.start').click(function(){
			if(confirm("使用此表单发起流程?")){
				var id = $(this).attr("idValue");
				 $.ajax({
						type : 'POST',
						url: 'jbpmFrom-createProcess.action?formId='+id,
						dataType:'json',
						success: function(json){
							if(json==1){
								alert("创建成功");
							}
						}
					});	
			}
		});
	});
	</script>
</head>
  
<body>
<div id="main-content">	
	
	<div class="clear"></div>
	
	<div class="content-box content-box-content tab-content default-tab">
		
		<div class="content-box content-box-content tab-content default-tab">
            <input type="button" value="创建新表单" class="button" id="newForm"/>
	    </div>
				<table>
					<thead>
						<tr>
			                <td>表单ID</td>
			                <td>表单名</td>
			                <td>备注信息</td>
			                <td>详情</td>
			                <td>发起流程</td>
						</tr>
					</thead>
					<tbody>
					<s:iterator value="vos" id="vo">
					
						<tr>
							<td><s:property value="id"/></td>
							<td><s:property value="name"/></td>
							<td><s:property value="remark"/></td>
							<td><input type="button" value="查看" idValue="<s:property value="id"/>" class="button view" /></a></td>
							<td>
								 <a href="#"  idValue="<s:property value="id"/>" class="start" title="work"><img src="/css/pencil.png" alt="work" /></a>
							</td>
						</tr>
						</s:iterator>
					</tbody>
				</table>
	</div>
</div>
</body>
  
</html>
