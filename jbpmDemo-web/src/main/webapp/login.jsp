<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml"><HEAD><TITLE>Koala - 用户登录</TITLE>
<META content="text/html; charset=utf-8" http-equiv=Content-Type>
<META content=IE=EmulateIE7 http-equiv=X-UA-Compatible><LINK rel="shortcut icon" 
href="/favicon.ico">
<STYLE type=text/css>HTML {
	PADDING-BOTTOM: 0px; MARGIN: 0px; PADDING-LEFT: 0px; PADDING-RIGHT: 0px; FONT-FAMILY: 宋体, Helvetica, sans-serif; BACKGROUND: url(images/background/login/lobg.jpg) repeat-x; FONT-SIZE: 12px; OVERFLOW: hidden; PADDING-TOP: 0px
}
BODY {
	PADDING-BOTTOM: 0px; MARGIN: 0px; PADDING-LEFT: 0px; PADDING-RIGHT: 0px; FONT-FAMILY: 宋体, Helvetica, sans-serif; BACKGROUND: url(images/background/login/lobg.jpg) repeat-x; FONT-SIZE: 12px; OVERFLOW: hidden; PADDING-TOP: 0px
}
.login {
	POSITION: relative; MARGIN: 0px auto; WIDTH: 1003px; HEIGHT: 610px; TOP: 0px; LEFT: 0px
}
.login-01_ {
	POSITION: absolute; WIDTH: 251px; HEIGHT: 153px; TOP: 0px; LEFT: 0px
}
.login-02_ {
	POSITION: absolute; WIDTH: 161px; HEIGHT: 153px; TOP: 0px; LEFT: 251px
}
.login-03_ {
	POSITION: absolute; WIDTH: 474px; HEIGHT: 153px; TOP: 0px; LEFT: 412px
}
.login-04_ {
	POSITION: absolute; WIDTH: 117px; HEIGHT: 153px; TOP: 0px; LEFT: 886px
}
.login-05_ {
	POSITION: absolute; WIDTH: 251px; HEIGHT: 110px; TOP: 153px; LEFT: 0px
}
.login-06_ {
	POSITION: absolute; WIDTH: 161px; HEIGHT: 110px; TOP: 153px; LEFT: 251px
}
.login-07_ {
	POSITION: absolute; WIDTH: 474px; BACKGROUND: url(images/background/login/login_07.jpg) no-repeat; HEIGHT: 273px; TOP: 153px; LEFT: 412px
}
.login-08_ {
	POSITION: absolute; WIDTH: 117px; HEIGHT: 110px; TOP: 153px; LEFT: 886px
}
.login-09_ {
	POSITION: absolute; WIDTH: 58px; HEIGHT: 163px; TOP: 263px; LEFT: 0px
}
.login-10_ {
	POSITION: absolute; WIDTH: 354px; HEIGHT: 163px; TOP: 263px; LEFT: 58px
}
.login-11_ {
	POSITION: absolute; WIDTH: 117px; HEIGHT: 163px; TOP: 263px; LEFT: 886px
}
.login-12_ {
	POSITION: absolute; WIDTH: 251px; HEIGHT: 184px; TOP: 426px; LEFT: 0px
}
.login-13_ {
	POSITION: absolute; WIDTH: 161px; HEIGHT: 184px; TOP: 426px; LEFT: 251px
}
.login-14_ {
	POSITION: absolute; WIDTH: 474px; HEIGHT: 184px; TOP: 426px; LEFT: 412px
}
.login-15_ {
	POSITION: absolute; WIDTH: 117px; HEIGHT: 184px; TOP: 426px; LEFT: 886px
}
A {
	COLOR: #0d588f
}
A:hover {
	COLOR: #c03
}
.box {
	MARGIN: 90px auto 10px; WIDTH: 100%
}
TABLE {
	MARGIN: 0px auto; WIDTH: 60%
}
TD {
	LINE-HEIGHT: 25px; PADDING-LEFT: 3px; HEIGHT: 25px
}
.put {
	BORDER-BOTTOM: #133367 1px solid; BORDER-LEFT: #133367 1px solid; LINE-HEIGHT: 20px; WIDTH: 150px; BACKGROUND: #fff; HEIGHT: 20px; BORDER-TOP: #133367 1px solid; MARGIN-RIGHT: 5px; BORDER-RIGHT: #133367 1px solid
}
.text {
	TEXT-ALIGN: right; PADDING-LEFT: 20px; PADDING-RIGHT: 5px; FONT-WEIGHT: bold
}
.user {
	BACKGROUND: url(images/icons/other/user.png) no-repeat left center
}
.psd {
	BACKGROUND: url(images/icons/other/psd.png) no-repeat left center
}
.butx {
	TEXT-ALIGN: center
}
.dl {
	BORDER-BOTTOM-STYLE: none; PADDING-BOTTOM: 0px; MARGIN: 0px 3px; BORDER-LEFT-STYLE: none; PADDING-LEFT: 0px; WIDTH: 73px; PADDING-RIGHT: 0px; BORDER-TOP-STYLE: none; BACKGROUND: url(images/background/login/dl.png) no-repeat; HEIGHT: 30px; BORDER-RIGHT-STYLE: none; PADDING-TOP: 0px
}
.cz {
	BORDER-BOTTOM-STYLE: none; PADDING-BOTTOM: 0px; MARGIN: 0px 3px; BORDER-LEFT-STYLE: none; PADDING-LEFT: 0px; WIDTH: 73px; PADDING-RIGHT: 0px; BORDER-TOP-STYLE: none; BACKGROUND: url(images/background/login/cz.png) no-repeat; HEIGHT: 30px; BORDER-RIGHT-STYLE: none; PADDING-TOP: 0px
}
.l_w {
	POSITION: absolute; BOTTOM: 100px; COLOR: red; FONT-SIZE: 12px; RIGHT: 4px; FONT-WEIGHT: bold
}
</STYLE>

<SCRIPT type=text/javascript>
/*登录验证*/
function checkdata(){
	var name = document.getElementById('j_username').value;
	var pass = document.getElementById('j_password').value;
	if(name.trim()==""){
		alert("请输入用户名！");
		return;
	}
	if(pass.trim()==""){
		alert("请输入密码！");
		return;
	}
	 
	if(name!=""&&pass!=""){
		var Regx = /^[A-Za-z0-9]*$/;
           if (Regx.test(name)) {
               var formObj = document.getElementById("loginFormId");
				formObj.submit();
           }else{
          	//	alert("用户名只能包含[A-Z],[a-z],[0-9]中的字符");
           	  var formObj = document.getElementById("loginFormId");
				formObj.submit();
           }
	}
	
}

String.prototype.trim = function()
{
   return this.replace(/(^\s+)|\s+$/g,"");
 }
 
 
 	function keyBorder(event){

			 //alert(event == window.event); 
			if( event.keyCode == 13 ){ // 13表示回车键
				document.getElementById('go').click();					
			}
		}
		
	function openDia(){
		var heightconst=400;
		var widthconst=600;
		var leftconst=(screen.availWidth-widthconst)/2;
		var topconst=(screen.availHeight-heightconst)/2;
		wZoom="dialogLeft:"+leftconst+"px;dialogTop:"+topconst+"px;dialogHeight:"+heightconst+"px;dialogWidth:"+widthconst+"px; center: no; help: no;status:no";
		window.showModalDialog("/pms/kpUser/getPassword.do",window.document,wZoom);
		
	}

</SCRIPT>

<META name=GENERATOR content="MSHTML 9.00.8112.16470"></HEAD>
<BODY>
<DIV class=login>
<DIV class=login-01_><IMG id=login_01 alt="" 
src="images/background/login/login_01.jpg" width=251 height=153></DIV>
<DIV class=login-02_><IMG id=login_02 alt="" 
src="images/background/login/login_02.jpg" width=161 height=153></DIV>
<DIV class=login-03_><IMG id=login_03 alt="" 
src="images/background/login/login_03.jpg" width=474 height=153></DIV>
<DIV class=login-04_><IMG id=login_04 alt="" 
src="images/background/login/login_04.jpg" width=117 height=153></DIV>
<DIV class=login-05_><IMG id=login_05 alt="" 
src="images/background/login/login_05.jpg" width=251 height=110></DIV>
<DIV class=login-06_><IMG id=login_06 alt="" 
src="images/background/login/login_06.jpg" width=161 height=110></DIV>
<DIV class=login-07_>
<DIV class=box>
<FORM id=loginFormId method=post action="j_spring_security_check">
<TABLE>
  <TBODY>
  <TR>
    <TD class="text user">用户名</TD>
    <TD><INPUT name="j_username" id="j_username" class="input-common" onkeypress=keyBorder(event); 
  name=lgName></TD></TR>
  <TR>
    <TD class="text psd">密&nbsp;&nbsp;码</TD>
    <TD noWrap><INPUT name="j_password" id="j_password"  class="input-common" onkeypress=keyBorder(event); type=password><A href="#">忘记密码</A></TD></TR>
  <TR>
    <TD>&nbsp;</TD>
    <TD>
      <DIV style="DISPLAY: none" id=logininfo 
class=l_w>登录名称或密码错误，请重新输入。</DIV></TD>
    <TD></TD></TR>
  <TR>
    <TD class=butx colSpan=2><INPUT id=go class=dl onkeypress=keyBorder(event); onclick=checkdata(); type=button> 
<INPUT class=cz type=reset value=""></TD></TR>
  <TR>
    <TD>&nbsp;</TD>
    <TD>&nbsp;</TD>
    <TD></TD></TR></TBODY></TABLE></FORM></DIV></DIV>
<DIV class=login-08_><IMG id=login_08 alt="" 
src="images/background/login/login_08.jpg" width=117 height=110></DIV>
<DIV class=login-09_><IMG id=login_09 alt="" 
src="images/background/login/login_09.jpg" width=58 height=163></DIV>
<DIV class=login-10_><IMG id=login_10 alt="" 
src="images/background/login/login_10.jpg" width=354 height=163></DIV>
<DIV class=login-11_><IMG id=login_11 alt="" 
src="images/background/login/login_11.jpg" width=117 height=163></DIV>
<DIV class=login-12_><IMG id=login_12 alt="" 
src="images/background/login/login_12.jpg" width=251 height=184></DIV>
<DIV class=login-13_><IMG id=login_13 alt="" 
src="images/background/login/login_13.jpg" width=161 height=184></DIV>
<DIV class=login-14_><IMG id=login_14 alt="" 
src="images/background/login/login_14.jpg" width=474 height=184></DIV>
<DIV class=login-15_><IMG id=login_15 alt="" 
src="images/background/login/login_15.jpg" width=117 height=184></DIV></DIV>
<SCRIPT type=text/javascript>
var errorFlag = 'null';
if (errorFlag == 'error') {
	logininfo.style.display = "";
}
var errorFlag = 'null';
if (errorFlag == 'text') {
	logininfo1.style.display = "";
}
</SCRIPT>
</BODY></HTML>
