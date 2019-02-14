<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>enrollment page</title>
</head>
<body bgcolor="lightblue">
	<div align="center">
		<h1 style="text-align: center; color: red;">Enrollment Page</h1>
		<hr />
		<form:form modelAttribute="enrollmentForm">
			<table>
				<tr>
					<td>User Name</td>
					<td><form:input path="userName" /></td>
				</tr>
				<tr>
					<td>Email Address</td>
					<td><form:input path="emailAddress" /></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><form:input path="mobileNumber" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:password path="password" /></td>
				</tr>
				<tr>
					<td />
					<td><input type="submit" value="enroll"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>