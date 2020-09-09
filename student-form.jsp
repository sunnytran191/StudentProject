<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		.error{color:red}
	</style>
</head>
<body>
<h1>Welcome to Office Scheduling Registration</h1>
<hr/>
<br/><br/>
<a href="student-form.jsp">Home |</a>
<a href="login.jsp">Login|</a>
<a href="contact.jsp">Contact |</a>
<a href="help.jsp">Help |</a>
<a href="viewhours.jsp">View available hours|</a>
<hr/>

<i>Fill out information. Asterisk(*) mean required.</i>
	<br><br>
	
	<form:form action="processForm" modelAttribute="student">
	
	First name: <form:input path="firstName" placeholder="Enter your firstName"/>
	
	
	<br><br>
	Last name: <form:input path="lastName" placeholder="Enter your lastName"/>
	
	<br><br>
	G number (*):  <form:input path="gNum" placeholder="G..."/>
	<form:errors path="gNum" cssClass="error"/>
	
	<br><br>
	Visiting Purpose:
	
	<form:select path="visitingPurpose">
		<form:option value="Review Exam/Quiz" label="Review Exam/Quiz"/>
		<form:option value="Homework" label="Homework"/>
		<form:option value="Other reason" label="Other reason"/>
	</form:select>
	<br><br>
	
	<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>