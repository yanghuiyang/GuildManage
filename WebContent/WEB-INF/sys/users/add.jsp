<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <s:form action="/users!add.action" method="post">
    	<table style="width:100%">
    		<tr>
    			<td style="width:30%;text-align: right">用户名：</td>
    			<td>
    				<input type="text" name="user.userName"/>
    			</td>
    		</tr>
    		<tr>
    			<td style="width:30%;text-align: right">角色：</td>
    			<td>
    				<select name="user.role.roleId">
    					<s:iterator value="#request.listrole" var="u">
    						<option value="<s:property value='roleId'/>"><s:property value='roleName'/></option>
    					</s:iterator>
					</select>
    			</td>
    		</tr>
    		<tr>
    			<td style="width:30%;text-align: right">密码：</td>
    			<td>
    				<input type="password" name="user.userPwd"/>
    			</td>
    		</tr>
    		<tr>
    			<td style="width:30%;text-align: right">真实姓名：</td>
    			<td>
    				<input type="text" name="user.userTrueName"/>
    			</td>
    		</tr>
    		<tr>
    			<td style="width:30%;text-align: right">用户是否可用：</td>
    			<td>
    				<select name="user.userIsused">
    					<option value="1">可用</option>
    					<option value="0">不可用</option>
    				</select>
    			</td>
    		</tr>
    		<tr>
    			<td style="width:30%;text-align: right"></td>
    			<td>
    				<input type="submit" value="保存" />
    				<input type="button" value="返回"/>
    			</td>
    		</tr>
    		
    	</table>
    </s:form>
  </body>
</html>
