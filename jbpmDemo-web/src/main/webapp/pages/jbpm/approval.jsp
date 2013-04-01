<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="/css/reset.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="/css/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="/resources/css/invalid.css" type="text/css" media="screen" />
	<title>审批</title>
	<style type="text/css">
        .l-table-edit-td{ padding:4px;font-size:12px;height:20px;}
        .l-button-submit,.l-button-reset{width:80px; float:left; margin-left:10px; padding-bottom:2px;}
        .l-verify-tip{ left:230px; top:120px;}
        .text-width{width: 176px;height:25px;}
        #search{height:60px;padding-top: 20px;}
        .tr{height:35px;}
    </style>
</head>
  
<body style="padding:10px;height:100%; text-align:center;">
<div id="main-content">	
	
	<p align="left">审批历史记录：</p>
	
	<table border="1">
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
				<tr>
					<td>提交审批申请</td>
					<td>2013-12-12 13:23:45</td>
					<td>cdads</td>
					<td>dsdfws@163.com</td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>分行经理审核处理</td>
					<td>2013-12-12 15:33:45</td>
					<td>张三</td>
					<td>dsdom</td>
					<td>通过</td>
					<td>分行经理审批通过</td>
				</tr>
			</tbody>
		</table>
		
		<p align="left">审批处理：</p>
		
		<table>
			<tr align="left">
	  			<td align="right" class="l-table-edit-td">审批意见</td>
	  			<td align="left" class="l-table-edit-td" >
	  			<textarea cols="65" rows="4" class="l-textarea" ></textarea></td>
	  		</tr>
	  		<tr>
	  			<td align="right" class="l-table-edit-td">审批结果</td>
            	<td align="left" class="l-table-edit-td">
            	<input type="radio"/>打回补充资料
				<input type="radio"  checked="checked" />通过，低风险
				<input type="radio" />通过，中风险
				<input type="radio" />通过，高风险
				<input type="radio" />驳回修改
            </td>
	  		</tr>
		</table>
	
</div>
</body>
  
</html>
