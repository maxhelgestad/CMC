<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Going to College</title>
</head>
<body>
Hello User: <%= (String)session.getAttribute("username") %>
<br>
<a href="profile.jsp">Manage My Profile</a>
<form method="post" action="Delete.jsp" name="Delete" >
<a href="savedSchools.jsp">Manage My Saved Schools</a>
</form>
<a href="search.jsp">Search For Schools</a>
</body>
</html>