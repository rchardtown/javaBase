<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<table>
			<caption style="font-size: 30px; font-weight: bold;">
				用户信息详情
			</caption>
			<tr>
				<td align="right">用户姓名：</td>
				<td>
					<input type="text" id="username" name="username" value="${user.username }" disabled style="width: 300px;" placeholder="请填写用户姓名"/>
					<input type="hidden" name="userId" value="${user.userId }">
				</td>
			</tr>
			<tr>
				<td align="right">手机号码：</td>
				<td>
					<input type="text" id="cellphone" name="cellphone" value="${user.cellphone }" disabled style="width: 300px;" placeholder="请填写手机号码"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<a href="list">返回列表</a>
				</td>
			</tr>
		</table>
	</body>
</html>