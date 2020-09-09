<!DOCTYPE html>
<html>
<head>
</head>
<body>
<script>
function register(form){
	return alert ('Successfully Submitted');
}
</script>

<h3>George Mason University ID Card Service Login Page</h3>
<hr/>
<br/><br/>
<a href="student-form.jsp">Home |</a>
<a href="login.jsp">Login|</a>
<a href="contact.jsp">Contact |</a>
<a href="help.jsp">Help |</a>
<a href="viewhours.jsp">View available hours|</a>
<br/><br/>
<b>Login Page</b>
<p>Please enter your login details</p>

<form action= "LoginProcess.jsp">
<table>
<tr>
	<td>Enter Username: </td>
	<td><input type="text" name ="t1"/></td>
</tr>
<tr>
	<td>Enter Password: </td>
	<td><input type="text" name="t2"/></td>
	
</tr>
<tr>
	<td><input type="submit" value="Login"/></td>
</tr>
</table>
</form>
</body>
</html>
