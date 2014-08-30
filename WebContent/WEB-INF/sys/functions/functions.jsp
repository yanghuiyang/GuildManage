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
    
    <title>系统功能管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/dtree.css"/>
	<script type="text/javascript" src="<%=basePath%>js/jquery-1.4.2.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>js/dtree.js"></script>
	<script type="text/javascript">
		//树节点点击事件
		function onClickTreeNode(id,name,url,pid)
		{
			$("#funId").val(id);
			$("#funName").val(name);
			$("#funUrl").val(url);
			$("#funPid").val(pid);
			$("#btnedit").attr("disabled","");
			$("#btnadd").attr("disabled","");
			$("#btndel").attr("disabled","");
		}
		//增加新功能节点按钮事件
		function addNewNode()
		{
			$("#funPid").val($("#funId").val());
			$("#funId").val("");
			$("#funPname").val($("#funName").val());
			$("#funName").val("");
			$("#funUrl").val("");
			$("#btnsave").attr("disabled","");
			
			$("#btnedit").attr("disabled","true");
			$("#btnadd").attr("disabled","true");
			$("#btndel").attr("disabled","true");
		}
		//修改事件
		function edit()
		{
		//alert("ddd");
			//location.href="roleright/sys/function!editfunction.action";
			var jsondatas={
				'fuctions.funId':$("#funId").val(),
				'fuctions.funName':$("#funName").val(),
				'fuctions.funUrl':$("#funUrl").val(),
				'fuctions.funPid':$("#funPid").val()
			};
			$.ajax({
				type:"post",
				url:"roleright/function!editfunction.action",
				data:jsondatas,
				dataType:"json",
				success:function(data)
				{
					alert(data);
					location.href='roleright/sys/function!list.action';
					
				}
			});
		}
		
		//删除事件
		function del()
		{
			//location.href="roleright/sys/function!editfunction.action";
		}
	</script>
  </head>
  
  <body>
  	<s:form action="roleright/sys/function!add.action" method="post">
  	<div id="msg"></div>
  		<table style="width:100%" align="center">
  			<tr align="left">
  				<td>系统功能管理</td>
  				<td></td>
  			</tr>
  			<tr align="left">
  				<td style="width:30%">
  					 <div id="trees" class="dtree">
  					<script type="text/javascript">
						d = new dTree('d');
						d.add(0,-1,'系统功能树',"javascript:onClickTreeNode('0','系统功能','','-1');");
	  					<s:iterator value="#request.listfun" var="u">
	  					d.add(<s:property value="funId"/>,<s:property value="funPid"/>,'<s:property value="funName"/>',"javascript:onClickTreeNode('<s:property value="funId"/>','<s:property value="funName"/>','<s:property value="funUrl"/>','<s:property value="funPid"/>');");
	  					</s:iterator>			
						document.write(d);
						</script> 
   					 </div>
  				<br></td>
  				<td>
  					<table style="width:100%">
  						<tr>
  							<td style="width:30%;text-align:right">
  								父功能名称:
  							</td>
  							<td>
  								<input type="text"  id="funPname"/>
  							</td>
  						</tr>
  						<tr>
  							<td style="width:30%;text-align:right">
  								功能名称:
  							</td>
  							<td>
  								<input type="text" name="fuctions.funName" id="funName"/>
  							</td>
  						</tr>
  						<tr>
  							<td style="width:30%;text-align:right">功能地址：</td>
  							<td>
  								<input type="text" name="fuctions.funUrl" id="funUrl"/>
  							</td>
  						</tr>
  						<tr>
  							<td></td>
  							<td>
  								<input type="button" id="btnadd" disabled="true" value="增加子功能" onclick="javascript:addNewNode();"/>
  								<input type="submit" id="btnsave" value="保存" disabled="true" />
  								<input type="button" id="btnedit" value="修改" disabled="true" onclick="javascript:edit();"/>
  								<input type="button" id="btndel" value="删除" disabled="true" onclick="javascript:del();"/>
  							</td>
  						</tr>
  					</table>
  				<input type="hidden" name="fuctions.funId" id="funId"/>
  				<input type="hidden" name="fuctions.funPid" id="funPid"/>
  				</td>
  			</tr>
  		</table>	
  	</s:form> 
   
 </body>
</html>
