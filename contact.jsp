<!DOCTYPE html>
<html>
<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;
	color: blue;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: green;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>

<h3>George Mason University Office Hour Contact Page</h3>
<hr/>
<br/><br/>
<a href="student-form.jsp">Home |</a>
<a href="login.jsp">Login|</a>
<a href="contact.jsp">Contact |</a>
<a href="help.jsp">Help |</a>
<a href="viewhours.jsp">View available hours|</a>
<br/><br/>
<b>Contact Information</b>

<div class="container">
  <form action="/action_page.php">
    <label for="fname">First Name</label>
    <input type="text" id="fname" name="firstname" placeholder="Your name..">

    <label for="lname">Last Name</label>
    <input type="text" id="lname" name="lastname" placeholder="Your last name..">

    <label for="gNum">G Number</label>
    <input type="text" id="gNum" name="gNumber" placeholder="Enter your G number">

    <label for="message">Message</label>
    <textarea id="message" name="subject" placeholder="Leave your message or comment, we will get back to you." style="height:200px"></textarea>

    <input type="submit" value="Submit">
  </form>
</div>

</body>
</html>
