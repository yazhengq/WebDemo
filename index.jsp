<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	div {
	width: 35%;
	margin-left: 32%;
	}
	</style>
  </head>
	<body>
	<div>
		<form class="f1" action="WriteGetDB" method="get">
			<fieldset>
				<legend>表单的注册</legend>
				<table width=100%>
					<tbody>
						<tr>
							<td class=“left” width=40% align="right"><label for="t1">姓名：</label></td>
							<td class="right"><input type="text" id="t1" name="Name"></td>
						</tr>
						<tr>
							<td class=“left” width=40% align="right"><label	for="Password">密 码：</label></td>
							<td class="right"><input id="Password1" type="password"	name="Password" /></td>
						</tr>
						<tr>
							<td class=“left” width=40% align="right"><label for="e1">邮箱：</label></td>
							<td class="right"><input type="email" id="e1" name="Email"></td>
						</tr>
						<tr>
							<td class=“left” width=40% align="right"><label for="1">性别：</label></td>
							<td class="right">
							<input type="radio" id="1" name="ssex" value="nan" />男<!-- name设置成一样的就行了--> 
							<input type="radio" id="2" name="ssex" value="nv" />女</td>
						</tr>
						<tr>
							<td class=“left” width=40% align="right">地 区：</td>
							<td><select id="selc" name="place">
									<option value="quanzhou">泉州</option>
									<option value="xiamen">厦门</option>
									<option value="zhangzhou">漳州</option>
							</select></td>
						</tr>
						<tr>
							<td class=“left” width=40% align="right"><label for="txtarea">简 介：</label></td>
							<td><textarea id="txtarea"></textarea></td>
						</tr>
						<tr>
							<td class=“left” width=40% align="right">兴 趣：</td>
							<td>
							<input type="checkbox" id="cbox1" name="dushu" value="c1">读书 
							<input type="checkbox" id="cbox2" name="yundong" value="c2">运动 
							<input type="checkbox" id="cbox3" name="chihe" value="c3">吃喝</td>
						</tr>
						<tr>
							<td class=“left” width=40% align="right">上 传：</td>
							<td><input type="file" id="f1" name="shangchuan" value="File1" /></td>
						</tr>
						<tr>
							<td class=“left” width=40% align="right" rowspan=2>
							<input id="Submit" type="submit" value="提 交" /></td>
							<td><input id="Reset" type="reset" value="重 置" /></td>
						</tr>
					</tbody>
				</table>
			</fieldset>
		</form>
	</div>
</body>
</html>
