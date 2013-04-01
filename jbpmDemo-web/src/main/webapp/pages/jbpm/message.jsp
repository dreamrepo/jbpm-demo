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
	<title>消息通知</title>
	<script type="text/javascript">
	</script>
</head>
  
<body>
<div id="main-content">	
	
	<div class="clear"></div>
	
	<div class="content-box content-box-content tab-content default-tab">
	
				<table>
					<thead>
						<tr>
			                <td>消息ID</td>
			                <td>消息内容</td>
			                <td>详情</td>
						</tr>
					</thead>
					<tbody>
					 　<s:iterator value="messages">
					   <tr>
					     <td><s:property value="id"/></td>
					     <td><s:property value="text"/></td>
					     <td>--</td>
					   </tr>
					 </s:iterator>
					</tbody>
				</table>
	</div>
	
</div>
</body>
  
</html>
