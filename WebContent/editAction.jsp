<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page language="java" import="cmc.account.user.*,java.util.*"%>
<% String firstName = request.getParameter("FirstName");
String lastName = request.getParameter("LastName");
String  username = request.getParameter("Username");
String password = request.getParameter("Password");
String type = request.getParameter("Type");
String status = request.getParameter("Status");
char t = type.charAt(0);
char s = status.charAt(0);
UserInteraction.viewToEditProfile(username, password, firstName, lastName, t, s);

response.sendRedirect("profile.jsp");

%>