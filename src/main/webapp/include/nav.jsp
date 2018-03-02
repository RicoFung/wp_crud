<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--DEV --%>
<%
String appId = "3";
String userId = "3";
String account = "DEV";
%>
<script type="text/javascript">
/* js 全局变量 **********************************************************/
var $g_menuJson = [
	{"tc_code":"demo","tc_order":"2-1","tc_app_id":3,"tc_permit_id":27,"pid":0,"id":1,"tc_name":"demo","tc_url":"/admin/tbdemo/query.action"}
	];
var $g_btnJson = null;
/************************************************************************/
$(function(){
	// nav
	$chok.nav.init($g_menuJson);
	// 导航菜单查询
	$("#navSearchForm").submit(function(event) {
		event.preventDefault();
	});
});
</script>
<%-- CAS
<%@ page import="chok.cas.client.CasLoginUser" %>
<%@ page import="chok.cas.client.filter.CasAccessFilter" %>
<%
CasLoginUser o = (CasLoginUser)session.getAttribute(CasAccessFilter.LOGINER);
String appId = o==null?"":o.getString("appId");
String userId = o==null?"":o.getString("id");
String account = o==null?"":o.getString("tc_code");
String menuJson = o==null?"":o.getString("menuJson");
String btnJson = o==null?"":o.getString("btnJson");
request.setAttribute("LoginUser", o);
%>
 --%>
<%-- SSO
<%@ page import="chok.sso.AuthUser"%>
<%@ page import="chok.sso.filter.LoginFilter"%>
<%
AuthUser o = (AuthUser)session.getAttribute(LoginFilter.LOGINER);
String appId = o==null?"":o.getString("appId");
String userId = o==null?"":o.getString("id");
String account = o==null?"":o.getString("tc_code");
String menuJson = o==null?"":o.getString("menuJson");
String btnJson = o==null?"":o.getString("btnJson");
request.setAttribute("LoginUser", o);
%>
--%>
<%-- 用于生产环境
<script type="text/javascript">
/* js 全局变量 **********************************************************/
var $g_menuJson = <%=menuJson%>;
var $g_btnJson = <%=btnJson%>;
/************************************************************************/
$(function(){
	// nav
	$chok.nav.init($g_menuJson);
	// 导航菜单查询
	$("#navSearchForm").submit(function(event) {
		event.preventDefault();
		var url = $("#navSearchForm").attr('action');
		$.post(
			url, 
			{'tc_name':$("#menuName").val(), "tc_user_id":<%=userId%>, "tc_app_id":<%=appId%>},
		  	function(rv) {
				$chok.nav.init(JSON.parse(rv));
			}
		);
	});
});
</script>
 --%>