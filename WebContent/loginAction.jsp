<%@page language="java" import="cmc.account.*"%>

<% 
String username = request.getParameter("Username");
String password = request.getParameter("Password");
//AccountController ac = new AccountController();
//UserInteraction ui = new UserInteraction();
session.setAttribute("username", username);
boolean logInStatus = AccountController.logOn(username, password);

if(logInStatus == true){
	session.setAttribute("loggedInUser", "ui");
	response.sendRedirect("Menu.jsp");
}
else{
	response.sendRedirect("index.jsp?error=INVALID USERNAME OR PASSWORD");
}


%>