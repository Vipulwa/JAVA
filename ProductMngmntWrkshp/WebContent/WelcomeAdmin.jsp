<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome Admin</h2>
	<table class="table table-striped mp-3">
		<thead>
			<tr>
				<th>Product ID</th>
				<th>Name</th>
				<th>Cost</th>
				<th>EDIT/DELETE</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.productList}" var="data">
				<tr>
					<td><c:out value="${data.productId}" /></td>
					<td><c:out value="${data.productName}" /></td>
					<td><c:out value="${data.productCost}" /></td>
					<td><a href="">EDIT</a>/<a href="">DELETE</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>