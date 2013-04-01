<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<%@ include file="/pages/common/header.jsp"%>
	<link rel="stylesheet" href="/css/reset.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="/css/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="/resources/css/invalid.css" type="text/css" media="screen" />
	<title>添加新表单</title>
</head>
  
<body>
<div id="main-content">	
<form action="/jbpmFrom-add.action" method="post">
   <input type="hidden" name="vo.id" value="<s:property value="vo.id"/>"/>
	<table>
		<tr>
			<td>报数物业分类：
				<input type="radio" name="houseType">一手住宅</input>
				<input type="radio" name="houseType">二手住宅</input>
				<input type="radio" name="houseType">二手写字楼</input>
				<input type="radio" name="houseType">一手写字楼</input>
				<input type="radio" name="houseType">一手商铺</input>
				<input type="radio" name="houseType">二手商铺</input>
			</td>
			<td colspan="2">
				<strong><font color="red">请务必选择正确的分类,此结果影响报数</font></strong>
			</td>
		</tr>
		<tr>
			<td colspan="3">成交报告类型：
				<input type="radio" name="reportType"/>住宅
				<input type="radio" name="reportType"/>商铺
				<input type="radio" name="reportType"/>写字楼
				<input type="radio" name="reportType"/>三级主成交互动
				<input type="radio" name="reportType"/>二级主成交互动
				<input type="radio" name="reportType"/>产权外单
				<input type="radio" name="reportType"/>产权内单(公司)
				<input type="radio" name="reportType"/>产权转佣
			</td>
		</tr>
		<tr>
			<td colspan="3">分行(组)名称：
				<select disabled="disabled">
					<option>财富中心分行1组</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				成交人：
				<select>
					<option>何丽(CQ12060117)</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				成交日期：
				<input value="2012-11-22"/>
			</td>
		</tr>
		<tr>
			<td colspan="3">定金(收据)编号：
				<select>
					<option>232222</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				成交报告编号：
				<select>
					<option>1234567</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				上业绩日期：
				<input type="text" disabled="disabled"/>
			</td>
		</tr>
		<tr>
			<td colspan="3">
			备注：
			<textarea name="vo.remark" rows="3" cols="80"><s:property value="vo.remark"/></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="3">
			附加说明：
			<textarea name="vo.name" rows="3" cols="80"><s:property value="vo.name"/></textarea>
			</td>
		</tr>
	</table>
	
	<div class="clear"></div>
	
	<div class="content-box content-box-content tab-content default-tab">
		<table>
			<tr>
				<td>交易类型：
					<input type="radio" disabled="disabled" checked="checked"/>售
					<input type="radio" disabled="disabled"/>租
				</td>
				<td>是否渠道项目：
					<input type="radio" />是
					<input type="radio" checked="checked"/>否
				</td>
			</tr>
			<tr>
				<td colspan="2">详细交易类型：
					<input type="radio" />一手证未出
					<input type="radio" />抵押
					<input type="radio" checked="checked"/>现证
				</td>
			</tr>
			<tr>
				<td>成交总价：
					<input type="text" value="600000.00" size="5"/>
					<select>
						<option>元</option>
					</select>
					<select>
						<option>2%</option>
					</select>
					三级市场占比<input type="text" value="100" size="5"/>%
				</td>
				<td>均价：
					<input type="text" value="7500.0000"/>/m&sup2;

				</td>
			</tr>
			<tr>
				<td>付款方式：
					<select>
						<option>一次性</option>
					</select>
				</td>
				<td>是否需产权交易部跟进：
					<input type="radio" />是
					<input type="radio" checked="checked"/>否
				</td>
			</tr>
			<tr>
				<td>预计放款时间：
					<input type="text"/>
				</td>
				<td>预计放款金额：
					<input type="text"/>
				</td>
			</tr>
			<tr>
				<td>意向书签约日期：
					<input type="text"/>
				</td>
				<td>是否资金监管：
					<input type="radio" checked="checked"/>自行划转
					<input type="radio" />通过资金监管
				</td>
			</tr>
		</table>
		
		<table>
			<tr>
				<td>客户来访日期：
					<input type="text" disabled="disabled"/>
				</td>
				<td>合同签约日期：
					<input type="text" disabled="disabled"/>
				</td>
				<td>合同类型：
					<input type="radio"/>租赁合同
					<input type="radio" checked="checked"/>买卖合同
					<input type="radio" />自制合同
				</td>
			</tr>
			<tr>
				<td>二手房买卖合同：
					<input type="text">
				</td>
				<td>资金监管协议编号：
					<input type="text">
				</td>
				<td>买卖居间合同编号：
					<input type="text" disabled="disabled">
				</td>
			</tr>
		</table>
	</div>
	
	<input type="button" value="附件" class="button"/>
	<input type="button" value="审批历史" class="button"/>
	<input type="button" value="上业绩" class="button"/>
	<input type="button" value="对佣" class="button"/>
	<input type="button" value="转成交" class="button"/>
	<input type="submit" value="保存" class="button"/>
	<input type="button" value="关闭" class="button"/>
	<input type="button" value="打印预览" class="button"/>
</div>
</form>
</body>
  
</html>
