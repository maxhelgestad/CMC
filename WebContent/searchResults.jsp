<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page language="java" import="cmc.database.*"%>
<%@page language="java" import="cmc.search.*"%>
<%@page language="java" import="cmc.university.*"%>
<%@page language="java" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Results</title>
</head>
<body>
<a href="search.jsp">Back to Search</a>
<table width=80% border=2>
<tbody><tr>
<td></td>
<td style="vertical-align: center;">School Name</td>
<td></td>
</tr>

<%ArrayList<University> searchResults = (ArrayList<University>)session.getAttribute("searchResults");%>

<%for(int i = 0; i < searchResults.size(); i++){%>
<tr>
<td style="vertical-align: top;">
<form method="post" action="saveAction.jsp" name="SAVE">
    <input name="SAVE" value="SAVE" type="submit">
    <input name="schoolName" value="<%= searchResults.get(i).getName() %>" type="hidden">
</form>
</td>
	<td><%=searchResults.get(i).getName()%></td>
	<td style="vertical-align: top;">
<form method="post" action="schoolPage.jsp" name="VIEW">
    <input name="VIEW" value="VIEW" type="submit">
    <input name="schoolName" value="<%= searchResults.get(i).getName() %>" type="hidden">
</form>
</td>
</tr>
<%} %>
</tbody>
</table>
<%//session.removeAttribute("searchResults"); %>
</body>
</html>