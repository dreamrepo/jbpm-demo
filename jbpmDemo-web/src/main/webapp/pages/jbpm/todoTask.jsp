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
	
	<script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
	
  <title>流程审批明细</title>
  <script type="text/javascript">
   $(function(){
	   
	   $('#openPng').click(function(){
		   $('#png').dialog({
			   width:800,
			   height:400
		   });
	   });
	
	   
	   $('#apply').click(function(){
		   var result = $("input[name='result']:checked").val();
		   var remark = $("#remarkText").val();
		   var approveStatus = $("input[name='result']:checked").attr('approveStatus');
		   var taskId = "<s:property value="taskId"/>";
		   var processId = "<s:property value="processId"/>";
		   var data = "resu="+result+"&comment="+remark+"&status="+approveStatus+"&taskId="+taskId+"&processId="+processId;
		   
		   if(confirm("确认审批?")){
		   $.ajax({
				type : 'POST',
				url: 'jbpmFrom-fhjlApproveStatus.action',
				dataType:'json',
				data:data,
				success: function(json){
					if(json==1){
						alert("审批成功");
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
	
	<p id="page-intro">业务数据：</p>
	
	<table>
			<thead>
				<tr>
	                <td>所属区域</td>
	                <td>申请内容</td>
	              </tr>
	         </thead>
	         <tbody>
	            <tr>
	              <td><s:property value="vo.name"/></td>
	              <td><s:property value="vo.remark"/></td>
	            </tr>
	         </tbody>
	</table>
	
	<p id="page-png">流程图片</p>
	<input type="button" value="查看流程图" class="button"id="openPng"/>
	  
	<div id="png" style="display:none">
	    <div background-color:#ffffff;'>
	    <div id="imageContainer" style="position:relative;"/>
	    <img src="/processImage?processInstanceId=<s:property value="processId"/>" style="position:absolute;top:0;left:0"/>
	    </div>
	  </div>
	</div>
	
	<p id="page-intro">审批历史记录：</p>
	
	<table>
			<thead>
				<tr>
	                <td>步骤名称</td>
	                <td>审批时间</td>
	                <td>审批人员</td>
	                <td>审批人账号</td>
	                <td>审批结果</td>
	                <td>备注</td>
				</tr>
			</thead>
			<tbody>
			<s:iterator value="logs">
			   <tr>
					<td><s:property value="nodeName"/></td>
					<td><s:property value="createDate"/></td>
					<td><s:property value="user"/></td>
					<td><s:property value="user"/></td>
					<td><s:property value="result"/></td>
					<td><s:property value="comment"/></td>
				</tr>
			</s:iterator>
				
			</tbody>
		</table>
		
		<p id="page-intro">审批处理：</p>
		
		<table>
		<tr>
			<td>
				审批意见
				<textarea id="remarkText" rows="5" cols="80"></textarea>
			</td>
		</tr>
		<tr>
			<td>
			<s:if test='actualName.equals("fhjlApprove")'>
				审批结果
				<input type="radio" name="result" value="打回补充资料" approveStatus="0"/>打回补充资料
				<input type="radio" name="result" value="通过，低风险" checked="checked" approveStatus="1"/>通过，低风险
				<input type="radio" name="result" value="通过，中风险" approveStatus="1"/>通过，中风险
				<input type="radio" name="result" value="通过，高风险" approveStatus="1"/>通过，高风险
				<input type="radio" name="result" value="错误选项" approveStatus="-2"/>这个个错误选项
			</s:if>
			<s:elseif test='actualName.equals("returnToModify")'>
			  <input name="result" approveStatus="1" checked="checked"/>
			</s:elseif>
			<s:else>
			        审批结果
				<input type="radio" name="result" value="审核通过" approveStatus="1" checked="checked"/>审核通过
				<input type="radio" name="result" value="审核不通过" approveStatus="0"/>审核不通过
			</s:else>
			</td>
		</tr>
		<tr>
		  <td>
		    <input type="button" value="提交审批" id="apply"/>
		    <s:property value=""/>
		  </td>
		</tr>
		</table>
</div>
</body>
</html>
