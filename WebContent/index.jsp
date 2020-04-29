<html>
<head>

<title>Going to College</title>
</head>
<body>

<% String error = request.getParameter("error");
if (error == null) {
}
else if (error.equals("INVALID USERNAME OR PASSWORD")){%>
<p>Username or password is invalid</p>
<%} %>
<br>
<%if (request.getParameter("error2") != null) {%>
<%= request.getParameter("error2") %>
<%} %>

<form method="post" action="loginAction.jsp" name="Login"><br>
<p>Username<input name="Username"></p>
<p>Password<input name="Password"></p>
<p><input value="Log in"
name="Log in" type="submit"><input value="Reset"
name="Reset" type="reset"></p>

</form>
<br>
</body>
</html>