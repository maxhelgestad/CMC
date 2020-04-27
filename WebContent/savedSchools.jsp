<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page language="java" import="cmc.database.*"%>
<%@page language="java" import="cmc.university.*"%>
<%@page language="java" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Saved Schools</title>
</head>
<body>
<a href="Menu.jsp">Back to Menu</a>
<br><br>
Here Are Your Saved Schools
<table width=80% border=2>
<tbody><tr>
<td></td>
<td>School Name</td>
<td></td>
</tr>
<%String username = (String)session.getAttribute("username"); %>
<%ArrayList<University> savedSchools = DatabaseController.getSavedSchools(username);%>

<%String dateFormat = (String)session.getAttribute("date");
String timeFormat = (String)session.getAttribute("time");
for(int i = 0; i < savedSchools.size(); i++){%>
<tr>
<td style="vertical-align: top;">
<form method="post" action="deleteSaved.jsp" name="DELETE">
    <input name="DELETE" value="DELETE" type="submit">
    <input name="schoolName" value="<%= savedSchools.get(i).getName() %>" type="hidden">
</form>
</td>
	<%String result = savedSchools.get(i).getName()+ "(added on: " + dateFormat + " " + timeFormat+ ")";%>
	<td><%= result %></td>
	<td style="vertical-align: top;">
    <form method="post" action="Schoolpage.jsp" name="VIEW">
    <input name="VIEW" value="VIEW" type="submit">
    <input name="schoolName" value="<%= savedSchools.get(i).getName() %>" type="hidden">
</form>
</td>
</tr>
<%} %>
</tbody>
</table>
</body>
</html>