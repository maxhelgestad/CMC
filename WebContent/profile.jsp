<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page language="java" import="cmc.account.user.*"%>
  <%@page language="java" import="cmc.account.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage My Profile</title>
</head>
<body>
<a href="Menu.jsp">back to menu</a>
<br>
<%//String username = request.getParameter("username");
String username = (String)session.getAttribute("username");
UserInteraction ui = (UserInteraction)session.getAttribute("loggedInUser");
Account user = UserInteraction.viewProfile(username);
%>
<table style="text-align: left; width: 266px; height: 228px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;">First Name<br>
</td>
<td style="vertical-align: top;"><input name="FirstName" value = <%=user.getFirstname()%>><br>
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
<td style="vertical-align: top;"><input name="Username" value = <%=user.getUsername() %>> </td>
</tr>
<tr>
<td style="vertical-align: top;">Password<br>
</td>
<td style="vertical-align: top;"><input name="Password" value = <%=user.getPassword()%>></td>
</tr>
<tr>
<td style="vertical-align: top;">Type<br>
</td>
<td style="vertical-align: top;"><input name="Type" value = <%=user.getType() %>>  </td>
</tr>
<tr>
<td style="vertical-align: top;">Status<br>
</td>
<td style="vertical-align: top;"><input name="Status" value = <%=user.getStatus() %>></td>
</tr>

</tbody>
</table>
<form method="post" action="edit.jsp" name="edit">
<input value="Edit User" name="Edit User" type="submit">
<input name="Username" value = <%=username%> type="hidden">
</form>
<input value="Reset"name="Reset" type="reset">
</body>
</html>