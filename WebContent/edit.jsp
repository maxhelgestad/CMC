<%@page language="java" import="cmc.account.*"%>
<%@page language="java" import="cmc.account.user.*"%>
<%@page language="java" import="cmc.database.*"%>

<html>
<head>

<title>Edit Profile</title>
</head>
<body>
<%String username = request.getParameter("Username");
UserInteraction ui = (UserInteraction)session.getAttribute("loggedInUser");
Account user = UserInteraction.viewProfile(username);
%>
<form method="post" action="editAction.jsp" name="editUser"><br>
<table style="text-align: left; width: 266px; height: 228px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;">First Name<br>
</td>
<td style="vertical-align: top;"><input name="FirstName" value = <%=user.getFirstname()%> ><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Last Name<br>
</td>
<td style="vertical-align: top;"><input name="LastName" value = <%=user.getLastName()%>><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Username<br>
</td>
<td style="vertical-align: top;"><input name="Username" value = <%=user.getUsername() %> readonly></td>
</tr>
<tr>
<td style="vertical-align: top;">Password<br>
</td>
<td style="vertical-align: top;"><input name="Password" value = <%=user.getPassword()%>> </td>
</tr>
<tr>
<td style="vertical-align: top;">Type<br>
</td>
<td style="vertical-align: top;"><input name="Type" value = <%=user.getType() %> readonly></td>
</tr>
<tr>
<td style="vertical-align: top;">Status<br>
</td>
<td style="vertical-align: top;"><input name="Status" value = <%=user.getStatus() %> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;"><input value="Edit"
name="Edit" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
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


