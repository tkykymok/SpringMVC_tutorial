<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>List Employees</h1>
	<button onclick="window.location.href='showFormForAddEmployee'">Add
		Employee</button>
	<div>
		<table border="1">
			<tr>
				<th>Full Name</th>
				<th>Email</th>
				<th>Gender</th>
				<th>Hobbies</th>
				<th>Country</th>
				<th>Address</th>
				<th colspan="2">Actions</th>
			</tr>
			<c:forEach items="${listemployees}" var="employee">

				<c:url var="deleteLink" value="/deleteemployee">
					<c:param name="employeeId" value="${employee.id}"/>
				</c:url>
				
				<c:url var="updateLink" value="/editemployee">
					<c:param name="employeeId" value="${employee.id}"/>
				</c:url>

				<tr>
					<td>${employee.fullname}</td>
					<td>${employee.email}</td>
					<td>${employee.gender}</td>
					<td>${employee.hobbies}</td>
					<td>${employee.country}</td>
					<td>${employee.address}</td>
					<td><a href="${updateLink}">Update</a></td>
					<td><a href="${deletelink}" onclick="if(!(confirm('Are you sure want to delete the record?'))) return false;">Delete</a></td>
				</tr>
				
			</c:forEach>
		</table>
	</div>

</body>
</html>