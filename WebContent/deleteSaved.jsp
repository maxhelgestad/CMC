<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page language="java" import="cmc.database.*"%>
<%@page language="java" import="cmc.university.*"%>
<%@page language="java" import="java.util.*" %>

<%
String username = (String)session.getAttribute("username");
String schoolName = request.getParameter("schoolName");
DatabaseController.removeSchool(username, schoolName);
response.sendRedirect("savedSchools.jsp");
%>