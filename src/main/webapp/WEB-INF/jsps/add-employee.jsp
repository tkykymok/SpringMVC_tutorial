<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Employee</h1>
	<s:form modelAttribute="employee" action="saveProcess">
		
		Employee Name:<s:input path="fullname" />
		<br>
		Employee Email: <s:input path="email" />
		<br>
		Gender: <s:radiobutton path="gender" value="Male" />Male<br>
		<s:radiobutton path="gender" value="Female" />Female<br>
		Interests: <s:checkbox path="hobbies" value="Sports" />Sports<br>
		<s:checkbox path="hobbies" value="Books" />Books<br>
		<s:checkbox path="hobbies" value="Swimming" />Swimming<br>
		<s:checkbox path="hobbies" value="Cycling" />Cycling<br>
		Country: <s:select path="country">
			<s:option value="India">India</s:option>
			<s:option value="Australia">Australia</s:option>
			<s:option value="South Africa">South Africa</s:option>
			<s:option value="Pakistan">Pakistan</s:option>
			<s:option value="America">America</s:option>
		</s:select>
		<br>
		Address: <s:textarea path="address" /> <br>
		
		<input type="submit" value="Save Employee">
		
		

	</s:form>
</body>
</html>