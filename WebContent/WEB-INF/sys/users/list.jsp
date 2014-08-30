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
    
    <title>My JSP 'list.jsp' starting page</title>
    
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
    <s:form action="roleright/sys/users!list.action" method="post">
    	<table style="width:100%">
    		<tr>
    			<td>
    				角色名称：
    				<select name="user.role.roleId">
    					<option value='-1' selected>-全部-</option>
    					<s:iterator value="#request.listrole" var="u">
    						<option value="<s:property value='roleId'/>"><s:property value='roleName'/></option>
    					</s:iterator>
					</select>
					<input type="submit" value="查询"/>
					<input type="button" value="增加" onclick="javascript:location.href='roleright/sys/users!gotoadd.action';"/>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				<table style="width:100%">
						<tr>
							<td>用户ID</td>
							<td>用户姓名</td>
							<td>用户角色</td>
							<td>编辑</td>
						</tr>
					<s:iterator value="#request.listuser" var="u">
				    <tr>
				      <td><s:property value="userId"/></td>
				      <td><s:property value="userTrueName"/></td>
				      <td>
				      	<s:property value="role.roleName"/>
					      <!--
					      	  <s:if test="%{#u.userSex==1}">男</s:if>
					      	  <s:else>女</s:else>
					      -->
				      </td>
				     
				      <td>
				      
				      	<a href="roleright/sys/users!detail.action?user.userId=<s:property value='userId'/>">编辑</a>
				    
				      </td> 
				    </tr>
				    </s:iterator>
					</table>
    			</td>
    		</tr>
    	</table>
    </s:form>
  </body>
</html>
