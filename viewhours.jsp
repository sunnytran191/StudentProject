<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<h2>Office Hour Table</h2>

<br/><br/>
<a href="student-form.jsp">Home |</a>
<a href="login.jsp">Login|</a>
<a href="contact.jsp">Contact |</a>
<a href="help.jsp">Help |</a>
<a href="viewhours.jsp">View available hours|</a>
<br/><br/>
<table>
  <tr>
    <th>Professor</th>
    <th>Available hour</th>
    <th>Pick your time</th>
  </tr>
  <tr>
    <td>Xin Li</td>
    <td>11am-11:30am</td>
    <td><input type="radio" id="b1" name="button" value="b1"></td>
  </tr>
  <tr>
    <td>John Dovatus</td>
    <td>10:30am-11am</td>
    <td><input type="radio" id="b2" name="button" value="b2"></td>
  </tr>
  <tr>
    <td>Xin Li</td>
    <td>1pm-1:30pm</td>
    <td><input type="radio" id="b3" name="button" value="b3"></td>
  </tr>
  <tr>
    <td>Xin Li</td>
    <td>Helen Bennett</td>
    <td><input type="radio" id="b4" name="button" value="b4"></td>
  </tr>
  <tr>
    <td>John Dovatus</td>
    <td>2pm-2:30pm</td>
    <td><input type="radio" id="b5" name="button" value="b5"></td>
  </tr>
  <tr>
    <td>Rebecca Homan</td>
    <td>11am-11:30am</td>
    <td><input type="radio" id="b6" name="button" value="b6"></td>
  </tr>
</table>

</body>
</html>

