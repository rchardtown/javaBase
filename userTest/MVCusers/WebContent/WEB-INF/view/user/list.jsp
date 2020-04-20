<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<a href="add">新增用户信息</a>
		<table>
			<caption style="font-size: 30px; font-weight: bold;">用户信息列表</caption>
			<thead>
				<tr>
					<th>序号</th>
					<th>用户姓名</th>
					<th>手机号码</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${userList }" varStatus="s">
					<tr>
						<td>${s.count }</td>
						<td>${user.username }</td>
						<td>${user.cellphone }</td>
						<td>
							<a href="detail?id=${user.userId }">详情</a>
							<a href="update?id=${user.userId }">修改</a>
							<a href="delete?id=${user.userId }">删除</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>