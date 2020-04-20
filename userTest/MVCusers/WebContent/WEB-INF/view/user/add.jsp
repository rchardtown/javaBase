<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<form action="add" method="post">
			<table>
				<caption style="font-size: 30px; font-weight: bold;">
					新增用户信息
				</caption>
				<tr>
					<td align="right">用户姓名：</td>
					<td>
						<input type="text" id="username" name="username" style="width: 300px;" placeholder="请填写用户姓名"/>
					</td>
				</tr>
				<tr>
					<td align="right">手机号码：</td>
					<td>
						<input type="text" id="cellphone" name="cellphone" style="width: 300px;" placeholder="请填写手机号码"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button type="submit">保存用户</button>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>