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
<td>State</td>
<td>Location</td>
<td>Control</td>
<td>Number of Students</td>
<td>% Female</td>
<td>% Admitted</td>
</tr>
<%String username = (String)session.getAttribute("username"); %>
<%ArrayList<University> savedSchools = DatabaseController.getSavedSchools(username);%>

<%for(int i = 0; i < savedSchools.size(); i++){%>
<tr>
<td style="vertical-align: top;">
<form method="post" action="deleteSaved.jsp" name="DELETE">
    <input name="DELETE" value="DELETE" type="submit">
    <input name="schoolName" value="<%= savedSchools.get(i).getName() %>" type="hidden">
</form>
</td>
	<td><%=savedSchools.get(i).getName()%></td>
	<td><%=savedSchools.get(i).getState()%></td>
	<td><%=savedSchools.get(i).getLocation()%></td>
	<td><%=savedSchools.get(i).getControl()%></td>
	<td><%=savedSchools.get(i).getNumStudents()%></td>
	<td><%=savedSchools.get(i).getMfRatio()%></td>
	<td><%=savedSchools.get(i).getAdmitionRate()%></td>
</tr>
<%} %>
</tbody>
</table>
<%session.removeAttribute("searchResults"); %>
</body>
</html>