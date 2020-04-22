<%@page language="java" import="cmc.account.user.*"%>
<%@page language="java" import="cmc.database.*"%>

<% 
String username = request.getParameter("Username");
String password = request.getParameter("Password");

UserInteraction ui = new UserInteraction();
DatabaseController.setUp("javengers", "csci230");
boolean logInStatus = UserInteraction.logOn(username, password);

if(logInStatus == true){
	session.setAttribute("loggedInUser", ui);
	session.setAttribute("username", username);
         response.sendRedirect("Menu.jsp");
}
else{
	response.sendRedirect("index.jsp?error=INVALID USERNAME OR PASSWORD");
}


%>