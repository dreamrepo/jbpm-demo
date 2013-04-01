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
	
  <title>流程审批明细</title>
   <script type="text/javascript">
   $(function(){
	   
	   $('#openPng').click(function(){
		   $('#png').dialog({
			   width:800,
			   height:400
		   });
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
	
    <p id="page-png">查看流程图片</p>
	<input type="button" value="查看流程图" class="button" id="openPng"/>
	  
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
		
		
</div>
</body>
</html>
