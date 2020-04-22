<html>
<head>

<title>Going to College</title>
</head>
<body>
<br>
Login form:<br>
<br>
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
<table style="text-align: left; width: 266px; height: 228px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;">Username<br>
</td>
<td style="vertical-align: top;"><input name="Username"> </td>
</tr>
<tr>
<td style="vertical-align: top;">Password<br>
</td>
<td style="vertical-align: top;"><input name="Password"> </td>
</tr>

<td style="vertical-align: top;"><input value="Log in"
name="Log in" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td style="vertical-align: top;"><input value="Reset"
name="Reset" type="reset"></td>
</tr>
</tbody>
</table>
<br>
</form>
<br>
</body>
</html>