<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello User <%= (String)session.getAttribute("username") %>
<br>
<a href="profile.jsp">View Your Profile</a>
<br>
<a href="search.jsp">Search For a School</a>
</body>
</html>