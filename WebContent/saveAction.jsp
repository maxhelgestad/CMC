<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page language="java" import="cmc.database.*"%>
<%@page language="java" import="cmc.university.*"%>
<%@page language="java" import="java.util.*" %>
<%@page language="java" import="java.text.*" %>



<%
String username = (String)session.getAttribute("username");
String schoolName = request.getParameter("schoolName");
DatabaseController.saveSchool(username, schoolName);
response.sendRedirect("searchResults.jsp");


TimeZone timeZone = TimeZone.getTimeZone("US/Central");
Calendar cal = Calendar.getInstance(timeZone);
String dateFormat = "MMMM dd,yy";
String timeFormat = "hh:mm:ss.SSS a zzzz";

DateFormat timeFormatI = new SimpleDateFormat(timeFormat);
DateFormat dateFormatI = new SimpleDateFormat(dateFormat);
Date theDate = new Date();
dateFormatI.setTimeZone(timeZone);
String date = dateFormatI.format(theDate);
String time = timeFormatI.format(cal.getTime());
session.setAttribute("date", date);
session.setAttribute("time", time);

%>