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
				<legend>����ע��</legend>
				<table width=100%>
					<tbody>
						<tr>
							<td class=��left�� width=40% align="right"><label for="t1">������</label></td>
							<td class="right"><input type="text" id="t1" name="Name"></td>
						</tr>
						<tr>
							<td class=��left�� width=40% align="right"><label	for="Password">�� �룺</label></td>
							<td class="right"><input id="Password1" type="password"	name="Password" /></td>
						</tr>
						<tr>
							<td class=��left�� width=40% align="right"><label for="e1">���䣺</label></td>
							<td class="right"><input type="email" id="e1" name="Email"></td>
						</tr>
						<tr>
							<td class=��left�� width=40% align="right"><label for="1">�Ա�</label></td>
							<td class="right">
							<input type="radio" id="1" name="ssex" value="nan" />��<!-- name���ó�һ���ľ�����--> 
							<input type="radio" id="2" name="ssex" value="nv" />Ů</td>
						</tr>
						<tr>
							<td class=��left�� width=40% align="right">�� ����</td>
							<td><select id="selc" name="place">
									<option value="quanzhou">Ȫ��</option>
									<option value="xiamen">����</option>
									<option value="zhangzhou">����</option>
							</select></td>
						</tr>
						<tr>
							<td class=��left�� width=40% align="right"><label for="txtarea">�� �飺</label></td>
							<td><textarea id="txtarea"></textarea></td>
						</tr>
						<tr>
							<td class=��left�� width=40% align="right">�� Ȥ��</td>
							<td>
							<input type="checkbox" id="cbox1" name="dushu" value="c1">���� 
							<input type="checkbox" id="cbox2" name="yundong" value="c2">�˶� 
							<input type="checkbox" id="cbox3" name="chihe" value="c3">�Ժ�</td>
						</tr>
						<tr>
							<td class=��left�� width=40% align="right">�� ����</td>
							<td><input type="file" id="f1" name="shangchuan" value="File1" /></td>
						</tr>
						<tr>
							<td class=��left�� width=40% align="right" rowspan=2>
							<input id="Submit" type="submit" value="�� ��" /></td>
							<td><input id="Reset" type="reset" value="�� ��" /></td>
						</tr>
					</tbody>
				</table>
			</fieldset>
		</form>
	</div>
</body>
</html>
